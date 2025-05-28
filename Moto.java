public class Moto extends Veiculo {
    private String tipoDeGuidao;

    public void setTipoDeGuidao(String t) {
        tipoDeGuidao = t;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de guidão: " + tipoDeGuidao);
    }
}
