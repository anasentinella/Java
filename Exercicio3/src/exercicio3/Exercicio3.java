/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
        CalculoMatematico mat1= new CalculoMatematico();
    }
       catch(ArithmeticException e){
          System.out.println(e.getMessage());
          e.setStackTrace(0);
      } 
      
    }
    
}
