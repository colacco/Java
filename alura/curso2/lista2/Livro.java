// Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo exibirDetalhes que imprime o título e o autor do livro.

public class Livro {
    private String autor;
    private String titulo;

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public  String getTitulo(){
        return titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
    }
}
