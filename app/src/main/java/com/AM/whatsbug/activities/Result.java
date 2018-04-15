package com.AM.whatsbug.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.AM.whatsbug.R;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView t1 = (TextView) findViewById(R.id.t1);
        t1.setText(getIntent().getStringExtra("data1"));

//        String s1 = t1.getText().toString();
//        String s2 = t2.getText().toString();
//        String s3 = t3.getText().toString();
//        String s4 = t4.getText().toString();
//        String s5 = t5.getText().toString();
//        String s6 = t6.getText().toString();
//        String s7 = t7.getText().toString();
//        String s8 = t8.getText().toString();
//        String s9 = t9.getText().toString();
//        String s10 = t10.getText().toString();
//        String s11 = t11.getText().toString();
//        String s12 = t12.getText().toString();
//        String s13 = t13.getText().toString();
//        String s14 = t14.getText().toString();
//        String s15 = t15.getText().toString();
//        String s16 = t16.getText().toString();

        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16;
//        n1 = Integer.parseInt(s1);
//        n2 = Integer.parseInt(s2);
//        n3 = Integer.parseInt(s3);
//        n4 = Integer.parseInt(s4);
//        n5 = Integer.parseInt(s5);
//        n6 = Integer.parseInt(s6);
//        n7 = Integer.parseInt(s7);
//        n8 = Integer.parseInt(s8);
//        n9 = Integer.parseInt(s9);
//        n10 = Integer.parseInt(s10);
//        n11 = Integer.parseInt(s11);
//        n12 = Integer.parseInt(s12);
//        n13 = Integer.parseInt(s13);
//        n14 = Integer.parseInt(s14);
//        n15 = Integer.parseInt(s15);
//        n16 = Integer.parseInt(s16);

//        if (n1==1){
//            t1.setText("Motility");
//        }else if(n1==0){
//            t1.setVisibility(View.GONE);
//        }
    }
}
