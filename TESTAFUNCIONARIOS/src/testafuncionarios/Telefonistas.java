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
public class Telefonistas extends Funcionario {

    private String codEstac;

    public Telefonistas(String nome, double salario, String codEstac) {
        super(nome, salario);
        this.codEstac = codEstac;
    }

    public String getCodEstac() {
        return codEstac;
    }

    public void setCodEstac(String codEstac) {
        this.codEstac = codEstac;
    }

    public String MostraDados() {
        return "nome: " + nome + ", Salario: " + salario + ", Codigo da Estação: "
                + codEstac;
    }

}
