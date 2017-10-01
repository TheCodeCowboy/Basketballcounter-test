package com.example.maupi.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;
import static com.example.maupi.basketballcounter.R.id.team_a_score;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
        {
            ScoreTeamA = savedInstanceState.getInt("ScoreTeamA");
            ScoreTeamB = savedInstanceState.getInt("ScoreTeamB");
        }
    }
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putInt("ScoreTeamA", ScoreTeamA);
        savedInstanceState.putInt("ScoreTeamB", ScoreTeamB);
    }

    public void addThreeForA(View v)
    {
        ScoreTeamA += 3;
        displayTeamA(ScoreTeamA);
    }
    public void addTwoForA(View v)
    {
        ScoreTeamA += 2;
        displayTeamA(ScoreTeamA);
    }
    public void addOneForA(View v)
    {
        ScoreTeamA += 1;
        displayTeamA(ScoreTeamA);
    }

    public void displayTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForB(View v)
    {
        ScoreTeamB += 3;
        displayTeamB(ScoreTeamB);
    }
    public void addTwoForB(View v)
    {
        ScoreTeamB += 2;
        displayTeamB(ScoreTeamB);
    }
    public void addOneForB(View v)
    {
        ScoreTeamB += 1;
        displayTeamB(ScoreTeamB);
    }

    public void displayTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View v)
    {
        ScoreTeamB = 0;
        ScoreTeamA = 0;
        displayTeamA(ScoreTeamA);
        displayTeamB(ScoreTeamB);
    }
}
