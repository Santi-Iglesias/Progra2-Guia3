package Clas;

import Interf.Transporte;
import Enum.TipoTransporte;

public class Autobus implements Transporte {
    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.AUTOBUS;
    }

    public Autobus() {
        this.tipo = TipoTransporte.AUTOBUS;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("Autobus arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Autobus deteniendose");
    }

    @Override
    public int obtenerCapacidad() {
        return 0;
    }

    public void anunciarParada(String parada){
        System.out.println("La siguente parada es: " + parada);
    }

    @Override
    public String toString() {
        return "Autobus[" + "numeroLinea=" + numeroLinea + ", capacidad=" + capacidad + ", tipo=" + tipo + ']';
    }
}
