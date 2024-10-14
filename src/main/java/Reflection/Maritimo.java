package Reflection;

public class Maritimo extends Vehiculo {
    public Maritimo(String tipo) {
        super(tipo);
    }

    public void navegar() {
        System.out.printf("El vehículo marítimo %s está navegando.%n", tipo);
    }
}
