package org.aimlang.core.entity;

import java.util.List;

/**
 * Template
 *
 * @author anton
 * @since 01/07/17
 */
public class Template implements Tag<Tag> {
    @Override
    public TagType getType() {
        return TagType.TEMPLATE;
    }

    @Override
    public List<Tag> getChilds() {
        return null;
    }
}
