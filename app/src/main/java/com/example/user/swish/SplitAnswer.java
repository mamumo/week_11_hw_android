package com.example.user.swish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class SplitAnswer extends AppCompatActivity {

    TextView mAnswerText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("swish:", "SplitAnswer.onCreate called");
        setContentView(R.layout.splitanswer_activity);

        mAnswerText = (TextView)findViewById(R.id.splitAnswer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();// this will get all of the extras- we need to get just the one.
        String splitanswer = extras.getString("splitanswer");//want to get the type back- getString/getInt
        mAnswerText.setText(splitanswer);
    }
}

