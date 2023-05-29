package Classes;

import java.util.ArrayList;

/*
Classes com informacoes do cliente
 */
public class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private String cep;
    private String email;
    private String numEndereco;
    private String sexo;
    private String complemento;
    private int idCliente;

    private ArrayList<Cliente> listaItens = null;

    public Cliente() {

    }

    /*
        construtor da classe
     */
    public Cliente(String nome, String endereco, String cpf, String cep, String email, String numEndereco, String sexo, String complemento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.numEndereco = numEndereco;
        this.sexo = sexo;
        this.complemento = complemento;
    }

    /*
        ArrayList para popular as informacoes do Cliente
     */
    public ArrayList<Cliente> getListaItens() {
        return listaItens;

    }

    public void setListaItens(ArrayList<Cliente> listaItens) {

    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(String numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}
