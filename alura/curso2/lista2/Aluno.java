// Desenvolva uma classe Aluno com os atributos privados nome e notas.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo calcularMedia que retorna a média das notas do aluno.

public class Aluno {
    private String nome;
    private double notas;

    private int quantidade = 0;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNotas(double notas){
        this.notas = notas;
        this.quantidade++;
    }

    public double getNotas(){
        return notas;
    }

    public double calcularMedia(int quantidade){
        return notas / quantidade;
    }
}
