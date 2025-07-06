public abstract class NaveEspacial {
    private static int contadorId = 0;
    protected int id;
    protected double velocidadeAtual;
    protected double velocidadeMaxima;

    public NaveEspacial(boolean blindada, boolean tripulada, double velocidadeDesejada) {
        this.id = ++contadorId;
        this.velocidadeAtual = 0;

        // Regras de velocidade
        double velocidadeFinal;

        if (blindada) {
            velocidadeFinal = 14.0; // Blindadas sempre têm 14 Mm/h
        } else {
            // Não blindadas
            if (tripulada) {
                if (velocidadeDesejada < 12.0 || velocidadeDesejada > 20.0) {
                    throw new IllegalArgumentException("Nave tripulada deve ter velocidade entre 12 e 20 Mm/h.");
                }
                velocidadeFinal = velocidadeDesejada;
            } else {
                if (velocidadeDesejada < 10.0 || velocidadeDesejada > 20.0) {
                    throw new IllegalArgumentException("Nave não tripulada deve ter velocidade entre 10 e 20 Mm/h.");
                }
                velocidadeFinal = velocidadeDesejada;
            }
        }

        this.velocidadeMaxima = velocidadeFinal;
    }

    public void decolar() {
        System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): decolando");
    }

    public void acelerar(double incremento) {
        if (velocidadeAtual + incremento <= velocidadeMaxima) {
            velocidadeAtual += incremento;
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): acelerando para " + velocidadeAtual + " Mm/h");
        } else {
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): não pode exceder a velocidade máxima de " + velocidadeMaxima + " Mm/h");
        }
    }

    protected abstract String getNomeClasse();
}

