/*
    Crie uma classe Pessoa com atributos como nome, idade, e um metodo toString que represente esses atributos.
    No metodo main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
    Adicione pelo menos três pessoas à lista utilizando o metodo add.
    Imprima o tamanho da lista utilizando o metodo size.
    Imprima a primeira pessoa da lista utilizando o metodo get.
    Imprima a lista completa
*/


import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(21);

        System.out.println(pessoa.toString());

        for (int i = 0; i < 3; i++){
            listaDePessoa.add(new Pessoa());
        }

        System.out.println("Tamanho da lista: " + listaDePessoa.size());
        System.out.println("Primeira pessoa: " + listaDePessoa.getFirst());
        System.out.println(listaDePessoa);
    }
}
