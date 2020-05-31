package ru.softlab.petrov.servicve;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Dictionary {

    private String id;
    private User user;
    private LanguageType languageType;
    private List<Word> words;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public List<Word> getWords() {
        return words;
    }


    public void setWords(List<Word> words) {
        this.words = words;
    }
}
