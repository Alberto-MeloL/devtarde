/*package PastaTeste.Bancojava;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        SistemaBancario sistemaBancario = new SistemaBancario();

        // Criação de alguns clientes e contas para teste
        Cliente cliente1 = new Cliente("João");
        Conta conta1 = new Conta("123456", 1000.0);
        cliente1.adicionarConta(conta1);

        Cliente cliente2 = new Cliente("Maria");
        Conta conta2 = new Conta("987654", 500.0);
        cliente2.adicionarConta(conta2);

        sistemaBancario.cadastrarCliente(cliente1);
        sistemaBancario.cadastrarCliente(cliente2);

        sistemaBancario.exibirClientes();

        // Simulação de operações bancárias
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();

        for (Cliente cliente : sistemaBancario.clientes) {
            for (Conta conta : cliente.getContas()) {
                if (conta.getNumero().equals(numeroConta)) {
                    conta.depositar(valorDeposito);
                    break;
                }
            }
        }

        sistemaBancario.exibirClientes();

        scanner.close();
    }

    private List<Cliente> clientes;

    public SistemaBancario(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public SistemaBancario() {
        clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Contas: ");
            for (Conta conta : cliente.getContas()) {
                System.out.println("Número: " + conta.getNumero());
                System.out.println("Saldo: " + conta.getSaldo());
            }
            System.out.println("--------------------------");
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "SistemaBancario [clientes=" + clientes + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SistemaBancario other = (SistemaBancario) obj;
        if (clientes == null) {
            if (other.clientes != null)
                return false;
        } else if (!clientes.equals(other.clientes))
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
}

class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class Cliente {
    private String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}
*/

