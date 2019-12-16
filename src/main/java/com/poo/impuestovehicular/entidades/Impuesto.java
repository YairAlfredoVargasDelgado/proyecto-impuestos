package com.poo.impuestovehicular.entidades;

import java.time.LocalDate;

public class Impuesto extends EntidadBase {

    private String idVehículo;
    
    private Vehículo vehículo;

    private Double tarifa;

    private LocalDate fechaDeLiquidación;

    private Double total;

    private Boolean pagado;

    public Impuesto() { }
    
    @Override
    public String toString() {
        return super.toString() + ";" + getIdVehículo() + ";" + getTarifa() + ";" + getFechaDeLiquidación() + ";" + getTotal() + ";" + getPagado();
    }

    public void liquidar() {
        setTotal(getVehículo().getBaseGravable() * getTarifa() + 55000);

        if (getFechaDeLiquidación().isBefore(LocalDate.of(LocalDate.now().getYear(), 3, 3))) {
            setTotal(getTotal() - (getTotal() * .05));
        } else {
            setTotal(getTotal() + (getTotal() * .05));
        }
    }

    public Vehículo getVehículo() {
        return vehículo;
    }

    public void setVehículo(Vehículo vehículo) {
        this.vehículo = vehículo;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa() {

        if (getVehículo() instanceof Motocicleta) {
            if (((Motocicleta) getVehículo()).getCilindraje() >= 125) {
                setTarifa((Double) 1.5);
                return;
            }
        }

        switch (getVehículo().getTipo()) {
            case PÚBLICO:
                setTarifa((Double) 0.5);
            case PARTICULAR: {
                if (getVehículo().getAvaluo() < 46630000) {
                    setTarifa((Double) 1.5);
                    return;
                }

                if (getVehículo().getAvaluo() < 104916000 && getVehículo().getAvaluo() >= 46630000) {
                    setTarifa((Double) 2.5);
                    return;
                }

                if (getVehículo().getAvaluo() >= 104916000) {
                    setTarifa((Double) 3.5);
                    return;
                }
            }
        }
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean isPagado() {
        return getPagado();
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public String getIdVehículo() {
        return idVehículo;
    }

    public void setIdVehículo(String idVehículo) {
        this.idVehículo = idVehículo;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
    
    public LocalDate getFechaDeLiquidación() {
        return fechaDeLiquidación;
    }

    public void setFechaDeLiquidación(LocalDate fechaDeLiquidación) {
        this.fechaDeLiquidación = fechaDeLiquidación;
    }
    
    public Boolean getPagado() {
        return pagado;
    }

}
