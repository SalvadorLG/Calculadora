package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText pantallaOperaiones;
    private EditText pantallaOperaiones2;
    private TextView id_respuesta;
    private Button id_porcentaje;
    private Button id_suma;
    private Button id_resta;
    private Button id_multiplicacion;
    private Button id_divicion;
    private Button id_potencia;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantallaOperaiones = (EditText) findViewById(R.id.pantallaOperaciones);
        pantallaOperaiones2 = (EditText) findViewById(R.id.pantallaOperaciones2);
        id_respuesta = (TextView) findViewById(R.id.id_respuesta);
        id_porcentaje = (Button) findViewById(R.id.id_porcentaje);
        id_suma = (Button) findViewById(R.id.id_suma);
        id_resta = (Button) findViewById(R.id.id_resta);
        id_multiplicacion = (Button) findViewById(R.id.id_multiplicacion);
        id_divicion = (Button) findViewById(R.id.id_divicion);
        id_potencia = (Button) findViewById(R.id.id_potencia);

        id_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_1 = Integer.parseInt(String.valueOf(pantallaOperaiones.getText()));
                int numero_2 = Integer.parseInt(String.valueOf(pantallaOperaiones2.getText()));
                String respuesta = String.valueOf(numero_1 + numero_2);
                id_respuesta.clearComposingText();
                id_respuesta.setText(respuesta);
            }
        });
        id_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_1 = Integer.parseInt(String.valueOf(pantallaOperaiones.getText()));
                int numero_2 = Integer.parseInt(String.valueOf(pantallaOperaiones2.getText()));
                String respuesta = String.valueOf(numero_1 - numero_2);
                id_respuesta.clearComposingText();
                id_respuesta.setText(respuesta);
            }
        });
        id_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_1 = Integer.parseInt(String.valueOf(pantallaOperaiones.getText()));
                int numero_2 = Integer.parseInt(String.valueOf(pantallaOperaiones2.getText()));
                String respuesta = String.valueOf(numero_1 * numero_2);
                id_respuesta.clearComposingText();
                id_respuesta.setText(respuesta);
            }
        });
        id_divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_1 = Integer.parseInt(String.valueOf(pantallaOperaiones.getText()));
                int numero_2 = Integer.parseInt(String.valueOf(pantallaOperaiones2.getText()));
                String respuesta = String.valueOf(numero_1 / numero_2);
                id_respuesta.clearComposingText();
                id_respuesta.setText(respuesta);
            }
        });
        id_potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_1 = Integer.parseInt(String.valueOf(pantallaOperaiones.getText()));
                int numero_2 = Integer.parseInt(String.valueOf(pantallaOperaiones2.getText()));
                String respuesta = String.valueOf(numero_1 ^ numero_2);
                id_respuesta.clearComposingText();
                id_respuesta.setText(respuesta);
            }
        });
        id_porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_1 = Integer.parseInt(String.valueOf(pantallaOperaiones.getText()));
                int numero_2 = Integer.parseInt(String.valueOf(pantallaOperaiones2.getText()));
                String respuesta = String.valueOf((numero_2/100)*numero_1);
                id_respuesta.clearComposingText();
                id_respuesta.setText(respuesta);
            }
        });
    }
}
