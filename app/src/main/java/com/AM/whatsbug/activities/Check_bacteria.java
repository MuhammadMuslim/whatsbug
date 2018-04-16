package com.AM.whatsbug.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.AM.whatsbug.R;

public class Check_bacteria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bacteria);

        final TextView tresult = (TextView) findViewById(R.id.tresult);
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


        final CheckBox r1 = (CheckBox) findViewById(R.id.r1);
        final CheckBox r1a = (CheckBox) findViewById(R.id.r1a);
        final CheckBox r2 = (CheckBox) findViewById(R.id.r2);
        final CheckBox r2a = (CheckBox) findViewById(R.id.r2a);
        final CheckBox r3 = (CheckBox) findViewById(R.id.r3);
        final CheckBox r3a = (CheckBox) findViewById(R.id.r3a);
        final CheckBox r4 = (CheckBox) findViewById(R.id.r4);
        final CheckBox r4a = (CheckBox) findViewById(R.id.r4a);
        final CheckBox r5 = (CheckBox) findViewById(R.id.r5);
        final CheckBox r5a = (CheckBox) findViewById(R.id.r5a);
        final CheckBox r6 = (CheckBox) findViewById(R.id.r6);
        final CheckBox r6a = (CheckBox) findViewById(R.id.r6a);
        final CheckBox r7 = (CheckBox) findViewById(R.id.r7);
        final CheckBox r7a = (CheckBox) findViewById(R.id.r7a);
        final CheckBox r8 = (CheckBox) findViewById(R.id.r8);
        final CheckBox r8a = (CheckBox) findViewById(R.id.r8a);
        final CheckBox r9 = (CheckBox) findViewById(R.id.r9);
        final CheckBox r9a = (CheckBox) findViewById(R.id.r9a);
        final CheckBox r10 = (CheckBox) findViewById(R.id.r10);
        final CheckBox r10a = (CheckBox) findViewById(R.id.r10a);
        final CheckBox r11 = (CheckBox) findViewById(R.id.r11);
        final CheckBox r11a = (CheckBox) findViewById(R.id.r11a);
        final CheckBox r12 = (CheckBox) findViewById(R.id.r12);
        final CheckBox r12a = (CheckBox) findViewById(R.id.r12a);
        final CheckBox r13 = (CheckBox) findViewById(R.id.r13);
        final CheckBox r13a = (CheckBox) findViewById(R.id.r13a);
        final CheckBox r14 = (CheckBox) findViewById(R.id.r14);
        final CheckBox r14a = (CheckBox) findViewById(R.id.r14a);
        final CheckBox r15 = (CheckBox) findViewById(R.id.r15);
        final CheckBox r15a = (CheckBox) findViewById(R.id.r15a);
        final CheckBox r16 = (CheckBox) findViewById(R.id.r16);
        final CheckBox r16a = (CheckBox) findViewById(R.id.r16a);
        final CheckBox r17 = (CheckBox) findViewById(R.id.r17);
        final CheckBox r17a = (CheckBox) findViewById(R.id.r17a);
        final CheckBox r18 = (CheckBox) findViewById(R.id.r18);
        final CheckBox r18a = (CheckBox) findViewById(R.id.r18a);
        final CheckBox r19 = (CheckBox) findViewById(R.id.r19);
        final CheckBox r19a = (CheckBox) findViewById(R.id.r19a);
        final CheckBox r20 = (CheckBox) findViewById(R.id.r20);
        final CheckBox r20a = (CheckBox) findViewById(R.id.r20a);
        final CheckBox r21 = (CheckBox) findViewById(R.id.r21);
        final CheckBox r21a = (CheckBox) findViewById(R.id.r21a);
        final CheckBox r22 = (CheckBox) findViewById(R.id.r22);
        final CheckBox r22a = (CheckBox) findViewById(R.id.r22a);
        final CheckBox r23 = (CheckBox) findViewById(R.id.r23);
        final CheckBox r23a = (CheckBox) findViewById(R.id.r23a);
        final CheckBox r24 = (CheckBox) findViewById(R.id.r24);
        final CheckBox r24a = (CheckBox) findViewById(R.id.r24a);
        final CheckBox r25 = (CheckBox) findViewById(R.id.r25);
        final CheckBox r25a = (CheckBox) findViewById(R.id.r25a);
        final CheckBox r26 = (CheckBox) findViewById(R.id.r26);
        final CheckBox r26a = (CheckBox) findViewById(R.id.r26a);
        final CheckBox r27 = (CheckBox) findViewById(R.id.r27);
        final CheckBox r27a = (CheckBox) findViewById(R.id.r27a);
        final CheckBox r28 = (CheckBox) findViewById(R.id.r28);
        final CheckBox r28a = (CheckBox) findViewById(R.id.r28a);
        final CheckBox r29 = (CheckBox) findViewById(R.id.r29);
        final CheckBox r29a = (CheckBox) findViewById(R.id.r29a);
        final CheckBox r30 = (CheckBox) findViewById(R.id.r30);
        final CheckBox r30a = (CheckBox) findViewById(R.id.r30a);
        final CheckBox r31 = (CheckBox) findViewById(R.id.r31);
        final CheckBox r31a = (CheckBox) findViewById(R.id.r31a);
        final CheckBox r32 = (CheckBox) findViewById(R.id.r32);
        final CheckBox r32a = (CheckBox) findViewById(R.id.r32a);


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
            r1a.setVisibility(View.VISIBLE);
            r2.setVisibility(View.VISIBLE);
            r2a.setVisibility(View.VISIBLE);
        }else if(n1==0){
            t1.setVisibility(View.GONE);
            r1.setVisibility(View.GONE);
            r1a.setVisibility(View.GONE);
            r2.setVisibility(View.GONE);
            r2a.setVisibility(View.GONE);
        }

        if (n2==1){
            t2.setText("Catalase");
            r3.setVisibility(View.VISIBLE);
            r3a.setVisibility(View.VISIBLE);
            r4.setVisibility(View.VISIBLE);
            r4a.setVisibility(View.VISIBLE);
        }else if(n2==0){
            t2.setVisibility(View.GONE);
            r3.setVisibility(View.GONE);
            r3a.setVisibility(View.GONE);
            r4.setVisibility(View.GONE);
            r4a.setVisibility(View.GONE);
        }

        if (n3==1){
            t3.setText("Oxidase");
            r5.setVisibility(View.VISIBLE);
            r5a.setVisibility(View.VISIBLE);
            r6.setVisibility(View.VISIBLE);
            r6a.setVisibility(View.VISIBLE);
        }else if(n3==0){
            t3.setVisibility(View.GONE);
            r5.setVisibility(View.GONE);
            r5a.setVisibility(View.GONE);
            r6.setVisibility(View.GONE);
            r6a.setVisibility(View.GONE);
        }

        if (n4==1){
            t4.setText("Indole");
            r7.setVisibility(View.VISIBLE);
            r7a.setVisibility(View.VISIBLE);
            r8.setVisibility(View.VISIBLE);
            r8a.setVisibility(View.VISIBLE);
        }else if(n4==0){
            t4.setVisibility(View.GONE);
            r7.setVisibility(View.GONE);
            r7a.setVisibility(View.GONE);
            r8.setVisibility(View.GONE);
            r8a.setVisibility(View.GONE);
        }

        if (n5==1){
            t5.setText("MR");
            r9.setVisibility(View.VISIBLE);
            r9a.setVisibility(View.VISIBLE);
            r10.setVisibility(View.VISIBLE);
            r10a.setVisibility(View.VISIBLE);
        }else if(n5==0){
            t5.setVisibility(View.GONE);
            r9.setVisibility(View.GONE);
            r9a.setVisibility(View.GONE);
            r10.setVisibility(View.GONE);
            r10a.setVisibility(View.GONE);
        }

        if (n6==1){
            t6.setText("VP");
            r11.setVisibility(View.VISIBLE);
            r11a.setVisibility(View.VISIBLE);
            r12.setVisibility(View.VISIBLE);
            r12a.setVisibility(View.VISIBLE);
        }else if(n6==0){
            t6.setVisibility(View.GONE);
            r11.setVisibility(View.GONE);
            r11a.setVisibility(View.GONE);
            r12.setVisibility(View.GONE);
            r12a.setVisibility(View.GONE);
        }

        if (n7==1){
            t7.setText("Citrate");
            r13.setVisibility(View.VISIBLE);
            r13a.setVisibility(View.VISIBLE);
            r14.setVisibility(View.VISIBLE);
            r14a.setVisibility(View.VISIBLE);
        }else if(n7==0){
            t7.setVisibility(View.GONE);
            r13.setVisibility(View.GONE);
            r13a.setVisibility(View.GONE);
            r14.setVisibility(View.GONE);
            r14a.setVisibility(View.GONE);
        }

        if (n8==1){
            t8.setText("Urease");
            r15.setVisibility(View.VISIBLE);
            r15a.setVisibility(View.VISIBLE);
            r16.setVisibility(View.VISIBLE);
            r16a.setVisibility(View.VISIBLE);
        }else if(n8==0){
            t8.setVisibility(View.GONE);
            r15.setVisibility(View.GONE);
            r15a.setVisibility(View.GONE);
            r16.setVisibility(View.GONE);
            r16a.setVisibility(View.GONE);
        }

        if (n9==1){
            t9.setText("H2S");
            r17.setVisibility(View.VISIBLE);
            r17a.setVisibility(View.VISIBLE);
            r18.setVisibility(View.VISIBLE);
            r18a.setVisibility(View.VISIBLE);
        }else if(n9==0){
            t9.setVisibility(View.GONE);
            r17.setVisibility(View.GONE);
            r17a.setVisibility(View.GONE);
            r18.setVisibility(View.GONE);
            r18a.setVisibility(View.GONE);
        }

        if (n10==1){
            t10.setText("Starch");
            r19.setVisibility(View.VISIBLE);
            r19a.setVisibility(View.VISIBLE);
            r20.setVisibility(View.VISIBLE);
            r20a.setVisibility(View.VISIBLE);
        }else if(n10==0){
            t10.setVisibility(View.GONE);
            r19.setVisibility(View.GONE);
            r19a.setVisibility(View.GONE);
            r20.setVisibility(View.GONE);
            r20a.setVisibility(View.GONE);
        }

        if (n11==1){
            t11.setText("Glucose");
            r21.setVisibility(View.VISIBLE);
            r21a.setVisibility(View.VISIBLE);
            r22.setVisibility(View.VISIBLE);
            r22a.setVisibility(View.VISIBLE);
        }else if(n11==0){
            t11.setVisibility(View.GONE);
            r21.setVisibility(View.GONE);
            r21a.setVisibility(View.GONE);
            r22.setVisibility(View.GONE);
            r22a.setVisibility(View.GONE);
        }

        if (n12==1){
            t12.setText("Lactose");
            r23.setVisibility(View.VISIBLE);
            r23a.setVisibility(View.VISIBLE);
            r24.setVisibility(View.VISIBLE);
            r24a.setVisibility(View.VISIBLE);
        }else if(n12==0){
            t12.setVisibility(View.GONE);
            r23.setVisibility(View.GONE);
            r23a.setVisibility(View.GONE);
            r24.setVisibility(View.GONE);
            r24a.setVisibility(View.GONE);
        }

        if (n13==1){
            t13.setText("Sucrose");
            r25.setVisibility(View.VISIBLE);
            r25a.setVisibility(View.VISIBLE);
            r26.setVisibility(View.VISIBLE);
            r26a.setVisibility(View.VISIBLE);
        }else if(n13==0){
            t13.setVisibility(View.GONE);
            r25.setVisibility(View.GONE);
            r25a.setVisibility(View.GONE);
            r26.setVisibility(View.GONE);
            r26a.setVisibility(View.GONE);
        }

        if (n14==1){
            t14.setText("Mannitol");
            r27.setVisibility(View.VISIBLE);
            r27a.setVisibility(View.VISIBLE);
            r28.setVisibility(View.VISIBLE);
            r28a.setVisibility(View.VISIBLE);
        }else if(n14==0){
            t14.setVisibility(View.GONE);
            r27.setVisibility(View.GONE);
            r27a.setVisibility(View.GONE);
            r28.setVisibility(View.GONE);
            r28a.setVisibility(View.GONE);
        }

        if (n15==1){
            t15.setText("Obligate aerobes/Facultative anaerobes");
            r29.setVisibility(View.VISIBLE);
            r29a.setVisibility(View.VISIBLE);
            r30.setVisibility(View.VISIBLE);
            r30a.setVisibility(View.VISIBLE);
        }else if(n15==0){
            t15.setVisibility(View.GONE);
            r29.setVisibility(View.GONE);
            r29a.setVisibility(View.GONE);
            r30.setVisibility(View.GONE);
            r30a.setVisibility(View.GONE);
        }

        if (n16==1){
            t16.setText("Nitrate reduction");
            r31.setVisibility(View.VISIBLE);
            r31a.setVisibility(View.VISIBLE);
            r32.setVisibility(View.VISIBLE);
            r32a.setVisibility(View.VISIBLE);
        }else if(n16==0){
            t16.setVisibility(View.GONE);
            r31.setVisibility(View.GONE);
            r31a.setVisibility(View.GONE);
            r32.setVisibility(View.GONE);
            r32a.setVisibility(View.GONE);
        }

        Button btcheck = (Button) findViewById(R.id.button);
        btcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()) {
                    Toast.makeText(Check_bacteria.this,
                            r1.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Aeromonas hydrophila,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Salmonella typhimurium");
                }if(r1a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r1a.getText(), Toast.LENGTH_SHORT).show();
                        tresult.setText("Aeromonas hydrophila,Alcaligenes faecalis,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli, Proteus mirabilis, Proteus vulgaris, Pseudomonas aeruginosa, Pseudomonas fluorescens, Serratia marcescens,Salmonella typhimurium");
                }if(r2.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r2.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r3.isChecked()){
                Toast.makeText(Check_bacteria.this,
                        r3.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Aeromonas hydrophila,Alcaligenes faecalis,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Klebsiella pneumoniae,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Shigella flexneri,Shigella dysentriae,Salmonella typhimurium");
                }if(r4.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r4.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText(" ");
                }if(r5.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r5.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Aeromonas hydrophila,Alcaligenes faecalis,Pseudomonas aeruginosa,Pseudomonas fluorescens");
                }if(r6.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r6.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Klebsiella pneumoniae,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Serratia marcescens,Shigella flexneri,Shigella dysentriae,Salmonella typhimurium");
                }if(r7.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r7.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Aeromonas hydrophila,Escherichia coli,Proteus vulgaris,Shigella flexneri");
                }if(r8.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r8.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Alcaligenes faecalis,Enterobacter aerogenes,Enterobacter cloacae,Klebsiella pneumoniae,Proteus mirabilis,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Shigella dysentriae,Salmonella typhimurium");
                }if(r9.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r9.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Aeromonas hydrophila,Alcaligenes faecalis,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Klebsiella pneumoniae,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Shigella flexneri,Shigella dysentriae,Salmonella typhimurium");
                }if(r10.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r10.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Alcaligenes faecalis,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Klebsiella pneumoniae,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Shigella flexneri,Shigella dysentriae,Salmonella typhimurium");
                //blm
                }if(r11.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r11.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r12.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r12.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r13.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r13.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r14.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r14.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r15.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r15.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r16.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r16.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r17.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r17.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r18.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r18.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r19.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r19.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r20.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r20.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r21.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r21.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r22.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r22.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r23.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r23.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r24.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r24.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r25.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r25.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r26.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r26.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r27.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r27.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r28.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r28.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r29.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r29.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r30.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r30.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r31.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r31.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }if(r32.isChecked()){
                    Toast.makeText(Check_bacteria.this,
                            r32.getText(), Toast.LENGTH_SHORT).show();
                    tresult.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                }

            }
        });
    }
}
