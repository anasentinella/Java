/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testethrow;

/**
 *
 * @author aluno
 */
public class Aluno {

    private int ra;
    private String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if (ra < 0) {
            throw new IllegalArgumentException("RA deve ser positivo\n ");
        } else {
            this.ra = ra;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       if(nome.equals(""))
       {
           throw new StringVaziaException();
       }
       else {
        this.nome = nome;
       }
    }

}
