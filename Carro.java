public class Carro extends Veiculo {
    private int numeroDePortas;

    public void setNumeroDePortas(int n) {
        numeroDePortas = n;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
