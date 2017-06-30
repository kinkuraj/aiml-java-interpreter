package org.aimlang.core.entity;

import java.util.List;

/**
 * Tag
 *
 * @author anton
 * @since 01/07/17
 */
public interface Tag<E extends Lexeme> extends Lexeme<List<E>> {
    TagType getType();

    default List<E> getValue() {
        return getChilds();
    }

    List<E> getChilds();
}
