/*
    Defina uma classe chamada Veiculo com os atributos necessários.
    Em seguida, crie um programa que instancia um objeto Veiculo,
    serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
*/


package br.com.alura.exercicios.ex4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Converter {
    public static void main(String[] args){
        Veiculo veiculo = new Veiculo("Onix LTZ", 2025, 103471.00);
        Gson conversor = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter escritor = new FileWriter("arquivo1.json")){
            escritor.write(conversor.toJson(veiculo));
        } catch (IOException e){
            System.out.println("Erro na gravação do arquivo: " + e.getMessage());
        }
    }
}
