package com.example.blippoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name = "Germaninho";
        String email = "email@email";

        WebView webView = findViewById(R.id.web_view);
        webView.loadUrl("https://app-orbi.herokuapp.com/?name="+name+"&email="+email);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}