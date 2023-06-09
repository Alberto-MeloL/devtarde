package ProjBanco;

import java.util.Random;
import java.util.Scanner;

public class Acao {

        int cContaPJ;
        int cContaPF;
        int CNPJ;
        int CPF;
        int vSaldo;
        int fSaque;
        int fEmprestimo;
        int fDeposito;
        int sConta;

        public Acao(int cContaPJ, int cContaPF) {
                this.cContaPJ = cContaPJ;
                this.cContaPF = cContaPF;
        }

        public int getCNPJ() {
                return CNPJ;
        }

        public void setCNPJ(int CNPJ) {
                this.CNPJ = CNPJ;
        }

        public int getCPF() {
                return CPF;
        }

        public void setCPF(int CPF) {
                this.CPF = CPF;
        }

        public int getvSaldo() {
                return vSaldo;
        }

        public void setvSaldo(int vSaldo) {
                this.vSaldo = vSaldo;
        }

        public int getfSaque() {
                return fSaque;
        }

        public void setfSaque(int fSaque) {
                this.fSaque = fSaque;
        }

        public int getfEmprestimo() {
                return fEmprestimo;
        }

        public void setfEmprestimo(int fEmprestimo) {
                this.fEmprestimo = fEmprestimo;
        }

        public int getfDeposito() {
                return fDeposito;
        }

        public void setfDeposito(int fDeposito) {
                this.fDeposito = fDeposito;
        }

        public int getsConta() {
                return sConta;
        }

        public void setsConta(int sConta) {
                this.sConta = sConta;
        }

        public void inicio() {
                vSaldo = 0;
                fSaque = 0;
                fEmprestimo = 0;
                fDeposito = 0;
        }

        //Criar conta
        public void criarPF(int cContaPF) { //tentar fazer com if/else
                Random random = new Random();
int nConta = random.nextInt(11);
Scanner ler = new Scanner(System.in);
            if(cContaPF == CPF){
                System.out.println("Conta criada, o número da sua conta é "+nConta);
            }else{
                System.out.println("Erro ao criar a conta.");
            }
                    
        }
        public void criarPJ(int cContaPJ) {
                Random random = new Random();
int nConta = random.nextInt(11);
                if (cContaPJ == CNPJ) {
                 System.out.println("Conta criada, o número da sua conta é "+nConta);       
                }else{
                        System.out.println("Erro ao criar a conta.");
                }
        }
        //Buscar conta
        public void buscar(int cContaPF , int contaPJ) {
             System.out.println("Digite o número da sua conta, para buscá-la.");   
        }
}