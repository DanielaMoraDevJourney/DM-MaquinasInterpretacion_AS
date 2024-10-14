package Reflection;

import groovy.lang.GroovyClassLoader;
import java.io.File;

public class App {
    public static void main(String[] args) {
        String motoClassPath = "src/main/resources/Moto.groovy";

        GroovyClassLoader shell = new GroovyClassLoader();

        try {
            Class<?> motoClass = shell.parseClass(new File(motoClassPath));

            Object motoInstance = motoClass.getDeclaredConstructor().newInstance();

            System.out.println("Método de la Moto:");
            motoClass.getMethod("arrancar").invoke(motoInstance);
            motoClass.getMethod("detener").invoke(motoInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
