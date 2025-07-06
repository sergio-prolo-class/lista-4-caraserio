package ifsc.poo;

public abstract class NaveEspacial {
    private static int contadorId = 0;
    protected int id;
    protected double velocidadeA;
    protected double velocidadeMax;

    public NaveEspacial(boolean blindada, boolean tripulada, double velocidadeDesejada) {
        this.id = ++contadorId;
        this.velocidadeA = 0;

        // Regras de velocidade
        double velocidadeFinal;

        if (blindada) {
            velocidadeFinal = 14.0; // Blindadas sempre têm 14 Mm/h
        } else {
            // Não blindadas
            if (tripulada) {
                if (velocidadeDesejada < 12.0 || velocidadeDesejada > 20.0) {
                    throw new IllegalArgumentException("Nave tripulada preciasa ter velocidade entre 12 e 20 Mm/h. ");
                }
                velocidadeFinal = velocidadeDesejada;
            } else {
                if (velocidadeDesejada < 10.0 || velocidadeDesejada > 20.0) {
                    throw new IllegalArgumentException("Nave não tripulada preciasa ter velocidade entre 10 e 20 Mm/h.");
                }
                velocidadeFinal = velocidadeDesejada;
            }
        }

        this.velocidadeMax = velocidadeFinal;
    }

    public void decolar() {
        System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): decolando");
    }

    public void acelerar(double aumento) {
        if (velocidadeA + aumento <= velocidadeMax) {
            velocidadeA += aumento;
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): acelerando para " + velocidadeA + " Mm/h");
        } else {
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): não pode exceder a velocidade máxima de " + velocidadeA + " Mm/h");
        }
    }

    protected abstract String getNomeClasse();

    public void frear(double freio) {
    if (freio <= 0) {
        System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): valor de frenagem inválido.");
        return;
    }

    if (velocidadeA > 0) {
        velocidadeA -= freio;
        if (velocidadeA <= 0) {
            velocidadeA = 0;
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): velocidade = 0 Mm/h");
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): pousou");
        } else {
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): freando para " + velocidadeA + " Mm/h");
        }
    } else {
        System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): já está parada");
    }
}
}

