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
        int acessarConta = 0;

        while (online) {
            System.out.println("+===============================+");
            System.out.println(" 1- Criar PF");
            System.out.println(" 2- Criar PJ");
            System.out.println(" 3- Depósito");
            System.out.println(" 4- Saque");
            System.out.println(" 5- Saldo");
            System.out.println(" 6- Informações da conta");
            System.out.println(" 7- Buscar por número da conta");
            System.out.println(" 8- Empréstimo");
            System.out.println("+===============================+");
            // Lógica para receber entrada do usuário e atualizar o valor de 'acao'
            Scanner ler = new Scanner(System.in);
            acao = ler.nextInt();
            switch (acao) {
                case 1:
                    acao1.criarPF();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 2:
                    acao1.criarPJ();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
            }
            switch (acessarConta) {
                case 3:
                    acao1.depositar();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 4:
                    acao1.sacar();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 5:
                    acao1.saldo();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 6:
                    acao1.buscarConta();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 7:
                    acao1.buscarPorNumero();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 8:
                    acao1.emprestimo();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
            }

        }
    }
}
