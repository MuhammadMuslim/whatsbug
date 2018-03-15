package com.AM.whatsbug.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class List_bacteria extends AppCompatActivity {
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Check_bacteria);


        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);
        cb4 = (CheckBox)findViewById(R.id.cb4);
        cb5 = (CheckBox)findViewById(R.id.cb5);
        cb6 = (CheckBox)findViewById(R.id.cb6);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(List_bacteria.this, Check_bacteria.class);

                String a="";
                String b="";
                String c="";
                String d="";
                String e="";

                if(cb1.isChecked()){
                    a+="Java ";
                }
                if(cb2.isChecked()){
                    a+="PHP ";

                }
                if(cb3.isChecked()){
                    b+="C++ ";

                }
                if(cb4.isChecked()){
                    c+="Actionscript ";
                }
                if(cb5.isChecked()){
                    d+="Phyton ";
                }
                if(cb6.isChecked()){
                    e+="Javascript ";

                }

                intent.putExtra("data1", a);
                intent.putExtra("data2", b);
                startActivity(intent);
            }
        });

    }



    }
