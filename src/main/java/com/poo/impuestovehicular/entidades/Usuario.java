package com.poo.impuestovehicular.entidades;

public class Usuario extends EntidadBase {

    private String nombre;

    private String contraseña;
    
    private String identificación;

    private String nombres;

    private String primerApellido;

    private String segundoApellido;

    private Integer edad;

    public Usuario() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(final String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + nombre + ";" + contraseña + ";" + identificación + ";" + nombres + ";" + primerApellido + ";" + segundoApellido + ";" + edad;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}