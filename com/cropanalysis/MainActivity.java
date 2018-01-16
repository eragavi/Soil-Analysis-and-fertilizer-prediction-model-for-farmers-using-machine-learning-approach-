package com.cropanalysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;

    class C03391 implements OnClickListener {
        C03391() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), MainActivity1.class));
        }
    }

    class C03402 implements OnClickListener {
        C03402() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), Fertilizer.class));
        }
    }

    class C03413 implements OnClickListener {
        C03413() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), NutrientMain.class));
        }
    }

    class C03424 implements OnClickListener {
        C03424() {
        }

        public void onClick(View arg0) {
            MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), MapActivity.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        this.image1 = (ImageView) findViewById(C0360R.id.imageView1);
        this.image2 = (ImageView) findViewById(C0360R.id.imageView2);
        this.image3 = (ImageView) findViewById(C0360R.id.imageView3);
        this.image4 = (ImageView) findViewById(C0360R.id.imageView4);
    }

    public void image1_onclick(View view) {
        this.image1.setOnClickListener(new C03391());
    }

    public void image2_onclick(View view) {
        this.image2.setOnClickListener(new C03402());
    }

    public void image3_onclick(View view) {
        this.image3.setOnClickListener(new C03413());
    }

    public void image4_onclick(View view) {
        this.image4.setOnClickListener(new C03424());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0360R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == C0360R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
