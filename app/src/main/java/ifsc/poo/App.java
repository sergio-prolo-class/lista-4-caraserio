package ifsc.poo;

public class App {
    public static void main(String[] args) {
        NaveEspacial mineradora = new NaveMineradora();
        mineradora.decolar();
        mineradora.acelerar(100);
        mineradora.acelerar(500);

        NaveEspacial exploradora = new NaveExploradora();
        exploradora.decolar();
        exploradora.acelerar(900);

        NaveEspacial cargueira = new NaveCargueira();
        cargueira.decolar();

        NaveEspacial sentinela = new NaveSentinela();
        sentinela.decolar();
    }
}