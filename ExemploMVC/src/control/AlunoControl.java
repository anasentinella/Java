/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    private ArrayList<Aluno> listaAl;
    
    public AlunoControl() {
        listaAl= new ArrayList<>();
    }
    public void CadastrarAluno(int ra,String nome) throws SQLException{
        Aluno al = new Aluno(ra, nome);
       AlunoDAO aldao = new AlunoDAO();
      try{
       aldao.inserirAluno(al);
//listaAl.add(al);
      }catch(SQLException ex){
          Logger.getLogger
      }
    }
    public ArrayList <Aluno> buscarTodos(){
        return listaAl;
    
}
    
    
    
}
