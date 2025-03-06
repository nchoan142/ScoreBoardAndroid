package com.nchoan.scoreboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    // R: Resource
    private Button btnReset;
    private Button btnPlus1A;
    private Button btnPlus2A;
    private Button btnPlus3A;
    private Button btnPlus1B;
    private Button btnPlus2B;
    private Button btnPlus3B;
    private TextView tvScoreA, tvScoreB;
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
        btnReset = findViewById(R.id.btn_reset);
        btnPlus1A = findViewById(R.id.btn_plus1A);
        btnPlus2A = findViewById(R.id.btn_plus2A);
        btnPlus3A = findViewById(R.id.btn_plus3A);
        btnPlus1B = findViewById(R.id.btn_plus1B);
        btnPlus2B = findViewById(R.id.btn_plus2B);
        btnPlus3B = findViewById(R.id.btn_plus3B);
        tvScoreA = findViewById(R.id.lb_scoreA);
        tvScoreB = findViewById(R.id.lb_scoreB);
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
                if (v.getId() == R.id.btn_reset) {
                    scoreA = 0;
                    scoreB = 0;
                    tvScoreA.setText(String.valueOf(scoreA));
                    tvScoreB.setText(String.valueOf(scoreB));
                } else if (v.getId() == R.id.btn_plus1A) {
                    scoreA += 1;
                    tvScoreA.setText(String.valueOf(scoreA));
                } else if (v.getId() == R.id.btn_plus2A) {
                    scoreA += 2;
                    tvScoreA.setText(String.valueOf(scoreA));

                } else if (v.getId() == R.id.btn_plus3A) {
                    scoreA += 3;
                    tvScoreA.setText(String.valueOf(scoreA));
                } else if (v.getId() == R.id.btn_plus1B) {
                    scoreB += 1;
                    tvScoreB.setText(String.valueOf(scoreB));
                } else if (v.getId() == R.id.btn_plus2B) {
                    scoreB += 2;
                    tvScoreB.setText(String.valueOf(scoreB));

                } else if (v.getId() == R.id.btn_plus3B) {
                    scoreB += 3;
                    tvScoreB.setText(String.valueOf(scoreB));
                } else {
                }
            }
        };

        btnReset.setOnClickListener(listener);
        btnPlus1A.setOnClickListener(listener);
        btnPlus2A.setOnClickListener(listener);
        btnPlus3A.setOnClickListener(listener);
        btnPlus1B.setOnClickListener(listener);
        btnPlus2B.setOnClickListener(listener);
        btnPlus3B.setOnClickListener(listener);
    }
}