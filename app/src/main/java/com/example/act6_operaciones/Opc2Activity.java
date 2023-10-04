package com.example.act6_operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opc2Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText etN1;
    private Button btnCalcular2, btnRegresar;
    private TextView tvResultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opc2);

        etN1 = findViewById(R.id.etN1);
        tvResultado2 = findViewById(R.id.tvResultado2);

        btnCalcular2 = findViewById(R.id.btnCalcular2);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular2.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnCalcular2) {

            String textN1 = etN1.getText().toString();
            String result = "";

            int n1 = Integer.parseInt(textN1);
            System.out.println(n1);

            if(n1 % 2 == 0) {
                result = "" + n1 + " es par";
                tvResultado2.setText(result);
            } else {
                result = "" + n1 + " es impar";
                tvResultado2.setText(result);
            }

        } else if(view.getId() == R.id.btnRegresar) {
            Intent intent = new Intent(Opc2Activity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}