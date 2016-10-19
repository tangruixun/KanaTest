package com.trx.kana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Activity thisActivity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button startBtn = (Button) findViewById(R.id.startBtnId);
        QuizClickListener quizClickListener = new QuizClickListener();
        startBtn.setOnClickListener (quizClickListener);

    }

    class QuizClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent int_quiz = new Intent (thisActivity, QuizActivity.class);
            startActivity(int_quiz);
        }
    }
}
