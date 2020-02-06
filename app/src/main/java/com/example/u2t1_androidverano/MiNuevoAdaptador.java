package com.example.u2t1_androidverano;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiNuevoAdaptador extends
        RecyclerView.Adapter<MiNuevoAdaptador.ViewHolder>
        {
            private LayoutInflater inflador;
            private ArrayList<Cliente> lista;
            Context micontext;

            public MainActivity activity;

            public MiNuevoAdaptador(Context context, ArrayList<Cliente> lista) {
                this.lista = lista;
                inflador = (LayoutInflater) context
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View v = inflador.inflate(R.layout.minuevoitem, parent, false);
                micontext = parent.getContext();
                return new ViewHolder(v);

            }
            @Override
            public void onBindViewHolder(final ViewHolder holder, final int i) {
                holder.titulo.setText(lista.get(i).getNombre());
                holder.apellido.setText(lista.get(i).getApellido());
                holder.codigo.setText(lista.get(i).getcodigo());
                holder.sexo.setText(lista.get(i).getSexo());
                holder.direccion.setText(lista.get(i).getDomicilio());
                holder.telefono.setText(lista.get(i).getCelular());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(micontext.getApplicationContext(), ConsultaDeClientes.class);
                        intent.putExtra("Nombre", holder.titulo.getText());
                        intent.putExtra("Apellidos", holder.apellido.getText());
                        intent.putExtra("Codigo", holder.codigo.getText());
                        intent.putExtra("Sexo", holder.sexo.getText());
                        intent.putExtra("Direccion", holder.direccion.getText());
                        intent.putExtra("Telefono", holder.telefono.getText());
                        micontext.startActivity(intent);
                    }
                });
            }
            @Override
            public int getItemCount() {
                return lista.size();
            }

            public class ViewHolder extends RecyclerView.ViewHolder {
                public TextView titulo, apellido,codigo,telefono,direccion,sexo;
                public ImageView icon;
                ViewHolder(View itemView) {
                    super(itemView);
                    titulo = (TextView)itemView.findViewById(R.id.titulo);
                    apellido = (TextView)itemView.findViewById(R.id.apellido);
                    codigo = (TextView)itemView.findViewById(R.id.codigo);
                    telefono = (TextView)itemView.findViewById(R.id.telefono);
                    direccion = (TextView)itemView.findViewById(R.id.direccion);
                    sexo = (TextView)itemView.findViewById(R.id.sexo);
                    icon = (ImageView)itemView.findViewById(R.id.icono);
                }
            }
            public void update(ArrayList<Cliente> datas){
                lista.clear();
                lista.addAll(datas);
                notifyDataSetChanged();
            }
}