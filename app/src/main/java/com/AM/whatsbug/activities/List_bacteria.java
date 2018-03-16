package com.AM.whatsbug.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.AM.whatsbug.R;

public class List_bacteria extends AppCompatActivity {
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bacteria);


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
                String f="";

                if(cb1.isChecked()){
                    a+="Motility";
                }
                if(cb2.isChecked()){
                    b+="Catalase";

                }
                if(cb3.isChecked()){
                    c+="Oxidase";

                }
                if(cb4.isChecked()){
                    d+="Indole";
                }
                if(cb5.isChecked()){
                    e+="MR";
                }
                if(cb6.isChecked()){
                    f+="VP";

                }

                intent.putExtra("data1", a);
                intent.putExtra("data2", b);
                intent.putExtra("data3", c);
                intent.putExtra("data4", d);
                intent.putExtra("data5", e);
                intent.putExtra("data6", f);
                startActivity(intent);
            }
        });

    }



    }
