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
public class Poupanca extends Conta {

    private double taxa;

    @Override
    public void mostra() {
        System.out.println("é uma conta poupança");
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

}
