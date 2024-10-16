package Nivell3.Ex1.modules;

public class Generica <T> {

    public static void realizarLlamada(Telefono telefono) {
        telefono.llamar();
    }

    public static void hacerFoto(Smartphone smartphone) {
        smartphone.fotografiar();
    }

}

