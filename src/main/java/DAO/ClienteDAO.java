/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SALOMAO.FLIMA
 */ 
public class ClienteDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/CasaDeCarne";
    static String Login = "root";
    static String Senha = "A@1090073061a";
    
        public static boolean cadastrar(Cliente obj) {
        boolean retorno = false;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Cliente (idCliente, Nome,Endereco,Cpf,Cep,Email,Numero,Sexo) VALUES (?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            
            comandoSQL.setInt(0, obj.getIdCliente());
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3,obj.getCep());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, obj.getNumEndereco());
            comandoSQL.setBoolean(6, obj.getSexo());
            comandoSQL.setString(7, obj.getComplemento());
             
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ta tudo errado po");
        }
        
        return retorno;
            
    }
    
}
    

