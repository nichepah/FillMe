package com.ammu.pa.fillme;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NeemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neem);
    }

    public void onClickE(View view){
        final Button buttonMove = findViewById(R.id.ButtonNeem);
        buttonMove.setText("N E E M");
        buttonMove.setBackgroundColor(Color.GREEN);
        Toast.makeText(this, "Congratulations  AMMU", Toast.LENGTH_SHORT).show();
        // for color change
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){

            @Override
            public void run() {
                buttonMove.setText("NE_M");
                buttonMove.setBackgroundColor(Color.WHITE);
            }
        }, 2000);
    }

    public void onClickR(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickK(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickO(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickNext(View view){
        Intent intent = new Intent(this, RoseActivity.class);
        startActivity(intent);
    }
}
