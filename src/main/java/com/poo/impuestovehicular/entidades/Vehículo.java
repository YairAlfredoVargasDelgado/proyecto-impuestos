package com.poo.impuestovehicular.entidades;

import java.time.LocalDate;

public class Vehículo extends EntidadBase {
    
    private String placa;
    
    private String modelo;
    
    private String idMarca;
    
    private Marca marca;
    
    private Integer capacidad;
    
    private TipoDeVehículo tipo;
    
    private Double avaluo;
    
    private ClaseDeVehículo clase;

    private LocalDate fechaDeCompra;

    private Float baseGravable;
    
    private Cliente cliente;
    
    private String cédulaCliente;
    
    public Vehículo() {}
    
    @Override
    public String toString() {
        return super.toString() + ";" +
                getPlaca() + ";" +
                getModelo() + ";" +
                getIdMarca() + ";" +
                getCapacidad() + ";" +
                getTipo() + ";" + 
                getAvaluo().toString() + ";" +
                getClase() + ";" +
                getFechaDeCompra() + ";" +
                getBaseGravable().toString() + ";" +
                getCédulaCliente();
    }

    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Marca getMarca() {
        return marca;
    }


    public void setMarca(Marca marca) {
        this.marca = marca;
    }


    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Double avaluo) {
        this.avaluo = avaluo;
    }

    public ClaseDeVehículo getClase() {
        return clase;
    }

    public void setClase(ClaseDeVehículo clase) {
        this.clase = clase;
    }

    public TipoDeVehículo getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeVehículo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Float getBaseGravable() {
        return baseGravable;
    }

    public void setBaseGravable(Float baseGravable) {
        this.baseGravable = baseGravable;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCédulaCliente() {
        return cédulaCliente;
    }

    public void setCédulaCliente(String cédulaCliente) {
        this.cédulaCliente = cédulaCliente;
    }

    public String getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }
    
}
