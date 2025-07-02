/*
    1.
    Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
    "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
*/

package br.com.alura.exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) throws IOException {
        FileWriter escritor = new FileWriter("arquivo.txt");

        escritor.write( "Conteúdo a ser gravado no arquivo.");
        escritor.close();
    }
}
