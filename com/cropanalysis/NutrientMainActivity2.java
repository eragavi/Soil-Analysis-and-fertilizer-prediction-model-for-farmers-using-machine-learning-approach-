package com.cropanalysis;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;

public class NutrientMainActivity2 extends AppCompatActivity {
    ImageView image1;
    ImageView image2;

    class C03551 implements OnClickListener {
        C03551() {
        }

        public void onClick(View arg0) {
            Intent i = new Intent(NutrientMainActivity2.this.getApplicationContext(), NutrientMainActivity4.class);
            NutrientMainActivity2.this.image1.buildDrawingCache();
            Bitmap image = NutrientMainActivity2.this.image1.getDrawingCache();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            image.compress(CompressFormat.PNG, 100, stream);
            i.putExtra("BMP", stream.toByteArray());
            NutrientMainActivity2.this.startActivity(i);
        }
    }

    class C03562 implements OnClickListener {
        C03562() {
        }

        public void onClick(View arg0) {
            Intent i = new Intent(NutrientMainActivity2.this.getApplicationContext(), NutrientMainActivity5.class);
            NutrientMainActivity2.this.image2.buildDrawingCache();
            Bitmap image = NutrientMainActivity2.this.image2.getDrawingCache();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            image.compress(CompressFormat.PNG, 100, stream);
            i.putExtra("BMP", stream.toByteArray());
            NutrientMainActivity2.this.startActivity(i);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.nutrient_activity_main2);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("cropname", "s1");
        String value2 = extras.getString("nutrition", "s2");
        if (value1.contains("தென்னை") && value2.contains("இரும்பு")) {
            this.image1 = (ImageView) findViewById(C0360R.id.imageView1);
            image1_onclick();
            this.image2 = (ImageView) findViewById(C0360R.id.imageView2);
            image2_onclick();
        } else if (value1.contains("நெல்") && value2.contains("இரும்பு")) {
            startActivity(new Intent(getApplicationContext(), NutrientMainActivity6.class));
        }
    }

    public void image1_onclick() {
        this.image1.setImageResource(C0360R.drawable.a1);
        this.image1.setOnClickListener(new C03551());
    }

    public void image2_onclick() {
        this.image2.setImageResource(C0360R.drawable.a1);
        this.image2.setOnClickListener(new C03562());
    }
}
