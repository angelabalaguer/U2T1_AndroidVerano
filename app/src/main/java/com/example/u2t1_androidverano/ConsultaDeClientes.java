package com.example.u2t1_androidverano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConsultaDeClientes extends AppCompatActivity {
    TextView txtmensaje,txtsexo,txtcelular,txtdomicilio,txtapellido;
    String titulonombre,tituloapellido,celular,domicilio,sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_de_clientes);
        Bundle extras = getIntent().getExtras();
        titulonombre = extras.getString("Nombre");
        tituloapellido = extras.getString("Apellidos");
        sexo = extras.getString("Sexo");
        celular = extras.getString("Telefono");
        domicilio = extras.getString("Direccion");




        txtmensaje=findViewById(R.id.titulonombre);
        txtapellido=findViewById(R.id.tituloapellido);
        txtsexo=findViewById(R.id.sexo);
        txtcelular=findViewById(R.id.telefono);
        txtdomicilio=findViewById(R.id.direccion);


        txtmensaje.setText(titulonombre);
        txtapellido.setText(tituloapellido);
        if (Integer.parseInt(sexo) == 0){
            txtsexo.setText("FEMENINO");
        }else {
            txtsexo.setText("MASCULINO");
        }

        txtcelular.setText(celular);
        txtdomicilio.setText(domicilio);
    }


}
