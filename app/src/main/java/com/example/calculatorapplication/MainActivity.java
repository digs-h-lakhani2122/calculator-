package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,
           b6,b7,b8,b9,b10,
           b11,b12,b13,b14,b15,
           b16,b17,b18,b19,b20;
    EditText e1;
    double input1=0,input2=0;
    boolean addition,substract,division,multiplication,reminder,decimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b10=(Button) findViewById(R.id.b10);
        b11=(Button) findViewById(R.id.b11);
        b12=(Button) findViewById(R.id.b12);
        b13=(Button) findViewById(R.id.b13);
        b14=(Button) findViewById(R.id.b14);
        b15=(Button) findViewById(R.id.b15);
        b16=(Button) findViewById(R.id.b16);
        b17=(Button) findViewById(R.id.b17);
        b18=(Button) findViewById(R.id.b18);
        b19=(Button) findViewById(R.id.b19);
        b20=(Button) findViewById(R.id.b20);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"1");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"2");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"3");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"4");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"5");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"6");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"7");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"8");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"9");
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"00");
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"0");
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+".");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()!=0)
                {
                    input1=Float.parseFloat(e1.getText()+"");
                    addition =true;
                    decimal=false;
                    e1.setText(null);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()!=0)
                {
                    input1=Float.parseFloat(e1.getText()+"");
                    substract =true;
                    decimal=false;
                    e1.setText(null);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()!=0)
                {
                    input1=Float.parseFloat(e1.getText()+"");
                    multiplication =true;
                    decimal=false;
                    e1.setText(null);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()!=0)
                {
                    input1=Float.parseFloat(e1.getText()+"");
                    division =true;
                    decimal=false;
                    e1.setText(null);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().length()!=0)
                {
                    input1=Float.parseFloat(e1.getText()+"");
                    reminder =true;
                    decimal=false;
                    e1.setText(null);
                }
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addition||substract||multiplication||division||reminder)
                {
                    input2=Float.parseFloat(e1.getText()+"");
                }
                if(addition)
                {
                    e1.setText(input1+input2+"");
                    addition=false;
                }
                if(substract)
                {
                    e1.setText(input1-input2+"");
                    substract=false;
                }
                if(multiplication)
                {
                    e1.setText(input1*input2+"");
                    multiplication=false;
                }
                if(division)
                {
                    e1.setText(input1/input2+"");
                    division=false;
                }
                if(reminder)
                {
                    e1.setText(input1%input2+"");
                    reminder=false;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                input1=0.0;
                input2=0.0;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                s=s.substring(0,s.length()-1);
                e1.setText(s);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+".");
            }
        });
    }
}