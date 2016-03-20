package com.example.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        Intent intent = getIntent();    // Receiving the Data

        // Player 1 data
        TextView txtPlayer1Name = (TextView) findViewById(R.id.player1_show_name_textview);
        String player1Name = intent.getStringExtra("Player1Name");
        txtPlayer1Name.setText(player1Name);

        TextView txtPlayer1SumResult = (TextView) findViewById(R.id.player1_sum_result_textview);
        String player1SumResult = intent.getStringExtra("Player1SumResult");
        txtPlayer1SumResult.setText(player1SumResult);

        TextView txtPlayer1SubtResult = (TextView) findViewById(R.id.player1_subt_result_textview);
        String player1SubtResult = intent.getStringExtra("Player1SubtResult");
        txtPlayer1SubtResult.setText(player1SubtResult);

        TextView txtPlayer1MultResult = (TextView) findViewById(R.id.player1_mult_result_textview);
        String player1MultResult = intent.getStringExtra("Player1MultResult");
        txtPlayer1MultResult.setText(player1MultResult);

        TextView txtPlayer1DivResult = (TextView) findViewById(R.id.player1_div_result_textview);
        String player1DivResult = intent.getStringExtra("Player1DivResult");
        txtPlayer1DivResult.setText(player1DivResult);

        TextView txtPlayer1Points = (TextView) findViewById(R.id.player1_points_textview);
        int player1Points = intent.getIntExtra("Player1Points", -1);
        txtPlayer1Points.setText("Total: " + player1Points + " points!");

        // Player 2 data
        TextView txtPlayer2Name = (TextView) findViewById(R.id.player2_show_name_textview);
        String player2Name = intent.getStringExtra("Player2Name");
        txtPlayer2Name.setText(player2Name);

        TextView txtPlayer2SumResult = (TextView) findViewById(R.id.player2_sum_result_textview);
        String player2SumResult = intent.getStringExtra("Player2SumResult");
        txtPlayer2SumResult.setText(player2SumResult);

        TextView txtPlayer2SubtResult = (TextView) findViewById(R.id.player2_subt_result_textview);
        String player2SubtResult = intent.getStringExtra("Player2SubtResult");
        txtPlayer2SubtResult.setText(player2SubtResult);

        TextView txtPlayer2MultResult = (TextView) findViewById(R.id.player2_mult_result_textview);
        String player2MultResult = intent.getStringExtra("Player2MultResult");
        txtPlayer2MultResult.setText(player2MultResult);

        TextView txtPlayer2DivResult = (TextView) findViewById(R.id.player2_div_result_textview);
        String player2DivResult = intent.getStringExtra("Player2DivResult");
        txtPlayer2DivResult.setText(player2DivResult);

        TextView txtPlayer2Points = (TextView) findViewById(R.id.player2_points_textview);
        int player2Points = intent.getIntExtra("Player2Points", -1);
        txtPlayer2Points.setText("Total: " + player2Points + " points!");

        TextView txtWinner = (TextView)findViewById(R.id.winner_textview);

        if (player1Points > player2Points){
            txtWinner.setText("The winner is " + player1Name + "!!!");
        } else if (player1Points < player2Points){
            txtWinner.setText("The winner is " + player2Name + "!!!");
        } else {
            txtWinner.setText("We have a draw!");
        }
    }

    public void restartQuiz(View view){
        Intent intent = new Intent(this, MainActivity.class);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
