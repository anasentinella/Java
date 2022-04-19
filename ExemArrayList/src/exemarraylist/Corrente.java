/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemarraylist;

/**
 *
 * @author aluno
 */
public class Corrente extends Conta {
private double limite;
    
    @Override
    public void mostra() {
        System.out.println("é uma conta corrente");
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
