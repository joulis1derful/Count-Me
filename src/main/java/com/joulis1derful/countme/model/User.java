package com.joulis1derful.countme.model;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private int highscore;

    public User(int id, String username, String email, String password, int highscore) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.highscore = highscore;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHighscore() {
        return highscore;
    }
}
