package ru.softlab.petrov.service;

public class User {
    private Long id;
    private String login;
    private String password;
    private String surname;
    private String firstname;

    public User(String login, String password, String surname, String firstname) {
        this.login      = login;
        this.password   = password;
        this.surname    = surname;
        this.firstname  = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }
}
