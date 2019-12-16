package com.poo.impuestovehicular.logica;

import com.poo.impuestovehicular.datos.Datos;
import com.poo.impuestovehicular.entidades.Cliente;
import com.poo.impuestovehicular.entidades.Vehículo;
import java.util.ArrayList;

public class LógicaCliente extends Lógica<Cliente> {

    public LógicaCliente() {
        super(new Datos<Cliente>("clientes.txt") {

            @Override
            public Cliente mapear(String datos, boolean lazy) {
                String[] _datos = datos.split(";");
                Cliente cliente = new Cliente();

                cliente.setId(_datos[0]);
                cliente.setNombre(_datos[1]);
                cliente.setContraseña(_datos[2]);
                cliente.setIdentificación(_datos[3]);
                cliente.setNombres(_datos[4]);
                cliente.setPrimerApellido(_datos[5]);
                cliente.setSegundoApellido(_datos[6]);
                cliente.setEdad(Integer.parseInt(_datos[7]));

                if (!lazy) {
                    ArrayList<Vehículo> vehículos = new ArrayList<>();

                    for (Vehículo v : new LógicaVehículo().obtenerTodas(true)) {
                        if (v.getCédulaCliente().equals(cliente.getIdentificación())) {
                            vehículos.add(v);
                        }
                    }

                    cliente.setVehículos(vehículos);
                } else {
                    cliente.setVehículos(null);
                }

                return cliente;
            }

        });
    }

}
