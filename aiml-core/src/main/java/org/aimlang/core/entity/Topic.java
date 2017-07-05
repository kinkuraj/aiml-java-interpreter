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
    public static final Topic DEFAULT = new Topic(null);

    private final String name;
    private List<Category> categories;

    public Topic(String name) {
        this(name, new ArrayList<>());
    }

    public Topic(String name, List<Category> categories) {
        this.name = name;
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

    public List<Category> add(Category category) {
        categories.add(category);
        return categories;
    }
}
