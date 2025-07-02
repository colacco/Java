package br.com.alura.modulos;

import java.util.Scanner;

public class Url {
    private static final Scanner scanner = new Scanner(System.in);

    public static String cep() {
        System.out.println("Buca por CEP");
        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        return "https://viacep.com.br/ws/" + cep + "/json/";
    }

    public static String endereco() {
        System.out.println("Buca por endereço");

        System.out.print("UF: ");
        String uf = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        cidade = cidade.replace(" ", "+");

        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        rua = rua.replace(" ", "+");

        return "https://viacep.com.br/ws/" + uf + "/" + cidade + "/" + rua + "/json/";
    }
}
