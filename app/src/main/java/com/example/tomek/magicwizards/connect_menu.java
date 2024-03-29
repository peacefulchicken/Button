package com.example.tomek.magicwizards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class connect_menu extends AppCompatActivity {
    private Button startGame;
    private Button joinGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_menu);

        //TODO: Wystartowanie servera
        startGame = (Button) findViewById(R.id.button3);
        startGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View x){
                startGame();
            }
        });

        //TODO: Dolaczenie servera
        joinGame = (Button) findViewById(R.id.button4);
        joinGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View x){
                joinGame();
            }
        });
    }
    //Funkcja przenoszaca z jednego activity do drugiego
    public void startGame(){
        Intent intent = new Intent(this, CustomGesturesActivity.class);
        startActivity(intent);
    }
    public void joinGame(){
        Intent intent = new Intent(this, CustomGesturesActivity.class);
        startActivity(intent);
    }
}
