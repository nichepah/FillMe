package com.ammu.pa.fillme;

/*
 * Written by pa for Ammu in June 2018
 * to help her with her studies
 *
 */

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMove = findViewById(R.id.ButtonMove);
        buttonMove.setText("MO_E");
    }

    public void onClickV(View view){
        final Button buttonMove = findViewById(R.id.ButtonMove);
        buttonMove.setText("M O V E");
        buttonMove.setBackgroundColor(Color.GREEN);
        Toast.makeText(this, "Congratulations  AMMU", Toast.LENGTH_SHORT).show();
        // for color change
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){

            @Override
            public void run() {
                buttonMove.setText("MO_E");
                buttonMove.setBackgroundColor(Color.WHITE);
            }
        }, 2000);
    }

    public void onClickE(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickK(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickP(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickNext(View view){
        Intent intent = new Intent(this, GrowActivity.class);
        startActivity(intent);
    }

}
