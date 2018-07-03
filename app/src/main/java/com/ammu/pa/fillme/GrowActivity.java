package com.ammu.pa.fillme;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GrowActivity extends AppCompatActivity {
    Button buttonGrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_grow);
        buttonGrow=findViewById(R.id.ButtonGrow);
    }

    public void onClickR(View view){
        final Button buttonMove = findViewById(R.id.ButtonGrow);
        buttonMove.setText("G R O W");
        buttonMove.setBackgroundColor(Color.GREEN);
        Toast.makeText(this, "Congratulations  AMMU", Toast.LENGTH_SHORT).show();
        // for color change
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){

            @Override
            public void run() {
                buttonMove.setText("G_OW");
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

    public void onClickO(View view){
        view.animate().alpha(0.0f).setDuration(2000);
    }

    public void onClickNext(View view){
        Intent intent = new Intent(this, NeemActivity.class);
        startActivity(intent);
    }

}
