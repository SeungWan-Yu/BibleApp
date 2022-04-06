package com.example.bible;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

public class AprActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10
            ,button11,button12,button13,button14,button15
            ,button16,button17,button18,button19,button20
            ,button21,button22,button23,button24,button25
            ,button26,button27,button28,button29,button30
            ,button31,button32,button33,button34,button35
            ,button36,button37,button38,button39,button40
            ,button41,button42,button45,captuer;
    SharedPreferences pref;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20
            ,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
    Handler hand;
    TextView textView,day1,day2,day3,day4,day5,day6,day7,day8,day9,day10,day11
            ,day12,day13,day14,day15,day16,day17,day18,day19,day20,day21,day22
            ,day23,day24,day25,day26,day27,day28,day29,day30,day31,day32,day33
            ,day34,day35,day36,day37,day38,day39,day40,day41,day42;
    Integer su=1,sat=1,rut=1,hang=1,samsang=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apr);

        textView = findViewById(R.id.textView);

        pref = getSharedPreferences("apr", MODE_PRIVATE);
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
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button40 = findViewById(R.id.button40);
        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button45 = findViewById(R.id.button45);

        Button[] ButtonArray = new Button[42];

        for (int i=0; i<42; i++)
        {
            ButtonArray[i] = findViewById(getResources().getIdentifier("button" + (i + 1), "id", getPackageName()));
        }

        Log.e("idididididididi", String.valueOf(ButtonArray[0]));

        ButtonArray[5].setText("\n요"+19+"-"+21+"\n"+"시"+91);
        for(int i=6;i<14;i++){
            ButtonArray[i].setText("\n수"+(su)+"-"+(su+2)+"\n"+"시"+(i+86));
            su = su+3;
        }
        for(int i=14;i<21;i++){
            ButtonArray[i].setText("\n삿"+(sat)+"-"+(sat+2)+"\n"+"시"+(i+86));
            sat = sat+3;
        }
        for(int i=21;i<23;i++){
            ButtonArray[i].setText("\n룻"+(rut)+"-"+(rut+1)+"\n"+"시"+(i+86));
            rut = rut+2;
        }
        for(int i=23;i<32;i++){
            if (i==31) {
                ButtonArray[i].setText("\n행" + (hang) + "-" + (hang + 3) + "\n" + "시" + (i + 86));
            }else {
                ButtonArray[i].setText("\n행" + (hang) + "-" + (hang + 2) + "\n" + "시" + (i + 86));
            }
            hang = hang+3;
        }
        for(int i=32;i<35;i++){
            ButtonArray[i].setText("\n삼상"+(samsang)+"-"+(samsang+2)+"\n"+"시"+(i+86));
            samsang = samsang+3;
        }

        captuer = findViewById(R.id.captuer);
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
        day36 = findViewById(R.id.day36);
        day37 = findViewById(R.id.day37);
        day38 = findViewById(R.id.day38);
        day39 = findViewById(R.id.day39);
        day40 = findViewById(R.id.day40);
        day41 = findViewById(R.id.day41);
        day42 = findViewById(R.id.day42);

        TextView[] TextArray = new TextView[42];

        for (int i=0; i<42; i++)
        {
            TextArray[i] = findViewById(getResources().getIdentifier("day" + (i + 1), "id", getPackageName()));
        }

        Log.e("idididididididi", String.valueOf(TextArray[0]));

        for(int i=5;i<35;i++){
            TextArray[i].setText(String.valueOf(i-4));
        }


