package com.example.mclane.truefalsequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonTrue, buttonFalse, buttonNext;
    private TextView questionText;
    private List<Question> questionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        initQuestinBank();
    }

    private void updateQuestionText(){
        questionText.setText(""+questionBank.get(0));
    }

    private void initQuestinBank() {
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.question_animal),true));
        questionBank.add(new Question(getString(R.string.question_harrison),true));
        questionBank.add(new Question(getString(R.string.question_cross), true));
        questionBank.add(new Question(getString(R.string.question_hate), false));
    }

    private void setListeners() {
        buttonNext.setOnClickListener(this);
        buttonTrue.setOnClickListener(this);
        buttonFalse.setOnClickListener(this);
    }

    private void wireWidgets() {
        buttonTrue = (Button) findViewById(R.id.button_true);
        buttonFalse = (Button) findViewById(R.id.button_false);
        buttonNext = (Button) findViewById(R.id.button_next);
        questionText = (TextView) findViewById(R.id.text_question);
    }

    @Override
    public void onClick(View view) {
        switch (R.id.button_true){
        }

    }
}
