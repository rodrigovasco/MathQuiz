package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Player player1;
    private Player player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = new Player();
        player2 = new Player();
}

    public void preparePlayer1(View view) {

        TextView sumField1TextView = (TextView) findViewById(R.id.player1_sum_1st_field_textview);
        TextView sumField2TextView = (TextView) findViewById(R.id.player1_sum_2nd_field_textview);

        TextView subtField1TextView = (TextView) findViewById(R.id.player1_subt_1st_field_textview);
        TextView subtField2TextView = (TextView) findViewById(R.id.player1_subt_2nd_field_textview);

        TextView multField1TextView = (TextView) findViewById(R.id.player1_mult_1st_field_textview);
        TextView multField2TextView = (TextView) findViewById(R.id.player1_mult_2nd_field_textview);

        TextView divField1TextView = (TextView) findViewById(R.id.player1_div_1st_field_textview);
        TextView divField2TextView = (TextView) findViewById(R.id.player1_div_2nd_field_textview);

        CheckBox readyCheckBox = (CheckBox) findViewById(R.id.player1_ready_checkbox);
        player1.setReady(readyCheckBox.isChecked());

        if (player1.isReady()) {

            player1.randomFields();

            displayNumbers(sumField1TextView, player1.getSumField1());
            displayNumbers(sumField2TextView, player1.getSumField2());

            displayNumbers(subtField1TextView, player1.getSubtField1());
            displayNumbers(subtField2TextView, player1.getSubtField2());

            displayNumbers(multField1TextView, player1.getMultField1());
            displayNumbers(multField2TextView, player1.getMultField2());

            displayNumbers(divField1TextView, player1.getDivField1());
            displayNumbers(divField2TextView, player1.getDivField2());
        }
    }
    public void preparePlayer2(View view) {

        TextView sumField1TextView = (TextView) findViewById(R.id.player2_sum_1st_field_textview);
        TextView sumField2TextView = (TextView) findViewById(R.id.player2_sum_2nd_field_textview);

        TextView subtField1TextView = (TextView) findViewById(R.id.player2_subt_1st_field_textview);
        TextView subtField2TextView = (TextView) findViewById(R.id.player2_subt_2nd_field_textview);

        TextView multField1TextView = (TextView) findViewById(R.id.player2_mult_1st_field_textview);
        TextView multField2TextView = (TextView) findViewById(R.id.player2_mult_2nd_field_textview);

        TextView divField1TextView = (TextView) findViewById(R.id.player2_div_1st_field_textview);
        TextView divField2TextView = (TextView) findViewById(R.id.player2_div_2nd_field_textview);

        CheckBox readyCheckBox = (CheckBox) findViewById(R.id.player2_ready_checkbox);
        player2.setReady(readyCheckBox.isChecked());

        if (player2.isReady()) {

            player2.randomFields();

            displayNumbers(sumField1TextView, player2.getSumField1());
            displayNumbers(sumField2TextView, player2.getSumField2());

            displayNumbers(subtField1TextView, player2.getSubtField1());
            displayNumbers(subtField2TextView, player2.getSubtField2());

            displayNumbers(multField1TextView, player2.getMultField1());
            displayNumbers(multField2TextView, player2.getMultField2());

            displayNumbers(divField1TextView, player2.getDivField1());
            displayNumbers(divField2TextView, player2.getDivField2());
        }
    }

    public void displayNumbers(TextView textView, int number) {
        textView.setText(String.valueOf(number));
    }

    public boolean checkPlayer1EditText(){

        EditText nameEditText = (EditText) findViewById(R.id.player1_name_edittext);
        if (nameEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 1 fill in the NAME field, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player1.setName(nameEditText.getText().toString());
        }

        if (player1.isReady() == false){
            Toast.makeText(this, "You are NOT ready Player 1!", Toast.LENGTH_SHORT).show();
            return false;
        }

        EditText sumAnswerEditText = (EditText) findViewById(R.id.player1_sum_answer_edittext);
        if (sumAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 1 answer the SUM, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player1.setSumEdit(Double.parseDouble(sumAnswerEditText.getText().toString()));
        }

        EditText subtAnswerEditText = (EditText) findViewById(R.id.player1_subt_answer_edittext);
        if (subtAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 1 answer the SUBTRACTION, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player1.setSubtEdit(Double.parseDouble(subtAnswerEditText.getText().toString()));
        }

        EditText multAnswerEditText = (EditText) findViewById(R.id.player1_mult_answer_edittext);
        if (multAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 1 answer the MULTIPLICATION, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player1.setMultEdit(Double.parseDouble(multAnswerEditText.getText().toString()));
        }

        EditText divAnswerEditText = (EditText) findViewById(R.id.player1_div_answer_edittext);
        if (divAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 1 answer the DIVISION, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player1.setDivEdit(Double.parseDouble(divAnswerEditText.getText().toString()));
        }

        return true;
    }

    public boolean checkPlayer2EditText(){

        EditText nameEditText = (EditText) findViewById(R.id.player2_name_edittext);
        if (nameEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 2 fill in the NAME field, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player2.setName(nameEditText.getText().toString());
        }

        if (player2.isReady() == false){
            Toast.makeText(this, "You are NOT ready Player 2!", Toast.LENGTH_SHORT).show();
            return false;
        }

        EditText sumAnswerEditText = (EditText) findViewById(R.id.player2_sum_answer_edittext);
        if (sumAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 2 answer the SUM, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player2.setSumEdit(Double.parseDouble(sumAnswerEditText.getText().toString()));
        }

        EditText subtAnswerEditText = (EditText) findViewById(R.id.player2_subt_answer_edittext);
        if (subtAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 2 answer the SUBTRACTION, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player2.setSubtEdit(Double.parseDouble(subtAnswerEditText.getText().toString()));
        }

        EditText multAnswerEditText = (EditText) findViewById(R.id.player2_mult_answer_edittext);
        if (multAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 2 answer the MULTIPLICATION, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player2.setMultEdit(Double.parseDouble(multAnswerEditText.getText().toString()));
        }

        EditText divAnswerEditText = (EditText) findViewById(R.id.player2_div_answer_edittext);
        if (divAnswerEditText.getText().toString().trim().equals("")) {
            Toast.makeText(this, "Player 2 answer the DIVISION, please!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            player2.setDivEdit(Double.parseDouble(divAnswerEditText.getText().toString()));
        }

        return true;
    }

    public void verifyAnswersAndCountPoints(Player player){

        int playerPoints = 0;

        String sumResult = player.getSumField1() + " + " + player.getSumField2() + " = " + (player.getSumEdit());
        if (player.sum() == player.getSumEdit()) {
            sumResult += "\n It is right!";
            playerPoints++;
        } else {
            sumResult += "\n Wrong! It is: " + player.sum();
        }
        player.setSumResultText(sumResult);

        String subtResult = player.getSubtField1() + " - " + player.getSubtField2() + " = " + (player.getSubtEdit());
        if (player.subtraction() == player.getSubtEdit()) {
            subtResult += "\n It is right!";
            playerPoints++;
        } else {
            subtResult += "\n Wrong! It is: " + player.subtraction();
        }
        player.setSubtResultText(subtResult);

        String multResult = player.getMultField1() + " x " + player.getMultField2() + " = " + (player.getMultEdit());
        if (player.multiplication() == player.getMultEdit()) {
            multResult += "\n It is right!";
            playerPoints++;
        } else {
            multResult += "\n Wrong! It is: " + player.multiplication();
        }
        player.setMultResultText(multResult);

        String divResult = player.getDivField1() + " : " + player.getDivField2() + " = " + (player.getDivEdit());
        if (player.division() == player.getDivEdit()) {
            divResult += "\n It is right!";
            playerPoints++;
        } else {
            divResult += "\n Wrong! It is: " + player.division();
        }
        player.setDivResultText(divResult);

        player.setPontuation(playerPoints);
    }

    public void showQuizResults(View view) {

        if (checkPlayer1EditText() && (checkPlayer2EditText())) {

            verifyAnswersAndCountPoints(player1);
            verifyAnswersAndCountPoints(player2);

            Intent intent = new Intent(this, QuizResult.class);

            //Player 1 intent
            intent.putExtra("Player1Name", player1.getName());
            intent.putExtra("Player1SumResult", player1.getSumResultText());
            intent.putExtra("Player1SubtResult", player1.getSubtResultText());
            intent.putExtra("Player1MultResult", player1.getMultResultText());
            intent.putExtra("Player1DivResult", player1.getDivResultText());
            intent.putExtra("Player1Points", player1.getPontuation());

            //Player 2 intent
            intent.putExtra("Player2Name", player2.getName());
            intent.putExtra("Player2SumResult", player2.getSumResultText());
            intent.putExtra("Player2SubtResult", player2.getSubtResultText());
            intent.putExtra("Player2MultResult", player2.getMultResultText());
            intent.putExtra("Player2DivResult", player2.getDivResultText());
            intent.putExtra("Player2Points", player2.getPontuation());

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
 /*
        if (player1.getPontuation() > player2.getPontuation()){
            intent.putExtra("TheWinner", "The winner is " + player1.getName());
        } else if (player1.getPontuation() < player2.getPontuation()){
            intent.putExtra("TheWinner", "The winner is " + player2.getName());
        } else {
            intent.putExtra("TheWinner", "We have a draw!");
        }
 */
    }
}
