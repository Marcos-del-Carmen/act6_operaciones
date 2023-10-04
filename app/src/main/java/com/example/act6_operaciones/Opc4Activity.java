package com.example.act6_operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opc4Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText etLado, etAltura;
    private Button btnCalcular, btnRegresar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opc4);

        etLado = findViewById(R.id.etLado);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnRegresar =findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnCalcular){
            String textA = etAltura.getText().toString();
            String textL = etLado.getText().toString();

            int a = Integer.parseInt(textA);
            int l = Integer.parseInt(textL);

            int peri = (l*2) + (a*2);
            int area = l*a;

            tvResultado.setText("Perimetro: " + peri + " Area: "  + area);

        } else if(view.getId() == R.id.btnRegresar){
            Intent intent = new Intent(Opc4Activity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}