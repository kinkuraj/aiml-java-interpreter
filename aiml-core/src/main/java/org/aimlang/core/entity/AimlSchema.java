package org.aimlang.core.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AimlSchema
 *
 * @author anton
 * @since 01/07/17
 */
public class AimlSchema {
    private final String name;
    private Map<String, List<Category>> topics = new HashMap<>();

    public AimlSchema(String name) {
        this.name = name;
        topics.put(null, new ArrayList<>()); //default topic
    }
}
