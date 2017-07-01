package org.aimlang.core.entity;

/**
 * Word
 *
 * @author anton
 * @since 01/07/17
 */
public class Word implements Lexeme<String> {
    private final String value;

    public Word(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
