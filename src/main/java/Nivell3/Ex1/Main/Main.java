package Nivell3.Ex1.Main;


import Nivell3.Ex1.modules.Generica;
import Nivell3.Ex1.modules.Smartphone;;

public class Main {

    public static void main(String[] args) {

        Smartphone telefono1 = new Smartphone("Iphone 15", 670822345);

        Generica.realizarLlamada(telefono1);

        Generica.hacerFoto(telefono1);

    }

    // El mètode limitat per la interfície Telefon, de la classe Generica,
    // pot cridar al mètode ferFotos()?

    //       NO, si estuviera implementado como abstracto sí, pero eso no tendría sentido
    //       ya que no todos los teléfonos tienen la posibilidad de hacer fotos, deberíamos
    //       crear otra clase llamada, por ejemplo, Phone, donde éste solo podria
    //       llamar sin poder hacer fotos.

}
