package com.example.bible;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

public class JunActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,
            button6,button7,button8,button9,button10
            ,button11,button12,button13,button14,button15
            ,button16,button17,button18,button19,button20
            ,button21,button22,button23,button24,button25
            ,button26,button27,button28,button29,button30
            ,button31,button32,button33,button34,button35,button36,button45,captuer;
    SharedPreferences pref;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20
            ,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
    Handler hand;
    TextView day1,day2,day3,day4,day5,day6,day7,day8,day9,day10,day11,day12,day13,
            day14,day15,day16,day17,day18,day19,day20,day21,day22,day23,day24,
            day25,day26,day27,day28,day29,day30,day31,day32,day33,day34,day35;
    Button[] arraybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jun);

        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);
        day4 = findViewById(R.id.day4);
        day5 = findViewById(R.id.day5);
        day6 = findViewById(R.id.day6);
        day7 = findViewById(R.id.day7);
        day8 = findViewById(R.id.day8);
        day9 = findViewById(R.id.day9);
        day10 = findViewById(R.id.day10);
        day11 = findViewById(R.id.day11);
        day12 = findViewById(R.id.day12);
        day13 = findViewById(R.id.day13);
        day14 = findViewById(R.id.day14);
        day15 = findViewById(R.id.day15);
        day16 = findViewById(R.id.day16);
        day17 = findViewById(R.id.day17);
        day18 = findViewById(R.id.day18);
        day19 = findViewById(R.id.day19);
        day20 = findViewById(R.id.day20);
        day21 = findViewById(R.id.day21);
        day22 = findViewById(R.id.day22);
        day23 = findViewById(R.id.day23);
        day24 = findViewById(R.id.day24);
        day25 = findViewById(R.id.day25);
        day26 = findViewById(R.id.day26);
        day27 = findViewById(R.id.day27);
        day28 = findViewById(R.id.day28);
        day29 = findViewById(R.id.day29);
        day30 = findViewById(R.id.day30);
        day31 = findViewById(R.id.day31);
        day32 = findViewById(R.id.day32);
        day33 = findViewById(R.id.day33);
        day34 = findViewById(R.id.day34);
        day35 = findViewById(R.id.day35);



