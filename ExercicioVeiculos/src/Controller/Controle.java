/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.sun.jdi.connect.spi.Connection;
import static java.lang.System.exit;

/**
 *
 * @author Felipe
 */
public class Controle {
     public Connection getConnection() {    
       String url = "jdbc:mysql://143.106.241.3:3306/cl201279";
       String usuario = "cl201279";
       String senha = "cl*17082005";
        try {  
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão "+ ex.toString());
            exit (1);
            return null;
        }
    } 
}
