package Classes;

import java.util.ArrayList;

/**
 * Classe com todas as informacoes do cliente
 * 
 */
public class Cliente {
        private String nome;
        private String endereco;
        private String cPF;
        private String cEP;
        private String email;
        private int numEndereco;
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
        
        public Cliente(String nome, String endereco, String CPF, String CEP, int numEndereco, Boolean sexo, String complemento){
         this.nome = nome;
         this.endereco = endereco;
         this.cPF = CPF;
         this.cEP = CEP;
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

        public String getCPF(String toString) {
            return cPF;
        }

        public void setCPF(String CPF) {
            this.cPF = CPF;
        }

        public String getCEP(String toString) {
            return cEP;
        }

        public void setCEP(String CEP) {
            this.cEP = CEP;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String Email) {
            this.email = Email;
        }

        public int getNumEndereco(String toString) {
            return numEndereco;
        }

        public void setNumEndereco(int numEndereco) {
            this.numEndereco = numEndereco;
        }

        public boolean getSexo(String toString) {
            return sexo;
        }

        public void setSexo(boolean sexo) {
            this.sexo = sexo;
        }

        public String getComplemento(String toString) {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }
                    
        
        
}
