package com.AM.whatsbug.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.AM.whatsbug.R;

public class Check_bacteria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bacteria);

        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Initiate Custom Dialog
                 */
                final Dialog dialog = new Dialog(Check_bacteria.this);
                dialog.setContentView(R.layout.popup);
                dialog.setTitle("Detail");

                /**
                 * Mengeset komponen dari custom dialog
                 */
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("TWOH's Engineering custom dialog sample");
                ImageView image = (ImageView) dialog.findViewById(R.id.iv_icon);
                image.setImageResource(R.mipmap.ic_launcher);

                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                /**
                 * Jika tombol diklik, tutup dialog
                 */
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });


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
        final CheckBox r2b = (CheckBox) findViewById(R.id.r2b);
        final CheckBox r2a = (CheckBox) findViewById(R.id.r2a);
        final CheckBox r3 = (CheckBox) findViewById(R.id.r3);
        final CheckBox r3a = (CheckBox) findViewById(R.id.r3a);
        final CheckBox r4 = (CheckBox) findViewById(R.id.r4);
        final CheckBox r4b = (CheckBox) findViewById(R.id.r4b);
        final CheckBox r4a = (CheckBox) findViewById(R.id.r4a);
        final CheckBox r5 = (CheckBox) findViewById(R.id.r5);
        final CheckBox r5a = (CheckBox) findViewById(R.id.r5a);
        final CheckBox r6 = (CheckBox) findViewById(R.id.r6);
        final CheckBox r6b = (CheckBox) findViewById(R.id.r6b);
        final CheckBox r6a = (CheckBox) findViewById(R.id.r6a);
        final CheckBox r7 = (CheckBox) findViewById(R.id.r7);
        final CheckBox r7a = (CheckBox) findViewById(R.id.r7a);
        final CheckBox r8 = (CheckBox) findViewById(R.id.r8);
        final CheckBox r8a = (CheckBox) findViewById(R.id.r8a);
        final CheckBox r8b = (CheckBox) findViewById(R.id.r8b);
        final CheckBox r9 = (CheckBox) findViewById(R.id.r9);
        final CheckBox r9a = (CheckBox) findViewById(R.id.r9a);
        final CheckBox r10 = (CheckBox) findViewById(R.id.r10);
        final CheckBox r10b = (CheckBox) findViewById(R.id.r10b);
        final CheckBox r10a = (CheckBox) findViewById(R.id.r10a);
        final CheckBox r11 = (CheckBox) findViewById(R.id.r11);
        final CheckBox r11a = (CheckBox) findViewById(R.id.r11a);
        final CheckBox r12 = (CheckBox) findViewById(R.id.r12);
        final CheckBox r12b = (CheckBox) findViewById(R.id.r12b);
        final CheckBox r12a = (CheckBox) findViewById(R.id.r12a);
        final CheckBox r13 = (CheckBox) findViewById(R.id.r13);
        final CheckBox r13a = (CheckBox) findViewById(R.id.r13a);
        final CheckBox r14 = (CheckBox) findViewById(R.id.r14);
        final CheckBox r14b = (CheckBox) findViewById(R.id.r14b);
        final CheckBox r14a = (CheckBox) findViewById(R.id.r14a);
        final CheckBox r15 = (CheckBox) findViewById(R.id.r15);
        final CheckBox r15a = (CheckBox) findViewById(R.id.r15a);
        final CheckBox r16 = (CheckBox) findViewById(R.id.r16);
        final CheckBox r16a = (CheckBox) findViewById(R.id.r16a);
        final CheckBox r16b = (CheckBox) findViewById(R.id.r16b);
        final CheckBox r17 = (CheckBox) findViewById(R.id.r17);
        final CheckBox r17a = (CheckBox) findViewById(R.id.r17a);
        final CheckBox r18 = (CheckBox) findViewById(R.id.r18);
        final CheckBox r18b = (CheckBox) findViewById(R.id.r18b);
        final CheckBox r18a = (CheckBox) findViewById(R.id.r18a);
        final CheckBox r19 = (CheckBox) findViewById(R.id.r19);
        final CheckBox r19a = (CheckBox) findViewById(R.id.r19a);
        final CheckBox r20 = (CheckBox) findViewById(R.id.r20);
        final CheckBox r20b = (CheckBox) findViewById(R.id.r20b);
        final CheckBox r20a = (CheckBox) findViewById(R.id.r20a);
        final CheckBox r21 = (CheckBox) findViewById(R.id.r21);
        final CheckBox r21a = (CheckBox) findViewById(R.id.r21a);
        final CheckBox r22 = (CheckBox) findViewById(R.id.r22);
        final CheckBox r22b = (CheckBox) findViewById(R.id.r22b);
        final CheckBox r22a = (CheckBox) findViewById(R.id.r22a);
        final CheckBox r23 = (CheckBox) findViewById(R.id.r23);
        final CheckBox r23a = (CheckBox) findViewById(R.id.r23a);
        final CheckBox r24 = (CheckBox) findViewById(R.id.r24);
        final CheckBox r24b = (CheckBox) findViewById(R.id.r24b);
        final CheckBox r24a = (CheckBox) findViewById(R.id.r24a);
        final CheckBox r25 = (CheckBox) findViewById(R.id.r25);
        final CheckBox r25a = (CheckBox) findViewById(R.id.r25a);
        final CheckBox r26 = (CheckBox) findViewById(R.id.r26);
        final CheckBox r26b = (CheckBox) findViewById(R.id.r26b);
        final CheckBox r26a = (CheckBox) findViewById(R.id.r26a);
        final CheckBox r27 = (CheckBox) findViewById(R.id.r27);
        final CheckBox r27a = (CheckBox) findViewById(R.id.r27a);
        final CheckBox r28 = (CheckBox) findViewById(R.id.r28);
        final CheckBox r28b = (CheckBox) findViewById(R.id.r28b);
        final CheckBox r28a = (CheckBox) findViewById(R.id.r28a);
        final CheckBox r29 = (CheckBox) findViewById(R.id.r29);
        final CheckBox r29a = (CheckBox) findViewById(R.id.r29a);
        final CheckBox r30 = (CheckBox) findViewById(R.id.r30);
        final CheckBox r30b = (CheckBox) findViewById(R.id.r30b);
        final CheckBox r30a = (CheckBox) findViewById(R.id.r30a);
        final CheckBox r31 = (CheckBox) findViewById(R.id.r31);
        final CheckBox r31a = (CheckBox) findViewById(R.id.r31a);
        final CheckBox r32 = (CheckBox) findViewById(R.id.r32);
        final CheckBox r32b = (CheckBox) findViewById(R.id.r32b);
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
            r2b.setVisibility(View.VISIBLE);
            r2a.setVisibility(View.VISIBLE);
            hide();
        }else if(n1==0){
            t1.setVisibility(View.GONE);
            r1.setVisibility(View.GONE);
            r1a.setVisibility(View.GONE);
            r2.setVisibility(View.GONE);
            r2b.setVisibility(View.GONE);
            r2a.setVisibility(View.GONE);
        }

        if (n2==1){
            t2.setText("Catalase");
            r3.setVisibility(View.VISIBLE);
            r3a.setVisibility(View.VISIBLE);
            r4.setVisibility(View.VISIBLE);
            r4b.setVisibility(View.VISIBLE);
            r4a.setVisibility(View.VISIBLE);
            hide();
        }else if(n2==0){
            t2.setVisibility(View.GONE);
            r3.setVisibility(View.GONE);
            r3a.setVisibility(View.GONE);
            r4.setVisibility(View.GONE);
            r4b.setVisibility(View.GONE);
            r4a.setVisibility(View.GONE);
        }

        if (n3==1){
            t3.setText("Oxidase");
            r5.setVisibility(View.VISIBLE);
            r5a.setVisibility(View.VISIBLE);
            r6.setVisibility(View.VISIBLE);
            r6b.setVisibility(View.VISIBLE);
            r6a.setVisibility(View.VISIBLE);
            hide();
        }else if(n3==0){
            t3.setVisibility(View.GONE);
            r5.setVisibility(View.GONE);
            r5a.setVisibility(View.GONE);
            r6.setVisibility(View.GONE);
            r6b.setVisibility(View.GONE);
            r6a.setVisibility(View.GONE);
        }

        if (n4==1){
            t4.setText("Indole");
            r7.setVisibility(View.VISIBLE);
            r7a.setVisibility(View.VISIBLE);
            r8.setVisibility(View.VISIBLE);
            r8b.setVisibility(View.VISIBLE);
            r8a.setVisibility(View.VISIBLE);
            hide();
        }else if(n4==0){
            t4.setVisibility(View.GONE);
            r7.setVisibility(View.GONE);
            r7a.setVisibility(View.GONE);
            r8.setVisibility(View.GONE);
            r8b.setVisibility(View.GONE);
            r8a.setVisibility(View.GONE);
        }

        if (n5==1){
            t5.setText("MR");
            r9.setVisibility(View.VISIBLE);
            r9a.setVisibility(View.VISIBLE);
            r10.setVisibility(View.VISIBLE);
            r10b.setVisibility(View.VISIBLE);
            r10a.setVisibility(View.VISIBLE);
            hide();
        }else if(n5==0){
            t5.setVisibility(View.GONE);
            r9.setVisibility(View.GONE);
            r9a.setVisibility(View.GONE);
            r10.setVisibility(View.GONE);
            r10b.setVisibility(View.GONE);
            r10a.setVisibility(View.GONE);
        }

        if (n6==1){
            t6.setText("VP");
            r11.setVisibility(View.VISIBLE);
            r11a.setVisibility(View.VISIBLE);
            r12.setVisibility(View.VISIBLE);
            r12b.setVisibility(View.VISIBLE);
            r12a.setVisibility(View.VISIBLE);
            hide();
        }else if(n6==0){
            t6.setVisibility(View.GONE);
            r11.setVisibility(View.GONE);
            r11a.setVisibility(View.GONE);
            r12.setVisibility(View.GONE);
            r12b.setVisibility(View.GONE);
            r12a.setVisibility(View.GONE);
        }

        if (n7==1){
            t7.setText("Citrate");
            r13.setVisibility(View.VISIBLE);
            r13a.setVisibility(View.VISIBLE);
            r14.setVisibility(View.VISIBLE);
            r14b.setVisibility(View.VISIBLE);
            r14a.setVisibility(View.VISIBLE);
            hide();
        }else if(n7==0){
            t7.setVisibility(View.GONE);
            r13.setVisibility(View.GONE);
            r13a.setVisibility(View.GONE);
            r14.setVisibility(View.GONE);
            r14b.setVisibility(View.GONE);
            r14a.setVisibility(View.GONE);
        }

        if (n8==1){
            t8.setText("Urease");
            r15.setVisibility(View.VISIBLE);
            r15a.setVisibility(View.VISIBLE);
            r16.setVisibility(View.VISIBLE);
            r16b.setVisibility(View.VISIBLE);
            r16a.setVisibility(View.VISIBLE);
            hide();
        }else if(n8==0){
            t8.setVisibility(View.GONE);
            r15.setVisibility(View.GONE);
            r15a.setVisibility(View.GONE);
            r16.setVisibility(View.GONE);
            r16b.setVisibility(View.GONE);
            r16a.setVisibility(View.GONE);
        }

        if (n9==1){
            t9.setText("H2S");
            r17.setVisibility(View.VISIBLE);
            r17a.setVisibility(View.VISIBLE);
            r18.setVisibility(View.VISIBLE);
            r18b.setVisibility(View.VISIBLE);
            r18a.setVisibility(View.VISIBLE);
            hide();
        }else if(n9==0){
            t9.setVisibility(View.GONE);
            r17.setVisibility(View.GONE);
            r17a.setVisibility(View.GONE);
            r18.setVisibility(View.GONE);
            r18b.setVisibility(View.GONE);
            r18a.setVisibility(View.GONE);
        }

        if (n10==1){
            t10.setText("Starch");
            r19.setVisibility(View.VISIBLE);
            r19a.setVisibility(View.VISIBLE);
            r20.setVisibility(View.VISIBLE);
            r20b.setVisibility(View.VISIBLE);
            r20a.setVisibility(View.VISIBLE);
            hide();
        }else if(n10==0){
            t10.setVisibility(View.GONE);
            r19.setVisibility(View.GONE);
            r19a.setVisibility(View.GONE);
            r20.setVisibility(View.GONE);
            r20b.setVisibility(View.GONE);
            r20a.setVisibility(View.GONE);
        }

        if (n11==1){
            t11.setText("Glucose");
            r21.setVisibility(View.VISIBLE);
            r21a.setVisibility(View.VISIBLE);
            r22.setVisibility(View.VISIBLE);
            r22b.setVisibility(View.VISIBLE);
            r22a.setVisibility(View.VISIBLE);
            hide();
        }else if(n11==0){
            t11.setVisibility(View.GONE);
            r21.setVisibility(View.GONE);
            r21a.setVisibility(View.GONE);
            r22.setVisibility(View.GONE);
            r22b.setVisibility(View.GONE);
            r22a.setVisibility(View.GONE);
        }

        if (n12==1){
            t12.setText("Lactose");
            r23.setVisibility(View.VISIBLE);
            r23a.setVisibility(View.VISIBLE);
            r24.setVisibility(View.VISIBLE);
            r24b.setVisibility(View.VISIBLE);
            r24a.setVisibility(View.VISIBLE);
            hide();
        }else if(n12==0){
            t12.setVisibility(View.GONE);
            r23.setVisibility(View.GONE);
            r23a.setVisibility(View.GONE);
            r24.setVisibility(View.GONE);
            r24b.setVisibility(View.GONE);
            r24a.setVisibility(View.GONE);
        }

        if (n13==1){
            t13.setText("Sucrose");
            r25.setVisibility(View.VISIBLE);
            r25a.setVisibility(View.VISIBLE);
            r26.setVisibility(View.VISIBLE);
            r26b.setVisibility(View.VISIBLE);
            r26a.setVisibility(View.VISIBLE);
            hide();
        }else if(n13==0){
            t13.setVisibility(View.GONE);
            r25.setVisibility(View.GONE);
            r25a.setVisibility(View.GONE);
            r26.setVisibility(View.GONE);
            r26b.setVisibility(View.GONE);
            r26a.setVisibility(View.GONE);
        }

        if (n14==1){
            t14.setText("Mannitol");
            r27.setVisibility(View.VISIBLE);
            r27a.setVisibility(View.VISIBLE);
            r28.setVisibility(View.VISIBLE);
            r28b.setVisibility(View.VISIBLE);
            r28a.setVisibility(View.VISIBLE);
            hide();
        }else if(n14==0){
            t14.setVisibility(View.GONE);
            r27.setVisibility(View.GONE);
            r27a.setVisibility(View.GONE);
            r28.setVisibility(View.GONE);
            r28b.setVisibility(View.GONE);
            r28a.setVisibility(View.GONE);
        }

        if (n15==1){
            t15.setText("Obligate aerobes/Facultative anaerobes");
            r29.setVisibility(View.VISIBLE);
            r29a.setVisibility(View.VISIBLE);
            r30.setVisibility(View.VISIBLE);
            r30b.setVisibility(View.VISIBLE);
            r30a.setVisibility(View.VISIBLE);
            hide();
        }else if(n15==0){
            t15.setVisibility(View.GONE);
            r29.setVisibility(View.GONE);
            r29a.setVisibility(View.GONE);
            r30.setVisibility(View.GONE);
            r30b.setVisibility(View.GONE);
            r30a.setVisibility(View.GONE);
        }

        if (n16==1){
            t16.setText("Nitrate reduction");
            r31.setVisibility(View.VISIBLE);
            r31a.setVisibility(View.VISIBLE);
            r32.setVisibility(View.VISIBLE);
            r32b.setVisibility(View.VISIBLE);
            r32a.setVisibility(View.VISIBLE);
            hide();
        }else if(n16==0){
            t16.setVisibility(View.GONE);
            r31.setVisibility(View.GONE);
            r31a.setVisibility(View.GONE);
            r32.setVisibility(View.GONE);
            r32b.setVisibility(View.GONE);
            r32a.setVisibility(View.GONE);
        }



        final Button btcheck = (Button) findViewById(R.id.button);
        btcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = btcheck.isClickable();
                if (checked){
                    if(r1.isChecked()) {
                        Toast.makeText(Check_bacteria.this,
                                r1.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr1();
                    }if(r1a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r1a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr1a();
                    }if(r2.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r2.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr2();
                    }if(r2b.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r2b.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr2b();
                    }if(r2a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r2a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr2a();
                    }if(r3.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r3.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr3();
                    }if(r3a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r3a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr3a();
                    }if(r4.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r4.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr4();
                    }if(r4b.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r4b.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr2b();
                    }if(r4a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r4a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr4a();
                    }if(r5.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r5.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr5();
                    }if(r5a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r5a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr5a();
                    }if(r6.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r6.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr6();
                    }if(r6b.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r6b.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr2b();
                    }if(r6a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r6a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr6a();
                    }if(r7.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r7.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr7();
                    }if(r7a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r7a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr5();
                    }if(r8.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r8.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr5();
                    }if(r8a.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r8a.getText(), Toast.LENGTH_SHORT).show();
                        show();
                        showr5();
                    }
                    if(r9.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r9.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Aeromonas hydrophila,Alcaligenes faecalis,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Klebsiella pneumoniae,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Shigella flexneri,Shigella dysentriae,Salmonella typhimurium");
                    }if(r10.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r10.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Alcaligenes faecalis,Citrobacter freundii,Enterobacter aerogenes,Enterobacter cloacae,Escherichia coli,Klebsiella pneumoniae,Proteus mirabilis,Proteus vulgaris,Pseudomonas aeruginosa,Pseudomonas fluorescens,Serratia marcescens,Shigella flexneri,Shigella dysentriae,Salmonella typhimurium");
                        //blm
                    }if(r11.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r11.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r12.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r12.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r13.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r13.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r14.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r14.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r15.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r15.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r16.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r16.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r17.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r17.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r18.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r18.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r19.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r19.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r20.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r20.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r21.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r21.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r22.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r22.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r23.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r23.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r24.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r24.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r25.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r25.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r26.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r26.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r27.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r27.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r28.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r28.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r29.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r29.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r30.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r30.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r31.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r31.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }if(r32.isChecked()){
                        Toast.makeText(Check_bacteria.this,
                                r32.getText(), Toast.LENGTH_SHORT).show();
                        trs1.setText("Klebsiella pneumoniae,Shigella flexneri,Shigella dysentriae");
                    }
                }else {
                    hide();
                }

            }
        });

        //inisialisasi 3 View

        final ImageView ish = (ImageView) findViewById(R.id.ish);
        final ToggleButton btshow = (ToggleButton) findViewById(R.id.btshow);
        btshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = btshow.isChecked();

                if (checked) {
                    if(r1.isChecked()) {
                        show();
                        showr1();
                    }else if(r1a.isChecked()) {
                        show();
                        showr1a();
                    }else if(r2.isChecked()) {
                        show();
                        showr2();
                    }else if(r2a.isChecked()) {
                        show();
                        showr2a();
                    }else if(r3.isChecked()) {
                        show();
                        showr3();
                    }else if(r3a.isChecked()) {
                        show();
                        showr3a();
                    }else if(r4.isChecked()) {
                        show();
                        showr4();
                    }else if(r4a.isChecked()) {
                        show();
                        showr4a();
                    }else if(r5.isChecked()) {
                        show();
                        showr5();
                    }else if(r5a.isChecked()) {
                        show();
                        showr5a();
                    }else if(r6.isChecked()) {
                        show();
                        showr6();
                    }else if(r6a.isChecked()) {
                        show();
                        showr6a();
                    }else if(r7.isChecked()) {
                        show();
                        showr7();
                    }
                    ish.setImageResource(R.drawable.show);
                } else {
                   hide();
                    ish.setImageResource(R.drawable.hide);
                }


            }
        });

    }

    public void showr1(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setVisibility(View.GONE);
        trs3.setText(bacteri3);
        trs4.setText(bacteri4);
        trs5.setText(bacteri5);
        trs6.setText(bacteri6);
        trs7.setVisibility(View.GONE);
        trs8.setText(bacteri8);
        trs9.setText(bacteri9);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setText(bacteri12);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr1a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setText(bacteri2);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr2(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setText(bacteri7);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr2a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr2b(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr3(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setText(bacteri2);
        trs3.setText(bacteri3);
        trs4.setText(bacteri4);
        trs5.setText(bacteri5);
        trs6.setText(bacteri6);
        trs7.setText(bacteri7);
        trs8.setText(bacteri8);
        trs9.setText(bacteri9);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setText(bacteri12);
        trs13.setText(bacteri13);
        trs14.setText(bacteri14);
        trs15.setText(bacteri15);
    }

    public void showr3a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr4(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr4a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr5(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setText(bacteri2);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr5a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr6(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setText(bacteri3);
        trs4.setText(bacteri4);
        trs5.setText(bacteri5);
        trs6.setText(bacteri6);
        trs7.setText(bacteri7);
        trs8.setText(bacteri8);
        trs9.setText(bacteri9);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setText(bacteri12);
        trs13.setText(bacteri13);
        trs14.setText(bacteri14);
        trs15.setText(bacteri15);
    }

    public void showr6a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr7(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setText(bacteri9);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr7a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setText(bacteri6);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr8(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setText(bacteri2);
        trs3.setVisibility(View.GONE);
        trs4.setText(bacteri4);
        trs5.setText(bacteri5);
        trs6.setVisibility(View.GONE);
        trs7.setText(bacteri7);
        trs8.setText(bacteri8);
        trs9.setVisibility(View.GONE);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setText(bacteri12);
        trs13.setVisibility(View.GONE);
        trs14.setText(bacteri14);
        trs15.setText(bacteri15);
    }

    public void showr8a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setText(bacteri13);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr8b(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setText(bacteri3);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr9(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setText(bacteri3);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setText(bacteri6);
        trs7.setVisibility(View.GONE);
        trs8.setText(bacteri8);
        trs9.setText(bacteri9);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setText(bacteri13);
        trs14.setText(bacteri14);
        trs15.setText(bacteri15);
    }

    public void showr9a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr10(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setText(bacteri2);
        trs3.setVisibility(View.GONE);
        trs4.setText(bacteri4);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr10a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr10b(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setText(bacteri5);
        trs6.setVisibility(View.GONE);
        trs7.setText(bacteri7);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setText(bacteri12);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr11(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setText(bacteri12);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr11a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setText(bacteri4);
        trs5.setText(bacteri5);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr12(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setText(bacteri2);
        trs3.setText(bacteri3);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setText(bacteri6);
        trs7.setText(bacteri7);
        trs8.setVisibility(View.GONE);
        trs9.setText(bacteri9);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setVisibility(View.GONE);
        trs13.setText(bacteri13);
        trs14.setText(bacteri14);
        trs15.setText(bacteri15);
    }

    public void showr12a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr12b(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setText(bacteri8);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr13(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setText(bacteri3);
        trs4.setText(bacteri4);
        trs5.setText(bacteri5);
        trs6.setVisibility(View.GONE);
        trs7.setText(bacteri7);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setText(bacteri10);
        trs11.setText(bacteri11);
        trs12.setText(bacteri12);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setText(bacteri15);
    }

    public void showr13a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setText(bacteri2);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr14b(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void show14(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setText(bacteri6);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setText(bacteri13);
        trs14.setText(bacteri14);
        trs15.setVisibility(View.GONE);
    }

    public void show14a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setText(bacteri1);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setText(bacteri8);
        trs9.setText(bacteri9);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr15(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setText(bacteri7);
        trs8.setText(bacteri8);
        trs9.setText(bacteri9);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr15a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setText(bacteri10);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr16(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setText(bacteri4);
        trs5.setVisibility(View.GONE);
        trs6.setText(bacteri6);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setText(bacteri13);
        trs14.setText(bacteri14);
        trs15.setText(bacteri15);
    }

    public void showr16a(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setText(bacteri3);
        trs4.setVisibility(View.GONE);
        trs5.setText(bacteri5);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setText(bacteri11);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr16b(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        final String bacteri1 = "Aeromonas hydrophila";
        final String bacteri2 = "Alcaligenes faecalis";
        final String bacteri3 = "Citrobacter freundii";
        final String bacteri4 = "Enterobacter aerogenes";
        final String bacteri5 = "Enterobacter cloacae";
        final String bacteri6 = "Escherichia coli";
        final String bacteri7 = "Klebsiella pneumoniae";
        final String bacteri8 = "Proteus mirabilis";
        final String bacteri9 = "Proteus vulgaris";
        final String bacteri10 = "Pseudomonas aeruginosa";
        final String bacteri11 = "Pseudomonas fluorescens";
        final String bacteri12 = "Serratia marcescens";
        final String bacteri13 = "Shigella flexneri";
        final String bacteri14 = "Shigella dysentriae";
        final String bacteri15 = "Salmonella typhimurium";

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setText(bacteri12);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void showr17(){

    }

    public void showr17a(){

    }

    public void showr18(){

    }

    public void showr18a(){

    }

    public void showr19(){

    }

    public void showr19a(){

    }

    public void showr20(){

    }

    public void showr20a(){

    }

    public void showr21(){

    }

    public void showr21a(){

    }

    public void showr22(){

    }

    public void showr22a(){

    }

    public void showr23(){

    }

    public void showr23a(){

    }

    public void showr24(){

    }

    public void showr24a(){

    }

    public void showr25(){

    }

    public void showr25a(){

    }

    public void showr26(){

    }

    public void showr26a(){

    }

    public void showr27(){

    }

    public void showr27a(){

    }

    public void showr28(){

    }

    public void showr28a(){

    }

    public void showr29(){

    }

    public void showr29a(){

    }

    public void showr30(){

    }

    public void showr30a(){

    }

    public void showr31(){

    }

    public void showr31a(){

    }

    public void showr32(){

    }

    public void showr32a(){

    }

    public void hide(){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);

        trs1.setVisibility(View.GONE);
        trs2.setVisibility(View.GONE);
        trs3.setVisibility(View.GONE);
        trs4.setVisibility(View.GONE);
        trs5.setVisibility(View.GONE);
        trs6.setVisibility(View.GONE);
        trs7.setVisibility(View.GONE);
        trs8.setVisibility(View.GONE);
        trs9.setVisibility(View.GONE);
        trs10.setVisibility(View.GONE);
        trs11.setVisibility(View.GONE);
        trs12.setVisibility(View.GONE);
        trs13.setVisibility(View.GONE);
        trs14.setVisibility(View.GONE);
        trs15.setVisibility(View.GONE);
    }

    public void show (){
        final TextView trs1 = (TextView) findViewById(R.id.trs1);
        final TextView trs2 = (TextView) findViewById(R.id.trs2);
        final TextView trs3 = (TextView) findViewById(R.id.trs3);
        final TextView trs4 = (TextView) findViewById(R.id.trs4);
        final TextView trs5 = (TextView) findViewById(R.id.trs5);
        final TextView trs6 = (TextView) findViewById(R.id.trs6);
        final TextView trs7 = (TextView) findViewById(R.id.trs7);
        final TextView trs8 = (TextView) findViewById(R.id.trs8);
        final TextView trs9 = (TextView) findViewById(R.id.trs9);
        final TextView trs10 = (TextView) findViewById(R.id.trs10);
        final TextView trs11 = (TextView) findViewById(R.id.trs11);
        final TextView trs12 = (TextView) findViewById(R.id.trs12);
        final TextView trs13 = (TextView) findViewById(R.id.trs13);
        final TextView trs14 = (TextView) findViewById(R.id.trs14);
        final TextView trs15 = (TextView) findViewById(R.id.trs15);
        trs1.setVisibility(View.VISIBLE);
        trs2.setVisibility(View.VISIBLE);
        trs3.setVisibility(View.VISIBLE);
        trs4.setVisibility(View.VISIBLE);
        trs5.setVisibility(View.VISIBLE);
        trs6.setVisibility(View.VISIBLE);
        trs7.setVisibility(View.VISIBLE);
        trs8.setVisibility(View.VISIBLE);
        trs9.setVisibility(View.VISIBLE);
        trs10.setVisibility(View.VISIBLE);
        trs11.setVisibility(View.VISIBLE);
        trs12.setVisibility(View.VISIBLE);
        trs13.setVisibility(View.VISIBLE);
        trs14.setVisibility(View.VISIBLE);
        trs15.setVisibility(View.VISIBLE);
    }

}
