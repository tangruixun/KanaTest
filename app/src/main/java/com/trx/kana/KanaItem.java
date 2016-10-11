package com.trx.kana;

/**
 * Created by TRX on 10/11/2016.
 */

public class KanaItem {
    String name;
    String imageName;
    boolean isKatakana; // true: katakana false: hiragana

    public String getImageName() {
        String type;
        if (!isKatakana) {
            type = "hiragana";
        } else {
            type = "katakana";
        }
        return name+"_"+type+".png";
    }

    public boolean isKatakana() {
        return isKatakana;
    }

    public void setIsKatakana(boolean b) {
        this.isKatakana = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
