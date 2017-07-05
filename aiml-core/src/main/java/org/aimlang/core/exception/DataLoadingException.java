package org.aimlang.core.exception;

/**
 * DataLoadingException
 *
 * @author anton
 * @since 01/07/17
 */
public class DataLoadingException extends AimlException {
    public DataLoadingException(String s) {
        super(s);
    }

    public DataLoadingException(Throwable cause) {
        super(cause);
    }
}
