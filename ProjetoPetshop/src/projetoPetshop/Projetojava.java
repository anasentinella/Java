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

        int i = new input.NextInt();

        switch (i) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                cadastrarFuncionario()
                );
                break;
            case 3:
                cadastrarProduto()
                );
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

    private void cadastrarCliente() {
        Cliente novoCliente = new Cliente();

        System.out.println("Digite o nome do Cliente: ");
        novoCliente.setNome(input.next());
        input.nextLine();

        while (novoCliente.getIdade() < 1) {
            try {
                System.out.println("Digite a idade do cliente: ");
                novoCliente.setIdade(input.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Idade de cliente invÃ¡lida...");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de idade invalida...");
                input.nextLine();
            }
        }

        while (novoCliente.getTelefone() < 0) {
            try {
                System.out.print("Digite o telefone do Cliente: \n");
                novoCliente.setTelefone(input.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Valor de telefone invalido... ");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de telefone invalido... ");
                input.nextLine();
            }
        }

        System.out.print("Digite a flor favorita do Cliente: \n");
        novoCliente.(input.next());
        input.nextLine();

        System.out.println("Digite o email do Cliente: ");
        novoCliente.setEmail(input.next());

        // retorna array
        return cadastrarCliente;
    }

    private static void cadastrarFuncionario() {
        Funcionario novoFuncionario = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        novoFuncionario.setNome(scanUsuario.next());
        scanUsuario.nextLine();

        while (novoFuncionario.getIdade() < 1) {
            try {
                System.out.println("Digite a idade do funcionario: ");
                novoFuncionario.setIdade(scanUsuario.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Idade InvÃ¡lida...");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de idade inválida... ");
                scanUsuario.nextLine();
                novoFuncionario.setIdade(0);
            }
        }

        System.out.println("Digite o cargo do funcionÃ¡rio: ");
        novoFuncionario.setCargo(scanUsuario.next());
        scanUsuario.nextLine();

        while (novoFuncionario.getSalario() < 0) {
            try {
                System.out.println("Digite o salario do funcionario: ");
                novoFuncionario.setSalario(scanUsuario.nextDouble());
            } catch (IllegalArgumentException e) {
                System.out.println("Salario de funcionario invalido...");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de salario invalido... ");
            }
        }

        System.out.println("Digite a quantidade de horas semanais do funcionario: ");
        novoFuncionario.setHorasSemanais(scanUsuario.nextInt());

        return novoFuncionario;
    }

}

                private static Produto criarProduto() {
		Produto novoProduto = new Produto();

		System.out.println("Digite a descricao da planta: ");
		novoProduto.setDescricao(scanUsuario.next());

		scanUsuario.nextLine();

		while (novoProduto.getPreco() < 1) {
			
			try {
				System.out.println("Digite o preco da planta: ");
				novoProduto.setPreco(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Preco invalido... ");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de preço inválido... ");
				input.nextLine();
			}
		}

		while (novoProduto.getPeso() < 1) {
			try {
				System.out.println("Digite o peso da planta: ");
				novoProduto.setPeso(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Preco invalido... ");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de preco invalido...");
				scanUsuario.nextLine();
			}
		}

		while (novoProduto.getAltura() < 1) {
			try {
				System.out.println("Digite a altura da planta: ");
				novoProduto.setAltura(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Altura invalida... ");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de altura invalida... ");
				scanUsuario.nextLine();
			}
		}

		System.out.println("Digite a especie da planta... ");
		novoProduto.setEspecie(scanUsuario.next());

		scanUsuario.nextLine();

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
