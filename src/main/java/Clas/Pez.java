package Clas;

import Interf.Nadador;

public class Pez extends Animal implements Nadador {

    public Pez(String nombre) {
        super(nombre);
    }

    public Pez() {
    }

    @Override
    public void comunicarse(String emocion) {
        if (emocion.equalsIgnoreCase("feliz")){
            System.out.println(getNombre() + " nada en circulos");
        } else if (emocion.equalsIgnoreCase("peligro")){
            System.out.println(getNombre() + " nada rapidamente en direccion contraria");
        }
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " nadando con agilidad...");
    }
}
