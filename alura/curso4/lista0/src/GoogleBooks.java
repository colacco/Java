import com.sun.net.httpserver.HttpsConfigurator;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static  void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String key = "AIzaSyCXBcmyCCAiB1Lbz8OkTbkquQgnzBctEwQ";

        System.out.println("Insira o título do livro para busca: ");
        var titulo = leitura.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo +"&key=" + key;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
