package org.aimlang.core.entity;

import java.util.Arrays;
import java.util.List;

/**
 * Category
 *
 * @author anton
 * @since 01/07/17
 */
public class Category implements Tag<Tag> {
    private Pattern pattern;
    private Template template;
    private That that;
    private Topic topic;

    @Override
    public TagType getType() {
        return TagType.CATEGORY;
    }

    @Override
    public List<Tag> getChilds() {
        return Arrays.asList(pattern, template, that, topic);
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public That getThat() {
        return that;
    }

    public void setThat(That that) {
        this.that = that;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
