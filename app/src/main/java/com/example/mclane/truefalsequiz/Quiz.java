package com.example.mclane.truefalsequiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by per6 on 9/15/17.
 */

public class Quiz{
    public List<Question> questionBank;

    public Quiz() {
        initQuestionBank(ArrayList<Question>() questionBank);
    }

    private void initQuestionBank(ArrayList<Question> questionBank) {
        this.questionBank = questionBank;
    }
}
