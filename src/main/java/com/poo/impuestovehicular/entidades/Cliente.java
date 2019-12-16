package com.poo.impuestovehicular.entidades;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private ArrayList<Vehículo> vehículos;

    public Cliente() {}

    public ArrayList<Vehículo> getVehículos() {
        return vehículos;
    }

    public void setVehículos(ArrayList<Vehículo> vehículos) {
        this.vehículos = vehículos;
    }

}