package com.example.standardcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView tans;
    boolean addition,subtraction,multiplication,division,reminder,decimal;
    double input1=0,input2=0;
    void clear()
    {
        if(tans.getText().toString().equals("0"))
        {
            tans.setText(null);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bc=(Button)findViewById(R.id.btnc);
        Button bans=(Button)findViewById(R.id.btnans);
        Button b1=(Button) findViewById(R.id.btn1);
        Button b2=(Button) findViewById(R.id.btn2);
        Button b3=(Button) findViewById(R.id.btn3);
        Button badd=(Button)findViewById(R.id.btnadd);
        Button b4=(Button) findViewById(R.id.btn4);
        Button b5=(Button) findViewById(R.id.btn5);
        Button b6=(Button) findViewById(R.id.btn6);
        Button bsub=(Button) findViewById(R.id.btnsub);
        Button b7=(Button) findViewById(R.id.btn7);
        Button b8=(Button) findViewById(R.id.btn8);
        Button b9=(Button) findViewById(R.id.btn9);
        Button bmul=(Button) findViewById(R.id.btnmul);
        Button bdot=(Button) findViewById(R.id.btndot);
        Button b0=(Button) findViewById(R.id.btn0);
        Button brem=(Button) findViewById(R.id.btnrem);
        Button bdiv=(Button) findViewById(R.id.btndiv);
        tans=(TextView) findViewById(R.id.tvans);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append(null);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                tans.append("0");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tans.getText().length() != 0)
                {
                    input1 = Integer.parseInt(tans.getText() + "");
                    addition = true;
                    decimal = false;
                    tans.setText(null);
                }

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tans.getText().length()!=0)
                {
                    input1=Integer.parseInt(tans.getText() + "");
                    subtraction=true;
                    decimal=false;
                    tans.setText(null);
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tans.getText().length() != 0) {
                    input1 = Integer.parseInt(tans.getText() + "");
                    multiplication = true;
                    decimal = false;
                    tans.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tans.getText().length() != 0)
                {
                    input1 = Float.parseFloat(tans.getText() + "");
                    division = true;
                    decimal = false;
                    tans.setText(null);
                }
            }
        });
        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tans.getText().length() != 0) {
                    input1 = Float.parseFloat(tans.getText() + "");
                    reminder = true;
                    decimal = false;
                    tans.setText(null);
                }
            }
        });
        bans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addition || subtraction || multiplication || division || reminder) {
                    input2 = Float.parseFloat(tans.getText() + "");

                }
                if (addition) {
                    tans.setText(input1 + input2 + " ");
                    addition = false;
                }
                if (subtraction) {
                    tans.setText(input1 - input2+ " ");
                    subtraction = false;
                }
                if (multiplication)
                {
                    tans.setText(input1 * input2 +" ");
                    multiplication=false;
                }
                if (division)
                {
                    tans.setText(input1 / input2 + "");
                    division=false;
                }
                if(reminder)
                {
                    tans.setText(input1 % input2 + "");
                    reminder=false;
                }
            }


        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tans.setText("");
                input1=0.0;
                input2=0.0;
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal)
                {

                }
                else
                {
                    tans.setText(tans.getText() + ".");
                    decimal=true;
                }
            }
        });


    }

}

