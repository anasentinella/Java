/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Conexao.Conexao;
import Model.Musicas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class MusicaDAO {

    Connection con;

    public void CadastrarMusica(Musicas m1) throws SQLException, ClassNotFoundException {
        con = new Conexao().getConnection();
        String sql = "Insert into Musicas (idMusicas,Nome,Compositor,Genero,AnoLancamento) values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, m1.getId());
        stmt.setString(2, m1.getNome());
        stmt.setString(3, m1.getCompositor());
        stmt.setString(4, m1.getGenero());
        stmt.setInt(5, m1.getAnoLanc());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public void Excluir(int id) throws SQLException, ClassNotFoundException {
        con = new Conexao().getConnection();
            String sql = "DELETE FROM Musicas WHERE idMusicas = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
            stmt.close();
            con.close();   
    }

    public ArrayList<Musicas> buscarTodasMusicas() throws SQLException, ClassNotFoundException {
        ResultSet rs;
        ArrayList<Musicas> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Musicas";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String compositor = rs.getString("compositor");
            String genero = rs.getString("genero");
            int anoLanca = rs.getInt("anoLanc");
            Musicas mu = new Musicas(id,nome, compositor, genero, anoLanca);
            lista.add(mu);
        }
        stmt.close();
        con.close();
        return lista;
    }

    public Musicas buscarMusica(int id) throws SQLException, ClassNotFoundException {
        ResultSet rs;
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Musicas WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        rs.first();
        int idd = rs.getInt("id");
        String nome = rs.getString("nome");
        String compositor = rs.getString("compositor");
        String genero = rs.getString("genero");
        int anoLanca = rs.getInt("anoLanc");
         Musicas mu = new Musicas(id,nome, compositor, genero, anoLanca);
        stmt.close();
        con.close();
        return mu;
    }
}
