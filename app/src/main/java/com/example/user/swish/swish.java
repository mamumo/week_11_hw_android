package com.example.user.swish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 15/08/2016.
 */
public class swish extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mSplitButton;
    Button mFullButton;

    Answers mAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("swish:", "onCreatecalled");
        setContentView(R.layout.activity_main);
        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mSplitButton = (Button)findViewById(R.id.split_button);
        mFullButton = (Button)findViewById(R.id.full_button);
        mAnswers = new AnswerSimple();

        mSplitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("swish:", "The split button was clicked");
                Log.d("swish:", "Name of user is '" + question + "'");
//                String splitanswer = ("Hi " + question + ", so you want to split the bill");
                  String answer = mAnswers.getAnswer();

                Intent intent = new Intent(swish.this, SplitAnswer.class);
                intent.putExtra("splitanswer", answer);
                startActivity(intent);

            }

        });

        mFullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Log.d("swish:", "The full button was clicked");
                Log.d("swish:", "Name of user is '" + question + "'");
//                String fullanswer = ("Hi " + question + ", so you want to pay the full bill");
                String answer = mAnswers.getAnswer();

                Intent intent2 = new Intent(swish.this, FullAnswer.class);
                intent2.putExtra("fullanswer", answer);
                startActivity(intent2);

            }
        });

    }
}
