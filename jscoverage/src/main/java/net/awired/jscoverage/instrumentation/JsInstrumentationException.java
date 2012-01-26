package net.awired.jscoverage.instrumentation;

public class JsInstrumentationException extends Exception {

    private static final long serialVersionUID = 1L;

    public JsInstrumentationException(String message, Exception e) {
        super(message, e);
    }

}
