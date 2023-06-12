package ProjBanco;

import java.util.Scanner;

public class App extends Acao {
    public App(int cContaPJ, int cContaPF, String cNPJ, String cPF, String vSaldo, String fSaque, String fEmprestimo,
            String fDeposito, String nome, int sConta) {
        super(cContaPJ, cContaPF, cNPJ, cPF, vSaldo, fSaque, fEmprestimo, fDeposito, nome, sConta);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Acao acao1 = new Acao(0, 0, null, null, null, null, null, null, null, 0);
        boolean online = true;
        int acao = 0;

        while (online) {
            System.out.println(
                    "===============================\n 1-CriarPF\n 2-CriarPJ\n 3-Depósito\n 4-Saque\n 5-Saldo\n 6-Buscar conta\n 7-Buscar por número da conta\n 8-Empréstimo\n ===============================\nSua opção: ");
            // Lógica para receber entrada do usuário e atualizar o valor de 'acao'
            Scanner ler = new Scanner(System.in);
            acao = ler.nextInt();
            switch (acao) {
                case 1:
                    acao1.criarPF();
                    System.out.println("\n----------------------------|");
                    break;
                case 2:
                    acao1.criarPJ();
                    System.out.println("----------------------------|");
                    break;
                case 3:
                    acao1.depositar();
                    System.out.println("\n----------------------------|");
                    break;
                case 4:
                    acao1.sacar();
                    System.out.println("\n----------------------------|");
                    break;
                case 5:
                    acao1.saldo();
                    System.out.println("\n----------------------------|");
                    break;
                case 6:
                    acao1.buscarConta();
                    System.out.println("\n----------------------------|");
                    break;
                case 7:
                    acao1.buscarPorNumero();
                    System.out.println("\n----------------------------|");
                    break;
                case 8:
                    acao1.emprestimo();
                    System.out.println("\n----------------------------|");
                    break;
            }
        }
    }
}
