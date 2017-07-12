package com.lvdcfactory.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.lvdcfactory.quizapp.quiz.Quiz;

public class Menu extends AppCompatActivity {

    Button btnCreateQuiz, btnViewYourQuizzes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViews();
        addListeners();
    }

    private void findViews() {
        btnCreateQuiz = (Button) findViewById(R.id.menu_btnCreateQuiz);
        btnViewYourQuizzes = (Button) findViewById(R.id.menu_btnViewYourQuizzes);
    }

    private void addListeners() {

        btnCreateQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), CreateQuiz.class));
            }
        });

        btnViewYourQuizzes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Menu", "'View Your Quizzes' Button Clicked");
            }
        });

    }

}
