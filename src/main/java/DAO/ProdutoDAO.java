
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
    static String Senha = "A@1090073061a";

    public static boolean adicionarEstoque(Produto obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO estoque (nomeProd,qntProd,vlrProd ) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

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
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comando = conexao.
                    prepareStatement("DELETE FROM estoque WHERE idProduto = ?");
            
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
     
  public static ArrayList<Produto> mostraTudo() {

        ArrayList<Produto> lista = new ArrayList<>();
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM estoque");
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto objProduto = new Produto();
                    objProduto.setCodProduto(rs.getInt("idProduto"));
                    objProduto.setNomeProduto(rs.getString("nomeProd"));
                    objProduto.setQuantidade(rs.getFloat("vlrProd"));
                    objProduto.setValorProduto(rs.getFloat("vlrProd"));
                    
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
  public static ArrayList<Produto> buscarPorNome(String nomeProd) {

       
        ArrayList<Produto> listar = new ArrayList<>();
        Connection conexao = null;

        try {

            // String cpf = cpfInfo;
            String sql = "SELECT * FROM estoque where nomeProd = '" + nomeProd + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            PreparedStatement comandoSQL = conexao.prepareStatement(sql);
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produto consultaPorNome = new Produto();
                    consultaPorNome.setCodProduto(rs.getInt("idProduto"));
                    consultaPorNome.setNomeProduto(rs.getString("nomeProd"));
                    consultaPorNome.setQuantidade(rs.getFloat("qntProd"));
                    consultaPorNome.setValorProduto(rs.getFloat("vlrProd"));
                 

                    listar.add(consultaPorNome);

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listar;
    }
  public static boolean alterar(Produto obj){
      boolean retorno = false;
        Connection conexao = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/casadecarne", "root", "A@1090073061a");
            
            PreparedStatement comando = conexao.
            prepareStatement("UPDATE estoque SET nomeProd = ?, qntProd =?, vlrProd = ? WHERE nomeProd = ?");
          
            
            comando.setString(1, obj.getNomeProduto());
            comando.setFloat(2, obj.getQuantidade());
            comando.setFloat(3, obj.getValorProduto());
            comando.setString(4, obj.getNomeProduto());
            
            
            
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


