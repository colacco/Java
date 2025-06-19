package ex5;

public class Livro extends Produto implements Calculavel{ //livros são isentos de imposto no Brasil.
    private boolean fisico;

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }

    public double calcularPrecoFinal() {
        if(fisico){
            return preco + taxaDeEntrega;
        } else {
            return preco;
        }
    }
}
