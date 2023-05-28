package Classes;

import java.util.ArrayList;

/**
 * Classe com informacoes do Pedido
 *
 */
public class Pedido {
     private ArrayList<Pedido> listaItens = null;

    public ArrayList<Pedido> getListaProdutos() {
        return listaItens;
    }

    public void setListaProdutos(ArrayList<Pedido> listaProdutos) {
        this.listaItens = listaProdutos;
    }

    public Pedido() {

    }

    private int idPedido;
    private String cpfCliente;
    private String nomeProd;
    private int quantidade;
    private float valorTotal;
    private float precoKg;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public float getPrecoKg() {
        return precoKg;
    }

    public void setPrecoKg(float precoKg) {
        this.precoKg = precoKg;
    }

    public int getNumeroPedido() {
        return idPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.idPedido = numeroPedido;
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

    public Pedido(int idPedido, String cpfCliente, String nomeProd, int quantidade, float valorTotal, float precoKg) {
        this.idPedido = idPedido;
        this.cpfCliente = cpfCliente;
        this.nomeProd = nomeProd;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.precoKg = precoKg;
    }
}
