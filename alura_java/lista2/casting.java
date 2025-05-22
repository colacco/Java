public class casting {
    public static void main(String[] args){
        double valor = 3.1415;
        int valorInteiro;

        valorInteiro = (int) valor;

        String display = String.format("O valor double é %f, mas ao realizar o cating para int, se torna %d", valor, valorInteiro);
        System.out.println(display);
    }    
}