//        TextView[] TextArray = new TextView[35];
//
//        for (int i=0; i<34; i++)
//        {
//            TextArray[i] = findViewById(getResources().getIdentifier("day" + (i + 1), "id", getPackageName()));
//        }
//
//        for(int i=0;i<34;i++){
//            TextArray[i+1].setText(String.valueOf(i+1));
//        }
//
//        Log.e("idididididididi", String.valueOf(TextArray[0]));


        pref = getSharedPreferences("jun", MODE_PRIVATE);
        b1 = pref.getString("b1", "0");
        b2 = pref.getString("b2", "0");
        b3 = pref.getString("b3", "0");
        b4 = pref.getString("b4", "0");
        b5 = pref.getString("b5", "0");
        b6 = pref.getString("b6", "0");
        b7 = pref.getString("b7", "0");
        b8 = pref.getString("b8", "0");
        b9 = pref.getString("b9", "0");
        b10 = pref.getString("b10", "0");
        b11 = pref.getString("b11", "0");
        b12 = pref.getString("b12", "0");
        b13 = pref.getString("b13", "0");
        b14 = pref.getString("b14", "0");
        b15 = pref.getString("b15", "0");
        b16 = pref.getString("b16", "0");
        b17 = pref.getString("b17", "0");
        b18 = pref.getString("b18", "0");
        b19 = pref.getString("b19", "0");
        b20 = pref.getString("b20", "0");
        b21 = pref.getString("b21", "0");
        b22 = pref.getString("b22", "0");
        b23 = pref.getString("b23", "0");
        b24 = pref.getString("b24", "0");
        b25 = pref.getString("b25", "0");
        b26 = pref.getString("b26", "0");
        b27 = pref.getString("b27", "0");
        b28 = pref.getString("b28", "0");
        b29 = pref.getString("b29", "0");
        b30 = pref.getString("b30", "0");
        b31 = pref.getString("b31", "0");
        b32 = pref.getString("b32", "0");
        b33 = pref.getString("b33", "0");
        b34 = pref.getString("b34", "0");
        b35 = pref.getString("b35", "0");
        b36 = pref.getString("b36", "0");


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button45 = findViewById(R.id.button45);
        captuer = findViewById(R.id.captuer);


        if(b1.equals("1")){
            button1.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b2.equals("1")){
            button2.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b3.equals("1")){
            button3.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b4.equals("1")){
            button4.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b5.equals("1")){
            button5.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b6.equals("1")){
            button6.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b7.equals("1")){
            button7.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b8.equals("1")){
            button8.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b9.equals("1")){
            button9.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b10.equals("1")){
            button10.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b11.equals("1")){
            button11.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b12.equals("1")){
            button12.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b13.equals("1")){
            button13.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b14.equals("1")){
            button14.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b15.equals("1")){
            button15.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b16.equals("1")){
            button16.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b17.equals("1")){
            button17.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b18.equals("1")){
            button18.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b19.equals("1")){
            button19.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b20.equals("1")){
            button20.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b21.equals("1")){
            button21.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b22.equals("1")){
            button22.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b23.equals("1")){
            button23.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b24.equals("1")){
            button24.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b25.equals("1")){
            button25.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b26.equals("1")){
            button26.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b27.equals("1")){
            button27.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b28.equals("1")){
            button28.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b29.equals("1")){
            button29.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b30.equals("1")){
            button30.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b31.equals("1")){
            button31.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b32.equals("1")){
            button32.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b33.equals("1")){
            button33.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b34.equals("1")){
            button34.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b35.equals("1")){
            button35.setBackgroundResource(R.drawable.button_jun2);
        }
        if(b36.equals("1")){
            button36.setBackgroundResource(R.drawable.button_jun2);
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b1", "1");
                editor.apply();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b2", "1");
                editor.apply();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b3", "1");
                editor.apply();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b4", "1");
                editor.apply();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b5", "1");
                editor.apply();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b6", "1");
                editor.apply();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b7", "1");
                editor.apply();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b8", "1");
                editor.apply();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b9", "1");
                editor.apply();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b10", "1");
                editor.apply();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b11", "1");
                editor.apply();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b12", "1");
                editor.apply();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b13", "1");
                editor.apply();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button14.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b14", "1");
                editor.apply();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button15.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b15", "1");
                editor.apply();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button16.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b16", "1");
                editor.apply();
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b17", "1");
                editor.apply();
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b18", "1");
                editor.apply();
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button19.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b19", "1");
                editor.apply();
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button20.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b20", "1");
                editor.apply();
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button21.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b21", "1");
                editor.apply();
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button22.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b22", "1");
                editor.apply();
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button23.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b23", "1");
                editor.apply();
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button24.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b24", "1");
                editor.apply();
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button25.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b25", "1");
                editor.apply();
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button26.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b26", "1");
                editor.apply();
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button27.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b27", "1");
                editor.apply();
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button28.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b28", "1");
                editor.apply();
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button29.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b29", "1");
                editor.apply();
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button30.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b30", "1");
                editor.apply();
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button31.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b31", "1");
                editor.apply();
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button32.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b32", "1");
                editor.apply();
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button33.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b33", "1");
                editor.apply();
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button34.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b34", "1");
                editor.apply();
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button35.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b35", "1");
                editor.apply();
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button36.setBackgroundResource(R.drawable.button_jun2);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b36", "1");
                editor.apply();
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1.setBackgroundResource(R.drawable.button_grid);
                button2.setBackgroundResource(R.drawable.button_grid);
                button3.setBackgroundResource(R.drawable.button_grid);
                button4.setBackgroundResource(R.drawable.button_grid);
                button5.setBackgroundResource(R.drawable.button_grid);
                button6.setBackgroundResource(R.drawable.button_grid);
                button7.setBackgroundResource(R.drawable.button_grid);
                button8.setBackgroundResource(R.drawable.button_grid);
                button9.setBackgroundResource(R.drawable.button_grid);
                button10.setBackgroundResource(R.drawable.button_grid);
                button11.setBackgroundResource(R.drawable.button_grid);
                button12.setBackgroundResource(R.drawable.button_grid);
                button13.setBackgroundResource(R.drawable.button_grid);
                button14.setBackgroundResource(R.drawable.button_grid);
                button15.setBackgroundResource(R.drawable.button_grid);
                button16.setBackgroundResource(R.drawable.button_grid);
                button17.setBackgroundResource(R.drawable.button_grid);
                button18.setBackgroundResource(R.drawable.button_grid);
                button19.setBackgroundResource(R.drawable.button_grid);
                button20.setBackgroundResource(R.drawable.button_grid);
                button21.setBackgroundResource(R.drawable.button_grid);
                button22.setBackgroundResource(R.drawable.button_grid);
                button23.setBackgroundResource(R.drawable.button_grid);
                button24.setBackgroundResource(R.drawable.button_grid);
                button25.setBackgroundResource(R.drawable.button_grid);
                button26.setBackgroundResource(R.drawable.button_grid);
                button27.setBackgroundResource(R.drawable.button_grid);
                button28.setBackgroundResource(R.drawable.button_grid);
                button29.setBackgroundResource(R.drawable.button_grid);
                button30.setBackgroundResource(R.drawable.button_grid);
                button31.setBackgroundResource(R.drawable.button_grid);
                button32.setBackgroundResource(R.drawable.button_grid);
                button33.setBackgroundResource(R.drawable.button_grid);
                button34.setBackgroundResource(R.drawable.button_grid);
                button35.setBackgroundResource(R.drawable.button_grid);
                button36.setBackgroundResource(R.drawable.button_grid);
                pref = getSharedPreferences("jun", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.clear();
                editor.apply();
            }
        });

        hand = new Handler();

        captuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                captuer.setVisibility(View.GONE);

                hand.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        captuer.setVisibility(View.VISIBLE);
                    }
                },3000);

                View container;
                container = getWindow().getDecorView();
                container.buildDrawingCache();
                Bitmap captureView = container.getDrawingCache();

                String adress = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/com.example.bible"+"/capture.jpeg";
                FileOutputStream fos;
                try{
                    fos = new FileOutputStream(adress);
                    captureView.compress(Bitmap.CompressFormat.JPEG,100,fos);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                Uri uri = FileProvider.getUriForFile(getApplicationContext(), "com.example.bible.fileProvider", new File(adress));
                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_STREAM, uri);
                shareintent.setType("image/*");
                startActivity(Intent.createChooser(shareintent,"공유"));

//                File file = ScreenShot(v);
//
//                try {
//                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                        shareIntent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                        Uri contentUri = FileProvider.getUriForFile(getApplicationContext(), "com.example.bible", file);
//                        shareIntent.setType("image/*");
//                        shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
//                    } else {
//                        shareIntent.setType("image/*");
//                        shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
//                    }
//                    getApplicationContext().startActivity(Intent.createChooser(shareIntent, ""));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
            }
        });

    }



    public File ScreenShot(View view){
        view.setDrawingCacheEnabled(true);

        Bitmap screenBitmap = view.getDrawingCache();

        String filename = "screenshot"+ System.currentTimeMillis() +".png";
        File file = new File(Environment.DIRECTORY_DCIM+"/Screenshots", filename);
        FileOutputStream os = null;
        try{
            os = new FileOutputStream(file);
            screenBitmap.compress(Bitmap.CompressFormat.PNG, 100, os); //PNG파일로 만들기
            os.close();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

        view.setDrawingCacheEnabled(false);
        return file;
    }
}