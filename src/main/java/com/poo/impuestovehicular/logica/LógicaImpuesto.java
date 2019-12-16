package com.poo.impuestovehicular.logica;

import com.poo.impuestovehicular.datos.Datos;
import com.poo.impuestovehicular.entidades.Impuesto;
import java.time.LocalDate;


public class LógicaImpuesto extends Lógica<Impuesto> {
    
    public LógicaImpuesto() {
        
        super(new Datos<Impuesto>("impuestos.txt") {
            
            @Override
            public Impuesto mapear(String datos, boolean lazy) {
                String[] _datos = datos.split(";");
                Impuesto impuesto = new Impuesto();
                
                impuesto.setId(_datos[0]);
                impuesto.setIdVehículo(_datos[1]);
                impuesto.setTarifa(Double.parseDouble(_datos[2]));
                impuesto.setFechaDeLiquidación(LocalDate.parse(_datos[3]));
                impuesto.setTotal(Double.parseDouble(_datos[4]));
                impuesto.setPagado(_datos[5].equals("true"));
                
                if (!lazy) {
                    impuesto.setVehículo(new LógicaVehículo().obtener(_datos[1], true));
                }
                
                return impuesto;
            }
            
        });
        
    }
    
}
