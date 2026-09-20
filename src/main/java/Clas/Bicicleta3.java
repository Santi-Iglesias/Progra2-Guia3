package Clas;

import Interf.IVehiculo;

public class Bicicleta3 extends VehiculoBase implements IVehiculo {
    private int alturaAsiento;

    public Bicicleta3(String marca, String modelo, double velocidadMaxima, int alturaAsiento) {
        super(marca, modelo, velocidadMaxima);
        this.alturaAsiento = alturaAsiento;
    }

    public Bicicleta3() {
    }

    public int getAlturaAsiento() {
        return alturaAsiento;
    }

    public void setAlturaAsiento(int alturaAsiento) {
        this.alturaAsiento = alturaAsiento;
    }

    @Override
    public String avanzar() {
        return "Bicicleta avanzando...";
    }

    @Override
    public String detenerse() {
        return "Bicicleta deteniendose...";
    }

    @Override
    public String toString() {
        return "Bicicleta3{" + super.toString() +
                "alturaAsiento=" + alturaAsiento +
                '}';
    }
}
