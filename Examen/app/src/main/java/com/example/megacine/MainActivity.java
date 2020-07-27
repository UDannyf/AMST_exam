package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btniniciar;
    public int score;
    public int partida = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btniniciar = (Button)findViewById(R.id.iniciar);
    }

    public void iniciartrivia(View view){
        Random rand = new Random();
        int x= rand.nextInt(4)+1;// valor 0
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
        if (x==5){
            Intent intent = new Intent(this, P5trivia.class);
            startActivity(intent);
        }

    }

}