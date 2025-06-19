public class Teste {
    public static void main(String args[]){
        System.out.println("Testando a classe ContaBancaria");
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(10123);
        conta1.setSaldo(70000.00);
        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo na conta: " + conta1.getSaldo());

        System.out.println();
        System.out.println("Testando a classe Idade Pessoa: ");
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Newton");
        pessoa1.setIdade(34);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();

        System.out.println();
        System.out.println("Testando a classe Produto: ");
        Produto produto1 = new Produto("Nitrato de amônio 25kg", 217.9);

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: R$" + produto1.getPreco());
        System.out.println("O desconto de 25% é: " + produto1.aplicarDesconto(0.25));

        System.out.println();
        System.out.println("Testando a classe Aluno: ");
        Aluno aluno01 = new Aluno();

        aluno01.setNome("Osvaldo");
        System.out.println("Nome do cidadão: " + aluno01.getNome());
        aluno01.setNotas(18);
        System.out.println("Notas no total: " + aluno01.getNotas());
        System.out.println("Média do aluno: " + aluno01.calcularMedia(2));

        System.out.println();
        System.out.println("Testando a classe Livro");
        Livro livro1 = new Livro();

        livro1.setAutor("Platão");
        livro1.setTitulo("O Banquete");
        livro1.exibirDetalhes();
    }
}
