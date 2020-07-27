package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class P5trivia extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1trivia);
    }
    public void si(View view){
        score++;
        partida--;
        if(score== 5 && partida==0){
            Intent intent = new Intent(this, Ganar.class);
            startActivityForResult(intent,0);
        }
        Random rand = new Random();
        int x= rand.nextInt(3)+1;// valor 0
        if (x==1){
            Intent intent = new Intent(this, P1trivia.class);
            startActivity(intent);
        }
        if (x==2){
            Intent intent = new Intent(this, P2trivia.class);
            startActivity(intent);
        }
        if (x==3){
            Intent intent = new Intent(this, P3trivia.class);
            startActivity(intent);
        }
        if (x==4){
            Intent intent = new Intent(this, P4trivia.class);
            startActivity(intent);
        }
    }
    public void no(View view){
        Intent intent = new Intent(this,Perder.class);
        startActivity(intent);
    }
}