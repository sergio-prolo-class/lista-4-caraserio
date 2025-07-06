package ifsc.poo;

public class NaveCargueira extends NaveEspacial {
    public NaveCargueira() {
        super(true, false, 0); // blindada => velocidade ignorada
    }

    protected String getNomeClasse() {
        return "Nave Cargueira";
    }
}