package ex6;

public class Produto extends Item implements Vendavel{
    private double imposto;
    private boolean entrega;
    private double taxaDeEntrega;

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setTaxaDeEntrega(double taxaDeEntrega) {
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    @Override
    public double precoTotal() {
        if(temDesconto){
            if(entrega){
                return preco * (1 + imposto) * (1 - desconto)  * quantidade + taxaDeEntrega;
            } else {
                return preco * (1 + imposto) * (1 - desconto) * quantidade;
            }
        } else {
            if (entrega){
                return preco * (1 + imposto) * quantidade + taxaDeEntrega;
            } else {
                return preco * (1 + imposto) * quantidade;
            }
        }
    }

    @Override
    public void aplicarDescontos(double desconto) {
        this.desconto = desconto / 100;
    }
}
