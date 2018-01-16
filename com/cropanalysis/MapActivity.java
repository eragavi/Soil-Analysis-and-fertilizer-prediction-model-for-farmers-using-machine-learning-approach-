package com.cropanalysis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MapActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.activity_map);
        ((WebView) findViewById(C0360R.id.webView)).loadUrl("https://www.google.co.in/maps/search/nearby+soil+centre/");
    }
}
