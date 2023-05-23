/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Classes.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SALOMAO.FLIMA
 */
public class ProdutoDAO {
    static String URL = "jdbc:mysql://localhost:3306/estoque";
    static String Login = "root";
    static String Senha = "P@$$w0rd";
   
        public static boolean adicionarEstoque(Produto obj) {
        boolean retorno = false;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (nomeProduto,quantidade,precoPorKg ) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            
            comandoSQL.setString(1, obj.getNomeProduto());
            comandoSQL.setFloat(2, obj.getQuantidade());
            comandoSQL.setFloat(3, obj.getValorProduto());
            
           
             
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
   

