/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoController {

    private ArrayList<Aluno> Lista;

    public AlunoController() {
        Lista = new ArrayList();
    }

    public void cadastrar(String nome, int idade) {
        Aluno al = new Aluno(nome, idade);
        Lista.add(al);
        mostrar();
    }
    public void mostrar(){
        for(Aluno a: Lista){
            System.out.println(a.getNome()+ " " + a.getIdade() + "\n");   
        }
    }

}
