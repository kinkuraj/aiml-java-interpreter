package org.aimlang.core.entity;

import java.util.Arrays;
import java.util.List;

/**
 * Srai
 *
 * @author anton
 * @since 01/07/17
 */
public class Srai<E extends Lexeme> implements Tag<Pattern> {
    private Pattern pattern;
    private Category category;

    public Srai(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public TagType getType() {
        return TagType.SRAI;
    }

    @Override
    public List<Pattern> getChilds() {
        return Arrays.asList(pattern);
    }
}
