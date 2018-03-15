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

        TextView tv = (TextView) findViewById(R.id.txv);
        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        TextView t3 = (TextView) findViewById(R.id.t3);
        RadioButton r1 = (RadioButton) findViewById(R.id.r1);
        RadioButton r2 = (RadioButton) findViewById(R.id.r2);

        tv.setText(getIntent().getStringExtra("data1"));
        t1.setText(getIntent().getStringExtra("data2"));
//        t3.setText(getIntent().getStringExtra("data3"));
//        String s1 = t3.getText().toString();
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
