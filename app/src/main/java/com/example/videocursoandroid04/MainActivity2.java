package com.example.videocursoandroid04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String resutado = intent.getStringExtra("RESULTADO");

        TextView tv1 = findViewById(R.id.tv1);
        tv1.setText(resutado);
    }
}