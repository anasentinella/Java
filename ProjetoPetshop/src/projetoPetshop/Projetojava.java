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

    private static ArrayList<Cliente> clientArray;
    private static ArrayList<Funcionario> funcArray;
    private static ArrayList<Produto> productArray;
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
        System.out.println("12-Produto mais caro\n" + "13-Produto mais barato\n" + "14-Media dos preços do Produtos\n" + "15-Media dos produtos com precos ácima da média\n" + "16-Sair");
        System.out.println("--------------------");
        System.out.println("Escolha o item que deseja selecionar: ");

        int i = new scan.NextInt();

        switch (i) {
            case 1:
                cadastrarCliente.add(AdicionaCliente());
                break;
            case 2:
                cadastrarFuncionario.add(AdicionaFuncionario());
                break;
            case 3:
                cadastrarProduto.add(AdicionaProduto());
                break;
            case 4:
                BuscaCliente();
                break;
            case 5:
                BuscaFuncionario();
                break;
            case 6:
                buscaProduto();
                break;
            case 7:
                maisvelho();
                break;
            case 8:
                maisjovem();
                break;
            case 9:
                climaiorq60;
                break;
            case 10:
                climenq18;
                break;
            case 11:
                idMediacli;
                break;
            case 12:
                produtoCaro;
                break;
            case 13:
                produtoBarato;
                break;
            case 14:
                mediaPrecos;
                break;
            case 15:
                mediaAcima;
                break;
        }

    }

    public static void inicItens() {
        clientArray = new ArrayList();
        funcArray = new ArrayList();
        productArray = new ArrayList();
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
                System.out.println("Valor de telefone digitado e invalido... ");
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
        
        System.out.println("Digite a raca do Animal: \n");
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
        //-----------Cadastrar Funcionário--------------
 

    private static  Funcionario AdicionaFuncionario() {
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

}
        //------------------Cadastrar Produto----------------------------//

        private static Produto AdicinaProduto() {
        Produto novoProd = new Produto();

        System.out.println("Digite o tipo do produto (E industrial ou um servico do Petshop): \n");
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
                novoFunc.setPreco(scan.nextDouble());
            } catch (IllegalArgumentException e) {
                System.out.println("Preco inserido não pode ser cadastrado...\n");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de preco inválido... \n");
                scan.nextLine();
            }
        }

        System.out.println("Digite a data de compra do produto: \n");
        novoProd.setDatacomp(scan.nextInt());


		return novoProduto;
	}
    }
        private static void buscarCliente() {
		System.out.println("Para realizar a busca, digite, no minimo parte do nome do cliente: ");
		String clienteIniciais = scanUsuario.next();

		for (Cliente c : cadastroClientes) {
			if (c.getNome().startsWith(clienteIniciais)) {
				c.exibir();
			}
		}
	}

    

    private static void BuscaFuncionario() {
        
    }

    private static void buscaProduto() {
        System.out.println("\nDeseja buscar produto por qual informação?");
        System.out.println("1 - Preço");
        System.out.println("2 - Descrição");
        System.out.println("3 - Código");
        System.out.print("\nDigite o número da opção escolhida: ");
        int a = input.nextInt();
        switch (a) {
            case 1:
                buscaProdutoValor();
                break;
            case 2:
                buscaProdutoDesc();
                break;
            case 3:
                buscaProdutoCod();
                break;
            default:
                System.out.println("Entrada inválida, por padrão, voltando ao menu.");
                menu();
        }
    }

    private static void maisvelho() {
        int maisSessenta = 0;

        for (Cliente c : cadastrarCliente) {
            if (c.getIdade() > 60) {
                qtdClientesMaisSessenta++;
            }
        }
        return qtdClientesMaisSessenta;
    }
}

        
        private static int retornaQtdClientesMaisDezoito() {
		int qtdClientesMaisDezoito = 0;

		for (Cliente c : cadastroClientes) {
			if (c.getIdade() > 18) {
				qtdClientesMaisDezoito++;
			}
		}

		return qtdClientesMaisDezoito;
	}
        private static void exibirClienteMaisNovo() {
		Cliente clienteMaisNovo = cadastroClientes.get(0);
		for (Cliente c : cadastroClientes) {
			if (clienteMaisNovo.getIdade() > c.getIdade()) {
				clienteMaisNovo = c;
			}
		}
		clienteMaisNovo.exibir();
	}

	private static void exibirClienteMaisVelho() {
		Cliente clienteMaisVelho = cadastroClientes.get(0);
		for (Cliente c : cadastroClientes) {
			if (clienteMaisVelho.getIdade() < c.getIdade()) {
				clienteMaisVelho = c;
			}
		}
		clienteMaisVelho.exibir();
	}
private static void exibirPrdtsAcimaMediaPreco() {
		for (Produto p : cadastroProdutos) {
			if (p.getPreco() > retornaMediaPrecos()) {
				p.exibir();
			}
		}

	}

	private static double retornaMediaPrecos() {
		double mediaPrecos = 0;

		for (Produto p : cadastroProdutos) {
			mediaPrecos += p.getPreco();
		}

		mediaPrecos = mediaPrecos / cadastroClientes.size();
		return mediaPrecos;
	}

	private static void imprimeProdutoBarato() {
		Produto prodMaisBarato = cadastroProdutos.get(0);
		for (Produto p : cadastroProdutos) {
			if (prodMaisBarato.getPreco() > p.getPreco()) {
				prodMaisBarato = p;
			}
		}
		prodMaisBarato.exibir();
	}

	private static void imprimeProdutoCaro() {
		Produto prodMaisCaro = new Produto();
		for (Produto p : cadastroProdutos) {
			if (prodMaisCaro.getPreco() < p.getPreco()) {
				prodMaisCaro = p;
			}
		}
		prodMaisCaro.exibir();
	}
    }
    private static void exibirListaClientes() {
		for (Cliente c : cadastroClientes) {
			c.exibir();
                        System.out.print("Número do Cliente: " + cadastroClientes.indexOf(c) + "\n");
		}
	}

    public static void main(String[] args) {

    }

}
