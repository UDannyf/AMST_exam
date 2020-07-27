package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Perder extends MainActivity {
    public TextView scoreText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perder);
        scoreText = (TextView)findViewById(R.id.score);
        scoreText.setText(score);
    }
    public void nueva_paritda(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void salir(View view)
    {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}