package com.example.user.swish;

import java.util.ArrayList;

/**
 * Created by user on 17/08/2016.
 */
public class AnswerSimple extends Answers {
    public AnswerSimple() {
        super();
    }

    public AnswerSimple(ArrayList<String> answers) {
        super(answers);
    }

    @Override
    public void setupAnswers() {
        String[] answers = {
                "You are welcome to pay at the bar",
                "Please call over your nearest waiter"
        };

        for(String answer : answers) {
            add(answer);
        }
    }
}
