/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeinterface;

/**
 *
 * @author aluno
 */
public class Circulo implements IForma, IBidimensional{
     private double raio;
    
     @Override
    public double calcArea() {
      return Math.PI*(raio*raio);
    }

    @Override
    public double calcPerimetro() {
      return 2*Math.PI*raio;       
    }

    @Override
    public double calcSeccao() {
       return 0;
    }

    @Override
    public void mostrar() {
        System.out.println("é um círculo");
    }

    @Override
    public void ehBidimensional() {
        System.out.println("é BI (biscate)");
    }
    
}
