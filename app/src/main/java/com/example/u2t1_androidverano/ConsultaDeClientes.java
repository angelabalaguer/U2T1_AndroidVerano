package com.example.u2t1_androidverano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class ConsultaDeClientes extends AppCompatActivity {
    private EditText nombre;
    private EditText apellido;
    private EditText telefono;
    private EditText direccion;
    private Spinner sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_de_clientes);
    }


}
