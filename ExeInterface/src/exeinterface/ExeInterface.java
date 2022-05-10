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
public class ExeInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setLado(2);
        System.out.println(q.calcArea());
        q.mostrar();
        IForma intF = new Quadrado();
        System.out.println(intF.calcPerimetro());
    }

}
