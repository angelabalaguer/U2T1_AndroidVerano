package com.example.u2t1_androidverano;

public class Cliente {
    private String codigo;
    private String nombre;
    private String Apellido;
    private String Sexo;
    private String Celular;
    private String Direccion;

    public Cliente(String codigo, String nombre, String Apellido, String Sexo,String Celular,String Direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Apellido= Apellido;
        this.Sexo=Sexo;
        this.Celular=Celular;
        this.Direccion=Direccion;
    }
    public String getcodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getSexo() {return Sexo;}
    public String getCelular() {return Celular;}
    public String getDomicilio() {return Direccion;}




}