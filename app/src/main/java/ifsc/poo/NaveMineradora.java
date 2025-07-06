package ifsc.poo;

public class NaveMineradora extends NaveEspacial {
    public NaveMineradora() {
        super(false, false, 15); 
    }

    protected String getNomeClasse() {
        return "Nave Mineradora";
    }
}