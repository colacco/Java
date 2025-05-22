public class celsius {
    public static void main(String[] args){
        double fahrenheit;
        double celsius = 27;
        fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("Valor em celsius: %.2f", celsius);
        System.out.println(mensagem);

        System.out.println("Valor inteiro em Fahrenheit: " + fahrenheit);
        fahrenheit = (int) (celsius * 1.8) + 32;
        System.out.println("Valor inteiro em Fahrenheit: " + fahrenheit);
    }    
}
