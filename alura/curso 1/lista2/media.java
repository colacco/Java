public class media{
    public static void main(String[] args){
        double n1 = 8.5;
        double n2 = 5.3;
        double media = (n1 + n2) / 2;

        String notas = String.format("Os resultados da prova 1 e a prova foram %.2f e %.2f, respectivamente.", n1, n2);
        System.out.println(notas);

        System.out.println("A média entre ambas é " + media + ".");
    }
}