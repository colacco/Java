package com.example.spring_sem_web;

import com.example.spring_sem_web.Models.*;
import com.example.spring_sem_web.Repositories.*;

import java.time.LocalDate;
import java.util.*;

public class Principal {
    private final Scanner leitor = new Scanner(System.in);

    private final CategoriaRepository categoriaRepository;
    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;
    private final ClienteRepository  clienteRepository;
    private final FuncionarioRepository funcionarioRepository;
    private final FornecedorRepository fornecedorRepository;


    public Principal(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository, FuncionarioRepository funcionarioRepository, ClienteRepository clienteRepository, FornecedorRepository fornecedorRepository){
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.funcionarioRepository = funcionarioRepository;
        this.fornecedorRepository = fornecedorRepository;
    }

    public void exibeMenu(){
        System.out.print("""
                01 - Buscar nome exato do produto
                02 - Buscar categoria do produto
                03 - Listar produtos acima de determinado valor
                04 - Listar produtos abaixo de determinado valor
                05 - Buscar nome do produto
                06 - Pedidos sem data de entrega
                07 - Pedidos com data de entrega
                08 - Produtos filtrados por categoria ordenados pelo preço de forma crescente
                09 - Produtos filtrados por categoria ordenados pelo preço de forma decrescente
                10 - Contagem de produtos em uma categoria específica
                11 - Contagem de produtos acima de determinado valor
                12 - Contagem de produtos menor de determinado valor ou cujo nome contenha o termo especificado
                13 - Pedidos após uma data específica
                14 - Pedidos antes da data espscífica
                15 - Pedidos em um intervalo de tempo
                16 - Top 3 produtos mais caros
                17 - Cinco produtos mais  baratos de cada categoria
               \s
                Desafios JPQL:
                18 - Produtos acima de determinado valor
                19 - Listar produtos crescente
                20 - Listar produtos decrescente
                21 - Pesquisar produto pela primeira letra
                22 - Pedidos em um intervalo de tempo
                23 - Média de produtos
                24 - Preço máximo de uma categoria
                25 - Quantidade de produtos por categoria
                26 - Categorias com mais de 10 produtos.
                27 - Produto por nome ou categoria.
                \s
                Desafio Nativo:
                28 - Top 5 mais caros
               \s
                Escolha uma opção:\s""");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
                pesquisarNomeExatoDoProduto();
                break;
            case 2:
                pesquisarCategoriaDoProduto();
                break;
            case 3:
                pesquisarProdutoCaro();
                break;
            case 4:
                pesquisarProdutoBarato();
                break;
            case 5:
                pesquisarNomedoProduto();
                break;
            case 6:
                pedidosSemEntrega();
                break;
            case 7:
                pedidosComEntrega();
                break;
            case 8:
                pesquisarCategoriaDoProdutocomPrecoCrescente();
                break;
            case 9:
                pesquisarCategoriaDoProdutocomPrecoDecrescente();
                break;
            case 10:
                contaProdutoPorCategoria();
                break;
            case 11:
                contaProdutoCaro();
                break;
            case 12:
                produtosBaratoOuDeTermoEspecificado();
                break;
            case 13:
                pedidosDepoisDe();
                break;
            case 14:
                pedidosAntesDe();
                break;
            case 15:
                pedidosEntre();
                break;
            case 16:
                top3ProdutosCaros();
            case 17:
                top5ProdutosbaratosTodasCategorias();
            case 18:
                produtoCaro();
                break;
            case 19:
                produtoCrescente();
                break;
            case 20:
                produtoDecrescente();
                break;
            case 21:
                buscaPrimeiraLetra();
                break;
            case 22:
                pedidosEntreJPQL();
                break;
            case 23:
                mediaProdutos();
                break;
            case 24:
                precoMaximoDeCategoria();
                break;
            case 25:
                quantidadePorCategoria();
                break;
            case 26:
                categoriaComMaisDe10Produtos();
                break;
            case 27:
                produtoPorNomeOuCategoria();
                break;
            case 28:
                top5ProdutosCaros();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void pesquisarNomeExatoDoProduto(){
        System.out.print("Insira o nome do produto: ");
        String nomeProduto = leitor.next();

        List<Produto> resultado = produtoRepository.findByNome(nomeProduto);
        resultado.forEach(System.out::println);
    }

    private void pesquisarCategoriaDoProduto(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        List<Produto> resultado = produtoRepository.findByCategoria(categoria);

        resultado.forEach(System.out::println);
    }

    private void pesquisarProdutoCaro(){
        System.out.print("Informe o valor mínimo: ");
        double minimo = leitor.nextDouble();

        List<Produto> resultado = produtoRepository.findByPrecoGreaterThan(minimo);
        System.out.println("Os produtos acimaa de R$" + minimo + ":");

        resultado.forEach(System.out::println);

    }

    private void pesquisarProdutoBarato(){
        System.out.print("Informe o valor limite: ");
        double limite = leitor.nextDouble();

        List<Produto> resultado = produtoRepository.findByPrecoLessThan(limite);
        System.out.println("Os produtos de valor abaixo de R$" + limite + ":");

        resultado.forEach(System.out::println);
    }

    private void pesquisarNomedoProduto(){
        System.out.print("Insira o nome do produto: ");
        String nomeProduto = leitor.next();

        List<Produto> resultado = produtoRepository.findByNomeContainingIgnoreCase(nomeProduto);
        resultado.forEach(System.out::println);
    }

    private void pedidosSemEntrega(){
        List<Pedido> resultado = pedidoRepository.findByDateIsNull();
        System.out.println("Pedidos sem data:");
        resultado.forEach(System.out::println);
    }

    private void pedidosComEntrega(){
        List<Pedido> resultado = pedidoRepository.findByDateIsNotNull();
        System.out.println("Pedidos com data:");
        resultado.forEach(System.out::println);
    }

    private void pesquisarCategoriaDoProdutocomPrecoCrescente(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        List<Produto> resultado = produtoRepository.findByCategoriaOrderByPreco(categoria);

        resultado.forEach(System.out::println);
    }

    private void pesquisarCategoriaDoProdutocomPrecoDecrescente(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        List<Produto> resultado = produtoRepository.findByCategoriaOrderByPrecoDesc(categoria);

        resultado.forEach(System.out::println);
    }

    private void contaProdutoPorCategoria(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        Long resultado = produtoRepository.countByCategoria(categoria);
        System.out.println("A quantidade de produtos em " + categoria + " é " + resultado);
    }

    private void contaProdutoCaro(){
        System.out.print("Insira o valor mínimo: ");
        double minimo = leitor.nextDouble();

        Long resultado = produtoRepository.countByPrecoGreaterThan(minimo);
        System.out.println("A quantidade de produtos acima de R$" + minimo + " é " + resultado);
    }

    private void produtosBaratoOuDeTermoEspecificado(){
        System.out.print("Insira um valor: ");
        double limite = leitor.nextDouble();
        System.out.print("Digite o nome do produto: ");
        String termo = leitor.next();

        List<Produto> resultado = produtoRepository.findByNomeContainingIgnoreCaseOrPrecoLessThan(termo, limite);
        resultado.forEach(System.out::println);
    }

    private void pedidosDepoisDe(){
        System.out.print("Defina a data(Formato: yyyy-mm-dd ): ");
        String termo = leitor.next();
        LocalDate data = LocalDate.parse(termo);

        List<Pedido> resultado = pedidoRepository.findByDateGreaterThan(data);
        System.out.println("Filtrado pedidos realizados após: " + data);
        resultado.forEach(System.out::println);
    }

    private void pedidosAntesDe(){
        System.out.print("Defina a data(Formato: yyyy-mm-dd ): ");
        String termo = leitor.next();
        LocalDate data = LocalDate.parse(termo);

        List<Pedido> resultado = pedidoRepository.findByDateLessThan(data);
        System.out.println("Filtrado pedidos realizados após: " + data);
        resultado.forEach(System.out::println);
    }

    private void pedidosEntre(){
        System.out.print("Defina a data de início(Formato: yyyy-mm-dd ): ");
        LocalDate dataInicio = LocalDate.parse(leitor.next());

        System.out.print("Defina a data de termino(Formato: yyyy-mm-dd ): ");
        LocalDate dataFinal = LocalDate.parse(leitor.next());

        List<Pedido> resultado = pedidoRepository.findByDateGreaterThanAndDateLessThan(dataInicio, dataFinal);
        resultado.forEach(System.out::println);
    }

    private void top3ProdutosCaros(){
        List<Produto> resultado = produtoRepository.findTop3ByOrderByPrecoDesc();
        resultado.forEach(System.out::println);
    }

    private void top5ProdutosbaratosTodasCategorias(){
        List<Categoria> categorias =categoriaRepository.findAll();

        System.out.println("Top 5 produtos de cada categoria:");
        for (Categoria categoria : categorias) {
            System.out.println("Top 5 produtos da categoria " + categoria.getNome());
            List<Produto> resultados = produtoRepository.findTop5ByCategoriaOrderByPreco(categoria);
            resultados.forEach(System.out::println);
        }
    }

    // DEASFIO JPQL

    private void  produtoCaro(){
        System.out.print("Acima de qual valor?: ");
        double valor = leitor.nextDouble();

        List<Produto> resultado = produtoRepository.produtosAcimaDe(valor);
        resultado.forEach(System.out::println);
    }

    private void produtoCrescente(){
        List<Produto> resultado = produtoRepository.produtosOrdenadoPreco();
        resultado.forEach(System.out::println);
    }

    private void produtoDecrescente(){
        List<Produto> resultado = produtoRepository.produtosOrdenadoPrecoDesc();
        resultado.forEach(System.out::println);
    }

    private void buscaPrimeiraLetra(){
        System.out.println("Digite a letra: ");
        String letra = leitor.next();
        List<Produto> resultado = produtoRepository.buscaPrimeiraLetra(letra);
        resultado.forEach(System.out::println);
    }

    private void pedidosEntreJPQL(){
        System.out.print("Defina a data de início(Formato: yyyy-mm-dd ): ");
        LocalDate dataInicio = LocalDate.parse(leitor.next());

        System.out.print("Defina a data de termino(Formato: yyyy-mm-dd ): ");
        LocalDate dataFinal = LocalDate.parse(leitor.next());

        List<Pedido> resultado = pedidoRepository.consultaEntre(dataInicio, dataFinal);
        resultado.forEach(System.out::println);
    }

    private void mediaProdutos(){
        System.out.printf("A média entre os valores dos produtos no banco de dados é: %.2f", produtoRepository.mediaProduto());
        System.out.println();
    }

    private void precoMaximoDeCategoria(){
        System.out.println("Insira a categoria desejada: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        System.out.printf("O valor máximo da categoria %s é R$%.2f", categoria.getNome(), produtoRepository.maximoPorCategoria(categoria));
        System.out.println();

    }

    private void quantidadePorCategoria(){
        List<Categoria> categorias = categoriaRepository.findAll();

        for (Categoria categoria : categorias) {
            Integer quantidadeProdutos = produtoRepository.quantidadePorCategoria(categoria);
            System.out.printf("Categoria %s: possui %d produtos.%n", categoria.getNome(), quantidadeProdutos);
        }
    }

    private void categoriaComMaisDe10Produtos(){
        List<Categoria> categorias = categoriaRepository.findAll();

        for (Categoria categoria : categorias) {
            Integer quantidadeProdutos = produtoRepository.quantidadePorCategoria(categoria);
            if(quantidadeProdutos > 10){
                System.out.printf("Categoria %s: possui %d produtos.%n", categoria.getNome(), quantidadeProdutos);
            }
        }
    }

    private void produtoPorNomeOuCategoria(){
        System.out.print("Insira o nome do produto: ");
        String nome = leitor.next();
        System.out.print("Insira a categoria desejada: ");
        String nomeCategoria = leitor.next();
        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);

        List<Produto> resultado = produtoRepository.produtoPorNomeOuCategoria(nome, categoria);
        resultado.forEach(System.out::println);
    }

    private void top5ProdutosCaros(){
        produtoRepository.top5ProdutosNativo().forEach(System.out::println);
    }
}