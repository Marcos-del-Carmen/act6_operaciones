package com.example.act6_operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opc3Activity extends AppCompatActivity implements View.OnClickListener{
    private EditText etN1;
    private Button btnCalcular, btnRegresar;
    private TextView tvResultado;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opc3);

        etN1 = findViewById(R.id.etN1);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnCalcular) {
            String textN1 = etN1.getText().toString();
            int n1 = Integer.parseInt(textN1);

            if (n1 == 0 || n1 == 1) {
                tvResultado.setText("igual a " + 1);
            }

            int factorial = 1;
            for(int i = 1; i <= n1; i++) {
                factorial = factorial * i;
            }

            tvResultado.setText("El facotial del " + n1 + " es " + factorial);
        } else if(view.getId() == R.id.btnRegresar){
            Intent intent = new Intent(Opc3Activity.this, MainActivity.class);
            startActivity(intent);
        }

    }
}