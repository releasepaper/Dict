package ru.softlab.petrov.servicve;

public class DictionaryException extends Exception {
    DictionaryException(Exception exception) {
        super(exception);
    }
}
