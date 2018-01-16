package com.cropanalysis;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class OutputFertilizer extends AppCompatActivity {
    ImageView i1;
    TextView t1;

    class C03591 implements OnClickListener {
        C03591() {
        }

        public void onClick(View view) {
            Snackbar.make(view, (CharSequence) "Replace with your own action", 0).setAction((CharSequence) "Action", null).show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.activity_output_fertilizer);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        ((FloatingActionButton) findViewById(C0360R.id.fab)).setOnClickListener(new C03591());
        Bundle extras = getIntent().getExtras();
        String value = "";
        if (extras != null) {
            value = extras.getString("value");
        }
        this.t1 = (TextView) findViewById(C0360R.id.t1);
        this.i1 = (ImageView) findViewById(C0360R.id.i1);
        if (value.equals("Urea")) {
            this.i1.setImageResource(C0360R.drawable.urea1);
            this.t1.setText("யூரியா");
            return;
        }
        this.i1.setImageResource(C0360R.drawable.mop1);
        this.t1.setText("பொட்டாஷ் மியூரியேட் ");
    }
}
