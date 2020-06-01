package ru.softlab.petrov.service;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class DictionaryException extends Exception {
    IOException exception;

    public DictionaryException(IOException exception) {
        super(exception);
        this.exception = exception;
    }
    public DictionaryException(ParseException e) {
        super(e);
    }

    public IOException getIOException() {
        return exception;
    }
}

