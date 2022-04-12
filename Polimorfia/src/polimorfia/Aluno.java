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
public class Aluno extends Pessoa {

    private int ra;

    @Override
    public  void mostraDados()
    {
        System.out.println("é um aluno");
    }
    
    public double calcularMedia(double n1, double n2)
    {
        return (n1+n2)/2;
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
