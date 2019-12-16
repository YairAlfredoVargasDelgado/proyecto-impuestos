package com.poo.impuestovehicular.logica;

import com.poo.impuestovehicular.datos.Datos;
import com.poo.impuestovehicular.entidades.ClaseDeVehículo;
import com.poo.impuestovehicular.entidades.TipoDeVehículo;
import com.poo.impuestovehicular.entidades.Vehículo;
import java.time.LocalDate;

public class LógicaVehículo extends Lógica<Vehículo> {

    public LógicaVehículo() {
        super(new Datos<Vehículo>("vehículos.txt") {

            @Override
            public Vehículo mapear(String datos, boolean lazy) {
                String[] _datos = datos.split(";");

                Vehículo vehículo = new Vehículo();

                vehículo.setId(_datos[0]);
                vehículo.setPlaca(_datos[1]);
                vehículo.setModelo(_datos[2]);
                vehículo.setIdMarca(_datos[3]);
                if (!lazy) {    
                    vehículo.setMarca(new LógicaMarca().obtener(_datos[3], true));
                } else {
                    vehículo.setMarca(null);
                }
                vehículo.setCapacidad(Integer.parseInt(_datos[4]));
                vehículo.setTipo(TipoDeVehículo.valueOf(_datos[5]));
                vehículo.setAvaluo(Double.parseDouble(_datos[6]));
                vehículo.setClase(ClaseDeVehículo.valueOf(_datos[7]));
                vehículo.setFechaDeCompra(LocalDate.parse(_datos[8]));
                vehículo.setBaseGravable(Float.parseFloat(_datos[9]));
                vehículo.setCédulaCliente(_datos[10]);
                if (!lazy) {
                    vehículo.setCliente(new LógicaCliente().obtener(_datos[10], true));
                } else {
                    vehículo.setCliente(null);
                }
                return vehículo;
            }
        });
    }
}
