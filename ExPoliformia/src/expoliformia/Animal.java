/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expoliformia;

/**
 *
 * @author aluno
 */
public class Animal {
    private String nome;
    private int idade;

   public void EmitirSom(){
       System.out.println("");
   } 
    
    public void mostraDados(){
        System.out.println("é um animal");
    } 
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
