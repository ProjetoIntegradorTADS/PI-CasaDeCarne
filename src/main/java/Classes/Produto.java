
package Classes;

/**
 * Classe com informacoes do Produto
 * 
 */
public class Produto {
        private String codProduto;
        private String nomeProduto;
        private float valorProduto;
        private float quantidade;

        public String getCodProduto() {
            return codProduto;
        }

        public void setCodProduto(String codProduto) {
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
