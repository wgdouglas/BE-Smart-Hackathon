package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        WebView webb = (WebView) findViewById(R.id.webA);
        {

            webb.setWebViewClient(new WebViewClient());
            webb.loadUrl("https://codepen.io/wgdouglas/full/eYOjBpX");


        }


    }
}