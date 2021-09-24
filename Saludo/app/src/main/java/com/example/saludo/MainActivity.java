package com.example.saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textSaludojava;
    Button btnCambiar;
    boolean cambiado=false;
    String valorboton1="cambiar texto";
    String valorTV1="hola mundo";
    String valorboton2="volver";
    String valorTV2="patatas fritas";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambiar = findViewById(R.id.btnCambiar);

        textSaludojava = findViewById(R.id.textSaludojava);
        textSaludojava.setText(valorTV1);
        btnCambiar.setText(valorboton1);
        //textSaludojava.setText("Patatas Fritas");
    }

    public void cambiarTexto(View v){

        if (!cambiado) {
            textSaludojava.setText(valorTV1);
            btnCambiar.setText(valorboton1);

            cambiado = !cambiado;
        } else {
            textSaludojava.setText(valorTV2);
            btnCambiar.setText(valorboton2);
            cambiado = !cambiado;
        }

    }
}