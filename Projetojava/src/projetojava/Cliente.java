/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa implements IPessoa {
     private String raca;
     private int codanimal; 
     private String email;
    
     @Override
    public void exibir() {
      
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getCodanimal() {
        return codanimal;
    }

    public void setCodanimal(int codanimal) {
        this.codanimal = codanimal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
