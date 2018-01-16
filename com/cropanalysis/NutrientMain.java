package com.cropanalysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class NutrientMain extends AppCompatActivity {
    private Button b1;
    private Spinner spinner1;
    private Spinner spinner2;

    class C03531 implements OnClickListener {
        C03531() {
        }

        public void onClick(View view) {
            Snackbar.make(view, (CharSequence) "Replace with your own action", 0).setAction((CharSequence) "Action", null).show();
        }
    }

    class C03542 implements OnClickListener {
        C03542() {
        }

        public void onClick(View arg0) {
            String s1 = String.valueOf(NutrientMain.this.spinner1.getSelectedItem());
            String s2 = String.valueOf(NutrientMain.this.spinner2.getSelectedItem());
            Intent i = new Intent(NutrientMain.this.getApplicationContext(), NutrientMainActivity2.class);
            i.putExtra("cropname", s1);
            i.putExtra("nutrition", s2);
            NutrientMain.this.startActivity(i);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.nutrient_main);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        addListenerOnSpinnerItemSelection1();
        addListenerOnSpinnerItemSelection2();
        addListenerOnButton();
        ((FloatingActionButton) findViewById(C0360R.id.fab)).setOnClickListener(new C03531());
    }

    public void addListenerOnSpinnerItemSelection1() {
        this.spinner1 = (Spinner) findViewById(C0360R.id.spinner1);
        this.spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnSpinnerItemSelection2() {
        this.spinner2 = (Spinner) findViewById(C0360R.id.spinner2);
        this.spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener2());
    }

    public void addListenerOnButton() {
        this.spinner1 = (Spinner) findViewById(C0360R.id.spinner1);
        this.spinner2 = (Spinner) findViewById(C0360R.id.spinner2);
        this.b1 = (Button) findViewById(C0360R.id.b1);
        this.b1.setOnClickListener(new C03542());
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
