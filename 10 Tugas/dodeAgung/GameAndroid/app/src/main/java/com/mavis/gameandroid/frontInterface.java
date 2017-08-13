package com.mavis.gameandroid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class frontInterface extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_interface);
        final Button button3A = findViewById(R.id.btn3A);
        final Button button2A = findViewById(R.id.btn2A);
        final Button buttonA = findViewById(R.id.btnA);
        final Button button3B = findViewById(R.id.btn3B);
        final Button button2B = findViewById(R.id.btn2B);
        final Button buttonB = findViewById(R.id.btnB);
        final Button buttonUndo = findViewById(R.id.btnUndo);
        final TextView txtscoreA = (TextView) findViewById(R.id.scoreA);
        final TextView txtscoreB = (TextView) findViewById(R.id.scoreB);


        button3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreTemp = (int) Integer.parseInt(txtscoreA.getText().toString());
                scoreTemp += 3;
                txtscoreA.setText(String.valueOf(scoreTemp));
            }
        });
        button2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreTemp = (int) Integer.parseInt(txtscoreA.getText().toString());
                scoreTemp += 2;
                txtscoreA.setText(String.valueOf(scoreTemp));
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreTemp = (int) Integer.parseInt(txtscoreA.getText().toString());
                scoreTemp += 1;
                txtscoreA.setText(String.valueOf(scoreTemp));
            }
        });
        buttonUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtscoreA.setText("0");
                txtscoreB.setText("0");
            }
        });
        button3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreTemp = (int) Integer.parseInt(txtscoreB.getText().toString());
                scoreTemp += 3;
                txtscoreB.setText(String.valueOf(scoreTemp));
            }
        });
        button2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreTemp = (int) Integer.parseInt(txtscoreB.getText().toString());
                scoreTemp += 2;
                txtscoreB.setText(String.valueOf(scoreTemp));
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreTemp = (int) Integer.parseInt(txtscoreB.getText().toString());
                scoreTemp += 1;
                txtscoreB.setText(String.valueOf(scoreTemp));
            }
        });
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        final TextView txtscoreA = (TextView) findViewById(R.id.scoreA);
        final TextView txtscoreB = (TextView) findViewById(R.id.scoreB);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putString("textscoreA",txtscoreA.getText().toString());
        savedInstanceState.putString("textscoreB",txtscoreB.getText().toString());
    }
}
