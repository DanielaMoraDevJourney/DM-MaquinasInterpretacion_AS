package Reflection;

public class Autobus extends Terrestre {
    public Autobus() {
        super("Autobús");
    }

    @Override
    public void arrancar() {
        System.out.println("El autobús está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El autobús se ha detenido.");
    }
}
