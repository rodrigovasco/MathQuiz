package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int sumField1;
    int sumField2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumbers(View view){

        CheckBox readyPlayer1checkBox = (CheckBox) findViewById(R.id.player1_ready);
        boolean isPlayer1Ready = readyPlayer1checkBox.isChecked();
        //Log.v("MainActivity", "Is ready? " + isPlayer1Ready);

        TextView sumField1TextView = (TextView) findViewById(R.id.sum_1st_field_textview);

        TextView sumField2TextView = (TextView) findViewById(R.id.sum_2nd_field_textview);

        Random rand = new Random();
        if (isPlayer1Ready){
            sumField1 = rand.nextInt(10); // Gives n such that 0 <= n < 10
            displayNumbers(sumField1TextView, sumField1);

            sumField2 = rand.nextInt(10); // Gives n such that 0 <= n < 10
            displayNumbers(sumField2TextView, sumField2);
        }
    }


    public void displayNumbers(TextView textView, int number) {
        textView.setText(String.valueOf(number));
    }
    public void showQuizResults(View view) {

        String sumResult = "" + sumField1 + " + " + sumField2 + " = " + (sumField1 + sumField2);

        Intent intent = new Intent(this, QuizResult.class);
        intent.putExtra("Result", sumResult);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
