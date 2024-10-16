package Nivell2.Ex1_Ex2.Modules;

public class NoGenericMethods {

    String palabra1;
    String palabra2;
    String palabra3;

    public NoGenericMethods(String palabra1, String palabra2, String palabra3) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.palabra3 = palabra3;
    }
    ///SETTERS
    public void setPalabra1(String palabra) {
        this.palabra1 = palabra;
    }
    public void setPalabra2(String palabra) {
        this.palabra2 = palabra;
    }
    public void setPalabra3(String palabra) {
        this.palabra3 = palabra;
    }

    //GETTERS
    public String getPalabra1() {
        return this.palabra1;
    }
    public String getPalabra2() {
        return this.palabra2;
    }
    public String getPalabra3() {
        return this.palabra3;
    }



}
