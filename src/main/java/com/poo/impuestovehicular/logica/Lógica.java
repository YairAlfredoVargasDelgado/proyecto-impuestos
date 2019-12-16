package com.poo.impuestovehicular.logica;

import com.poo.impuestovehicular.datos.Datos;
import com.poo.impuestovehicular.entidades.EntidadBase;
import java.util.ArrayList;

public abstract class Lógica<T extends EntidadBase> {
    
    Datos<T> datos;
    
    public Lógica(Datos<T> datos) {
        this.datos = datos;
    }
    
    public T obtener(String id, boolean lazy) {
        return datos.obtener(id, lazy);
    }
    
    public boolean eliminar(String id) {
        return datos.eliminar(id);
    }
    
    public boolean actualizar(String id, T entidad) {
        return datos.actualizar(id, entidad);
    }
    
    public ArrayList<T> obtenerTodas(boolean lazy) {
        return datos.obtenerTodas(lazy);
    }
    
    public boolean registrar(T entidad) {
        return datos.registrar(entidad);
    }
    
    public Integer count() {
        return datos.count();
    }
}