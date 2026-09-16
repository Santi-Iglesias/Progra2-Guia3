package Clas;

import Interf.Transporte;
import Enum.TipoTransporte;

public class Tranvia implements Transporte {
    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
    }

    public Tranvia() {
        this.tipo = TipoTransporte.TRANVIA;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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
        System.out.println("Tranvia arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Tranvia deteniendose");
    }

    @Override
    public int obtenerCapacidad() {
        return 0;
    }

    public void cambiarVia(int nuevaVia){
        System.out.println("La nueva via es: " + nuevaVia);
    }

    @Override
    public String toString() {
        return "Tranvia[" + "ruta=" + ruta + ", capacidad=" + capacidad + ", tipo=" + tipo + ']';
    }
}
