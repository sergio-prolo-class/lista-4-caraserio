public abstract class NaveEspacial {
    private static int contadorId = 0;
    protected int id;
    protected double velocidadeA;
    protected double velocidadeMax;

    public NaveEspacial(double velocidadeMaximaPermitida) {
        this.id = ++contadorId;

        // Define a velocidade 
        if (velocidadeMaximaPermitida < 0) {
            throw new IllegalArgumentException("Velocidade não pode ser negativa.");
        }

        this.velocidadeMax = velocidadeMaximaPermitida;
        this.velocidadeA = 0;
    }

    public void decolar() {
        System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): decolando");
    }

    public void acelerar(double incremento) {
        if (velocidadeA + incremento <= velocidadeMax) {
            velocidadeA += incremento;
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): acelerando para " + velocidadeA + " km/h"); //zero a esqueda , 4 digitos , decimal
        } else {
            System.out.println(getNomeClasse() + "(ID#" + String.format("%04d", id) + "): não pode exceder a velocidade máxima de " + velocidadeMax + " km/h");
        }
    }

    protected abstract String getNomeClasse(); // Fornece o nome da classe para as mensagens
}
