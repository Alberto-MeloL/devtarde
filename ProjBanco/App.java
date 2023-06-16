package ProjBanco;

import java.util.Scanner;

public class App extends Acao {
    public App(int cContaPJ, int cContaPF, String cNPJ, String cPF, String vSaldo, String fSaque, String fEmprestimo,
            String fDeposito, String nome, int sConta) {
        super(cContaPJ, cContaPF, cNPJ, cPF, vSaldo, fSaque, fEmprestimo, fDeposito, nome, sConta);
    }

    public static void main(String[] args) {
        Acao acao1 = new Acao(0, 0, null, null, null, null, null, null, null, 0);
        boolean online = true;
        int acao = 0;

        while (online) {
            System.out.println("+===============================+");
            System.out.println(" 1- Criar PF");
            System.out.println(" 2- Acessar PJ");
            System.out.println(" 3- Acessar conta");
            System.out.println(" 4- Depósito");
            System.out.println(" 5- Saque");
            System.out.println(" 6- Saldo");
            System.out.println(" 7- Informações da conta");
            System.out.println(" 8- Buscar por número da conta");
            System.out.println(" 9- Empréstimo");
            System.out.println(" 10- Criar PF");
            System.out.println(" 11- Acessar PJ");
            System.out.println(" 12- Sair ");
            System.out.println("+===============================+");

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
                case 3:
                    acao1.acessarPF();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;

                case 4:
                    acao1.depositar();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 5:
                    acao1.sacar();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 6:
                    acao1.saldo();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 7:
                    acao1.buscarConta();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 8:
                    acao1.buscarPorNumero();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 9:
                    acao1.emprestimo();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 10:
                    acao1.acessarPF();
                    System.out.println("\n+==========Banco Senai==========+");
                    break;
                case 11:
                    online = false;
                    System.out.println("Você saiu da sua conta.");
                    break;
                    default: System.out.println("Informação inválida.");
            }

        }

    }
}
