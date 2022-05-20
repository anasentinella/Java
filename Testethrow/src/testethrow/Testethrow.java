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
public class Testethrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        try {
            a1.setNome("");
        }
        catch (StringVaziaException e)
        {
            System.out.println(e.getMessage());
        }
         catch (RuntimeException e) 
        {
           e.printStackTrace();
        }
        try {
            a1.setRa(-1);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) 
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Termino do Programa.");
    }

}
