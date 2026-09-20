package Clas;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }
    public void dormir(){
        System.out.println(nombre + " esta durmiendo");
    }

    public abstract void comunicarse(String emocion);
}
