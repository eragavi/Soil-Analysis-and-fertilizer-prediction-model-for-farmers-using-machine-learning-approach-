package com.cropanalysis;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class NutrientMainActivity4 extends AppCompatActivity {
    ImageView image;
    TextView t1;
    TextView t2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.nutrient_activity_main4);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        this.t2 = (TextView) findViewById(C0360R.id.text2);
        this.t2.setText("தென்னை -  இரும்பு சத்து குறைபாடு ");
        byte[] bytes = getIntent().getByteArrayExtra("BMP");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        this.image = (ImageView) findViewById(C0360R.id.imageView3);
        this.image.setImageBitmap(bmp);
        this.t1 = (TextView) findViewById(C0360R.id.text1);
        this.t1.setText("செய்ய வேண்டியவை: \n அடியுரமாக எக்டருக்கு  25 கிலோ பெரேஸ் சல்பேட்டை இட வேண்டும் ");
    }
}
