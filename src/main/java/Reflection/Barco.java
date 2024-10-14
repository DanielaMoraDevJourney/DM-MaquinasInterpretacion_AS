package Reflection;

public class Barco extends Maritimo {
    public Barco() {
        super("Barco");
    }

    @Override
    public void arrancar() {
        System.out.println("El barco está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El barco se ha detenido.");
    }
}
