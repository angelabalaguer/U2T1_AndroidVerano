package com.example.u2t1_androidverano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MiNuevoAdaptador adaptador;
    private ArrayList<Cliente> misdatos;
    public Vector<String> valor;
    private String res;
    HttpURLConnection conexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        misdatos = new ArrayList<>();
        misdatos.add(new Cliente("1", "Juanito", "Perez"));
        misdatos.add(new Cliente("2", "Pablito", "Canto"));
        adaptador = new MiNuevoAdaptador(this, misdatos);
/* adaptador = new MiNuevoAdaptador(this,
ListaClientes());*/
        recyclerView.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}