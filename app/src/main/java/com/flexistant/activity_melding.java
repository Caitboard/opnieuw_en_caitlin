package com.flexistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_melding extends AppCompatActivity {
    private Button button;
    private Button button4;
    private ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melding);
//Ja button linkt naar het homescherm
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityHome();
            }
        });
//        Nee button linkt naar overzicht flexlease
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityFlexLease();
            }
        });
//        Kruisje linkt naar het homescherm
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivityHome();
            }
        });

    }

    public void openActivityHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivityFlexLease(){
        Intent intent = new Intent(this, overzicht_flexlease.class);
        startActivity(intent);
    }
}