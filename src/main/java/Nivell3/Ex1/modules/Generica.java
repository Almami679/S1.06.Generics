package Nivell3.Ex1.modules;

public class Generica {

    /// con extends limitas el tipo
    public static <T extends Telefono> void realizarLlamada(T telefono) {
        telefono.llamar();
    }

    public static <T extends Smartphone> void hacerFoto(T smartphone) {
        smartphone.fotografiar();
    }

}

