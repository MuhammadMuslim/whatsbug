package com.AM.whatsbug.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.AM.whatsbug.R;

public class List_bacteria extends AppCompatActivity {
    CheckBox cb1, cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16;
    Button btn1;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab, fab1, fab2;
    private CardView card1, card2;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward, card_open, card_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_bacteria);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);

        /*kenalkan animasi*/
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);
        card_open= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.card_open);
        card_close= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.card_close);

        /*perintah jika tombol diklik, maka jalankan method animateFAB()*/
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFAB();
                Toast.makeText(getApplicationContext(), "Check Bacteria", Toast.LENGTH_SHORT).show();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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

                startActivity(intent);
                Toast.makeText(com.AM.whatsbug.activities.List_bacteria.this, "Gram Negative", Toast.LENGTH_SHORT).show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.AM.whatsbug.activities.List_bacteria.this, "Gram Positive", Toast.LENGTH_SHORT).show();
            }
        });

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
    }
    /*metode untuk menjalankan animasi
        pastikan apakah tombol dalam keadaan true atau false*/
    /*default fab dalam keadaan false/close*/
    public void animateFAB() {
        /*jika fab dalam keadaan false*/
        if (isFabOpen) {
            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            card1.startAnimation(card_close);
            card2.startAnimation(card_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            isFabOpen = false;
        } else {
            /*jika dalam keadaan true*/
            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            card1.startAnimation(card_open);
            card2.startAnimation(card_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            isFabOpen = true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    }
