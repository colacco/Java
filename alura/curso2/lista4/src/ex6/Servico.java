package ex6;

public class Servico extends Item implements Vendavel{
    @Override
    public double precoTotal() {
        if (temDesconto){
            return preco * quantidade * (1 - desconto);
        } else {
            return preco * quantidade;
        }
    }

    @Override
    public void aplicarDescontos(double desconto) {
        this.desconto = desconto / 100;
    }
}
