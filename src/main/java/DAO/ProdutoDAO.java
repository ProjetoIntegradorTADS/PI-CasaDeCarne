
package DAO;

import Classes.Cliente;
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

/**
 *
 * @author SALOMAO.FLIMA
 */
public class ProdutoDAO {

    static String URL = "jdbc:mysql://localhost:3306/casadecarne";
    static String Login = "root";
    static String Senha = "p@$$w0rd";

    public static boolean adicionarEstoque(Produto obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO estoque (nome_prod,quantidade,valorPorKg ) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, obj.getNomeProduto());
            comandoSQL.setFloat(2, obj.getQuantidade());
            comandoSQL.setFloat(3, obj.getValorProduto());

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
     public static boolean excluir (int id){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "p@$$w0rd");
            PreparedStatement comando = conexao.
                    prepareStatement("DELETE FROM estoque WHERE cod_prod = ?");
            
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
     public static boolean alterar(Produto obj){
      boolean retorno = false;
        Connection conexao = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "p@$$w0rd");
            
            PreparedStatement comando = conexao.
            prepareStatement("UPDATE estoque SET nomeProd = ?, qntProd =?, vlrProd = ?, WHERE cod_prod = ?");
           
            
            comando.setString(1, obj.getNomeProduto());
            comando.setFloat(2, obj.getQuantidade());
            comando.setFloat(3, obj.getValorProduto());
    
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
  public static ArrayList<Produto> mostraTudo() {

        ArrayList<Produto> lista = new ArrayList<>();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "p@$$w0rd");
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM estoque");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto objProduto = new Produto();
                    objProduto.setCodProduto(rs.getInt("cod_prod"));
                    objProduto.setNomeProduto(rs.getString("nome_prod"));
                    objProduto.setQuantidade(rs.getFloat("quantidade"));
                    objProduto.setValorProduto(rs.getFloat("valorPorKg"));
                    
                    lista.add(objProduto);

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
}
