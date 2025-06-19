import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Pessoa msg = new Pessoa();
        Musica show = new Musica();
        Carro carro1 = new Carro();
        Aluno0 aluno01 = new Aluno0();
        
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();

        Calculadora dobrar = new Calculadora();

        msg.mensagem();
        System.out.println();

        System.out.println(dobrar.dobro(valor));
        System.out.println();

        show.titulo = "Show";
        show.artista = "Ado";
        show.anoLancamento = 2023;
        show.avalia(10);
        show.avalia(9.9);
        show.avalia(9.5);
        System.out.println(show.media());
        show.fichaTecnica();
        System.out.println();
        
        carro1.modelo = "Onix";
        carro1.cor = "grafite";
        carro1.ano = 2021;

        System.out.println(carro1.idade(2025));
        carro1.fichaTecnica();
        System.out.println();

        aluno01.nome = "Ana Camargo";
        aluno01.idade = 24;
        aluno01.informar();

    
    }    

}
