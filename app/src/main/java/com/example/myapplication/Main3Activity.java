package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void actionb(View view) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    public void actionc(View view){
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
}
