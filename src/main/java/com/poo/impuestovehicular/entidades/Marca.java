package com.poo.impuestovehicular.entidades;

import java.util.ArrayList;
import java.util.Objects;

public class Marca extends EntidadBase {
    
    private String nombre;
    
    private String código;
    
    private ArrayList<Vehículo> vehículos;
    
    public Marca() {}
    
    @Override
    public String toString() {
        return super.toString() + ";" + getCódigo() + ";" + getNombre(); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public ArrayList<Vehículo> getVehículos() {
        return vehículos;
    }

    public void setVehículos(ArrayList<Vehículo> vehículos) {
        this.vehículos = vehículos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Marca other = (Marca) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}
