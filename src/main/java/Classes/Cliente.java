package Classes;

import java.util.ArrayList;

/**
 * Classe com todas as informacoes do cliente
 * 
 */
public class Cliente {
        private String nome;
        private String endereco;
        private String cpf;
        private String cep;
        private String email;
        private String numEndereco;
        private boolean sexo;
        private String complemento;
        private int idCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
        
        private ArrayList<Cliente> listaItens = null;
       
        public Cliente(){
            
        }
        
        public Cliente(String nome, String endereco, String cpf, String cep,String email, String numEndereco, Boolean sexo, String complemento){
         this.nome = nome;
         this.endereco = endereco;
         this.cep = cpf;
         this.cep = cep;
         this.email = email;
         this.numEndereco = numEndereco;
         this.sexo = sexo;
         this.complemento = complemento;
        }
        public ArrayList <Cliente> getListaItens(){
            return listaItens;
            
        }
        public void setListaItens (ArrayList<Cliente> listaItens){
            
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

        public boolean getSexo() {
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
                    
        
        
}
