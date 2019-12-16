package com.poo.impuestovehicular.logica;

import com.poo.impuestovehicular.datos.Datos;
import com.poo.impuestovehicular.entidades.Administrador;

public class LógicaAdministrador extends Lógica<Administrador> {

    public LógicaAdministrador() {
        super(new Datos<Administrador>("administador.txt") {
            
            @Override
            public Administrador mapear(String datos, boolean lazy) {
                Administrador administrador = new Administrador();
                
                String[] _datos = datos.split(";");
                
                administrador.setId(_datos[0]);
                administrador.setNombre(_datos[1]);
                administrador.setContraseña(_datos[2]);
                administrador.setIdentificación(_datos[3]);
                administrador.setNombres(_datos[4]);
                administrador.setPrimerApellido(_datos[5]);
                administrador.setSegundoApellido(_datos[6]);
                administrador.setEdad(Integer.parseInt(_datos[7]));
                
                return administrador;
            }
            
        });
    }

}
