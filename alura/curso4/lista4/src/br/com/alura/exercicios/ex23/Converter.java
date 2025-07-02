/*
    2. Defina uma classe chamada Titulo com os atributos necessários.
    Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto
    para JSON usando a biblioteca Gson e imprime o resultado.

    3. Modifique o programa anterior para que o JSON gerado seja formatado
    de maneira mais elegante. Utilize o metodo setPrettyPrinting para alcançar esse resultado.
*/

package br.com.alura.exercicios.ex23;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Converter {
    public static void main(String[] args){
        Titulo titulo = new Titulo("F1", 2025, 156, true);
        Gson conversor = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter arquivoJson = new FileWriter("arquivo.json")){
            arquivoJson.write(conversor.toJson(titulo));
        } catch (IOException e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
