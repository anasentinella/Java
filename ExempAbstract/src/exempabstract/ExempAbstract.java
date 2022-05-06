
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempabstract;

/**
 *
 * @author aluno
 */
public class ExempAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Animal a1= new Cachorro();
     a1.Falar();
     Animal a2= new Gato();
     a2.Falar();
     Gato g1= (Gato)a2;
     g1.arranha();
     
     
    }
    
}

