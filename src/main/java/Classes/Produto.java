
package Classes;

import java.util.ArrayList;

/* Classe com informacoes do Produto  */

    

public class Produto {
    
   

        private ArrayList<Produto> listaProdutos = null;

        public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

        public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
       
        public Produto(){
            
        }
        
        
        
    public Produto(int codProduto, String nomeProduto, float valorProduto, float quantidade) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
    }
        private int codProduto;
        private String nomeProduto;
        private float valorProduto;
        private float quantidade;

        public int getCodProduto() {
            return codProduto;
        }

        public void setCodProduto(int codProduto) {
            this.codProduto = codProduto;
        }
        public String getNomeProduto() {
            return nomeProduto;
        }

        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }

        public float getValorProduto() {
            return valorProduto;
        }

        public void setValorProduto(float valorProduto) {
            this.valorProduto = valorProduto;
        }

        public float getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(float quantidade) {
            this.quantidade = quantidade;
        }
         
      
        }

