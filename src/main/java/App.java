import Clas.Autobus;
import Clas.Bicicleta;
import Clas.Tranvia;

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
                    break;
                case 3:
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
