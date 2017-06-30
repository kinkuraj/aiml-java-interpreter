package org.aimlang.core.entity;

import java.util.List;

/**
 * That
 *
 * @author anton
 * @since 01/07/17
 */
public class That implements Tag<Tag> {
    @Override
    public TagType getType() {
        return TagType.THAT;
    }

    @Override
    public List<Tag> getChilds() {
        return null;
    }
}
