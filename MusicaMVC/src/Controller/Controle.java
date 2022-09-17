/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dao.MusicaDAO;
import Model.Musicas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class Controle {
     
    public void CadastrarMusicas(int id,String nome,String compositor,String genero,int ano) throws ClassNotFoundException{
        Musicas m1 = new Musicas(id,nome,compositor,genero,ano);
        MusicaDAO mdao= new MusicaDAO();
        try {
            mdao.CadastrarMusica(m1);
        } catch (SQLException ex) {
            Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ExcluirMusicas(int id) throws SQLException, ClassNotFoundException {
       MusicaDAO mDao= new MusicaDAO();
        mDao.Excluir(id);
    }

    public ArrayList<Musicas> buscarTodasMusicas() throws SQLException, ClassNotFoundException {
        MusicaDAO mdao = new MusicaDAO();
        return ((mdao.buscarTodasMusicas()));
    }
    
    public Musicas buscarMusica(int id ) throws SQLException, ClassNotFoundException {
        MusicaDAO mudao = new MusicaDAO();
        return (mudao.buscarMusica(id));
    }

    

    
}
