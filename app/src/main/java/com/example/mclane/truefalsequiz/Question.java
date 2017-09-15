package com.example.mclane.truefalsequiz;

/**
 * Created by per6 on 9/15/17.
 */

public class Question {

    private String questionText;
    private boolean questionAns;

    public Question(String questionText, boolean questionAns) {
        this.questionText = questionText;
        this.questionAns = questionAns;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isQuestionAns() {
        return questionAns;
    }

    public boolean checkAnswer(boolean userAns) {
        return questionAns == userAns;
    }
}
