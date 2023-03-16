public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getNumero());

        Cliente mateus = new Cliente();
        mateus.setNome("Mateus Lemos Sá de Meneses");
        conta.setTitular(mateus);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Estudante de Programação");

    }
}
