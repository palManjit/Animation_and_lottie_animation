package com.jp.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_translate,btn_alpha,btn_rotate,btn_scale;
        TextView textview;

        btn_translate=findViewById(R.id.translate);
        textview=findViewById(R.id.textview);
        btn_alpha=findViewById(R.id.alpha);
        btn_rotate=findViewById(R.id.rotate);
        btn_scale=findViewById(R.id.scale);


        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation translate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                textview.startAnimation(translate);
            }
        });

        btn_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation alpha= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                textview.startAnimation(alpha);
            }
        });

        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                textview.startAnimation(rotate);
            }
        });

        btn_scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation scale= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                textview.startAnimation(scale);
            }
        });
    }
}