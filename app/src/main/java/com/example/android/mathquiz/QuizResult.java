package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        TextView txtName = (TextView) findViewById(R.id.sum_result);
        Intent i = getIntent();
        // Receiving the Data

        String result = i.getStringExtra("Result");
        txtName.setText(result);
    }
}
