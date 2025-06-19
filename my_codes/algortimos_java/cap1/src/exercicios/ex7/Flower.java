// 7. Crie uma classe Flower com atributos nome(String), pétalas(int) e preço(float). Adicione um construtor, getters e setters.
package exercicios.ex7;

public class Flower {
    private String nome;
    private int numPetalas;
    private double preco;

    public Flower(String nome, int numPetalas, double preco){
        this.nome = nome;
        this.numPetalas = numPetalas;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getNumPetalas(){
        return numPetalas;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumPetalas(int numPetalas){
        this.numPetalas = numPetalas;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
}
