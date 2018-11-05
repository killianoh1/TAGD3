package com.tagd.tagd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button createGameBtn, joinGameBtn, currentGameBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        createGameBtn = (Button) findViewById(R.id.createGameBtn);
        joinGameBtn = (Button) findViewById(R.id.joinGameBtn);
        currentGameBtn = (Button) findViewById(R.id.currentGameBtn);


        createGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, CreateGameActivity.class));
            }
        });

        currentGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, QRCodeActivity.class));
            }
        });



    }
}
