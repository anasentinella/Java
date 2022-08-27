/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

/**
 *
 * @author Felipe
 */
public class VeiculoDAO {
     con = new Conexao().getConnection();
            String sql = "INSERT INTO VeiculoJava (Marca,Modelo,Placa,Cor,AnoFabri) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, h.getCod());
            stmt.setString(2, h.getMarca());
            stmt.setString(3, h.getModelo());
            stmt.setString(4, h.getTipo());
            stmt.setDouble(5, h.getPreco());
            stmt.execute();
            stmt.close();
            con.close();    
}
