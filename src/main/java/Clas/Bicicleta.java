package Clas;

import Interf.Transporte;
import Enum.TipoTransporte;

public class Bicicleta implements Transporte {
    private String numeroSerie;
    private TipoTransporte tipo;

    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;
    }

    public Bicicleta() {
        this.tipo = TipoTransporte.BICICLETA;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("Bicicleta arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Bicicleta deteniendose");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public void ajustarAsiento(int altura){
        System.out.println("La nueva altura es: " + altura + "cm");
    }

    @Override
    public String toString() {
        return "Bicicleta[" + "numeroSerie=" + numeroSerie + ", tipo=" + tipo + ']';
    }
}
