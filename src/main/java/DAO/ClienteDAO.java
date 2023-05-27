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
import javax.swing.JFormattedTextField;

/**
 *
 * @author SALOMAO.FLIMA
 */
public class ClienteDAO {

    static String URL = "jdbc:mysql://localhost:3306/casadecarne";
    static String Login = "root";
    static String Senha = "A@1090073061a";

        
    public static boolean cadastrar(Cliente obj) {
        boolean retorno = false;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente ( Nome,Endereco,Cpf,Cep,Email,Numero,sexo,complemento) VALUES (?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getEndereco());
            comandoSQL.setString(3, obj.getCpf());
            comandoSQL.setString(4, obj.getCep());
            comandoSQL.setString(5, obj.getEmail());
            comandoSQL.setString(6, obj.getNumEndereco());
            comandoSQL.setString(7, obj.getSexo());
            comandoSQL.setString(8, obj.getComplemento());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ta tudo errado po");
        }

        return retorno;

    }

    public static ArrayList<Cliente> mostrarRegistros() {

        ArrayList<Cliente> lista = new ArrayList<>();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente objCliente = new Cliente();
                    objCliente.setIdCliente(rs.getInt("cod_cli"));
                    objCliente.setNome(rs.getString("nome"));
                    objCliente.setCpf(rs.getString("cpf"));
                    objCliente.setCep(rs.getString("cep"));
                    objCliente.setEmail(rs.getString("email"));
                    objCliente.setEndereco(rs.getString("endereco"));
                    objCliente.setNumEndereco(rs.getString("numero"));
                    objCliente.setSexo(rs.getString("sexo"));
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

    public static ArrayList<Cliente> buscarPorCpf(String cpfInfo) {

        // CRUD_Cliente crud_cliente = new CRUD_Cliente();
        ArrayList<Cliente> listar = new ArrayList<>();
        Connection conexao = null;

        try {

            // String cpf = cpfInfo;
            String sql = "SELECT * FROM cliente where cpf = '" + cpfInfo + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente objCliente = new Cliente();
                    objCliente.setIdCliente(rs.getInt("cod_cli"));
                    objCliente.setNome(rs.getString("nome"));
                    objCliente.setEndereco(rs.getString("endereco"));
                    objCliente.setCpf(rs.getString("cpf"));
                    objCliente.setCep(rs.getString("cep"));
                    objCliente.setEmail(rs.getString("email"));
                    objCliente.setNumEndereco(rs.getString("numero"));
                    objCliente.setSexo(rs.getString("sexo"));
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

    public static ArrayList<Cliente> buscarPorNome(String nomeInfo) {

        // CRUD_Cliente crud_cliente = new CRUD_Cliente();
        ArrayList<Cliente> listar = new ArrayList<>();
        Connection conexao = null;

        try {

            String sql = "SELECT * FROM cliente where nome = '" + nomeInfo + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Cliente objCliente = new Cliente();
                    objCliente.setIdCliente(rs.getInt("cod_cli"));
                    objCliente.setNome(rs.getString("nome"));
                    objCliente.setEndereco(rs.getString("endereco"));
                    objCliente.setCpf(rs.getString("cpf"));
                    objCliente.setCep(rs.getString("cep"));
                    objCliente.setEmail(rs.getString("email"));
                    objCliente.setNumEndereco(rs.getString("numero"));
                    objCliente.setSexo(rs.getString("sexo"));
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
    public static boolean excluir (int id){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061");
            PreparedStatement comando = conexao.
                    prepareStatement("DELETE FROM cliente WHERE cod_cli = ?");
            
            comando.setInt(1, id);
                        
            int linhasAfetadas = comando.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
        }
        
        
        return retorno;
    }
        public static boolean alterar(Cliente obj){
      boolean retorno = false;
        Connection conexao = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            
            PreparedStatement comando = conexao.
            prepareStatement("UPDATE cliente SET nome = ?, cpf =?, cep = ?, email = ?, endereco = ?, numero = ?, sexo = ?, complemento = ? WHERE cod_cli = ?");
          
            
            comando.setString(1, obj.getNome());
            comando.setString(2, obj.getCpf());
            comando.setString(3, obj.getCep());
            comando.setString(4, obj.getEmail());
            comando.setString(5, obj.getEndereco());
            comando.setString(6, obj.getNumEndereco());
            comando.setString(7, obj.getSexo());
            comando.setString(8, obj.getComplemento());
            
            int linhasAfetadas = comando.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco");
        }
        
        
        return retorno;
         
     }
}
