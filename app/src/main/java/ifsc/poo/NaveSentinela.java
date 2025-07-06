package ifsc.poo;

public class NaveSentinela extends NaveEspacial {
    public NaveSentinela() {
        super(true, true, 0);
    } 

    protected String getNomeClasse() {
        return "Nave Sentinela";
    }
}