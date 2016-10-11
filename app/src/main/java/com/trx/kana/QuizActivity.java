package com.trx.kana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

public class QuizActivity extends AppCompatActivity {

    final static String A_LIST  [] = {"a", "i", "u", "e", "o"};
    final static String KA_LIST [] = {"ka", "ki", "ku", "ke", "ko"};
    final static String SA_LIST [] = {"sa", "shi", "su", "se", "so"};
    final static String TA_LIST [] = {"ta", "chi", "tsu", "te", "to"};
    final static String NA_LIST [] = {"na", "ni", "nu", "ne", "no"};
    final static String HA_LIST [] = {"ha", "hi", "fu", "he", "ho"};
    final static String MA_LIST [] = {"ma", "mi", "mu", "me", "mo"};
    final static String YA_LIST [] = {"ya", "yu", "yo"};
    final static String RA_LIST [] = {"ra", "ri", "ru", "re", "ro"};
    final static String WA_LIST [] = {"wa", "wo"};
    final static String N_LIST  [] = {"n"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ImageView qImage = (ImageView) findViewById(R.id.kanaimageid);
        Button select1Btn = (Button)findViewById(R.id.select1id);
        Button select2Btn = (Button)findViewById(R.id.select2id);
        Button select3Btn = (Button)findViewById(R.id.select3id);
        Button select4Btn = (Button)findViewById(R.id.select4id);

        for


    }
}
