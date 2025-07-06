package ifsc.poo;


public class App {
    public static void main(String[] args) {
        NaveEspacial mineradora = new NaveMineradora();
        mineradora.decolar();
        mineradora.acelerar(100);
        mineradora.acelerar(500); // Tenta exceder o limite

        NaveEspacial exploradora = new NaveExploradora();
        exploradora.decolar();
        exploradora.acelerar(900);
    }
}