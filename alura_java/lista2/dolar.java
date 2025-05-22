public class dolar {
    public static void main(String[] args){
        double valorEmDolares = 50.3;
        double valorEmReais = valorEmDolares * 5.65; // 20/05/2025

        String frase = String.format("U$%.2f é equivalente a R$%.2f", valorEmDolares, valorEmReais);
        System.out.println(frase);
    }    
}
