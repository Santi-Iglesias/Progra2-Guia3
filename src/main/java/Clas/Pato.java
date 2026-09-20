package Clas;

import Interf.Caminador;
import Interf.Nadador;
import Interf.Volador;

public class Pato extends Animal implements Caminador, Volador, Nadador {

    public Pato(String nombre) {
        super(nombre);
    }

    public Pato() {
    }

    @Override
    public void comunicarse(String emocion) {
        if (emocion.equalsIgnoreCase("feliz")){
            System.out.println(getNombre() + " hace cuak");
        } else if (emocion.equalsIgnoreCase("peligro")){
            System.out.println(getNombre() + " aletea y hace CUAK fuertemente");
        }
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " caminando...");
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " nadando...");
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " volando...");
    }
}
