package com.joulis1derful.countme.service;

import com.joulis1derful.countme.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitOperationsService {
    private Map<String, Integer> highscoreList;
    private enum Difficulty { EASY, MEDIUM, HARD }

    public Map<String, Integer> showHighscores(List<User> users) {
        highscoreList = new HashMap<>();
        for(User user : users) {
            highscoreList.put(user.getUsername(), user.getHighscore());
        }
        return highscoreList;
    }

    public int sumDigits(int dig1, int dig2) {
        return dig1 + dig2;
    }
    public int multiplyDigits(int dig1, int dig2) {
        return dig1 * dig2;
    }


}
