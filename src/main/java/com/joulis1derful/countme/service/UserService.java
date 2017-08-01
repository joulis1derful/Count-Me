package com.joulis1derful.countme.service;

import com.joulis1derful.countme.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService  {
    List<User> users;
    public UserService() {
       createUsers();
    }

    private List<User> createUsers() {
        users = new ArrayList<>();
        User user1 = new User(1, "antonhuzhov", "antonhuzhov@gmail.com", "6803708", 2000);
        User user2 = new User(2, "uchihaanton", "uchihaanton@yandex.ru", "6803708", 1500);
        User user3 = new User(3, "joulis1derful", "joulis1derful@gmail.com", "6803708", 3000);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    public List<User> getUsers() {
        return users;
    }
}
