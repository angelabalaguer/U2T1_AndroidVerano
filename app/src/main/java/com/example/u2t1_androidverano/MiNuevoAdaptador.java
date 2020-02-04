package com.example.u2t1_androidverano;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiNuevoAdaptador extends
        RecyclerView.Adapter<MiNuevoAdaptador.ViewHolder>
        implements View.OnClickListener{
    private LayoutInflater inflador;
    private ArrayList<Cliente> lista;
    private View.OnClickListener listener;

    public MiNuevoAdaptador(Context context, ArrayList<Cliente> lista) {
        this.lista = lista;
        inflador = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.minuevoitem, parent, false);
       v.setOnClickListener(this);
        return new ViewHolder(v);

    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {

        holder.codpersona.setText(lista.get(i).getcodigo());
        holder.titulo.setText(lista.get(i).getNombre()+" "+lista.get(i).getApellido()+" "+lista.get(i).getcodigo());
    }
    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void  setOnClickListener(View.OnClickListener listener) {
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null){
            listener.onClick(view);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, subtitutlo,codpersona;
        public ImageView icon;
        ViewHolder(View itemView) {
            super(itemView);
            codpersona = (TextView) itemView.findViewById(R.id.codpersona);
            titulo = (TextView)itemView.findViewById(R.id.titulo);
            subtitutlo = (TextView)itemView.findViewById(R.id.subtitulo);
            icon = (ImageView)itemView.findViewById(R.id.icono);
        }
    }
    public void update(ArrayList<Cliente> datas){
        lista.clear();
        lista.addAll(datas);
        notifyDataSetChanged();
    }
}