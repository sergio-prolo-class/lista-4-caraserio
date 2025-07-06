package ifsc.poo;

public class NaveMineradora extends NaveEspacial {
    public NaveMineradora() {
        super(false, false, 15); // velocidade válida entre 10 e 20
    }

    protected String getNomeClasse() {
        return "Nave Mineradora";
    }
}