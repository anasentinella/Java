/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciothrow;

/**
 *
 * @author aluno
 */
public class ExercicioThrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Object o = null;
            o.toString();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("ERRO! A String esta vazia.\n");
        }
        
        
    
    }

}
