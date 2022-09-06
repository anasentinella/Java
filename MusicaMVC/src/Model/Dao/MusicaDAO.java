/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Conexao.Conexao;
import Model.Musicas;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class MusicaDAO {

    Connection con;

    public void CadastrarMusica(Musicas m1) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "Insert into Musicas (Nome,Compositor,Genero,AnoLancamento) values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, m1.getNome());
        stmt.setString(2, m1.getCompositor());
        stmt.setString(3, m1.getGenero());
        stmt.setInt(4, m1.getAnoLanc());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public void Excluir(String nome) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM Musicas WHERE Nome = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();
        stmt.close();
        con.close();

    }
}
