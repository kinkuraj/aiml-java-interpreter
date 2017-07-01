package org.aimlang.core.entity;

import java.util.List;

/**
 * Pattern
 *
 * @author anton
 * @since 01/07/17
 */
public class Pattern implements Tag<Tag> {
    @Override
    public TagType getType() {
        return TagType.PATTERN;
    }

    @Override
    public List<Tag> getChilds() {
        return null;
    }
}
