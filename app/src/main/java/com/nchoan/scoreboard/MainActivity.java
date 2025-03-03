package com.nchoan.scoreboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

//    private Button buttonReset;
    private TextView textViewScoreA, textViewScoreB;
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.blue_5969C0));

        mapIdToView();
        setUpViews();
    }

    private void mapIdToView() {
//        buttonReset = findViewById(R.id.btn_reset);
        textViewScoreA = findViewById(R.id.lb_scoreA);
        textViewScoreB = findViewById(R.id.lb_scoreB);
    }

    private void setUpViews() {
//        buttonReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textViewScoreA.setText("0");
//                textViewScoreB.setText("0");
//            }
//        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btn_reset) {
                    textViewScoreA.setText("0");
                    textViewScoreB.setText("0");
                } else if (v.getId() == R.id.btn_plus1A) {
                    scoreA += 1;
                    textViewScoreA.setText(String.valueOf(scoreA));
                } else if (v.getId() == R.id.btn_plus2A) {
                    scoreA += 2;
                    textViewScoreA.setText(String.valueOf(scoreA));

                } else if (v.getId() == R.id.btn_plus3A) {
                    scoreA += 3;
                    textViewScoreA.setText(String.valueOf(scoreA));
                } else if (v.getId() == R.id.btn_plus1B) {
                    scoreB += 1;
                    textViewScoreB.setText(String.valueOf(scoreB));
                } else if (v.getId() == R.id.btn_plus2B) {
                    scoreB += 2;
                    textViewScoreB.setText(String.valueOf(scoreB));

                } else if (v.getId() == R.id.btn_plus3B) {
                    scoreB += 3;
                    textViewScoreB.setText(String.valueOf(scoreB));
                } else {
                    return;
                }
            }
        };
        findViewById(R.id.btn_reset).setOnClickListener(listener);
        findViewById(R.id.btn_plus1A).setOnClickListener(listener);
        findViewById(R.id.btn_plus2A).setOnClickListener(listener);
        findViewById(R.id.btn_plus3A).setOnClickListener(listener);
        findViewById(R.id.btn_plus1B).setOnClickListener(listener);
        findViewById(R.id.btn_plus2B).setOnClickListener(listener);
        findViewById(R.id.btn_plus3B).setOnClickListener(listener);
    }
}