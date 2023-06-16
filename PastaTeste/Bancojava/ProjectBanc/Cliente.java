package ProjectBanc;

public class Cliente {
     String nome;
     String cpf;
     String cnpj;
     String diaNascimento;
     String mesNascimento;
     String anoNascimento;

    // Construtor
    public Cliente(String nome, String cpf, String cnpj, String diaNascimento, String mesNascimento,
            String anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
