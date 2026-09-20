package Clas;

import Interf.IVehiculoDePasajeros;

public class Automovil extends VehiculoConPasajeros {

    public Automovil(String marca, String modelo, double velocidadMaxima, int cantidadDePasajeros) {
        super(marca, modelo, velocidadMaxima, cantidadDePasajeros);
    }

    public Automovil() {
    }

    @Override
    public String avanzar() {
        return "Automovil: " + super.avanzar();
    }

    @Override
    public String detenerse() {
        return "Automovil: " + super.detenerse();
    }

    @Override
    public String toString() {
        return "Automovil: " + super.toString();
    }
}
