package org.aimlang.core.loader;

import org.aimlang.core.exception.DataLoadingException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * AimlLoader
 *
 * @author anton
 * @since 01/07/17
 */
public class XmlLoader extends FileLoader<Document> {
    @Override
    public Collection<Document> load(File file) throws DataLoadingException {
        List<Document> data = new ArrayList<>(1);
        data.add(loadXmlDoc(file));
        return data;
    }

    private Document loadXmlDoc(File file) throws DataLoadingException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        Document doc;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(file);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new DataLoadingException(e);
        }
        doc.getDocumentElement().normalize();
        return doc;
    }
}
