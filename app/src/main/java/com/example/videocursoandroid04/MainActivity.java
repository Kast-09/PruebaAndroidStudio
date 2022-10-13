package com.example.videocursoandroid04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox check1, check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
    }

    public void operar(View v){
        int v1 = Integer.parseInt(et1.getText().toString());
        int v2 = Integer.parseInt(et2.getText().toString());
        String resu = "";

        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

        if(check1.isChecked()){
            int suma = v1 + v2;
            resu+="La suma es: "+suma;
            intent.putExtra("RESULTADO", resu);
            startActivity(intent);
        }
        if(check2.isChecked()){
            int resta = v1 - v2;
            resu+="La resta es: "+resta;
            intent.putExtra("RESULTADO", resu);
            startActivity(intent);
        }
    }
}