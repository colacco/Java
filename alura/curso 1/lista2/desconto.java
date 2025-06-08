public class desconto {
    public static void main(String[] args){
        double precoOriginal = 70.47;
        double desconto = 1 - ((double) 10 / 100); 
        // Em 10/100 ele cpnsidera como resultado inteiro, então é preciso ou colocar o número como float ou adicionar o (double) para fazer o casting.
        double percentualDesconto = precoOriginal * desconto;
        
        String fala = String.format("Hoje temos um desconto! O produto de R$%.2f está por R$%.2f", precoOriginal, percentualDesconto);
        System.out.println(fala);
        System.out.println(desconto);
    }    
}
