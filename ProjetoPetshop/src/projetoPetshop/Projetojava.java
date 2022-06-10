/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPetshop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Projetojava {


private static ArrayList<Cliente> cliArray = new ArrayList<Cliente>();
    private static ArrayList<Funcionario> funcArray= new ArrayList<Funcionario>();
    private static ArrayList<Produto> prodArray= new ArrayList<Produto>();
    private static final Scanner scan = new Scanner(System.in);

    Scanner menu = new Scanner(System.in);

    public static void menu() {
        System.out.println(" Menu Petshop: ");
        System.out.println("-------------------");
        System.out.println("1 - Cadastro de Clientes\n" + "2- Cadastro de Funcionarios\n" + "3-Cadastro de Produtos");
        System.out.println("--------------------");
        System.out.println("4-Busca por Clientes\n" + "5-Busca por Funcionarios\n" + "6-Busca por Produtos");
        System.out.println("--------------------");
        System.out.println("7-Cliente mais velho\n" + "8-Cliente mais jovem\n" + "9- Quantidade de Clientes maiores que 60 anos\n " + "10- Quantidade de Clientes menores que 18 anos \n"
                + "11-Idade media dos Clientes");
        System.out.println("--------------------");
        System.out.println("12-Produto mais caro\n" + "13-Produto mais barato\n" + "14-Media dos preços do Produtos\n" + "15-Media dos produtos com precos ácima da média\n" + "16-Lista de Clientes");
        System.out.println("--------------------");
        System.out.println("Escolha o item que deseja selecionar: ");

        int i = scan.nextInt();

        switch (i) {
            case 1:
               cliArray.add(AdicionaCliente());
                menu();
               break;
            case 2:
                funcArray.add(AdicionaFuncionario());
                menu();
                break;
            case 3:
                prodArray.add(AdicionaProduto());
                menu();
                break;
            case 4:
                buscarCliente();
                menu();
                break;
            case 5:
                BuscaFuncionario();
                menu();
                break;
            case 6:
                buscaProduto();
                menu();
                break;
            case 7:
                CliMaisVelho();
                menu();
                break;
            case 8:
                CliMaisNovo();
                menu();
                break;
            case 9:
                maisSessenta();
                menu();
                break;
            case 10:
                CliMenorDezoito();
                menu();
                break;
            case 11:
                MediaIdade();
                menu();
                break;
            case 12:
                ProdutoCaro();
                menu();
                break;
            case 13:
                ProdutoBarato();
                menu();
                break;
            case 14:
                MediaPrecos();
                menu();
                break;
            case 15:
                ProdAcimaMediaPreco();
                menu();
                break;
            case 16:
                ListaClientes();
                menu();
                break;
        }

    }

    public static void inicItens() {
        cliArray = new ArrayList();
        funcArray = new ArrayList();
        prodArray = new ArrayList();
    }

    public static Cliente AdicionaCliente() {
        // add cliente
        Cliente novoCli = new Cliente();

        System.out.println("Digite o nome do Cliente: \n");
        novoCli.setTutorAnimal(scan.next());
        scan.nextLine();

        while (novoCli.getIdade() < 1) {
            try {
                System.out.println("Digite a idade do cliente: \n");
                novoCli.setIdade(scan.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Idade do cliente não pode ser cadastrada...\n");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de idade invalida...");
                scan.nextLine();
            }
        }

        while (novoCli.getTelefone() < 0) {
            try {
                System.out.print("Digite o numero de telefone do Cliente: \n");
                novoCli.setTelefone(scan.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Valor de telefone digitado é invalido... ");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de telefone invalido... ");
                scan.nextLine();
            }
        }

        System.out.print("Digite o endereco do Cliente: \n");
        novoCli.setEndereco(scan.next());
        scan.nextLine();

        System.out.print("Digite o nome do Animal do Cliente: \n");
        novoCli.setNomeA(scan.next());
        scan.nextLine();

        while (novoCli.getIdadeAnim() < 1) {
            try {
                System.out.println("Digite a idade do Animal:  \n");
                novoCli.setIdadeAnim(scan.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Idade do animal não pode ser cadastrada...\n");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de idade invalida...");
                scan.nextLine();
            }
        }

        System.out.println("Digite a raça do Animal: \n");
        novoCli.setRaca(scan.next());
        scan.nextLine();

        System.out.println("Digite a cor do Animal: \n");
        novoCli.setCor(scan.next());
        scan.nextLine();

        while (novoCli.getPeso() < 0) {
            try {
                System.out.println("Digite o peso do Animal:  \n");
                novoCli.setPeso(scan.nextFloat());
            } catch (IllegalArgumentException e) {
                System.out.println("O peso do animal não pode ser cadastrado...\n");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de peso invalido...");
                scan.nextLine();
            }
        }

      
      return novoCli;
    }

    private static Funcionario AdicionaFuncionario() {
        Funcionario novoFunc = new Funcionario();

        System.out.println("Digite o nome do Funcionario: \n");
        novoFunc.setNome(scan.next());
        scan.nextLine();

        while (novoFunc.getIdade() < 1) {
            try {
                System.out.println("Digite a idade do Funcionario: \n");
                novoFunc.setIdade(scan.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Idade do cliente não pode ser cadastrada...\n");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de idade inválida... \n");
                scan.nextLine();
                novoFunc.setIdade(0);
            }
        }

        System.out.println("Digite o cargo do Funcionario: \n");
        novoFunc.setCargo(scan.next());
        scan.nextLine();

        System.out.println("Digite o email do Funcionario: \n");
        novoFunc.setEmail(scan.next());
        scan.nextLine();

        while (novoFunc.getSalario() < 0) {
            try {
                System.out.println("Digite o salario do funcionario: \n");
                novoFunc.setSalario(scan.nextDouble());
            } catch (IllegalArgumentException e) {
                System.out.println("O salario d funcionario cadastrado e invalido...");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de salario invalido... ");
            }
        }

        System.out.println("Digite a carga horaria semanal do Funcionario: \n");
        novoFunc.setCargaH(scan.nextInt());

        System.out.println("Digite o codigo da carteira de trabalho do Funcionario: \n");
        novoFunc.setCtps(scan.nextInt());

        return novoFunc;
    }

    private static Produto AdicionaProduto() {
        Produto novoProd = new Produto();

        System.out.println("Digite o tipo do produto (É Industrial ou um serviço do Petshop): \n");
        novoProd.setTipo(scan.next());
        scan.nextLine();

        System.out.println("Digite a descricao (nome) do Produto: \n");
        novoProd.setDescricao(scan.next());
        scan.nextLine();

        System.out.println("Digite o codigo do produto: \n");
        novoProd.setCodigo(scan.nextInt());

        while (novoProd.getPreco() < 1) {
            try {
                System.out.println("Digite o preco do Produto: \n");
                novoProd.setPreco(scan.nextDouble());
            } catch (IllegalArgumentException e) {
                System.out.println("Preco inserido não pode ser cadastrado...\n");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de preco inválido... \n");
                scan.nextLine();
            }
        }

        System.out.println("Digite a data de compra do produto: \n");
        novoProd.setDatacomp(scan.nextLine());

        return novoProd;
    }

    private static void buscarCliente() {

        System.out.println("Para realizar a busca, digite, no minimo parte do nome do cliente: ");
        String cliIniciais = scan.nextLine();
        for (Cliente c : cliArray) {
            if (c.getNome().startsWith(cliIniciais)) {
                c.exibir();
            }
        }
    }

    private static void BuscaFuncionario() {
        System.out.println("Para realizar a busca, digite, no minimo parte do nome do Funcionario: ");

        String funcIniciais = scan.nextLine();
        for (Funcionario f : funcArray) {
            if (f.getNome().startsWith(funcIniciais)) {
                f.exibir();
            }
        }
    }

    private static void buscaProduto() {
        System.out.println("\nDeseja buscar produto por qual informação?");
        System.out.println("1 - Preço");
        System.out.println("2 - Descrição");
        System.out.println("3 - Código");
        System.out.print("\nDigite o número da opção escolhida: ");
        int p = scan.nextInt();
        switch (p) {
            case 1:
                buscarPrecoProduto();
                break;
            case 2:
                buscarDescProducao();
                break;
            case 3:
                buscarDescProducao();
                break;
            default:
                System.out.println("Entrada inválida, por padrão, voltando ao menu.");
                menu();
        }
    }

    private static void buscarPrecoProduto() {
        System.out.println("Para realizar a busca digite o preco do produto: ");
        double produtoPreco;
        produtoPreco = scan.nextDouble();

        for (Produto p : prodArray) {
            if (p.getPreco() == produtoPreco) {
                p.exibir();
            }
        }
    }

    private static void buscarDescProducao() {
        System.out.println("Para realizar uma busca de produtos, digite pelo menos o inicio de sua descricao: ");
        String produtoIniciais = scan.nextLine();

        for (Produto p : prodArray) {
            if (p.getDescricao().startsWith(produtoIniciais)) {
                p.exibir();
            }
        }
    }

    private static void buscarCodProduto() {
        System.out.println("Para realizar a busca digite o codigo do produto: ");
        double prodCodigo;
        prodCodigo = scan.nextDouble();

        for (Produto p : prodArray) {
            if (p.getCodigo() == prodCodigo) {
                p.exibir();
            }
        }
    }

    private static int MediaIdade() {
        int mediaIdade = 0;

        for (Cliente c : cliArray) {
            mediaIdade += c.getIdade();
        }
        mediaIdade = mediaIdade / cliArray.size();
        return mediaIdade;
    }

    private static int maisSessenta() {
        int CliMaisSessenta = 0;

        for (Cliente c : cliArray) {
            if (c.getIdade() > 60) {
                CliMaisSessenta++;
            }
        }
        return CliMaisSessenta;
    }

    private static int CliMenorDezoito() {
        int CliMaisDezoito = 0;

        for (Cliente c : cliArray) {
            if (c.getIdade() > 18) {
                CliMaisDezoito++;
            }
        }

        return CliMaisDezoito;
    }

    private static void CliMaisNovo() {
        Cliente clienteMaisNovo = cliArray.get(0);
        for (Cliente c : cliArray) {
            if (clienteMaisNovo.getIdade() > c.getIdade()) {
                clienteMaisNovo = c;
            }
        }
        clienteMaisNovo.exibir();
    }

    private static void CliMaisVelho() {
        Cliente clienteMaisVelho = cliArray.get(0);
        for (Cliente c : cliArray) {
            if (clienteMaisVelho.getIdade() < c.getIdade()) {
                clienteMaisVelho = c;
            }
        }
        clienteMaisVelho.exibir();
    }

    private static void ProdAcimaMediaPreco() {
        for (Produto p : prodArray) {
            if (p.getPreco() > MediaPrecos()) {
                p.exibir();
            }
        }

    }

    private static double MediaPrecos() {
        double mediaPrecos = 0;

        for (Produto p : prodArray) {
            mediaPrecos += p.getPreco();
        }

        mediaPrecos = mediaPrecos / prodArray.size();
        return mediaPrecos;
    }

    private static void ProdutoBarato() {
        Produto prodMaisBarato = prodArray.get(0);
        for (Produto p : prodArray) {
            if (prodMaisBarato.getPreco() > p.getPreco()) {
                prodMaisBarato = p;
            }
        }
        prodMaisBarato.exibir();
    }

    private static void ProdutoCaro() {
        Produto prodMaisCaro = new Produto();
        for (Produto p : prodArray) {
            if (prodMaisCaro.getPreco() < p.getPreco()) {
                prodMaisCaro = p;
            }
        }
        prodMaisCaro.exibir();
    }

    private static void ListaClientes() {
        for (Cliente cli : cliArray) {
            cli.exibir();
            
            System.out.print("Número do Cliente: " + cliArray.indexOf(cli) + "\n");
        }
    }

    public static void main(String[] args) {
      menu();
    }

}
