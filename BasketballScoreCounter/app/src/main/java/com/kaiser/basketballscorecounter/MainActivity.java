package com.kaiser.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewScoreA;
    private TextView textViewScoreB;
    private Button buttonAdd1TeamA;
    private Button buttonAdd2TeamA;
    private Button buttonAdd3TeamA;
    private Button buttonAdd1TeamB;
    private Button buttonAdd2TeamB;
    private Button buttonAdd3TeamB;
    private Button buttonReset;
    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapIdToView();
        setupView();
    }

    private void mapIdToView() {
        textViewScoreA  = findViewById(R.id.textViewScoreA);
        textViewScoreB  = findViewById(R.id.textViewScoreB);
        buttonAdd1TeamA = findViewById(R.id.buttonAdd1TeamA);
        buttonAdd2TeamA = findViewById(R.id.buttonAdd2TeamA);
        buttonAdd3TeamA = findViewById(R.id.buttonAdd3TeamA);
        buttonAdd1TeamB = findViewById(R.id.buttonAdd1TeamB);
        buttonAdd2TeamB = findViewById(R.id.buttonAdd2TeamB);
        buttonAdd3TeamB = findViewById(R.id.buttonAdd3TeamB);
        buttonReset     = findViewById(R.id.buttonReset);
    }

    private void setupView() {
        buttonAdd1TeamA.setOnClickListener(this);
        buttonAdd2TeamA.setOnClickListener(this);
        buttonAdd3TeamA.setOnClickListener(this);
        buttonAdd1TeamB.setOnClickListener(this);
        buttonAdd2TeamB.setOnClickListener(this);
        buttonAdd3TeamB.setOnClickListener(this);
        buttonReset.setOnClickListener(this);
    }

    private void updateScore() {
        textViewScoreA.setText(String.valueOf(teamAScore));
        textViewScoreB.setText(String.valueOf(teamBScore));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAdd1TeamA:
                teamAScore++;
                updateScore();
                break;
            case R.id.buttonAdd2TeamA:
                teamAScore += 2;
                updateScore();
                break;
            case R.id.buttonAdd3TeamA:
                teamAScore += 3;
                updateScore();
                break;
            case R.id.buttonAdd1TeamB:
                teamBScore++;
                updateScore();
                break;
            case R.id.buttonAdd2TeamB:
                teamBScore += 2;
                updateScore();
                break;
            case R.id.buttonAdd3TeamB:
                teamBScore += 3;
                updateScore();
                break;
            case R.id.buttonReset:
                teamAScore = 0;
                teamBScore = 0;
                updateScore();
                break;
        }
    }
}