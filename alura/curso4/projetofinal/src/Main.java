/*
    Requisitos:
    1. Criar uma aplicação para consultar a API ViaCEP.
    2. Menu para o usuário informar o CEP para busca.
    3. Geração de um arquivo .JSON com os dados do endereço.

*/

import br.com.alura.modulos.Consulta;
import br.com.alura.modulos.Display;
import br.com.alura.modulos.Url;

public class Main{
    public static void main(String[] args){
        boolean is_runnig = true;
        System.out.println("Bem vindo ao programa de Busca de endereço!");

        while (is_runnig) {
            switch (Display.opcao()) {
                case 1:
                    Consulta.consulta(Url.cep());
                    break;
                case 2:
                    Consulta.consulta(Url.endereco());
                    break;
                case 3:
                    is_runnig = false;
                    break;
                default:
            }
        }

      System.out.println("Programa finalizado.");
    }
}
