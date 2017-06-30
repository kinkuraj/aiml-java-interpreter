package org.aimlang.core.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Li
 *
 * @author anton
 * @since 01/07/17
 */
public class Li implements Tag<Word> {
    private String value;

    @Override
    public TagType getType() {
        return TagType.LI;
    }

    @Override
    public List<Word> getChilds() {
        return Arrays.stream(value.split("\\s+")).map(Word::new).collect(Collectors.toList());
    }
}
