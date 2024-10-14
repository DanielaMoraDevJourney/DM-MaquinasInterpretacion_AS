package Reflection;

public class Terrestre extends Vehiculo {
    public Terrestre(String tipo) {
        super(tipo);
    }

    public void conducir() {
        System.out.printf("El vehículo terrestre %s está siendo conducido.%n", tipo);
    }
}
