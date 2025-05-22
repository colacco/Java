import static java.lang.System.out;
import java.util.Scanner;

public class Autenticator2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("bburd")) {
            out.print("Password: ");
            String password = keyboard.next();
            if (password.equals("swordfish")){
                out.println("Você está conectado");
            } else {
                out.println("Senha incorreta");
            }
        } else {
            out.println("Usuário desconhecido");
        }
    }
}
