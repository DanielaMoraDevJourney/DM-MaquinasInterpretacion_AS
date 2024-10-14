package Reflection;

public class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.printf("Tipo de vehículo: %s%n", tipo);
    }

    public void arrancar() {
        System.out.printf("El vehículo %s está arrancando.%n", tipo);
    }

    public void detener() {
        System.out.printf("El vehículo %s se ha detenido.%n", tipo);
    }
}
