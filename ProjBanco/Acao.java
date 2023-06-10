package ProjBanco;

import java.util.Random;
import java.util.Scanner;

public class Acao {

        int cContaPJ;
        int cContaPF;
        String CNPJ;
        String CPF;
        double vSaldo;
        String fSaque;
        String fEmprestimo;
        String fDeposito;
        String nome;
        int nConta;
        int sConta;
        double valor;

        public Acao(int cContaPJ, int cContaPF, String cNPJ, String cPF, double vSaldo, String fSaque,
                        String fEmprestimo, String fDeposito, String nome, int nConta, int sConta, double valor) {
                this.cContaPJ = cContaPJ;
                this.cContaPF = cContaPF;
                CNPJ = cNPJ;
                CPF = cPF;
                this.vSaldo = vSaldo;
                this.fSaque = fSaque;
                this.fEmprestimo = fEmprestimo;
                this.fDeposito = fDeposito;
                this.nome = nome;
                this.nConta = nConta;
                this.sConta = sConta;
                this.valor = valor;
        }

        public Acao(int i, int j, Object object, Object object2, Object object3, Object object4, Object object5,
                        Object object6, Object object7, int k) {
        }

        public int getcContaPJ() {
                return cContaPJ;
        }

        public void setcContaPJ(int cContaPJ) {
                this.cContaPJ = cContaPJ;
        }

        public int getcContaPF() {
                return cContaPF;
        }

        public void setcContaPF(int cContaPF) {
                this.cContaPF = cContaPF;
        }

        public String getCNPJ() {
                return CNPJ;
        }

        public void setCNPJ(String cNPJ) {
                CNPJ = cNPJ;
        }

        public String getCPF() {
                return CPF;
        }

        public void setCPF(String cPF) {
                CPF = cPF;
        }

        public double getvSaldo() {
                return vSaldo;
        }

        public void setvSaldo(double vSaldo) {
                this.vSaldo = vSaldo;
        }

        public String getfSaque() {
                return fSaque;
        }

        public void setfSaque(String fSaque) {
                this.fSaque = fSaque;
        }

        public String getfEmprestimo() {
                return fEmprestimo;
        }

        public void setfEmprestimo(String fEmprestimo) {
                this.fEmprestimo = fEmprestimo;
        }

        public String getfDeposito() {
                return fDeposito;
        }

        public void setfDeposito(String fDeposito) {
                this.fDeposito = fDeposito;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getnConta() {
                return nConta;
        }

        public void setnConta(int nConta) {
                this.nConta = nConta;
        }

        public int getsConta() {
                return sConta;
        }

        public void setsConta(int sConta) {
                this.sConta = sConta;
        }

        public double getValor() {
                return valor;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public void criarPF() {
                Scanner ler = new Scanner(System.in);
                Random nConta = new Random();

                System.out.println("Informe seu nome: ");
                String nome = ler.nextLine();
                setNome(nome);

                System.out.println("Digite seu CPF: ");
                String CPF = ler.nextLine();
                setCPF(CPF);

                int nContaPF = nConta.nextInt(100000);
                setnConta(nContaPF);

                if (CPF != nome) {
                        System.out.println("Conta criada. O número da sua conta é: " + nContaPF);
                } else {
                        System.out.println("Erro.");
                }

        }

        public void criarPJ() {
                Scanner ler = new Scanner(System.in);
                Random nConta = new Random();

                System.out.println("Informe seu nome: ");
                String nome = ler.nextLine();
                setNome(nome);

                System.out.println("Digite seu CNPJ: ");
                String CNPJ = ler.nextLine();
                setCNPJ(CNPJ);

                int nContaPJ = nConta.nextInt(100000);
                setnConta(nContaPJ);
                if (CNPJ != nome) {
                        System.out.println("Conta criada. O número da sua conta é: " + nContaPJ);
                } else {
                        System.out.println("Erro.");
                }

        }

        public void depositar() {
                Scanner ler = new Scanner(System.in);
                System.out.println("Quanto deseja depositar: ");
                double valor = ler.nextDouble();

                double novoSaldo = getvSaldo() + valor;

                setvSaldo(novoSaldo);

                System.out.println("Depósito realizado. Novo saldo: " + getvSaldo());
        }

        public void sacar() {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite o valor a ser sacado: ");
                double valor = ler.nextDouble();

                if (getvSaldo() >= valor) {
                        double novoSaldo = getvSaldo() - valor;

                        setvSaldo(novoSaldo);
                        System.out.println("Saque realizado com sucesso. Saldo atual: " + getvSaldo());
                } else {
                        System.out.println("Saldo insuficiente.");
                }
        }

        public void saldo() {
                System.out.println(vSaldo);
        }

        public void buscarConta() {
                System.out.println("Número da conta: " + nConta);
                System.out.println("Saldo: " + vSaldo);
                System.out.println("Usuário: " + nome);
        }

        public void buscarPorNumero() {
                int c;
                Scanner ler = new Scanner(System.in);
                System.out.println("Buscar: ");
                c = ler.nextInt();
                if (c == nConta) {
                        System.out.println("Conta encontrada");
                        System.out.println("Número da conta: " + nConta);
                        System.out.println("Saldo: " + vSaldo);
                        System.out.println("Usuário: " + nome);
                } else {
                        System.out.println("Conta não localizada, verifica se realmente esse é o número dela.");
                }
        }
}
