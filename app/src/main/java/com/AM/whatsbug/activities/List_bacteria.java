package com.AM.whatsbug.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.AM.whatsbug.R;

public class List_bacteria extends AppCompatActivity {
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16;
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
//        cb18 = (CheckBox)findViewById(R.id.cb18);
//        cb19 = (CheckBox)findViewById(R.id.cb19);
//        cb20 = (CheckBox)findViewById(R.id.cb20);
//        cb21 = (CheckBox)findViewById(R.id.cb21);

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
//                String r="";
//                String s="";
//                String t="";
//                String u="";

                if(cb1.isChecked()){
                    a+="1";
                }else{
                    a+="0";
                }
                if(cb2.isChecked()){
                    b+="1";
                }else{
                    b+="0";
                }
                if(cb3.isChecked()){
                    c+="1";
                }else{
                    c+="0";
                }
                if(cb4.isChecked()){
                    d+="1";
                }else{
                    d+="0";
                }
                if(cb5.isChecked()){
                    e+="1";
                }else{
                    e+="0";
                }
                if(cb6.isChecked()) {
                    f +="1";
                }else{
                    f+="0";
                }

                if(cb7.isChecked()){
                    g+="1";
                }else{
                    g+="0";
                }

                if(cb8.isChecked()) {
                    h +="1";
                }else{
                    h+="0";
                }
                if(cb9.isChecked()){
                    i+="1";
                }else{
                    i+="0";
                }
                if(cb10.isChecked()){
                    j+="1";
                }else{
                    j+="0";
                }
                if(cb11.isChecked()){
                    k+="1";
                }else{
                    k+="0";
                }
                if(cb12.isChecked()){
                    l+="1";
                }else{
                    l+="0";
                }
                if(cb13.isChecked()){
                    m+="1";
                }else{
                    m+="0";
                }
                if(cb14.isChecked()) {
                    n +="1";
                }else{
                    n+="0";
                }

                if(cb15.isChecked()){
                    o+="1";
                }else{
                    o+="0";
                }

                if(cb16.isChecked()){
                    p+="1";
                }else{
                    p+="0";
                }

//                if(cb17.isChecked()){
//                    q+="1";
//                }else{
//                    q+="0";
//                }
//
//                if(cb18.isChecked()){
//                    r+="1";
//                }else{
//                    r+="0";
//                }
//
//                if(cb19.isChecked()){
//                    s+="1";
//                }else{
//                    s+="0";
//                }
//
//                if(cb20.isChecked()){
//                    t+="1";
//                }else{
//                    t+="0";
//                }
//
//                if(cb21.isChecked()){
//                    u+="1";
//                }else{
//                    u+="0";
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
//                intent.putExtra("data18", r);
//                intent.putExtra("data19", s);
//                intent.putExtra("data20", t);
//                intent.putExtra("data21", u);
                startActivity(intent);
            }
        });

    }



    }
