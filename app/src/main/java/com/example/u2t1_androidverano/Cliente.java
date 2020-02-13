package com.example.u2t1_androidverano;

public class Cliente {
    private String codigo;
    private String Nombre;
    private String Apellidos;
    private String Sexo;
    private String celular;
    private String Domicilio;

    public Cliente(String codigo, String Nombre, String Apellidos, String Sexo,String celular,String Domicilio) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Apellidos= Apellidos;
        this.Sexo=Sexo;
        this.celular=celular;
        this.Domicilio=Domicilio;
    }
    public String getcodigo() {
        return codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellidos;
    }
    public String getSexo() {return Sexo;}
    public String getCelular() {return celular;}
    public String getDomicilio() {return Domicilio;}




}