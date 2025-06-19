package ex3;

public class TabuadaMultiplicacao implements Tabuada{
    public void mostrarTabuada(double valor){
        for(int i = 0; i <= 10; i++){
            System.out.println( valor + " x " + i + " = " + (valor*i) );
        }
    }
}
