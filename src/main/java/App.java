import Clas.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int num;

        do {

            System.out.println("Guia 3");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ingrese 0 si desea salir.");
            System.out.println("Introduzca el ejercicio a realizar: ");

            num = escaner.nextInt();
            escaner.nextLine();

            switch (num) {
                case 1:
                    //1
                    Autobus autobus1 = new Autobus(555,35);
                    Tranvia tranvia1 = new Tranvia("Puerto",60);
                    Bicicleta bicicleta1 = new Bicicleta("SCH1256");
                    //2
                    autobus1.arrancar();
                    tranvia1.arrancar();
                    tranvia1.cambiarVia(562);
                    bicicleta1.arrancar();
                    bicicleta1.ajustarAsiento(15);
                    autobus1.anunciarParada("Colon y Lamadrid");
                    autobus1.detener();
                    tranvia1.detener();
                    bicicleta1.detener();
                    autobus1.getCapacidad();
                    tranvia1.getCapacidad();
                    bicicleta1.obtenerCapacidad();
                    //3
                    System.out.println("Tipo: " + autobus1.getTipo());
                    System.out.println("Estado: " + autobus1);
                    System.out.println("Tipo: " + tranvia1.getTipo());
                    System.out.println("Estado " + tranvia1);
                    System.out.println("Tipo: " + bicicleta1.getTipo());
                    System.out.println("Estado: " + bicicleta1);
                    break;
                case 2:
                    Pato pato1 = new Pato("Patito");
                    Murcielago murcielago1 = new Murcielago("Dracu");
                    Pez pez1 = new Pez("Nemo");

                    System.out.println("Acciones del pato");
                    pato1.caminar();
                    pato1.nadar();
                    pato1.volar();
                    pato1.comer();
                    pato1.comunicarse("feliz");
                    pato1.dormir();

                    System.out.println("Acciones del murcielago");
                    murcielago1.volar();
                    murcielago1.comer();
                    murcielago1.comunicarse("feliz");
                    murcielago1.colgarseBocaAbajo();
                    murcielago1.dormir();

                    System.out.println("Acciones del pez");
                    pez1.nadar();
                    pez1.comer();
                    pez1.comunicarse("peligro");
                    pez1.dormir();
                    break;
                case 3:
                    Automovil auto1 = new Automovil("Ford","Focus", 150, 4);
                    Autobus3 bus1 = new Autobus3("Mercedes", "1114", 80, 25);
                    Bicicleta3 bici1 = new Bicicleta3("Vairo", "X35", 26, 10);
                    Camion camion1 = new Camion("Volvo", "P40", 90, 32);

                    auto1.setCantidadDePasajeros(3);
                    bus1.setCantidadDePasajeros(20);
                    camion1.setEstablecerCarga(30);
                    System.out.println(auto1.avanzar());
                    System.out.println(bus1.avanzar());
                    System.out.println(camion1.avanzar());
                    System.out.println(bici1.avanzar());
                    System.out.println(auto1.detenerse());
                    System.out.println(bus1.detenerse());
                    System.out.println(camion1.detenerse());
                    System.out.println(bici1.detenerse());

                    System.out.println(auto1);
                    System.out.println(bus1);
                    System.out.println(camion1);
                    System.out.println(bici1);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (num != 0);
        escaner.close();
    }
}
