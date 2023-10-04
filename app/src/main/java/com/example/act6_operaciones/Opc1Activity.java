package com.example.act6_operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opc1Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText etN1, etN2, etN3, etN4, etN5;
    private Button btnOrdenar, btnRegresar;
    private TextView tvResultado;
    private int[] numeros = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opc1);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        etN3 = findViewById(R.id.etN3);
        etN4 = findViewById(R.id.etN4);
        etN5 = findViewById(R.id.etN5);

        tvResultado = findViewById(R.id.tvResultado);

        btnOrdenar = findViewById(R.id.btnOrdenar);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnOrdenar.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String texN1 = etN1.getText().toString();
        String texN2 = etN2.getText().toString();
        String texN3 = etN3.getText().toString();
        String texN4 = etN4.getText().toString();
        String texN5 = etN5.getText().toString();

        numeros[0] = Integer.parseInt(texN1);
        numeros[1] = Integer.parseInt(texN2);
        numeros[2] = Integer.parseInt(texN3);
        numeros[3] = Integer.parseInt(texN4);
        numeros[4] = Integer.parseInt(texN5);

        if(view.getId() == R.id.btnOrdenar) {
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    if(numeros[j]>numeros[j+1]) { // NumeroActual > numeroSiguiente
                        int aux = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = aux;
                    }
                }
            }

            String result = "";

            for(int i = 0; i<5; i++ ) {
                result += numeros[i] + " ";
            }
            tvResultado.setText("El orden de los numeros es " + result);
        }
        else if(view.getId() == R.id.btnRegresar){
            Intent intent = new Intent(Opc1Activity.this , MainActivity.class);
            startActivity(intent);
        }
    }
}