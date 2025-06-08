import static java.lang.System.out;
import java.util.Scanner;

// Na alura, o Projeto é apenas da linha 25 até o 72.
// Mas como eu queria realizar a implementação de um outro código que fiz, tomei a liberdade de colocar também.

public class ProjetoFinal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int opcao;

        String usuario = "Gabriel";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        double valor;

        out.print("Username: ");
        String username = input.next();

        if (username.equals(usuario)) {
            out.print("Password: ");
            String password = input.next();
            if (password.equals("swordfish")){
                out.println("*******************************");
                out.println("Dados iniciais do cliente:\n");
                out.println("Nome: " + usuario);
                out.println("Tipo de Conta: " + tipoDeConta);
                out.println("Saldo inicial: R$" + saldo);
                out.println("*******************************\n\n");
                
                while(loop){
                    out.println("Operações\n");
                    out.println("1- Consultar saldos");
                    out.println("2- Receber valor");
                    out.println("3- Transferir valor");
                    out.println("4- Sair\n");
                    out.print("Digite a opção desejada: ");
                    opcao = input.nextInt();
                    
                    switch (opcao){
                        case 1:
                            out.println("\nSeu saldo atual é R$" + saldo);
                            break;
                        case 2:
                            out.println("\nInforme o valor a receber:");
                            valor = input.nextDouble();
                        
                            saldo += valor;
                            out.println("Saldo atualizado R$" + saldo + "\n");
                        
                            break;
                        case 3:
                            out.println("\nInforme o valor que deseja transferir:");
                            valor = input.nextDouble();
                        
                            if (valor > saldo){
                                out.println("Não há saldo suficiente para fazer essa transferência.\n");
                                break;
                            } else {
                                saldo -= valor;
                                out.println("Saldo atualizado R$" + saldo + "\n");
                                break;    
                                } 
                        case 4:
                            loop = false;
                            break;
                        default:
                            out.println("\nOpção inválida\n");
                            break;
                        }
                    }
            } else {
                out.println("Senha incorreta");
            }
        } else {
            out.println("Usuário desconhecido");
        }
    }
}
