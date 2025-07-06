package ifsc.poo;

public class App {
    public static void main(String[] args) {
        NaveEspacial mineradora = new NaveMineradora();
        mineradora.decolar();
        mineradora.acelerar(10);
        mineradora.acelerar(5);

        NaveEspacial exploradora = new NaveExploradora();
        exploradora.decolar();
        exploradora.acelerar(9);
        exploradora.frear(9);

        NaveEspacial cargueira = new NaveCargueira();
        cargueira.decolar();
        cargueira.acelerar(24);
        NaveEspacial sentinela = new NaveSentinela();
        sentinela.decolar();
    }
}