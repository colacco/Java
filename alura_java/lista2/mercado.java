public class mercado {
    public static void main(String[] args){
        double precoProduto = 3.19;
        int quantidade = 4;
        double total = precoProduto * ( quantidade);

        String mensagem = String.format("O produto de R$%.2f vezes %d é igual a R$%.2f", precoProduto, quantidade, total);
        System.out.println(mensagem);
    }    
}
