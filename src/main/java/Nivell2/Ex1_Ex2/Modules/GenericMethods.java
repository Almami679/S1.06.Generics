package Nivell2.Ex1_Ex2.Modules;

import java.util.Arrays;

public class GenericMethods <T>{

    public GenericMethods() {}

//////////////      Ex 1     ///////////////////////////////////////
    public void imprimirArgumentos(T uno, String dos, T tres) {
        System.out.println(" - " + uno + "\n - " + dos + "\n - " + tres);
    }


//////////////       Ex 2   /////////////////////////////////////


    public <T> void imprimirArgumentosEnLista(T [] lista) {
        System.out.println("La lista contiene " + lista.length +
                        " elementos de la clase (" + lista.getClass() + ")");
    }

    /// sugerimiento de Raquel
    public static <T> void printLista(T... items) {// genera una lista de cosas random a nombre items
        for(T item : items){
            System.out.println(item);
        }
    }




}
