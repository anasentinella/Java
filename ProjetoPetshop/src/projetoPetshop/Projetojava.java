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
    private static ArrayList<Funcionario> funcArray = new ArrayList<Funcionario>();
    private static ArrayList<Produto> prodArray = new ArrayList<Produto>();
    private static final Scanner scan = new Scanner(System.in);

    Scanner menu = new Scanner(System.in);

    public static void menu() {
        System.out.println(" Menu Petshop: ");
        System.out.println("-------------------");
        System.out.println("1-Cadastro de Clientes\n" + "2-Cadastro de Funcionarios\n" + "3-Cadastro de Produtos");
        System.out.println("--------------------");
        System.out.println("4-Excluir Cliente: \n" + "5-Exclusão de Funcionario: \n" + "6-Exclusão de Produtos: ");
        System.out.println("-------------------");
        System.out.println("7-Busca por Clientes\n" + "8-Busca por Funcionarios\n" + "9-Busca por Produtos");
        System.out.println("--------------------");
        System.out.println("10-Cliente mais velho\n" + "11-Cliente mais jovem\n" + "12- Quantidade de Clientes maiores que 60 anos\n " + "13- Quantidade de Clientes menores que 18 anos \n"
                + "14-Idade media dos Clientes");
        System.out.println("--------------------");
        System.out.println("15-Produto mais caro\n" + "16-Produto mais barato\n" + "17-Media dos preços do Produtos\n" + "18-Media dos produtos com precos ácima da média");
        System.out.println("--------------------");
        System.out.println("19-Lista de Clientes:\n " + "20-Lista de funcionarios: \n" + "21-Lista de Produtos: ");
        System.out.println("--------------------");
        System.out.println("Escolha o item que deseja selecionar: ");

        int i = scan.nextInt();

        switch (i) {
            case 1:
                System.out.println("Novo cadstro de Cliente: \n");
                cliArray.add(AdicionaCliente());
                menu();
                break;
            case 2:
                System.out.println("Novo cadstro de Funcionario: \n");
                funcArray.add(AdicionaFuncionario());
                menu();
                break;
            case 3:
                System.out.println("Novo cadstro de Produto: \n");
                prodArray.add(AdicionaProduto());
                menu();
                break;
            case 4:
                System.out.println("Exclusão de Cliente: ");
                excluirCliente();
                menu();
                break;
            case 5:
                System.out.println("Exclusão de Funcionario: ");
                excluirFuncionario();
                menu();
                break;
            case 6:
                System.out.println("Exclusão de Produto: ");
                excluirProduto();
                menu();
                break;
            case 7:
                System.out.println("Busca de Cliente: ");
                buscaCliente();
                menu();
                break;
            case 8:
                System.out.println("Busca de Funcionario: ");
                BuscaFuncionario();
                menu();
                break;
            case 9:
                System.out.println("Busca de Produto: ");
                buscaProduto();
                menu();
                break;
            case 10:
                System.out.println("Cliente mais Velho: ");
                CliMaisVelho();
                menu();
                break;
            case 11:
                System.out.println("Cliente mais Novo: ");
                CliMaisNovo();
                menu();
                break;
            case 12:
                System.out.println("Clientes com mais de 60 anos: "+ maisSessenta());
                menu();
                break;
            case 13:
                System.out.println("Clientes com menos de 18 anos: "+ CliMenorDezoito());
                menu();
                break;
            case 14:
                System.out.println("Media das idades dos Clientes: " + MediaIdade());
                menu();
                break;
            case 15:
                System.out.println("Produto mais Caro: ");
                ProdutoCaro();
                menu();
                break;
            case 16:
                System.out.println("Produto mais Barato: ");
                ProdutoBarato();
                menu();
                break;
            case 17:
                System.out.println("Média dos preços dos Produtos: " + MediaPrecos());
                menu();
                break;
            case 18:
                System.out.println("Produtos com preço acima da média: ");
                ProdAcimaMediaPreco();
                menu();
                break;
            case 19:
                System.out.println("Lista de Clientes: ");
                ListaDeClientes();
                menu();
                break;
            case 20:
                System.out.println("Lista de Funcionarios: ");
                ListaDeFuncionarios();
                menu();
                break;

            case 21:
                System.out.println("Lista de produtos: ");
                ListaDeProdutos();
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

    public static void excluirCliente() {

        boolean found = false;
        System.out.println("\nQual o nome do animal do cliente a ser removido?");
        String value = scan.next();
        for (Cliente c : cliArray) {  
            if (c.getNomeA() == value) {
                cliArray.remove(c);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNenhum cliente encontrado. Deseja reiniciar a operação? 1 = Sim; 2 = Não");
            int s = scan.nextInt();
            switch (s) {
                case 1:
                    excluirCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Voltando ao menu.");
                    menu();
                    break;
            }
        }
        System.out.println("\nOperação Finalizada. Deseja remover mais algum cliente? 1 = Sim; 2 = Não");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                excluirCliente();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
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

    public static void excluirFuncionario() {

        boolean found = false;
        System.out.println("\nQual o numero da carteira de trabalho do funcionário a ser removido?");
        int value = scan.nextInt();
        for (Funcionario func : funcArray) {
            if (func.getCtps() == value) {
                funcArray.remove(func);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nFuncionario não encontrado. Deseja retomar a operação? 1 = Sim; 2 = Não");
            int s = scan.nextInt();
            switch (s) {
                case 1:
                    excluirFuncionario();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Voltando ao menu.");
                    menu();
            }
        }
        System.out.println("\nOperação Finalizada. Deseja apagar mais algum registro? 1 = Sim; 2 = Não");
        int s = scan.nextInt();
        switch (s) {
            case 1:
                excluirFuncionario();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
        }
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
        novoProd.setDatacomp(scan.next());
        scan.nextLine();
        return novoProd;
    }

    public static void excluirProduto() {

        boolean found = false;
        System.out.println("\n Qual o codigo do produto a ser removido?");
        int value = scan.nextInt();
        for (Produto p : prodArray) {
            if (p.getCodigo() == value) {
                prodArray.remove(p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNenhum produto encontrado. Deseja reiniciar a operação? 1 = Sim; 2 = Não");
            int s = scan.nextInt();
            switch (s) {
                case 1:
                    excluirProduto();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nNão é uma entrada válida. Voltando ao menu.");
                    menu();
                    break;
            }
        }
        System.out.println("\nOperação Finalizada. Deseja remover mais algum produto? 1 = Sim; 2 = Não");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                excluirProduto();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Voltando ao menu.");
                menu();
                break;
        }
    }

    public static void buscaCliente() {
        limpaBuffer(scan);

        boolean found = false;

        System.out.println("\nDigite o nome  do cliente:");
        String le = scan.next();

        for (Cliente c : cliArray) {
            if (c.getTutorAnimal().contains(le)) {
                System.out.println("\nRegistro encontrado:");
                c.exibir();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNenhum registro encontrado. Deseja reiniciar a operação ou sair? 1 = Reiniciar; 2 = Sair.");
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    buscaCliente();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("\nEntrada inválida. Por padrão, voltando ao menu.");
                    menu();
            }
        }

        System.out.println("\nOperação Finalizada. Deseja buscar mais algum cliente? 1 = Sim; 2 = Não");
        int s = scan.nextInt();
        switch (s) {
            case 1:
                buscaCliente();
                break;
            case 2:
                menu();
                break;
            default:
                System.out.println("\nNão é uma entrada válida. Por padrão, voltando ao menu.");
                menu();
                break;
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
        String produtoIniciais = scan.next();

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
      int CliMenorDezoito = 0;

		for (Cliente c : cliArray) {
			if (c.getIdade() > 18) {
				CliMenorDezoito++;
			}
		}

		return CliMenorDezoito;
	}

    private static void CliMaisNovo() {
        Cliente c1i;
        c1i = cliArray.get(0);

        for (Cliente c : cliArray) {
            if (c1i.getIdade() > c.getIdade()) {
                c1i = c;
            }
        }

        System.out.println("\nCliente mais novo :");
        c1i.exibir();
    }

    private static void CliMaisVelho() {
        Cliente cliMaisVelho = cliArray.get(0);
        for (Cliente c : cliArray) {
            if (cliMaisVelho.getIdade() < c.getIdade()) {
                cliMaisVelho = c;
            }
        }
        cliMaisVelho.exibir();
    }

    private static void ProdAcimaMediaPreco() {
        for (Produto prod : prodArray) {
            if (prod.getPreco() > MediaPrecos()) {
                prod.exibir();
            }
        }

    }

    private static double MediaPrecos() {
        double mediaPrecos = 0;
 
        
        for (Produto prod : prodArray) { 
            mediaPrecos += prod.getPreco();
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

    private static void ListaDeClientes() {
        for (Cliente cli : cliArray) {
            cli.exibir();

            System.out.println("Número do Cliente: " + cliArray.indexOf(cli));
        }
    }

    private static void ListaDeFuncionarios() {
        for (Funcionario func : funcArray) {
            func.exibir();

            System.out.println("Número do Funcinario: " + funcArray.indexOf(func));
        }
    }

    private static void ListaDeProdutos() {
        for (Produto prod : prodArray) {
            prod.exibir();

            System.out.println("Número do Produto: " + prodArray.indexOf(prod));
        }
    }

    public static void limpaBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
