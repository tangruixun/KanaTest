package com.trx.kana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    Context thisContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button startBtn = (Button) findViewById(R.id.startBtnId);
        QuizClickListener quizClickListener = new QuizClickListener();
        startBtn.setOnClickListener(quizClickListener);
    }

    class QuizClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(thisContext, "test", Toast.LENGTH_SHORT).show();
            Intent int_quiz = new Intent (thisContext, QuizActivity.class);
            startActivity(int_quiz);
        }
    }
}
