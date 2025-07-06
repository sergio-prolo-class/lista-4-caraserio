package ifsc.poo;

public class NaveSentinela extends NaveEspacial {
    public NaveSentinela() {
        super(true, true, 0); // blindada => velocidade fixa
    }

    protected String getNomeClasse() {
        return "Nave Sentinela";
    }
}