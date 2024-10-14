package Reflection;

public class Lancha extends Maritimo {
    public Lancha() {
        super("Lancha");
    }

    @Override
    public void arrancar() {
        System.out.println("La lancha está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("La lancha se ha detenido.");
    }
}
