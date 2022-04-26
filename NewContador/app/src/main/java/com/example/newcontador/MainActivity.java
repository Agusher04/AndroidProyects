package com.example.newcontador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newcontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    View V;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void setButton(View V){
        this.V = V;
    }
    public void enable(View V){
        this.V.setEnabled(true);
    }
    public void disable(View V){
        this.V.setEnabled(false);
    }
}