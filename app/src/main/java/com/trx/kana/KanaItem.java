package com.trx.kana;

import java.util.Random;

/**
 * Created by TRX on 10/11/2016.
 */

public class KanaItem {
    String name;
    String imageName;

    public String getImageName(boolean isKatakana) {
        // true: katakana false: hiragana
        String type;
        if (!isKatakana) {
            type = "hiragana";
        } else {
            type = "katakana";
        }
        return name+"_"+type;
    }

    public String getImageName() {
        // get random item between hiragana and katakana
        Random randomizer = new Random();
        boolean  torf = randomizer.nextBoolean();
        return getImageName(torf);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
