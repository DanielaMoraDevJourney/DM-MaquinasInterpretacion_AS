import Reflection.Terrestre

class Moto extends Terrestre{
    Moto() {
        super("Moto")
    }
    @Override
    void arrancar() {
        println "La moto está arrancando."
    }

    @Override
    void detener() {
        println "La moto se ha detenido."
    }
}


