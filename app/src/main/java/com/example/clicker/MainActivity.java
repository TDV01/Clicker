package com.example.clicker;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Constructor;

public class MainActivity extends AppCompatActivity {
    int clickCounter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        TextView textview =findViewById(R.id.TextView);
        textview.setText("Counter: "+clickCounter);
        clickCounter++;
        if(clickCounter==1000000000){clickCounter=0;textview.setText("Kezd újra");}
    }
}