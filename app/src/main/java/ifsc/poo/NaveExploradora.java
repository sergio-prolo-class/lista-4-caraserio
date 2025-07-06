package ifsc.poo;

public class NaveExploradora extends NaveEspacial {
    public NaveExploradora() {
        super(false, true, 18); 
    }

    protected String getNomeClasse() {
        return "Nave Exploradora";
    }
}