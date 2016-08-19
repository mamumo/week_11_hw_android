package com.example.user.swish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class FullAnswer extends AppCompatActivity {

    TextView mAnswerText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("swish:", "FullAnswer.onCreate called");
        setContentView(R.layout.fullanswer_activity);

        mAnswerText = (TextView)findViewById(R.id.fullAnswer_text);

        Intent intent2 = getIntent();
        Bundle extras = intent2.getExtras();// this will get all of the extras- we need to get just the one.
        String fullanswer = extras.getString("fullanswer");//want to get the type back- getString/getInt
        mAnswerText.setText(fullanswer);
    }
}
