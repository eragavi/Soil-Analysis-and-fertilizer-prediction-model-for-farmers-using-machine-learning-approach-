package com.cropanalysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Fertilizer extends AppCompatActivity {
    Button f12b;
    Spinner crop;
    Spinner irrigation;
    EditText f13k;
    EditText f14n;
    EditText f15p;
    Spinner soil;
    Spinner village;

    class C03381 implements OnClickListener {
        C03381() {
        }

        public void onClick(View v) {
            String crop1;
            String soil1;
            String village1;
            String irrigation1;
            if (Fertilizer.this.crop.getSelectedItemPosition() == 0) {
                crop1 = "paddy";
            } else {
                crop1 = "ground";
            }
            if (Fertilizer.this.soil.getSelectedItemPosition() == 0) {
                soil1 = "r";
            } else {
                soil1 = "b";
            }
            if (Fertilizer.this.village.getSelectedItemPosition() == 0) {
                village1 = "m";
            } else {
                village1 = "p";
            }
            if (Fertilizer.this.irrigation.getSelectedItemPosition() == 0) {
                irrigation1 = "r";
            } else {
                irrigation1 = "i";
            }
            try {
                String message = CropClass.fertilizerRecommendation(Double.parseDouble(Fertilizer.this.f14n.getText().toString()), Double.parseDouble(Fertilizer.this.f15p.getText().toString()), Double.parseDouble(Fertilizer.this.f13k.getText().toString()), soil1, irrigation1, village1, crop1);
                Bundle bundle = new Bundle();
                bundle.putString("value", message);
                Intent intent = new Intent(Fertilizer.this.getApplicationContext(), OutputFertilizer.class);
                intent.putExtras(bundle);
                Fertilizer.this.startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(Fertilizer.this, "Enter valid data", 0).show();
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.activity_fertilizer);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        this.crop = (Spinner) findViewById(C0360R.id.s1);
        this.soil = (Spinner) findViewById(C0360R.id.s2);
        this.village = (Spinner) findViewById(C0360R.id.s3);
        this.irrigation = (Spinner) findViewById(C0360R.id.s4);
        this.f14n = (EditText) findViewById(C0360R.id.e1);
        this.f15p = (EditText) findViewById(C0360R.id.e2);
        this.f13k = (EditText) findViewById(C0360R.id.e3);
        this.f12b = (Button) findViewById(C0360R.id.bn);
        this.f12b.setOnClickListener(new C03381());
    }
}
