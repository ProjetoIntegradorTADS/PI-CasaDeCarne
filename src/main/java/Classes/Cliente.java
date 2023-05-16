package Classes;

/**
 * Classe com todas as informacoes do cliente
 * 
 */
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
