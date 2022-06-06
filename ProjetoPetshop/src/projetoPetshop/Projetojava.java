/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPetshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Projetojava {

    private static ArrayList<Cliente> clientArray;
    private static ArrayList<Funcionario> funcArray;
    private static ArrayList<Produto> productArray;
    private static final Scanner input = new Scanner(System.in);

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
        throw new 
                    }

    private static void cadastrarFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void cadastrarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void BuscaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void BuscaFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void buscaProduto() {
        System.out.println("\nDeseja buscar produto por qual informação?");
        System.out.println("1 - Preço");
        System.out.println("2 - Descrição");
        System.out.println("3 - Código");
        System.out.print("\nDigite o número da opção escolhida: ");
        int a = input.nextInt();
        switch(a) {
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
        throw new; 
    }

    private static void maisjovem() {
        throw new; 
    }

    public static void main(String[] args) {

    }

}
