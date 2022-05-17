/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexcecoes;

/**
 *
 * @author aluno
 */
public class TesteExcecoes {

    public static void aumentarLetra()
     {
        String teste = "Rapaizzzzzzzz";
        try
        {
            
        System.out.println(teste.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("Verzeihung! "+" A String não pode ser null.");
        }
        finally
        {
            System.out.println("Rofatto passou pra te desejar um bom dia.\n" + "Vai estudar preguiçoso.");
        }
        
    }
    
    public static void main(String[] args) {
       aumentarLetra();
       
    }
    
}
