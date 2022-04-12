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
public class Polimorfia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();

        //polimorfismo
        Pessoa p2 = new Aluno();
        p2.mostraDados();
        System.out.println(a1.calcularMedia(10, 8));

        Pessoa p3 = new Aluno();
        Aluno a3 = (Aluno) p3;
        System.out.println(a3.calcularMedia(2, 5));

        if (a1 instanceof Aluno)
            System.out.println("é instancia");
        else
            System.out.println("não é instancia");
        
    }

}