//\n창1-3\n시1

        if(b1.equals("1")){
            button1.setTextColor(Color.WHITE);
            day1.setTextColor(Color.WHITE);
            button1.setBackgroundResource(R.color.apr_select);
        }
        if(b2.equals("1")){
            button2.setTextColor(Color.WHITE);
            day2.setTextColor(Color.WHITE);
            button2.setBackgroundResource(R.color.apr_select);
        }
        if(b3.equals("1")){
            button3.setTextColor(Color.WHITE);
            day3.setTextColor(Color.WHITE);
            button3.setBackgroundResource(R.color.apr_select);
        }
        if(b4.equals("1")){
            button4.setTextColor(Color.WHITE);
            day4.setTextColor(Color.WHITE);
            button4.setBackgroundResource(R.color.apr_select);
        }
        if(b5.equals("1")){
            button5.setTextColor(Color.WHITE);
            day5.setTextColor(Color.WHITE);
            button5.setBackgroundResource(R.color.apr_select);
        }
        if(b6.equals("1")){
            button6.setTextColor(Color.WHITE);
            day6.setTextColor(Color.WHITE);
            button6.setBackgroundResource(R.color.apr_select);
        }
        if(b7.equals("1")){
            day7.setTextColor(Color.WHITE);
            button7.setTextColor(Color.WHITE);
            button7.setBackgroundResource(R.color.apr_select);
        }
        if(b8.equals("1")){
            button8.setTextColor(Color.WHITE);
            day8.setTextColor(Color.WHITE);
            button8.setBackgroundResource(R.color.apr_select);
        }
        if(b9.equals("1")){
            button9.setTextColor(Color.WHITE);
            day9.setTextColor(Color.WHITE);
            button9.setBackgroundResource(R.color.apr_select);
        }
        if(b10.equals("1")){
            button10.setTextColor(Color.WHITE);
            day10.setTextColor(Color.WHITE);
            button10.setBackgroundResource(R.color.apr_select);
        }
        if(b11.equals("1")){
            button11.setTextColor(Color.WHITE);
            day11.setTextColor(Color.WHITE);
            button11.setBackgroundResource(R.color.apr_select);
        }
        if(b12.equals("1")){
            button12.setTextColor(Color.WHITE);
            day12.setTextColor(Color.WHITE);
            button12.setBackgroundResource(R.color.apr_select);
        }
        if(b13.equals("1")){
            button13.setTextColor(Color.WHITE);
            day13.setTextColor(Color.WHITE);
            button13.setBackgroundResource(R.color.apr_select);
        }
        if(b14.equals("1")){
            button14.setTextColor(Color.WHITE);
            day14.setTextColor(Color.WHITE);
            button14.setBackgroundResource(R.color.apr_select);
        }
        if(b15.equals("1")){
            button15.setTextColor(Color.WHITE);
            day15.setTextColor(Color.WHITE);
            button15.setBackgroundResource(R.color.apr_select);
        }
        if(b16.equals("1")){
            button16.setTextColor(Color.WHITE);
            day16.setTextColor(Color.WHITE);
            button16.setBackgroundResource(R.color.apr_select);
        }
        if(b17.equals("1")){
            button17.setTextColor(Color.WHITE);
            day17.setTextColor(Color.WHITE);
            button17.setBackgroundResource(R.color.apr_select);
        }
        if(b18.equals("1")){
            button18.setTextColor(Color.WHITE);
            day18.setTextColor(Color.WHITE);
            button18.setBackgroundResource(R.color.apr_select);
        }
        if(b19.equals("1")){
            button19.setTextColor(Color.WHITE);
            day19.setTextColor(Color.WHITE);
            button19.setBackgroundResource(R.color.apr_select);
        }
        if(b20.equals("1")){
            button20.setTextColor(Color.WHITE);
            day20.setTextColor(Color.WHITE);
            button20.setBackgroundResource(R.color.apr_select);
        }
        if(b21.equals("1")){
            button21.setTextColor(Color.WHITE);
            day21.setTextColor(Color.WHITE);
            button21.setBackgroundResource(R.color.apr_select);
        }
        if(b22.equals("1")){
            button22.setTextColor(Color.WHITE);
            day22.setTextColor(Color.WHITE);
            button22.setBackgroundResource(R.color.apr_select);
        }
        if(b23.equals("1")){
            button23.setTextColor(Color.WHITE);
            day23.setTextColor(Color.WHITE);
            button23.setBackgroundResource(R.color.apr_select);
        }
        if(b24.equals("1")){
            button24.setTextColor(Color.WHITE);
            day24.setTextColor(Color.WHITE);
            button24.setBackgroundResource(R.color.apr_select);
        }
        if(b25.equals("1")){
            button25.setTextColor(Color.WHITE);
            day25.setTextColor(Color.WHITE);
            button25.setBackgroundResource(R.color.apr_select);
        }
        if(b26.equals("1")){
            button26.setTextColor(Color.WHITE);
            day26.setTextColor(Color.WHITE);
            button26.setBackgroundResource(R.color.apr_select);
        }
        if(b27.equals("1")){
            button27.setTextColor(Color.WHITE);
            day27.setTextColor(Color.WHITE);
            button27.setBackgroundResource(R.color.apr_select);
        }
        if(b28.equals("1")){
            button28.setTextColor(Color.WHITE);
            day28.setTextColor(Color.WHITE);
            button28.setBackgroundResource(R.color.apr_select);
        }
        if(b29.equals("1")){
            button29.setTextColor(Color.WHITE);
            day29.setTextColor(Color.WHITE);
            button29.setBackgroundResource(R.color.apr_select);
        }
        if(b30.equals("1")){
            button30.setTextColor(Color.WHITE);
            day30.setTextColor(Color.WHITE);
            button30.setBackgroundResource(R.color.apr_select);
        }
        if(b31.equals("1")){
            button31.setTextColor(Color.WHITE);
            day31.setTextColor(Color.WHITE);
            button31.setBackgroundResource(R.color.apr_select);
        }
        if(b32.equals("1")){
            button32.setTextColor(Color.WHITE);
            day32.setTextColor(Color.WHITE);
            button32.setBackgroundResource(R.color.apr_select);
        }
        if(b33.equals("1")){
            button33.setTextColor(Color.WHITE);
            day33.setTextColor(Color.WHITE);
            button33.setBackgroundResource(R.color.apr_select);
        }
        if(b34.equals("1")){
            button34.setTextColor(Color.WHITE);
            day34.setTextColor(Color.WHITE);
            button34.setBackgroundResource(R.color.apr_select);
        }
        if(b35.equals("1")){
            button35.setTextColor(Color.WHITE);
            day35.setTextColor(Color.WHITE);
            button35.setBackgroundResource(R.color.apr_select);
        }
        if(b36.equals("1")){
            button36.setTextColor(Color.WHITE);
            day36.setTextColor(Color.WHITE);
            button36.setBackgroundResource(R.color.apr_select);
        }


