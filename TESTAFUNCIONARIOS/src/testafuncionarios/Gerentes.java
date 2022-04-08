/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionarios;

/**
 *
 * @author aluno
 */
public class Gerentes extends Funcionario {

    private String nomeUs;
    private int senha;

    public Gerentes(String nome, double salario, String nomeUs, int senha) {
        super(nome, salario);
        this.nomeUs = nomeUs;
        this.senha = senha;
    }

    public String getNomeUs() {
        return nomeUs;
    }

    public void setNomeUs(String nomeUs) {
        this.nomeUs = nomeUs;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double CalculaBonificacao(double salario, double bonus) {
        bonus = salario * 2.1;

        return bonus;
    }

    public String MostraDados() {
        return "nome: " + nome + ", Salario: " + salario + ", senha: " + senha
                + ", nome do usuario: " + nomeUs;
    }
}
