/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Cliente;
import Classes.Pedido;
import static DAO.ClienteDAO.Login;
import static DAO.ClienteDAO.Senha;
import static DAO.ClienteDAO.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SALOMAO.FLIMA
 */
public class PedidoDAO {
    static String URL = "jdbc:mysql://localhost:3306/casadecarne";
    static String Login = "root";
    static String Senha = "P@$$word";
    
    public static boolean adicionar(Pedido obj) {
        boolean retorno = false;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO pedido (quantidade,vlrNota,precoKG) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            
            comandoSQL.setFloat(0, obj.getQuantidade());
            comandoSQL.setFloat(1, obj.getValorTotal());
            comandoSQL.setFloat(2, obj.getPrecoKg());
           
             
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0){
            retorno = true;
        }
            
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ta tudo errado po");
        }
        
        return retorno;
            
    }
    
}

