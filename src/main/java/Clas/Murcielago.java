package Clas;

import Interf.Volador;

public class Murcielago extends Animal implements Volador {

    public Murcielago(String nombre) {
        super(nombre);
    }

    public Murcielago() {
    }

    public void colgarseBocaAbajo() {
        System.out.println(getNombre() + " colgando abajo");
    }

    @Override
    public void comunicarse(String emocion) {
        if (emocion.equalsIgnoreCase("feliz")){
            System.out.println(getNombre() + " aletea suavemente");
        } else if (emocion.equalsIgnoreCase("peligro")) {
            System.out.println(getNombre() + " vuela en distintas direcciones para huir");
        }
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " vuela en la oscuridad...");
    }
}
