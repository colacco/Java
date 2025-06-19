package ex1;

public class Carro {
    String modelo;
    private int precoMedio1;
    private int precoMedio2;
    private int precoMedio3;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPrecomedio(int precoMedio1, int precoMedio2, int precoMedio3){
        this.precoMedio1 = precoMedio1;
        this.precoMedio2 = precoMedio2;
        this.precoMedio3 = precoMedio3;
    }

    public int menorpreco() {
        if (precoMedio1 <= precoMedio2 && precoMedio1 <= precoMedio3) {
            return precoMedio1;
        } else if (precoMedio2 <= precoMedio1 && precoMedio2 <= precoMedio3) {
            return precoMedio2;
        } else {
            return precoMedio3;
        }
    }

    public int maiorpreco() {
        if (precoMedio1 >= precoMedio2 && precoMedio1 >= precoMedio3) {
            return precoMedio1;
        } else if (precoMedio2 >= precoMedio1 && precoMedio2 >= precoMedio3) {
            return precoMedio2;
        } else {
            return precoMedio3;
        }
    }
}

