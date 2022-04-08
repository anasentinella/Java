/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionarios;

/**
 *
 * @author aluno
 */
public class TESTAFUNCIONARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerentes g1 = new Gerentes("Matioli",1500,"Vossa Senhoria",12345);
        System.out.println(g1.MostraDados());
        System.out.println("bonificação:  \n" + g1.CalculaBonificacao());
      
        Telefonistas t1 = new Telefonistas("Tania",1800,"400200");
        System.out.println(t1.MostraDados());
         System.out.println("bonificação: \n" + t1.CalculaBonificacao());
 
        Secretarias sec1 = new Secretarias("Ana Júlia",3500,4002);       
        System.out.println(sec1.MostraDados());
        System.out.println("bonificação:  \n" + sec1.CalculaBonificacao());    
    }
}
    

