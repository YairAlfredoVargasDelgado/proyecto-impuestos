package com.poo.impuestovehicular.logica;

import com.poo.impuestovehicular.datos.Datos;
import com.poo.impuestovehicular.entidades.Marca;

public class LógicaMarca extends Lógica<Marca> {

    public LógicaMarca() {
        super(new Datos<Marca>("marcas.txt") {

            @Override
            public Marca mapear(String dato, boolean lazy) {
                String[] _datos = dato.split(";");

                Marca marca = new Marca();

                marca.setId(_datos[0]);
                marca.setCódigo(_datos[1]);
                marca.setNombre(_datos[2]);

                if (!lazy) {
                    marca.setVehículos(new LógicaVehículo().obtenerTodas(true));
                } else {
                    marca.setVehículos(null);
                }

                return marca;
            }

            @Override
            public Marca obtener(String id, boolean lazy) {
                for (Marca entidad : obtenerTodas(lazy)) {
                    if (entidad.getNombre().equalsIgnoreCase(id)) {
                        return entidad;
                    }
                }
                return null;
            }

        });
    }

}
