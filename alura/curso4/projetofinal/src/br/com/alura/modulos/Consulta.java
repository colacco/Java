package br.com.alura.modulos;

import br.com.alura.excecoes.BadRequestException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    public static  void consulta(String url){
        try(FileWriter escritor = new FileWriter("CEP.json")){
            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 400){
                throw new BadRequestException("Não foi possível localizar. Verifique se foi digitado de forma correta.");
            }

            escritor.write(response.body());
            System.out.println("Sua consulta foi realizada com sucesso.");
        } catch(IOException | InterruptedException e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } catch(BadRequestException badRequest){
            System.out.println(badRequest.getMessage());
        } catch (Exception e){
            System.out.println("Não foi possível encontrar: " + e.getMessage());
        }
    }
}
