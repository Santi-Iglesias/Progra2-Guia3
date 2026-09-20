package Clas;

import Interf.IVehiculoDePasajeros;

public abstract class VehiculoConPasajeros extends VehiculoBase implements IVehiculoDePasajeros {
    protected int cantidadDePasajeros;

    public VehiculoConPasajeros(String marca, String modelo, double velocidadMaxima, int cantidadDePasajeros) {
        super(marca, modelo, velocidadMaxima);
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    public VehiculoConPasajeros() {
    }

    @Override
    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    @Override
    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    @Override
    public String avanzar() {
        return "avanzando...";
    }

    @Override
    public String detenerse() {
        return "deteniendose...";
    }

    @Override
    public String toString() {
        return "VehiculoConPasajeros{" +
                "cantidadDePasajeros=" + cantidadDePasajeros +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
