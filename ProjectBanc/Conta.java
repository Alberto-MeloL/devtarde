package ProjectBanc;

public class Conta {
    String saldo;
    String deposito;
    String emprestimo;
    String saque;
    String sair;

    // Construtor
    public Conta(String saldo, String deposito, String emprestimo, String saque, String sair) {
        this.saldo = saldo;
        this.deposito = deposito;
        this.emprestimo = emprestimo;
        this.saque = saque;
        this.sair = sair;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public String getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(String emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    public String getSair() {
        return sair;
    }

    public void setSair(String sair) {
        this.sair = sair;
    }

}
