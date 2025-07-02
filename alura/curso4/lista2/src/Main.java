import br.com.alura.exercicios.Pessoa;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        String json = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

        String json2 = "{\"nome\":\"João Noites\",\"cidade\":\"Campinas\"}";
        Gson gson2 = new Gson();
        Pessoa pessoa2 = gson2.fromJson(json2, Pessoa.class);
        System.out.println(pessoa2);

        String json3 = "{\"nome\":\"Torrencio\",\"idade\":34,\"cidade\":\"Brasília\",\"Sexo\":\"Masculino\"}";
        Gson gson3 = new Gson();
        Pessoa pessoa3 = gson3.fromJson(json3, Pessoa.class);
        System.out.println(pessoa3);

    }
}
