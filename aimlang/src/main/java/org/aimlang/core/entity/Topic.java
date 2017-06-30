package org.aimlang.core.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Topic
 *
 * @author anton
 * @since 01/07/17
 */
public class Topic implements Tag<Category> {
    private final String name;
    private List<Category> categories = new ArrayList<>();

    public Topic(String name) {
        this.name = name;
    }

    public Topic(String name, List<Category> categories) {
        this(name);
        this.categories = categories;
    }

    @Override
    public TagType getType() {
        return TagType.TOPIC;
    }

    @Override
    public List<Category> getChilds() {
        return categories;
    }
}
