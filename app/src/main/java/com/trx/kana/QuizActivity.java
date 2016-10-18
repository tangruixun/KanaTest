package com.trx.kana;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
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

    KanaItem correctItem, option1Item, option2Item, option3Item;
    int correctPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ImageView qImage = (ImageView) findViewById(R.id.kanaimageid);
        Button select1Btn = (Button)findViewById(R.id.select1id);
        Button select2Btn = (Button)findViewById(R.id.select2id);
        Button select3Btn = (Button)findViewById(R.id.select3id);
        Button select4Btn = (Button)findViewById(R.id.select4id);

        String mergedList [] = (String[]) ArrayUtils.addAll(A_LIST, KA_LIST, SA_LIST, TA_LIST,
                NA_LIST, HA_LIST, MA_LIST, YA_LIST, RA_LIST, WA_LIST, N_LIST);
        ArrayList <KanaItem> kanaList = new ArrayList<>();
        for (String letter :
                mergedList) {
            KanaItem kanaItem = new KanaItem();
            kanaItem.setName(letter);
            kanaList.add(kanaItem);
        }

        correctItem = getRandomItem (kanaList);
        kanaList.remove(correctItem);
        option1Item = getRandomItem(kanaList);
        kanaList.remove(option1Item);
        option2Item = getRandomItem(kanaList);
        kanaList.remove(option2Item);
        option3Item = getRandomItem(kanaList);

        SparseArray <ArrayList<KanaItem>> result = randomPos (option1Item, option2Item, option3Item, correctItem);
        correctPos = result.keyAt(0);
        ArrayList<KanaItem> choiceList = result.valueAt(0);

        String imageName = correctItem.getImageName();

        SelectBtn1Listener selectBtn1Listener = new SelectBtn1Listener();
        SelectBtn2Listener selectBtn2Listener = new SelectBtn2Listener();
        SelectBtn3Listener selectBtn3Listener = new SelectBtn3Listener();
        SelectBtn4Listener selectBtn4Listener = new SelectBtn4Listener();
        select1Btn.setText(choiceList.get(0).getName());
        select2Btn.setText(choiceList.get(1).getName());
        select3Btn.setText(choiceList.get(2).getName());
        select4Btn.setText(choiceList.get(3).getName());

        select1Btn.setOnClickListener(selectBtn1Listener);
        select2Btn.setOnClickListener(selectBtn2Listener);
        select3Btn.setOnClickListener(selectBtn3Listener);
        select4Btn.setOnClickListener(selectBtn4Listener);

        String srcString = "@mipmap/" + imageName;
        int imgResource = getResources().getIdentifier(srcString, null, getPackageName());
        Drawable imgDrawable = ResourcesCompat.getDrawable(getResources(), imgResource, null);
        qImage.setImageDrawable(imgDrawable);



    }

    private SparseArray <ArrayList<KanaItem>> randomPos(KanaItem option1Item, KanaItem option2Item, KanaItem option3Item, KanaItem correctItem) {
        Random randomizer = new Random();
        int correctPos = randomizer.nextInt(4);
        ArrayList <KanaItem> choiceList = new ArrayList<>();
        SparseArray <ArrayList<KanaItem>> result = new SparseArray<>();
        choiceList.add(option1Item);
        choiceList.add(option2Item);
        choiceList.add(option3Item);
        choiceList.add(correctPos, correctItem);
        result.append(correctPos, choiceList);
        return result;
    }

    private KanaItem getRandomItem(ArrayList<KanaItem> kanaList) {
        Random randomizer = new Random();
        return kanaList.get(randomizer.nextInt(kanaList.size()));
    }

    private void nextQuestion() {
        ;;;''''
    }

    class SelectBtn1Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (correctPos == 0) {
                // correct answer

            } else {
                // wrong answer

            }
            nextQuestion ();
        }
    }

    class SelectBtn2Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (correctPos == 1) {
                // correct answer

            } else {
                // wrong answer

            }
            nextQuestion ();
        }
    }

    class SelectBtn3Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (correctPos == 2) {
                // correct answer

            } else {
                // wrong answer

            }
            nextQuestion ();
        }
    }

    class SelectBtn4Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (correctPos == 3) {
                // correct answer

            } else {
                // wrong answer

            }
            nextQuestion ();
        }
    }
}
