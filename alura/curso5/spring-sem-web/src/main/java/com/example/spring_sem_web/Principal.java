package com.example.spring_sem_web;

import com.example.spring_sem_web.Models.*;
import com.example.spring_sem_web.Repositories.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
            default:
                System.out.println("Opção inválida");
        }
    }

    public void pesquisarNomeExatoDoProduto(){
        System.out.print("Insira o nome do produto: ");
        String nomeProduto = leitor.next();

        List<Produto> resultado = produtoRepository.findByNome(nomeProduto);
        resultado.forEach(System.out::println);
    }

    public void pesquisarCategoriaDoProduto(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        List<Produto> resultado = produtoRepository.findByCategoria(categoria);

        resultado.forEach(System.out::println);
    }

    public void pesquisarProdutoCaro(){
        System.out.print("Informe o valor mínimo: ");
        double minimo = leitor.nextDouble();

        List<Produto> resultado = produtoRepository.findByPrecoGreaterThan(minimo);
        System.out.println("Os produtos acimaa de R$" + minimo + ":");

        resultado.forEach(System.out::println);

    }

    public void pesquisarProdutoBarato(){
        System.out.print("Informe o valor limite: ");
        double limite = leitor.nextDouble();

        List<Produto> resultado = produtoRepository.findByPrecoLessThan(limite);
        System.out.println("Os produtos de valor abaixo de R$" + limite + ":");

        resultado.forEach(System.out::println);
    }

    public void pesquisarNomedoProduto(){
        System.out.print("Insira o nome do produto: ");
        String nomeProduto = leitor.next();

        List<Produto> resultado = produtoRepository.findByNomeContainingIgnoreCase(nomeProduto);
        resultado.forEach(System.out::println);
    }

    public void pedidosSemEntrega(){
        List<Pedido> resultado = pedidoRepository.findByDateIsNull();
        System.out.println("Pedidos sem data:");
        resultado.forEach(System.out::println);
    }

    public void pedidosComEntrega(){
        List<Pedido> resultado = pedidoRepository.findByDateIsNotNull();
        System.out.println("Pedidos com data:");
        resultado.forEach(System.out::println);
    }

    public void pesquisarCategoriaDoProdutocomPrecoCrescente(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        List<Produto> resultado = produtoRepository.findByCategoriaOrderByPreco(categoria);

        resultado.forEach(System.out::println);
    }

    public void pesquisarCategoriaDoProdutocomPrecoDecrescente(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        List<Produto> resultado = produtoRepository.findByCategoriaOrderByPrecoDesc(categoria);

        resultado.forEach(System.out::println);
    }

    public void contaProdutoPorCategoria(){
        System.out.print("Insira a categoria do produto: ");
        String nomeCategoria = leitor.next();

        Categoria categoria = categoriaRepository.findFirstByNomeContainingIgnoreCase(nomeCategoria);
        Long resultado = produtoRepository.countByCategoria(categoria);
        System.out.println("A quantidade de produtos em " + categoria + " é " + resultado);
    }

    public void contaProdutoCaro(){
        System.out.print("Insira o valor mínimo: ");
        double minimo = leitor.nextDouble();

        Long resultado = produtoRepository.countByPrecoGreaterThan(minimo);
        System.out.println("A quantidade de produtos acima de R$" + minimo + " é " + resultado);
    }

    public void produtosBaratoOuDeTermoEspecificado(){
        System.out.print("Insira um valor: ");
        double limite = leitor.nextDouble();
        System.out.print("Digite o nome do produto: ");
        String termo = leitor.next();

        List<Produto> resultado = produtoRepository.findByNomeContainingIgnoreCaseOrPrecoLessThan(termo, limite);
        resultado.forEach(System.out::println);
    }

    public void pedidosDepoisDe(){
        System.out.print("Defina a data(Formato: yyyy-mm-dd ): ");
        String termo = leitor.next();
        LocalDate data = LocalDate.parse(termo);

        List<Pedido> resultado = pedidoRepository.findByDateGreaterThan(data);
        System.out.println("Filtrado pedidos realizados após: " + data);
        resultado.forEach(System.out::println);
    }

    public void pedidosAntesDe(){
        System.out.print("Defina a data(Formato: yyyy-mm-dd ): ");
        String termo = leitor.next();
        LocalDate data = LocalDate.parse(termo);

        List<Pedido> resultado = pedidoRepository.findByDateLessThan(data);
        System.out.println("Filtrado pedidos realizados após: " + data);
        resultado.forEach(System.out::println);
    }

    public void pedidosEntre(){
        System.out.print("Defina a data de início(Formato: yyyy-mm-dd ): ");
        LocalDate dataInicio = LocalDate.parse(leitor.next());

        System.out.print("Defina a data de termino(Formato: yyyy-mm-dd ): ");
        LocalDate dataFinal = LocalDate.parse(leitor.next());

        List<Pedido> resultado = pedidoRepository.findByDateGreaterThanAndDateLessThan(dataInicio, dataFinal);
        resultado.forEach(System.out::println);
    }

    public void top3ProdutosCaros(){
        List<Produto> resultado = produtoRepository.findTop3ByOrderByPrecoDesc();
        resultado.forEach(System.out::println);
    }

    public void top5ProdutosbaratosTodasCategorias(){
        List<Categoria> categorias =categoriaRepository.findAll();

        System.out.println("Top 5 produtos de cada categoria:");
        for (Categoria categoria : categorias) {
            System.out.println("Top 5 produtos da categoria " + categoria.getNome());
            List<Produto> resultados = produtoRepository.findTop5ByCategoriaOrderByPreco(categoria);
            resultados.forEach(System.out::println);
        }
    }

}