package com.example.act6_operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton opc1, opc2, opc3, opc4, opc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opc1 = findViewById(R.id.btnOpc1);
        opc2 = findViewById(R.id.btnOpc2);
        opc3 = findViewById(R.id.btnOpc3);
        opc4 = findViewById(R.id.btnOpc4);
        opc5 = findViewById(R.id.btnOpc5);

        opc1.setOnClickListener(this);
        opc2.setOnClickListener(this);
        opc3.setOnClickListener(this);
        opc4.setOnClickListener(this);
        opc5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnOpc1) {
            Intent intent = new Intent(MainActivity.this, Opc1Activity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.btnOpc2) {
            Intent intent = new Intent(MainActivity.this, Opc2Activity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.btnOpc3) {
            Intent intent = new Intent(MainActivity.this, Opc3Activity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.btnOpc4) {
            Intent intent = new Intent(MainActivity.this, Opc4Activity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.btnOpc5) {
            Intent intent = new Intent(MainActivity.this, Opc5Activity.class);
            startActivity(intent);
        }
    }
}