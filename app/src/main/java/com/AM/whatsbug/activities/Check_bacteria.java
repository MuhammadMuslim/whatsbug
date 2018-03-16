package com.AM.whatsbug.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.TextView;

import com.AM.whatsbug.R;

public class Check_bacteria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bacteria);

        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        TextView t3 = (TextView) findViewById(R.id.t3);
        TextView t4 = (TextView) findViewById(R.id.t4);
        TextView t5 = (TextView) findViewById(R.id.t5);
        TextView t6 = (TextView) findViewById(R.id.t6);
        TextView t7 = (TextView) findViewById(R.id.t7);
        TextView t8 = (TextView) findViewById(R.id.t8);
        TextView t9 = (TextView) findViewById(R.id.t9);
        TextView t10 = (TextView) findViewById(R.id.t10);
        TextView t11 = (TextView) findViewById(R.id.t11);
        TextView t12 = (TextView) findViewById(R.id.t12);
        TextView t13 = (TextView) findViewById(R.id.t13);
        TextView t14 = (TextView) findViewById(R.id.t14);
        TextView t15 = (TextView) findViewById(R.id.t15);
        TextView t16 = (TextView) findViewById(R.id.t16);
//        TextView t17 = (TextView) findViewById(R.id.t17);
        RadioButton r1 = (RadioButton) findViewById(R.id.r1);
        RadioButton r2 = (RadioButton) findViewById(R.id.r2);

        t1.setText(getIntent().getStringExtra("data1"));
        t2.setText(getIntent().getStringExtra("data2"));
        t3.setText(getIntent().getStringExtra("data3"));
        t4.setText(getIntent().getStringExtra("data4"));
        t5.setText(getIntent().getStringExtra("data5"));
        t6.setText(getIntent().getStringExtra("data6"));
        t7.setText(getIntent().getStringExtra("data7"));
        t8.setText(getIntent().getStringExtra("data8"));
        t9.setText(getIntent().getStringExtra("data9"));
        t10.setText(getIntent().getStringExtra("data10"));
        t11.setText(getIntent().getStringExtra("data11"));
        t12.setText(getIntent().getStringExtra("data12"));
        t13.setText(getIntent().getStringExtra("data13"));
        t14.setText(getIntent().getStringExtra("data14"));
        t15.setText(getIntent().getStringExtra("data15"));
        t16.setText(getIntent().getStringExtra("data16"));
//        t17.setText(getIntent().getStringExtra("data17"));
//        String s1 = t3.getText().toString();.
//        float n1,n2;
//        n1 = Float.parseFloat(s1);
//        int n4 = (int) n1;
//
//        if (n4==1){
//            r1.setVisibility(View.INVISIBLE);
//            r2.setVisibility(View.INVISIBLE);
//        }else if(n4==0){
//            r1.setVisibility(View.VISIBLE);
//            r2.setVisibility(View.VISIBLE);
//        }

    }
}
