package org.example;
import java.util.Scanner;

import groovy.lang.GroovyShell;

public class Main {
    private static GroovyShell shell = new GroovyShell();
    private static String operation =  "def operacion(a, b) { return a + b }";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Presiona 'Enter' para ejecutar la operación actual.");
            scanner.nextLine();

            String script = operation + "; operacion(10, 5)";
            Object result = shell.evaluate(script);
            System.out.println("Resultado: " + result);

            System.out.println("¿Deseas cambiar la operación actual? (s/n)");
            String cambiar = scanner.nextLine();

            if ("s".equalsIgnoreCase(cambiar)) {
                System.out.println("Introduce el nuevo código de operación. Ejemplo: 'return a - b' para resta.");
                String nuevaOperacion = scanner.nextLine();
                operation = "def operacion(a, b) { " + nuevaOperacion + " }";
            }
        }
    }
}