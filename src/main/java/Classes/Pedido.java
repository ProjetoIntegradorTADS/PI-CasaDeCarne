package Classes;

/**
 *  Classe com informacoes do Pedido
 * 
 */
public class Pedido {
    private String numeroPedido;
        private int quantidade;
        private float valorTotal;
        private float precoKg;

        public float getPrecoKg() {
            return precoKg;
        }

        public void setPrecoKg(float precoKg) {
            this.precoKg = precoKg;
        }

        public String getNumeroPedido() {
            return numeroPedido;
        }

        public void setNumeroPedido(String numeroPedido) {
            this.numeroPedido = numeroPedido;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public float getValorTotal() {
            return valorTotal;
        }

        public void setValorTotal(float valorTotal) {
            this.valorTotal = valorTotal;
        }

}
