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
        double fEmprestimo;
        String fDeposito;
        String nome;
        int nConta;
        String sConta;
        double valor;
        int senha;

        public Acao(int cContaPJ, int cContaPF, String cNPJ, String cPF, double vSaldo, String fSaque,
                        double fEmprestimo, String fDeposito, String nome, int nConta, String sConta, double valor,
                        int senha) {
                this.cContaPJ = cContaPJ;
                this.cContaPF = cContaPF;
                this.CNPJ = CNPJ;
                this.CPF = CPF;
                this.vSaldo = vSaldo;
                this.fSaque = fSaque;
                this.fEmprestimo = fEmprestimo;
                this.fDeposito = fDeposito;
                this.nome = nome;
                this.nConta = nConta;
                this.sConta = sConta;
                this.valor = valor;
                this.senha = senha;
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

        public double getfEmprestimo() {
                return fEmprestimo;
        }

        public void setfEmprestimo(double fEmprestimo) {
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

        public String getsConta() {
                return sConta;
        }

        public void setsConta(String sConta) {
                this.sConta = sConta;
        }

        public double getValor() {
                return valor;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public int getSenha() {
                return senha;
        }

        public void setSenha(int senha) {
                this.senha = senha;
        }

        public void acesso() {
                String[] nome = { "nome1" }; // Vetor com os nomes de usuário
                String[] senha = { "senha" }; // Vetor com as senhas correspondentes
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite seu nome: ");
                String nomeDig = ler.next();
                System.out.println("Digite sua senha: ");
                int senhaDig = ler.nextInt();

                if (nomeDig.equals(getNome()) && senhaDig == getSenha()) {
                        System.out.println("Acesso aprovado.");
                } else {
                        System.out.println("Usuário ou senha inválidos.");
                }

        }

        public void criarPF() {
                Scanner ler = new Scanner(System.in);
                Random nConta = new Random();

                System.out.println("Informe seu nome: ");
                String nome = ler.nextLine();
                setNome(nome);

                System.out.println("Digite seu CPF: ");
                System.out.println("Ex: xxx.xxx.xxx-xx");
                String CPF = ler.nextLine();
                setCPF(CPF);

                System.out.print("Escolha uma senha: ");
                int senhaa = ler.nextInt();
                setSenha(senhaa);

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
                System.out.println("Ex: XX. XXX. XXX/0001-XX");
                String CNPJ = ler.nextLine();
                setCNPJ(CNPJ);

                System.out.print("Escolha uma senha: ");
                int senhaa = ler.nextInt();
                setSenha(senhaa);
                setcContaPJ(nome, CNPJ, senhaa);
                int nContaPJ = nConta.nextInt(100000);
                setnConta(nContaPJ);
                if (CNPJ != nome) {
                        System.out.println("Conta criada. O número da sua conta é: " + nContaPJ);
                } else {
                        System.out.println("Erro.");
                }

        }

        private void setcContaPJ(String nome2, String cNPJ2, int senhaa) {
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
                System.out.println("Seu saldo é de: " + vSaldo);
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

        public void emprestimo() {
                System.out.println(
                                "Empréstimo min: R$ 500 max: R$ 5000.\nEmpréstimo de imediato, com juros de 5% ao mês.");
                Scanner ler = new Scanner(System.in);
                System.out.println("Quanto você deseja emprestar: ");
                double vEmprestimo = ler.nextDouble();
                if (vEmprestimo < 500) {
                        System.out.println("(Erro)Empréstimo minímo R$ 500,00.");
                } else if (vEmprestimo > 5000) {
                        System.out.println("(Erro).Empréstimo máximo R$ 5000,00.");
                } else {
                        double novoSaldo = getvSaldo() + vEmprestimo;
                        setvSaldo(novoSaldo);
                        System.out.println("O juros será combrado até que efetue o pagamento.");
                }

        }
public void acessarPF() {
          String[] nome = { "nome1" }; // Vetor com os nomes de usuário
                String[] senha = { "senha" }; // Vetor com as senhas correspondentes
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite seu nome: ");
                String nomeDig = ler.next();
                System.out.println("Digite sua senha: ");
                int senhaDig = ler.nextInt();

                if (nomeDig.equals(getNome()) && senhaDig == getSenha()) {
                     System.out.println("a");
                } else {
                        System.out.println("Usuário ou senha inválidos.");
                }
}

}
