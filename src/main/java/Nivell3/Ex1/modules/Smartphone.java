package Nivell3.Ex1.modules;

public class Smartphone implements Telefono{

    private String modelo;
    private int num;


    public Smartphone(String modelo, int num) {
        this.modelo = modelo;
        this.num = num;
    }

    public String llamar(){
        return "Llamada en curso";
    }

    public String fotografiar() {
        return "'Click' \nFoto guardada en la galeria";
    }



}
