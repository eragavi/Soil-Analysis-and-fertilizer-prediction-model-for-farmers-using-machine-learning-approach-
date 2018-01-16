package com.cropanalysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity1 extends AppCompatActivity {
    int count = 0;
    int pos;
    int pos1;
    RadioGroup r1;
    RadioGroup r10;
    RadioGroup r11;
    RadioGroup r2;
    RadioGroup r3;
    RadioGroup r4;
    RadioGroup r5;
    RadioGroup r6;
    RadioGroup r7;
    RadioGroup r8;
    RadioGroup r9;
    int total = 0;
    int[] f16x = new int[11];

    class C03431 implements OnClickListener {
        C03431() {
        }

        public void onClick(View view) {
            Snackbar.make(view, (CharSequence) "Replace with your own action", 0).setAction((CharSequence) "Action", null).show();
        }
    }

    class C03442 implements OnClickListener {
        C03442() {
        }

        public void onClick(View v) {
            MainActivity1.this.count = 0;
            for (int i = 0; i < 11; i++) {
                if (MainActivity1.this.f16x[i] != -1) {
                    MainActivity1 mainActivity1 = MainActivity1.this;
                    mainActivity1.count++;
                }
            }
            float ans = ((float) MainActivity1.this.total) / ((float) MainActivity1.this.count);
            String message = "";
            if (((double) ans) < 0.6d) {
                MainActivity1.this.startActivity(new Intent(MainActivity1.this.getApplicationContext(), NonFertile.class));
            } else if (((double) ans) < 1.4d) {
                MainActivity1.this.startActivity(new Intent(MainActivity1.this.getApplicationContext(), SemiFertile.class));
            } else {
                MainActivity1.this.startActivity(new Intent(MainActivity1.this.getApplicationContext(), Fertile.class));
            }
        }
    }

    class C03453 implements OnCheckedChangeListener {
        C03453() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r1.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[0] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[0];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[0] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[0] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[0] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    class C03464 implements OnCheckedChangeListener {
        C03464() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r2.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[1] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[1];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[1] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[1] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[1] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    class C03475 implements OnCheckedChangeListener {
        C03475() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r3.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[2] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[2];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[2] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[2] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[2] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    class C03486 implements OnCheckedChangeListener {
        C03486() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r4.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[3] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[3];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[3] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[3] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[3] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    class C03497 implements OnCheckedChangeListener {
        C03497() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r5.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[4] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[4];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[4] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[4] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[4] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    class C03508 implements OnCheckedChangeListener {
        C03508() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r6.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[5] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[5];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[5] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[5] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[5] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    class C03519 implements OnCheckedChangeListener {
        C03519() {
        }

        public void onCheckedChanged(RadioGroup group, int checkedId) {
            MainActivity1.this.pos = MainActivity1.this.r7.indexOfChild(MainActivity1.this.findViewById(checkedId));
            if (MainActivity1.this.f16x[6] != -1) {
                MainActivity1.this.total -= MainActivity1.this.f16x[6];
            }
            switch (MainActivity1.this.pos) {
                case 0:
                    MainActivity1.this.total += 2;
                    MainActivity1.this.f16x[6] = 2;
                    return;
                case 1:
                    MainActivity1.this.total++;
                    MainActivity1.this.f16x[6] = 1;
                    return;
                case 2:
                    MainActivity1.this.total += 0;
                    MainActivity1.this.f16x[6] = 0;
                    return;
                default:
                    return;
            }
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.activity_main1);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        ((FloatingActionButton) findViewById(C0360R.id.fab)).setOnClickListener(new C03431());
        for (int i = 0; i < 11; i++) {
            this.f16x[i] = -1;
        }
        ((Button) findViewById(C0360R.id.b1)).setOnClickListener(new C03442());
        this.total = 0;
        this.r1 = (RadioGroup) findViewById(C0360R.id.S11);
        this.r2 = (RadioGroup) findViewById(C0360R.id.S12);
        this.r3 = (RadioGroup) findViewById(C0360R.id.S13);
        this.r4 = (RadioGroup) findViewById(C0360R.id.S21);
        this.r5 = (RadioGroup) findViewById(C0360R.id.S22);
        this.r6 = (RadioGroup) findViewById(C0360R.id.S31);
        this.r7 = (RadioGroup) findViewById(C0360R.id.S32);
        this.r8 = (RadioGroup) findViewById(C0360R.id.S33);
        this.r9 = (RadioGroup) findViewById(C0360R.id.S41);
        this.r10 = (RadioGroup) findViewById(C0360R.id.S42);
        this.r11 = (RadioGroup) findViewById(C0360R.id.S43);
        this.r1.setOnCheckedChangeListener(new C03453());
        this.r2.setOnCheckedChangeListener(new C03464());
        this.r3.setOnCheckedChangeListener(new C03475());
        this.r4.setOnCheckedChangeListener(new C03486());
        this.r5.setOnCheckedChangeListener(new C03497());
        this.r6.setOnCheckedChangeListener(new C03508());
        this.r7.setOnCheckedChangeListener(new C03519());
        this.r8.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                MainActivity1.this.pos = MainActivity1.this.r8.indexOfChild(MainActivity1.this.findViewById(checkedId));
                if (MainActivity1.this.f16x[7] != -1) {
                    MainActivity1.this.total -= MainActivity1.this.f16x[7];
                }
                switch (MainActivity1.this.pos) {
                    case 0:
                        MainActivity1.this.total += 2;
                        MainActivity1.this.f16x[7] = 2;
                        return;
                    case 1:
                        MainActivity1.this.total++;
                        MainActivity1.this.f16x[7] = 1;
                        return;
                    case 2:
                        MainActivity1.this.total += 0;
                        MainActivity1.this.f16x[7] = 0;
                        return;
                    default:
                        return;
                }
            }
        });
        this.r9.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                MainActivity1.this.pos = MainActivity1.this.r9.indexOfChild(MainActivity1.this.findViewById(checkedId));
                if (MainActivity1.this.f16x[8] != -1) {
                    MainActivity1.this.total -= MainActivity1.this.f16x[8];
                }
                switch (MainActivity1.this.pos) {
                    case 0:
                        MainActivity1.this.total += 2;
                        MainActivity1.this.f16x[8] = 2;
                        return;
                    case 1:
                        MainActivity1.this.total++;
                        MainActivity1.this.f16x[8] = 1;
                        return;
                    case 2:
                        MainActivity1.this.total += 0;
                        MainActivity1.this.f16x[8] = 0;
                        return;
                    default:
                        return;
                }
            }
        });
        this.r10.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                MainActivity1.this.pos = MainActivity1.this.r10.indexOfChild(MainActivity1.this.findViewById(checkedId));
                if (MainActivity1.this.f16x[9] != -1) {
                    MainActivity1.this.total -= MainActivity1.this.f16x[9];
                }
                switch (MainActivity1.this.pos) {
                    case 0:
                        MainActivity1.this.total += 2;
                        MainActivity1.this.f16x[9] = 2;
                        return;
                    case 1:
                        MainActivity1.this.total++;
                        MainActivity1.this.f16x[9] = 1;
                        return;
                    case 2:
                        MainActivity1.this.total += 0;
                        MainActivity1.this.f16x[9] = 0;
                        return;
                    default:
                        return;
                }
            }
        });
        this.r11.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                MainActivity1.this.pos = MainActivity1.this.r11.indexOfChild(MainActivity1.this.findViewById(checkedId));
                if (MainActivity1.this.f16x[10] != -1) {
                    MainActivity1.this.total -= MainActivity1.this.f16x[10];
                }
                switch (MainActivity1.this.pos) {
                    case 0:
                        MainActivity1.this.total += 2;
                        MainActivity1.this.f16x[10] = 2;
                        return;
                    case 1:
                        MainActivity1.this.total++;
                        MainActivity1.this.f16x[10] = 1;
                        return;
                    case 2:
                        MainActivity1.this.total += 0;
                        MainActivity1.this.f16x[10] = 0;
                        return;
                    default:
                        return;
                }
            }
        });
    }
}
