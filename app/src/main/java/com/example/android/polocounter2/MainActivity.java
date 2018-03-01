package com.example.android.polocounter2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int goalTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int red_cardTeamA = 0;
    int red_cardTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamAFoul(0);
        displayForTeamBFoul(0);
        displayForTeamAPenalty(0);
        displayForTeamBPenalty(0);
        displayForTeamARed(0);
        displayForTeamBRed(0);
    }

    public void addOneForTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayForTeamA(goalTeamA);
    }

    public void addOneForTeamB(View v) {
        goalTeamB = goalTeamB + 1;
        displayForTeamB(goalTeamB);
    }

    public void addOneForTeamAFoul(View v) {
        foulTeamA = foulTeamA + 1;
        displayForTeamAFoul(foulTeamA);
    }

    public void addOneForTeamBFoul(View v) {
        foulTeamB = foulTeamB + 1;
        displayForTeamBFoul(foulTeamB);
    }

    public void addOneForTeamBPenalty(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayForTeamBPenalty(penaltyTeamB);
    }

    public void addOneForTeamAPenalty(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayForTeamAPenalty(penaltyTeamA);
    }

    public void addOneForTeamARed(View v) {
        red_cardTeamA = red_cardTeamA + 1;
        displayForTeamARed(red_cardTeamA);
    }

    public void addOneForTeamBRed(View v) {
        red_cardTeamB = red_cardTeamB + 1;
        displayForTeamBRed(red_cardTeamB);
    }


    /**
     * Resets all score for Team A and Team B.
     */

    public void Reset (View v){
        goalTeamA = 0;
        goalTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        red_cardTeamA = 0;
        red_cardTeamB = 0;
        displayForTeamB(goalTeamA);
        displayForTeamA(goalTeamB);
        displayForTeamARed(red_cardTeamA);
        displayForTeamBRed(red_cardTeamB);
        displayForTeamAFoul(foulTeamA);
        displayForTeamBFoul(foulTeamB);
        displayForTeamAPenalty(penaltyTeamA);
        displayForTeamBPenalty(penaltyTeamB);

    }

        /**
         * Displays the goal score for Team A.
         */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goal score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView =(TextView) findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the  foul score for Team A.
     */
    public void displayForTeamAFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team B.
     */
    public void displayForTeamBFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalty score for Team A.
     */
    public void displayForTeamAPenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the penalty score for Team B.
     */
    public void displayForTeamBPenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red_card score for Team A.
     */
    public void displayForTeamARed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red_card score for Team B.
     */
    public void displayForTeamBRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_score);
        scoreView.setText(String.valueOf(score));
    }

}



