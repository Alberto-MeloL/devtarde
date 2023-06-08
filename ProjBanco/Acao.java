package ProjBanco;

public class Acao {

        int cContaPJ;
        int cContaPF;
        int pessPJ;
        int pessPF;
        int vSaldo;
        int fSaque;
        int fEmprestimo;
        int fDeposito;
        int sConta;

        public Acao(int cContaPJ, int cContaPF) {
                this.cContaPJ = cContaPJ;
                this.cContaPF = cContaPF;
        }

        public int getPessPJ() {
                return pessPJ;
        }

        public void setPessPJ(int pessPJ) {
                this.pessPJ = pessPJ;
        }

        public int getPessPF() {
                return pessPF;
        }

        public void setPessPF(int pessPF) {
                this.pessPF = pessPF;
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

        public void entrar() {
                vSaldo = 0;
                fSaque = 0;
                fEmprestimo = 0;
                fDeposito = 0;
        }

        //Criar conta
        public void criar(int p) {
                
        }
}
