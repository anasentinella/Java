/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dao.MusicaDAO;
import Model.Musicas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Controle {
     
    public void CadastrarMusicas(String nome,String compositor,String genero,int ano){
        Musicas m1 = new Musicas(nome,compositor,genero,ano);
        MusicaDAO mdao= new MusicaDAO();
        try {
            mdao.CadastrarMusica(m1);
        } catch (SQLException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    public void ExcluirMusicas(String nome) throws SQLException{
        MusicaDAO mDao= new MusicaDAO();
        mDao.Excluir(nome);
    }
}
