import static java.lang.System.out;

public class UsoDaConta {
    public static void main(String[] args){
        Contas minhConta = new Contas();
        Contas suaConta = new Contas();

        minhConta.setNome("Barry Burd");
        minhConta.setEndereco("Rua Ciberespaço 222");
        minhConta.setSaldo(24.02);

        suaConta.setNome("João Q. Público");
        suaConta.setEndereco("Rua do Consumidor 111");
        suaConta.setSaldo(55.63);

        out.print(minhConta.getNome());
        out.print(" (");
        out.print(minhConta.getEndereco());
        out.print(") tem $");
        out.print(minhConta.getSaldo());
        out.println();

        out.print(suaConta.getNome());
        out.print(" (");
        out.print(suaConta.getEndereco());
        out.print(") tem $");
        out.print(suaConta.getSaldo());
    }
}