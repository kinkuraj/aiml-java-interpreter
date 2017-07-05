package org.aimlang.core.loader;

import org.aimlang.core.exception.DataLoadingException;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.format;

/**
 * File loader
 *
 * @param <R> type of result data
 * @author anton
 * @since 19/10/16
 */
public abstract class FileLoader<R> implements Loader<R, File> {
    public abstract Collection<R> load(File file);

    public Collection<R> load(File... files) {
        if (files == null || files.length == 0) return new ArrayList<>();

        Collection<R> data = new ArrayList<>();
        for (File file : files) {
            data.addAll(load(file));
        }
        return data;
    }

    public Collection<R> load(Collection<File> files) {
        return load(files.toArray(new File[files.size()]));
    }

    public Collection<R> load(String path, String fileMask) {
        File directory = new File(path);
        if (!directory.isDirectory())
            throw new DataLoadingException(format("This is not a directory: %s", path));
        else if (!directory.canRead())
            throw new DataLoadingException(format("Directory %s is not readable!", path));

        try {
            File[] files = directory.listFiles();
            if (files == null || files.length == 0)
                throw new DataLoadingException(format("Directory %s is empty!", path));
            List<File> matchedFiles = Arrays.stream(files)
                    .filter(file -> file.getName().matches(fileMask)).collect(Collectors.toList());
            if (matchedFiles.isEmpty())
                throw new DataLoadingException(format("Has not files matched by mask %s", fileMask));
            return load(matchedFiles);
        } catch (Exception e) {
            throw new DataLoadingException(e.getLocalizedMessage());
        }
    }
}
