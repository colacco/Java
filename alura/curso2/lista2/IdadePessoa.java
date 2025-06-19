// Crie uma classe IdadePessoa com os atributos privados nome e idade. 
// Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
