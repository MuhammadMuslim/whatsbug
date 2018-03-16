package com.AM.whatsbug.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.AM.whatsbug.R;

public class List_bacteria extends AppCompatActivity {
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17;
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
        cb7 = (CheckBox)findViewById(R.id.cb7);
        cb8 = (CheckBox)findViewById(R.id.cb8);
        cb9 = (CheckBox)findViewById(R.id.cb9);
        cb10 = (CheckBox)findViewById(R.id.cb10);
        cb11 = (CheckBox)findViewById(R.id.cb11);
        cb12 = (CheckBox)findViewById(R.id.cb12);
        cb13 = (CheckBox)findViewById(R.id.cb13);
        cb14 = (CheckBox)findViewById(R.id.cb14);
        cb15 = (CheckBox)findViewById(R.id.cb15);
        cb16 = (CheckBox)findViewById(R.id.cb16);
//        cb17 = (CheckBox)findViewById(R.id.cb17);

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
                String g="";
                String h="";
                String i="";
                String j="";
                String k="";
                String l="";
                String m="";
                String n="";
                String o="";
                String p="";
//                String q="";

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

                }if(cb7.isChecked()){
                    g+="Citrate";

                }if(cb8.isChecked()){
                    h+="Urease";

                }if(cb9.isChecked()){
                    i+="H2S";

                }if(cb10.isChecked()){
                    j+="Strach";

                }if(cb11.isChecked()){
                    k+="Glucose";

                }if(cb12.isChecked()){
                    l+="Lactose";

                }if(cb13.isChecked()){
                    m+="Sucrose";

                }if(cb14.isChecked()){
                    n+="Mannitol";

                }if(cb15.isChecked()){
                    o+="Obligate aerobes/Facultative anaerobes";

                }if(cb16.isChecked()){
                    p+="Nitrate reduction";

                }
//                if(cb17.isChecked()){
//                    q+="Lactose";
//
//                }

                intent.putExtra("data1", a);
                intent.putExtra("data2", b);
                intent.putExtra("data3", c);
                intent.putExtra("data4", d);
                intent.putExtra("data5", e);
                intent.putExtra("data6", f);
                intent.putExtra("data7", g);
                intent.putExtra("data8", h);
                intent.putExtra("data9", i);
                intent.putExtra("data10", j);
                intent.putExtra("data11", k);
                intent.putExtra("data12", l);
                intent.putExtra("data13", m);
                intent.putExtra("data14", n);
                intent.putExtra("data15", o);
                intent.putExtra("data16", p);
//                intent.putExtra("data17", q);
                startActivity(intent);
            }
        });

    }



    }
