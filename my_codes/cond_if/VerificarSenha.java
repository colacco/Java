import static java.lang.System.*;
import java.util.Scanner;

class VerificarSenha {
    public static void main(String[] args){
        out.print("Qual a senha?");

        Scanner keyboard = new Scanner(in);
        String senha = keyboard.next();

        out.println("Você digitou >>" + senha + "<<");
        out.println();

        if(senha.equals("swordfish")) { // Utilizar (==) não é o adequado quando quer comparar duas expressões do tipo String. 
            out.println("A palavra digitada tem");
            out.println("Os mesmos caracteres que a");
            out.println("senha real. Pode usar o");
            out.println("Sistema.");
        } else {
            out.println("A palavra digitada não");
            out.println("tem os mesmos caracteres");
            out.println("que a senha real. Não pode");
            out.println("usar o sistema.");
        }
    }
}
