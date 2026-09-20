package Clas;

import Interf.IVehiculoDeCarga;

public class Camion extends VehiculoBase implements IVehiculoDeCarga {
    private double establecerCarga;

    public Camion(String marca, String modelo, double velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.establecerCarga = capacidadCarga;
    }

    public Camion() {
    }

    @Override
    public double getEstablecerCarga() {
        return 0;
    }

    @Override
    public void setEstablecerCarga(int cantidad) {

    }

    @Override
    public String avanzar() {
        return "Camion avanzando...";
    }

    @Override
    public String detenerse() {
        return "Camion deteniendose...";
    }

    @Override
    public String toString() {
        return super.toString()+ "Capacidad de carga: " + getEstablecerCarga();
    }
}
