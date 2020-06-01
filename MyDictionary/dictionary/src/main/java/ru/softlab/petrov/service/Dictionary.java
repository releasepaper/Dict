package ru.softlab.petrov.service;

import java.util.LinkedList;
import java.util.List;



public class Dictionary {

    private Long id;
    private User user;
    private LanguageType languageType;
    private List<Word> words = new LinkedList<Word>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void addWord(Word word) {
        words.add(word);
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public void ViewDictionary() {
        System.out.print(this.getId());
        System.out.println(this.user.getFirstName());
        System.out.println(this.user.getSurname());
        System.out.println(this.user.getLogin());
        System.out.println(this.user.getPassword());
        System.out.println(this.getLanguageType().toString());
        for (int i=0;i<words.size();++i) {
            System.out.println(words.get(i).getNative());
            System.out.println(words.get(i).getId());
            System.out.println(words.get(i).getTranscription());
            System.out.println(words.get(i).getTranslation());
        }
    }
}
