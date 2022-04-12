/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfia;

/**
 *
 * @author aluno
 */
public class Pessoa {

    private String nome;

    public final void mostraDados()
    {
        System.out.println("é uma pessoa");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
