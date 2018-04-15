package com.AM.whatsbug.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        RadioButton r3 = (RadioButton) findViewById(R.id.r3);
        RadioButton r4 = (RadioButton) findViewById(R.id.rg4);
        RadioButton r5 = (RadioButton) findViewById(R.id.rg5);
        RadioButton r6 = (RadioButton) findViewById(R.id.r6);
        RadioButton r7 = (RadioButton) findViewById(R.id.r7);
        RadioButton r8 = (RadioButton) findViewById(R.id.r8);
        RadioButton r9 = (RadioButton) findViewById(R.id.r9);
        RadioButton r10 = (RadioButton) findViewById(R.id.r10);
        RadioButton r11 = (RadioButton) findViewById(R.id.r11);
        RadioButton r12 = (RadioButton) findViewById(R.id.r12);
        RadioButton r13 = (RadioButton) findViewById(R.id.r13);
        RadioButton r14 = (RadioButton) findViewById(R.id.r14);
        RadioButton r15 = (RadioButton) findViewById(R.id.r15);
        RadioButton r16 = (RadioButton) findViewById(R.id.r16);
        RadioButton r17 = (RadioButton) findViewById(R.id.r17);
        RadioButton r18 = (RadioButton) findViewById(R.id.r18);
        RadioButton r19 = (RadioButton) findViewById(R.id.r19);
        RadioButton r20 = (RadioButton) findViewById(R.id.r20);
        RadioButton r21 = (RadioButton) findViewById(R.id.r21);
        RadioButton r22 = (RadioButton) findViewById(R.id.r22);
        RadioButton r23 = (RadioButton) findViewById(R.id.r23);
        RadioButton r24 = (RadioButton) findViewById(R.id.r24);
        RadioButton r25 = (RadioButton) findViewById(R.id.r25);
        RadioButton r26 = (RadioButton) findViewById(R.id.r26);
        RadioButton r27 = (RadioButton) findViewById(R.id.r27);
        RadioButton r28 = (RadioButton) findViewById(R.id.r28);
        RadioButton r29 = (RadioButton) findViewById(R.id.r29);
        RadioButton r30 = (RadioButton) findViewById(R.id.r30);
        RadioButton r31 = (RadioButton) findViewById(R.id.r31);
        RadioButton r32 = (RadioButton) findViewById(R.id.r32);

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
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        String s3 = t3.getText().toString();
        String s4 = t4.getText().toString();
        String s5 = t5.getText().toString();
        String s6 = t6.getText().toString();
        String s7 = t7.getText().toString();
        String s8 = t8.getText().toString();
        String s9 = t9.getText().toString();
        String s10 = t10.getText().toString();
        String s11 = t11.getText().toString();
        String s12 = t12.getText().toString();
        String s13 = t13.getText().toString();
        String s14 = t14.getText().toString();
        String s15 = t15.getText().toString();
        String s16 = t16.getText().toString();

        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16;
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        n3 = Integer.parseInt(s3);
        n4 = Integer.parseInt(s4);
        n5 = Integer.parseInt(s5);
        n6 = Integer.parseInt(s6);
        n7 = Integer.parseInt(s7);
        n8 = Integer.parseInt(s8);
        n9 = Integer.parseInt(s9);
        n10 = Integer.parseInt(s10);
        n11 = Integer.parseInt(s11);
        n12 = Integer.parseInt(s12);
        n13 = Integer.parseInt(s13);
        n14 = Integer.parseInt(s14);
        n15 = Integer.parseInt(s15);
        n16 = Integer.parseInt(s16);

        if (n1==1){
            t1.setText("Motility");
            r1.setVisibility(View.VISIBLE);
            r2.setVisibility(View.VISIBLE);
        }else if(n1==0){
            t1.setVisibility(View.GONE);
            r1.setVisibility(View.GONE);
            r2.setVisibility(View.GONE);
        }

        if (n2==1){
            t2.setText("Catalase");
            r3.setVisibility(View.VISIBLE);
            r4.setVisibility(View.VISIBLE);
        }else if(n2==0){
            t2.setVisibility(View.GONE);
            r3.setVisibility(View.GONE);
            r4.setVisibility(View.GONE);
        }

        if (n3==1){
            t3.setText("Oxidase");
            r5.setVisibility(View.VISIBLE);
            r6.setVisibility(View.VISIBLE);
        }else if(n3==0){
            t3.setVisibility(View.GONE);
            r5.setVisibility(View.GONE);
            r6.setVisibility(View.GONE);
        }

        if (n4==1){
            t4.setText("Indole");
            r7.setVisibility(View.VISIBLE);
            r8.setVisibility(View.VISIBLE);
        }else if(n4==0){
            t4.setVisibility(View.GONE);
            r7.setVisibility(View.GONE);
            r8.setVisibility(View.GONE);
        }

        if (n5==1){
            t5.setText("MR");
            r9.setVisibility(View.VISIBLE);
            r10.setVisibility(View.VISIBLE);
        }else if(n5==0){
            t5.setVisibility(View.GONE);
            r9.setVisibility(View.GONE);
            r10.setVisibility(View.GONE);
        }

        if (n6==1){
            t6.setText("VP");
            r11.setVisibility(View.VISIBLE);
            r12.setVisibility(View.VISIBLE);
        }else if(n6==0){
            t6.setVisibility(View.GONE);
            r11.setVisibility(View.GONE);
            r12.setVisibility(View.GONE);
        }

        if (n7==1){
            t7.setText("Citrate");
            r13.setVisibility(View.VISIBLE);
            r14.setVisibility(View.VISIBLE);
        }else if(n7==0){
            t7.setVisibility(View.GONE);
            r13.setVisibility(View.GONE);
            r14.setVisibility(View.GONE);
        }

        if (n8==1){
            t8.setText("Urease");
            r15.setVisibility(View.VISIBLE);
            r16.setVisibility(View.VISIBLE);
        }else if(n8==0){
            t8.setVisibility(View.GONE);
            r15.setVisibility(View.GONE);
            r16.setVisibility(View.GONE);
        }

        if (n9==1){
            t9.setText("H2S");
            r17.setVisibility(View.VISIBLE);
            r18.setVisibility(View.VISIBLE);
        }else if(n9==0){
            t9.setVisibility(View.GONE);
            r17.setVisibility(View.GONE);
            r18.setVisibility(View.GONE);
        }

        if (n10==1){
            t10.setText("Starch");
            r19.setVisibility(View.VISIBLE);
            r20.setVisibility(View.VISIBLE);
        }else if(n10==0){
            t10.setVisibility(View.GONE);
            r19.setVisibility(View.GONE);
            r20.setVisibility(View.GONE);
        }

        if (n11==1){
            t11.setText("Glucose");
            r21.setVisibility(View.VISIBLE);
            r22.setVisibility(View.VISIBLE);
        }else if(n11==0){
            t11.setVisibility(View.GONE);
            r21.setVisibility(View.GONE);
            r22.setVisibility(View.GONE);
        }

        if (n12==1){
            t12.setText("Lactose");
            r23.setVisibility(View.VISIBLE);
            r24.setVisibility(View.VISIBLE);
        }else if(n12==0){
            t12.setVisibility(View.GONE);
            r23.setVisibility(View.GONE);
            r24.setVisibility(View.GONE);
        }

        if (n13==1){
            t13.setText("Sucrose");
            r25.setVisibility(View.VISIBLE);
            r26.setVisibility(View.VISIBLE);
        }else if(n13==0){
            t13.setVisibility(View.GONE);
            r25.setVisibility(View.GONE);
            r26.setVisibility(View.GONE);
        }

        if (n14==1){
            t14.setText("Mannitol");
            r27.setVisibility(View.VISIBLE);
            r28.setVisibility(View.VISIBLE);
        }else if(n14==0){
            t14.setVisibility(View.GONE);
            r27.setVisibility(View.GONE);
            r28.setVisibility(View.GONE);
        }

        if (n15==1){
            t15.setText("Obligate aerobes/Facultative anaerobes");
            r29.setVisibility(View.VISIBLE);
            r30.setVisibility(View.VISIBLE);
        }else if(n15==0){
            t15.setVisibility(View.GONE);
            r29.setVisibility(View.GONE);
            r30.setVisibility(View.GONE);
        }

        if (n16==1){
            t16.setText("Nitrate reduction");
            r31.setVisibility(View.VISIBLE);
            r32.setVisibility(View.VISIBLE);
        }else if(n16==0){
            t16.setVisibility(View.GONE);
            r31.setVisibility(View.GONE);
            r32.setVisibility(View.GONE);
        }

        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
        Button btcheck = (Button) findViewById(R.id.button);
        btcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Check_bacteria.this, Result.class);
                startActivity(i1);

                String a="cob";

                int id = rg1.getCheckedRadioButtonId();
                switch (id){
                    case R.id.r1 :
//                        a+="cobcob";
                        i1.putExtra("data1", a);
                        break;
                    case R.id.r2 :
//                        a+="0";
                        i1.putExtra("data2", a);
                        break;
                }
            }
        });
    }
}
