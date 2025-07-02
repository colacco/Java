/*
    2.
    Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
    uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
    (por exemplo, ter pelo menos 8 caracteres).
*/

package br.com.alura.ex2;

import java.util.Scanner;

public class CadastrarSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String senha, senha1;

        try {
            System.out.print("Insira uma senha: ");
            senha = scanner.nextLine();
            if(senha.length() < 8){
                throw new SenhaInvalidaException();
            }

            System.out.print("Confirme sua senha: ");
            senha1 = scanner.nextLine();
            if (!senha.equals(senha1)){
                throw new SenhaDivergente();
            }

            System.out.println("Senha definida!");
        } catch (SenhaInvalidaException e){
            System.out.println("Senha inválida.");
        } catch (SenhaDivergente e){
            System.out.println("As senhas não são iguais.");
        }

        System.out.println("Programa Finalizado.");
    }

}
