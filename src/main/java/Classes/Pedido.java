package Classes;

/**
 *  Classe com informacoes do Pedido
 * 
 */
public class Pedido {
    private String numeroPedido;
        private int quantidade;
        private float valorTotal;
        private float preçoKG;

        public float getPreçoUnitario() {
            return preçoKG;
        }

        public void setPreçoUnitario(float preçoUnitario) {
            this.preçoKG = preçoUnitario;
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
