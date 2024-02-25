package com.mobile.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       num = findViewById(R.id.num);


    }

    public void sortearNum(View view) {
        Random rd = new Random();

        int numero = rd.nextInt(101);

        num.setText(String.valueOf(numero));
    }
}