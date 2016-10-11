package com.trx.kana;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Random;

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

    String name_correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ImageView qImage = (ImageView) findViewById(R.id.kanaimageid);
        Button select1Btn = (Button)findViewById(R.id.select1id);
        Button select2Btn = (Button)findViewById(R.id.select2id);
        Button select3Btn = (Button)findViewById(R.id.select3id);
        Button select4Btn = (Button)findViewById(R.id.select4id);




        SelectBtnListener selectBtnListener = new SelectBtnListener();

        select1Btn.setOnClickListener(selectBtnListener);
        select2Btn.setOnClickListener(selectBtnListener);
        select3Btn.setOnClickListener(selectBtnListener);
        select4Btn.setOnClickListener(selectBtnListener);

        String mergedList [] = (String[]) ArrayUtils.addAll(A_LIST, KA_LIST, SA_LIST, TA_LIST,
                NA_LIST, HA_LIST, MA_LIST, YA_LIST, RA_LIST, WA_LIST, N_LIST);
        ArrayList <KanaItem> kanaList = new ArrayList<>();
        for (String letter :
                mergedList) {
            KanaItem kanaItem = new KanaItem();
            kanaItem.setName(letter);
            kanaList.add(kanaItem);
        }

        KanaItem randomItem = getRandomItem (kanaList);
        String imageName = randomItem.getImageName();
        name_correct = randomItem.getName();

        String srcString = "@mipmap/" + imageName;
        int imgResource = getResources().getIdentifier(srcString, null, getPackageName());
        Drawable imgDrawable = ResourcesCompat.getDrawable(getResources(), imgResource, null);
        qImage.setImageDrawable(imgDrawable);




    }

    private KanaItem getRandomItem(ArrayList<KanaItem> kanaList) {
        Random randomizer = new Random();
        return kanaList.get(randomizer.nextInt(kanaList.size()));
    }

    class SelectBtnListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
;
        }
    }
}
