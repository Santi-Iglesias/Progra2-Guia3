package Clas;

public class Autobus3 extends VehiculoConPasajeros{

    public Autobus3(String marca, String modelo, double velocidadMaxima, int cantidadDePasajeros) {
        super(marca, modelo, velocidadMaxima, cantidadDePasajeros);
    }

    public Autobus3() {
    }

    @Override
    public String avanzar() {
        return "Autobus: " + super.avanzar();
    }

    @Override
    public String detenerse() {
        return "Autobus " + super.detenerse();
    }

    @Override
    public String toString() {
        return "Autobus: " + super.toString();
    }
}
