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
public class Gato extends Animal {

    @Override
    public void Falar() {
        System.out.println("miauu");
    }
    
    public void arranha(){
        System.out.println("gato arranhando");
    }
    
}
