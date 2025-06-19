import exercicios.ex6.InputAllBaseTypes;
import exercicios.ex7.Flower;
import exercicios.ex891011.Numeros;

public class Test {
    public static void main(String args[]){
        InputAllBaseTypes numero = new InputAllBaseTypes();
        Flower flor1 = new Flower("Rosa", 12, 7.50);
        Numeros numeros = new Numeros();

        System.out.println(flor1.getNome());
        System.out.println();
        System.out.println(numeros.isMultiple(14, 7));
        System.out.println(numeros.isOdd(23));
        System.out.println(numeros.somaAnteriores(5));
        System.out.println(numeros.somaAnterioresPares(10));
    }
}
