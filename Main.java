public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setMarca("Chevrolet");
        c.setModelo("S-10");
        c.setAno(2024);
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
