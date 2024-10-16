package Nivell2.Ex1_Ex2.Main;


import Nivell2.Ex1_Ex2.Modules.GenericMethods;
import Nivell2.Ex1_Ex2.Modules.Persona;

public class Main {

    public static void main(String[] args) {

        GenericMethods<Object> metodo1 = new GenericMethods<>();


        metodo1.imprimirArgumentos(new Persona("Albert", "Marin", 35)
                ,"@FujitaOficial", true);

/////////////////    Ex 2 //////////////////////////////////

        String [] elementos = {"Cobre", "Níquel", "Zinc"};
        Persona [] personas = {new Persona("ALbert", "Marin", 35),
                                new Persona("Irene", "Marin", 32) };

        metodo1.imprimirArgumentosEnLista(elementos);
        metodo1.imprimirArgumentosEnLista(personas);


    }
}