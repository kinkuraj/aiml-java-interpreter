package org.aimlang.core.exception;

/**
 * AimlException
 *
 * @author anton
 * @since 19/04/17
 */
public class AimlException extends RuntimeException {
    public AimlException(String s) {
        super(s);
    }

    public AimlException(Throwable cause) {
        super(cause);
    }
}
