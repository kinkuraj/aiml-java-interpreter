package org.aimlang.core.loader;

import org.aimlang.core.entity.Category;
import org.aimlang.core.entity.Topic;
import org.aimlang.core.exception.DataLoadingException;
import org.slf4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.aimlang.core.entity.TagType.CATEGORY;
import static org.aimlang.core.entity.TagType.TOPIC;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * AimlLoader
 *
 * @author anton
 * @since 01/07/17
 */
public class AimlLoader extends FileLoader<Topic> {
    private static final Logger log = getLogger(AimlLoader.class);

    private XmlLoader xmlLoader = new XmlLoader();

    @Override
    public List<Topic> load(File file) {
        List<Topic> topics = new ArrayList<>();
        Topic defaultTopic = Topic.DEFAULT;
        Document document;
        try {
            document = new ArrayList<>(xmlLoader.load(file)).get(0);
        } catch (DataLoadingException e) {
            log.error(e.getLocalizedMessage(), e);
            return topics;
        }

        NodeList categoryNodes = document.getElementsByTagName(CATEGORY.name());
        int categoriesSize = categoryNodes.getLength();
        for (int i = 0; i < categoriesSize; ++i) {
            Node item = categoryNodes.item(i);
            Element element = (Element) item;
            Category category = new Category();
            if (TOPIC.name().equals(item.getParentNode().getNodeName())) {
                //add topic name from parent
                String topicName = ((Element) item.getParentNode()).getAttribute("name");
                Topic topic = new Topic(topicName);
            }
        }
        topics.add(defaultTopic);
        return topics;
    }
}
