package ifsc.poo;

public class NaveExploradora extends NaveEspacial {
    public NaveExploradora() {
        super(false, true, 18); // velocidade válida entre 12 e 20
    }

    protected String getNomeClasse() {
        return "Nave Exploradora";
    }
}