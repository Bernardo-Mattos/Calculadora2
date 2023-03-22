    package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);
    }
        public void somar(View v) {
            int valor1 = Integer.parseInt(numero1.getText().toString());
            int valor2 = Integer.parseInt(numero2.getText().toString());

            resultado.setText(String.valueOf(valor1 + valor2));
        }

        public void subtrair(View v) {
            int valor1 = Integer.parseInt(numero1.getText().toString());
            int valor2 = Integer.parseInt(numero2.getText().toString());

            resultado.setText(String.valueOf(valor1 - valor2));

        }
        public void multiplicar(View v) {
            int valor1 = Integer.parseInt(numero1.getText().toString());
            int valor2 = Integer.parseInt(numero2.getText().toString());

            resultado.setText(String.valueOf(valor1*valor2));

        }
        public void dividir(View v) {
            int valor1 = Integer.parseInt(numero1.getText().toString());
            int valor2 = Integer.parseInt(numero1.getText().toString());

            resultado.setText(String.valueOf(valor1/valor2));

        }

    }

