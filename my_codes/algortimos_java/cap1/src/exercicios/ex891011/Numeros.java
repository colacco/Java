/*
    8. Escreva o metodo isMultiple, que recebe dois valores long (n e m) e retorna true se n é multiplo de m
    9. EScreva o metodo isOdd, que recebe um int (i) e retorna true se for ímpar. O metodo não pode usar multiplicacao, divisão ou módulo.
    10. Escreva um metodo que receba um inteiro n e retorne a soma de todos os inteiros menores que n.
    11. Escreva um metodo que receba um inteiro n e retorne a somos de todos os inteiros pares menores que n.
 */

package exercicios.ex891011;

public class Numeros {
    public boolean isMultiple(long n, long m){
        return n % m == 0;
    }

    /* Operador bitwise (Resolução ChatGPT)
        public boolean isOdd(int i){
            return(i & 1) !=0; // Entre parênteses verifica se há  o dígito 1 no final, se sim volta 1, se não, 0. Depois compara se o resultado é diferente de 0.
        }
     */

    public boolean isOdd(int i){
        boolean isodd = false;

        for(int j = 0; j <= i; j++){
            if(isodd){
                isodd = false;
            } else {
                isodd = true;
            }
        }
        return isodd;
    }

    public int somaAnteriores(int n){
        if (n == 0){
            return 0;
        }
        return (n-1) + somaAnteriores(n-1);
    }

    public  int somaAnterioresPares(int n) {
        int soma = 0;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
