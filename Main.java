public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setMarca("Fiat");
        c.setModelo("Uno");
        c.setAno(2010);
        c.setNumeroDePortas(4);

        Moto m = new Moto();
        m.setMarca("Yamaha");
        m.setModelo("Factor");
        m.setAno(2018);
        m.setTipoDeGuidao("Alto");

        System.out.println("Detalhes do carro:");
        c.exibirDetalhes();

        System.out.println("\nDetalhes da moto:");
        m.exibirDetalhes();
    }
}
