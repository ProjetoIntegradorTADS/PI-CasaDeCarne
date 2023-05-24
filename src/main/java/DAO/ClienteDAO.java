/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import br.sp.senac.d160.TelasCasaDeCarnes.CRUD_Cliente;
import Classes.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente ( Nome,Endereco,Cpf,Cep,Email,Numero,complemento) VALUES (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            
          
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getEndereco());
            comandoSQL.setString(3,obj.getCpf());
            comandoSQL.setString(4, obj.getCep());
            comandoSQL.setString(5, obj.getEmail());
            comandoSQL.setString(6, obj.getNumEndereco());
            comandoSQL.setString(7, obj.getComplemento());
             
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
     public static ArrayList<Cliente> mostrarRegistros(){
        
        ArrayList<Cliente> lista = new ArrayList<>();
        Connection conexao = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/CasaDeCarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL =  conexao.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Cliente objCliente = new Cliente();
                    objCliente.setIdCliente(rs.getInt("cod_cli"));
                    objCliente.setNome(rs.getString("nome"));
                    objCliente.setCpf(rs.getString("cpf"));
                    objCliente.setCep(rs.getString("cep"));
                    objCliente.setEmail(rs.getString("email"));
                    objCliente.setEndereco(rs.getString("endereco"));
                    objCliente.setNumEndereco(rs.getString("numero"));
                    objCliente.setComplemento(rs.getString("complemento"));
                    
                    
                    lista.add(objCliente);
                    
                }
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return lista;
    }
    public static ArrayList<Cliente> buscarPorCpf(){
        
        ArrayList<Cliente> listar = new ArrayList<>();
        Connection conexao = null;
        
        
        try {
           
            
            String sql = "SELECT * FROM cliente where cod_cli = 1";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/CasaDeCarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL =  conexao.prepareStatement( sql );
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Cliente objCliente = new Cliente();
                    objCliente.setIdCliente(rs.getInt("cod_cli"));
                    objCliente.setNome(rs.getString("nome"));
                    objCliente.setEndereco(rs.getString("endereco"));
                    objCliente.setCpf(rs.getString("cpf"));
                    objCliente.setCep(rs.getString("cep"));
                    objCliente.setEmail(rs.getString("email"));
                    objCliente.setNumEndereco(rs.getString("numero"));
                    objCliente.setSexo(true);
                    objCliente.setComplemento(rs.getString("complemento"));
                    
                    
                    listar.add(objCliente);
                    
                }
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listar;
    }


}
