package Nivell1.Ex1_Ex2.Main;


import Nivell1.Ex1_Ex2.Modules.GenericMethods;
import Nivell1.Ex1_Ex2.Modules.Persona;

public class Main {

    public static void main(String[] args) {

        ////// añadir objeto ex1

        GenericMethods<Object> metodo1 = new GenericMethods<>();


        metodo1.imprimirArgumentos(new Persona("Albert", "Marin", 35)
                                                            ,"@FujitaOficial", true);

    }
}