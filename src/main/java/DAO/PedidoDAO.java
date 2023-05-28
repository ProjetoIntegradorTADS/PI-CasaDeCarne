package DAO;

import Classes.Pedido;
import Classes.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author SALOMAO.FLIMA
 */
public class PedidoDAO {

    static String URL = "jdbc:mysql://localhost:3306/casadecarne";
    static String Login = "root";
    static String Senha = "A@1090073061a";

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
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ta tudo errado po");
        }

        return retorno;

    }

    public static ArrayList<Pedido> buscarPorCpf(String cpfPed) {

        ArrayList<Pedido> listarPorCpf = new ArrayList<>();
        Connection conexao = null;

        try {

            String sql = "SELECT * FROM estoque where fk_cpf = '" + cpfPed + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, Login, Senha);
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Pedido consultaPorCpf= new Pedido();
                    consultaPorCpf.setNumeroPedido(rs.getInt("idPedido"));
                    consultaPorCpf.setCpfCliente(rs.getString("fk_cpf"));
                    consultaPorCpf.setNomeProd(rs.getString("fk_NomeProd"));
                    consultaPorCpf.setQuantidade(rs.getInt("qntPed"));
                    consultaPorCpf.setPrecoKg(rs.getFloat("fk_PrecoKg"));
                    consultaPorCpf.setValorTotal(rs.getFloat("vlrTotal"));
                    listarPorCpf.add(consultaPorCpf);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listarPorCpf;
    }
     public static ArrayList<Pedido> mostrarLista() {

        ArrayList<Pedido> lista = new ArrayList<>();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * From estoque;");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Pedido objPedido = new Pedido();
                    objPedido.setNomeProd(rs.getString("nomeProd"));
                  
                    lista.add(objPedido);

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}


       
    



        
      


    
