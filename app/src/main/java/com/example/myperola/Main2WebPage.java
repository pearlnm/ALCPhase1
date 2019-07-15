package com.example.myperola;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Main2WebPage extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_web_page);

        WebView About_us_Wb = findViewById(R.id.webView);
        About_us_Wb.setWebViewClient(new WebViewClient());
        About_us_Wb.getSettings().getLoadsImagesAutomatically();
        WebSettings wbSettings = About_us_Wb.getSettings();
        wbSettings.setJavaScriptEnabled(true);
        About_us_Wb.loadUrl("http://www.andela.com/alc");
    }
}