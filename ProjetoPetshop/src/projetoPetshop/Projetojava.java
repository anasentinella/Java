/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPetshop;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projetojava {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
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

        int opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(cadastrarCliente);
                break;
            case 2:
                System.out.println(cadastrarFuncionario);
                break;
            case 3:
                System.out.println(cadastrarProduto);
                break;
            case 4:
                System.out.println(BuscaCliente);
                break;
            case 5:
                System.out.println(BuscaFuncionario);
                break;
            case 6:
                System.out.println(buscaProduto);
                break;
            case 7:
                System.out.println(maisvelho);
                break;
            case 8:
                System.out.println(maisjovem);
                break;
            case 9:
                System.out.println(climaiorq60);
                break;
            case 10:
                System.out.println(climenq18);
                break;
            case 11:
                System.out.println(cadastrarCliente);
                break;
            case 12:
                System.out.println(cadastrarCliente);
                break;
            case 13:
                System.out.println(cadastrarCliente);
                break;
            case 14:
                System.out.println(cadastrarCliente);
                break;
            case 15:
                System.out.println(cadastrarCliente);
                break;

        }

    }

}
