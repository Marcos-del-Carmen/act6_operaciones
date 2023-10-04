package com.example.act6_operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opc5Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText etN1;
    private Button btnPrimo, btnRegresar;
    private TextView tvPrimo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opc5);

        etN1 = findViewById(R.id.etNPrimo);

        tvPrimo = findViewById(R.id.tvPrimo);

        btnPrimo = findViewById(R.id.btnPrimo);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnPrimo.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnPrimo)
        {
            String textN1 = etN1.getText().toString();

            int n1 = Integer.parseInt(textN1);
            boolean esPrimo = true;

            if(n1<=1) {
                tvPrimo.setText(n1 + " no es primo.");
            } else {
                for(int i = 2 ; i <= n1; i++) {
                    if (n1 % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                tvPrimo.setText(n1 + " es un número primo.");
            }
        }
        else if(view.getId() == R.id.btnRegresar)
        {
            Intent intent = new Intent(Opc5Activity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}