import br.com.alura.exercicios.ex123.Produto;
import br.com.alura.exercicios.ex4.ProdutoPerecivel;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]){
        //ex1 e ex3:
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Monster", 18.00, 56));
        listaProdutos.add(new Produto("Elétron", 0.001, 2000000));
        listaProdutos.add(new Produto("Urânio", 1450.29, 529));

        System.out.println("A lista contém " + listaProdutos.size() + " produtos.");
        System.out.println("Você sabia que a gente vende elétrons? Veja: " + listaProdutos.get(1));
        System.out.println();

        //ex2:
        System.out.println(listaProdutos);
        System.out.println();

        //ex4:
        listaProdutos.add(new ProdutoPerecivel("Bife", 25.55, 4, "2025-09-20"));
        System.out.println(listaProdutos.get(3));
    }
}
