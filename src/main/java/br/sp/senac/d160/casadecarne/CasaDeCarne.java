/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.sp.senac.d160.casadecarne;

/**
 *
 * @author saloma
 */
public class CasaDeCarne {

    public static void main(String[] args) {
        MenuPrincipal tela = new MenuPrincipal();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(MenuPrincipal.DO_NOTHING_ON_CLOSE);
        tela.setDefaultCloseOperation(MenuPrincipal.EXIT_ON_CLOSE);
    }

    public class Cliente {

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getcPF() {
            return cPF;
        }

        public void setcPF(String CPF) {
            this.cPF = CPF;
        }

        public String getcEP() {
            return cEP;
        }

        public void setcEP(String CEP) {
            this.cEP = CEP;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String Email) {
            this.email = Email;
        }

        public int getNumEndereco() {
            return numEndereco;
        }

        public void setNumEndereco(int numEndereco) {
            this.numEndereco = numEndereco;
        }

        public boolean isSexo() {
            return sexo;
        }

        public void setSexo(boolean sexo) {
            this.sexo = sexo;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }
        private String nome;
        private String endereco;
        private String cPF;
        private String cEP;
        private String email;
        private int numEndereco;
        private boolean sexo;
        private String complemento;

    }

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

}