//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                button1.setTextColor(Color.WHITE);
//                day1.setTextColor(Color.WHITE);
//                button1.setBackgroundResource(R.color.apr_select);
//                pref = getSharedPreferences("apr", MODE_PRIVATE);
//                SharedPreferences.Editor editor = pref.edit();
//                editor.putString("b1", "1");
//                editor.apply();
//            }
//        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setTextColor(Color.WHITE);
                day2.setTextColor(Color.WHITE);
                button2.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b2", "1");
                editor.apply();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setTextColor(Color.WHITE);
                day3.setTextColor(Color.WHITE);
                button3.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b3", "1");
                editor.apply();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setTextColor(Color.WHITE);
                day4.setTextColor(Color.WHITE);
                button4.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b4", "1");
                editor.apply();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setTextColor(Color.WHITE);
                day5.setTextColor(Color.WHITE);
                button5.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b5", "1");
                editor.apply();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setTextColor(Color.WHITE);
                day6.setTextColor(Color.WHITE);
                button6.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b6", "1");
                editor.apply();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day7.setTextColor(Color.WHITE);
                button7.setTextColor(Color.WHITE);
                button7.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b7", "1");
                editor.apply();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setTextColor(Color.WHITE);
                day8.setTextColor(Color.WHITE);
                button8.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b8", "1");
                editor.apply();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setTextColor(Color.WHITE);
                day9.setTextColor(Color.WHITE);
                button9.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b9", "1");
                editor.apply();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setTextColor(Color.WHITE);
                day10.setTextColor(Color.WHITE);
                button10.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b10", "1");
                editor.apply();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setTextColor(Color.WHITE);
                day11.setTextColor(Color.WHITE);
                button11.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b11", "1");
                editor.apply();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setTextColor(Color.WHITE);
                day12.setTextColor(Color.WHITE);
                button12.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b12", "1");
                editor.apply();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setTextColor(Color.WHITE);
                day13.setTextColor(Color.WHITE);
                button13.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b13", "1");
                editor.apply();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button14.setTextColor(Color.WHITE);
                day14.setTextColor(Color.WHITE);
                button14.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b14", "1");
                editor.apply();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button15.setTextColor(Color.WHITE);
                day15.setTextColor(Color.WHITE);
                button15.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b15", "1");
                editor.apply();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button16.setTextColor(Color.WHITE);
                day16.setTextColor(Color.WHITE);
                button16.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b16", "1");
                editor.apply();
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setTextColor(Color.WHITE);
                day17.setTextColor(Color.WHITE);
                button17.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b17", "1");
                editor.apply();
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setTextColor(Color.WHITE);
                day18.setTextColor(Color.WHITE);
                button18.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b18", "1");
                editor.apply();
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button19.setTextColor(Color.WHITE);
                day19.setTextColor(Color.WHITE);
                button19.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b19", "1");
                editor.apply();
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button20.setTextColor(Color.WHITE);
                day20.setTextColor(Color.WHITE);
                button20.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b20", "1");
                editor.apply();
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button21.setTextColor(Color.WHITE);
                day21.setTextColor(Color.WHITE);
                button21.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b21", "1");
                editor.apply();
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button22.setTextColor(Color.WHITE);
                day22.setTextColor(Color.WHITE);
                button22.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b22", "1");
                editor.apply();
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button23.setTextColor(Color.WHITE);
                day23.setTextColor(Color.WHITE);
                button23.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b23", "1");
                editor.apply();
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button24.setTextColor(Color.WHITE);
                day24.setTextColor(Color.WHITE);
                button24.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b24", "1");
                editor.apply();
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button25.setTextColor(Color.WHITE);
                day25.setTextColor(Color.WHITE);
                button25.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b25", "1");
                editor.apply();
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button26.setTextColor(Color.WHITE);
                day26.setTextColor(Color.WHITE);
                button26.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b26", "1");
                editor.apply();
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button27.setTextColor(Color.WHITE);
                day27.setTextColor(Color.WHITE);
                button27.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b27", "1");
                editor.apply();
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button28.setTextColor(Color.WHITE);
                day28.setTextColor(Color.WHITE);
                button28.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b28", "1");
                editor.apply();
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button29.setTextColor(Color.WHITE);
                day29.setTextColor(Color.WHITE);
                button29.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b29", "1");
                editor.apply();
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button30.setTextColor(Color.WHITE);
                day30.setTextColor(Color.WHITE);
                button30.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b30", "1");
                editor.apply();
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button31.setTextColor(Color.WHITE);
                day31.setTextColor(Color.WHITE);
                button31.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b31", "1");
                editor.apply();
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button32.setTextColor(Color.WHITE);
                day32.setTextColor(Color.WHITE);
                button32.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b32", "1");
                editor.apply();
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button33.setTextColor(Color.WHITE);
                day33.setTextColor(Color.WHITE);
                button33.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b33", "1");
                editor.apply();
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button34.setTextColor(Color.WHITE);
                day34.setTextColor(Color.WHITE);
                button34.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b34", "1");
                editor.apply();
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button35.setTextColor(Color.WHITE);
                day35.setTextColor(Color.WHITE);
                button35.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b35", "1");
                editor.apply();
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button36.setTextColor(Color.WHITE);
                day36.setTextColor(Color.WHITE);
                button36.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b36", "1");
                editor.apply();
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button37.setTextColor(Color.WHITE);
                day37.setTextColor(Color.WHITE);
                button37.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b37", "1");
                editor.apply();
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button38.setTextColor(Color.WHITE);
                day38.setTextColor(Color.WHITE);
                button38.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b38", "1");
                editor.apply();
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button39.setTextColor(Color.WHITE);
                day39.setTextColor(Color.WHITE);
                button39.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b39", "1");
                editor.apply();
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button40.setTextColor(Color.WHITE);
                day40.setTextColor(Color.WHITE);
                button40.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b40", "1");
                editor.apply();
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button41.setTextColor(Color.WHITE);
                day41.setTextColor(Color.WHITE);
                button41.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b41", "1");
                editor.apply();
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button42.setTextColor(Color.WHITE);
                day42.setTextColor(Color.WHITE);
                button42.setBackgroundResource(R.color.apr_select);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("b36", "1");
                editor.apply();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundResource(R.color.apr_sub);
                button2.setBackgroundResource(R.color.apr_sub);
                button3.setBackgroundResource(R.color.apr_sub);
                button4.setBackgroundResource(R.color.apr_sub);
                button5.setBackgroundResource(R.color.apr_sub);
                button6.setBackgroundResource(R.color.apr_sub);
                button7.setBackgroundResource(R.color.apr_sub);
                button8.setBackgroundResource(R.color.apr_sub);
                button9.setBackgroundResource(R.color.apr_sub);
                button10.setBackgroundResource(R.color.apr_sub);
                button11.setBackgroundResource(R.color.apr_sub);
                button12.setBackgroundResource(R.color.apr_sub);
                button13.setBackgroundResource(R.color.apr_sub);
                button14.setBackgroundResource(R.color.apr_sub);
                button15.setBackgroundResource(R.color.apr_sub);
                button16.setBackgroundResource(R.color.apr_sub);
                button17.setBackgroundResource(R.color.apr_sub);
                button18.setBackgroundResource(R.color.apr_sub);
                button19.setBackgroundResource(R.color.apr_sub);
                button20.setBackgroundResource(R.color.apr_sub);
                button21.setBackgroundResource(R.color.apr_sub);
                button22.setBackgroundResource(R.color.apr_sub);
                button23.setBackgroundResource(R.color.apr_sub);
                button24.setBackgroundResource(R.color.apr_sub);
                button25.setBackgroundResource(R.color.apr_sub);
                button26.setBackgroundResource(R.color.apr_sub);
                button27.setBackgroundResource(R.color.apr_sub);
                button28.setBackgroundResource(R.color.apr_sub);
                button29.setBackgroundResource(R.color.apr_sub);
                button30.setBackgroundResource(R.color.apr_sub);
                button31.setBackgroundResource(R.color.apr_sub);
                button32.setBackgroundResource(R.color.apr_sub);
                button33.setBackgroundResource(R.color.apr_sub);
                button34.setBackgroundResource(R.color.apr_sub);
                button35.setBackgroundResource(R.color.apr_sub);
                button36.setBackgroundResource(R.color.apr_sub);
                button1.setTextColor(Color.BLACK);
                button2.setTextColor(Color.BLACK);
                button3.setTextColor(Color.BLACK);
                button4.setTextColor(Color.BLACK);
                button5.setTextColor(Color.BLACK);
                button6.setTextColor(Color.BLACK);
                button7.setTextColor(Color.BLACK);
                button8.setTextColor(Color.BLACK);
                button9.setTextColor(Color.BLACK);
                button10.setTextColor(Color.BLACK);
                button11.setTextColor(Color.BLACK);
                button12.setTextColor(Color.BLACK);
                button13.setTextColor(Color.BLACK);
                button14.setTextColor(Color.BLACK);
                button15.setTextColor(Color.BLACK);
                button16.setTextColor(Color.BLACK);
                button17.setTextColor(Color.BLACK);
                button18.setTextColor(Color.BLACK);
                button19.setTextColor(Color.BLACK);
                button20.setTextColor(Color.BLACK);
                button21.setTextColor(Color.BLACK);
                button22.setTextColor(Color.BLACK);
                button23.setTextColor(Color.BLACK);
                button24.setTextColor(Color.BLACK);
                button25.setTextColor(Color.BLACK);
                button26.setTextColor(Color.BLACK);
                button27.setTextColor(Color.BLACK);
                button28.setTextColor(Color.BLACK);
                button29.setTextColor(Color.BLACK);
                button30.setTextColor(Color.BLACK);
                button31.setTextColor(Color.BLACK);
                button32.setTextColor(Color.BLACK);
                button33.setTextColor(Color.BLACK);
                button34.setTextColor(Color.BLACK);
                button35.setTextColor(Color.BLACK);
                button36.setTextColor(Color.BLACK);
                day1.setTextColor(Color.BLACK);
                day2.setTextColor(Color.BLACK);
                day3.setTextColor(Color.BLACK);
                day4.setTextColor(Color.BLACK);
                day5.setTextColor(Color.BLACK);
                day6.setTextColor(Color.BLACK);
                day7.setTextColor(Color.BLACK);
                day8.setTextColor(Color.BLACK);
                day9.setTextColor(Color.BLACK);
                day10.setTextColor(Color.BLACK);
                day11.setTextColor(Color.BLACK);
                day12.setTextColor(Color.BLACK);
                day13.setTextColor(Color.BLACK);
                day14.setTextColor(Color.BLACK);
                day15.setTextColor(Color.BLACK);
                day16.setTextColor(Color.BLACK);
                day17.setTextColor(Color.BLACK);
                day18.setTextColor(Color.BLACK);
                day19.setTextColor(Color.BLACK);
                day20.setTextColor(Color.BLACK);
                day21.setTextColor(Color.BLACK);
                day22.setTextColor(Color.BLACK);
                day23.setTextColor(Color.BLACK);
                day24.setTextColor(Color.BLACK);
                day25.setTextColor(Color.BLACK);
                day26.setTextColor(Color.BLACK);
                day27.setTextColor(Color.BLACK);
                day28.setTextColor(Color.BLACK);
                day29.setTextColor(Color.BLACK);
                day30.setTextColor(Color.BLACK);
                day31.setTextColor(Color.BLACK);
                day32.setTextColor(Color.BLACK);
                day33.setTextColor(Color.BLACK);
                day34.setTextColor(Color.BLACK);
                day35.setTextColor(Color.BLACK);
                day36.setTextColor(Color.BLACK);
                day37.setTextColor(Color.BLACK);
                day38.setTextColor(Color.BLACK);
                day39.setTextColor(Color.BLACK);
                day40.setTextColor(Color.BLACK);
                day41.setTextColor(Color.BLACK);
                day42.setTextColor(Color.BLACK);
                pref = getSharedPreferences("apr", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.clear();
                editor.apply();
            }
        });

        hand = new Handler();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                button1.setText("");

                hand.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button1.setText("캡쳐");
                    }
                },3000);

                View view = getWindow().getDecorView().getRootView();
                view.setDrawingCacheEnabled(true);  //화면에 뿌릴때 캐시를 사용하게 한다

                //캐시를 비트맵으로 변환
                Bitmap screenBitmap = Bitmap.createBitmap(view.getDrawingCache());

                try {

                    File cachePath = new File(getApplicationContext().getCacheDir(), "images");
                    cachePath.mkdirs(); // don't forget to make the directory
                    FileOutputStream stream = new FileOutputStream(cachePath + "/image.png"); // overwrites this image every time
                    screenBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                    stream.close();

                    File newFile = new File(cachePath, "image.png");
                    Uri contentUri = FileProvider.getUriForFile(getApplicationContext(),
                            "com.example.bible.fileProvider", newFile);

                    Intent Sharing_intent = new Intent(Intent.ACTION_SEND);
                    Sharing_intent.setType("image/png");
                    Sharing_intent.putExtra(Intent.EXTRA_STREAM, contentUri);
                    startActivity(Intent.createChooser(Sharing_intent, "Share image"));

                } catch (IOException e) {
                    e.printStackTrace();
                }


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
