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
    
        public static boolean salvar(Cliente obj) {
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Cliente (Nome,Endereco,CPF,CEP,Email,Numero,Sexo) VALUES (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, obj.getIdCliente());
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getEndereco());
            comandoSQL.setString(3, obj.getcPF());
            comandoSQL.setString(4, obj.getcEP());
            comandoSQL.setString(5, obj.getEmail());
            comandoSQL.setInt(6, obj.getNumEndereco());
            comandoSQL.setBoolean(7, obj.getSexo());
             
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs .next()) {
                    int idCliente = rs.getInt(1);
                    for (Cliente item : obj.getListaItens()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO ItemNota (Nome,Endereco,CPF,CEP,Email,Numero,Sexo) VALUES (?,?,?,?,?,?,?)");
                        comandoSQLItem.setInt(1, item.getIdCliente());
                        comandoSQLItem.setString(2, item.getNome());
                        comandoSQLItem.setString(3, item.getEndereco());
                        comandoSQLItem.setString(4, item.getcPF());
                        comandoSQLItem.setString(5,item.getcEP());
                        comandoSQLItem.setString(6,item.getEmail());
                        comandoSQLItem.setInt(7,item.getNumEndereco());
                        comandoSQLItem.setBoolean(8,item.getSexo());
                        

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem>0){
                            retorno = true;
                        }
                    }
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("bla");
        }
        
        return retorno;
            
    }
    
}
    

