package AtividadeArray03;

public class Elevador {
   // construir o elevador
   // atributos do elevador
   int nMaxAndares;
   int nMaxPessoas;
   int andarAtual;
   int capacidadeAtual;

   // cosntrutor
   public Elevador(int nMaxAndares, int nMaxPessoas) {
       this.nMaxAndares = nMaxAndares;
       this.nMaxPessoas = nMaxPessoas;
   }

   // construir os métodos
   // set and gets
   public int getAndarAtual() {
       return andarAtual;
   }

   public void setAndarAtual(int andarAtual) {
       this.andarAtual = andarAtual;
   }

   public int getCapacidadeAtual() {
       return capacidadeAtual;
   }

   public void setCapacidadeAtual(int capacidadeAtual) {
       this.capacidadeAtual = capacidadeAtual;
   }

   // métodos adicionais
   // iniciar
   public void name() {
       capacidadeAtual = 0;
       andarAtual = 0;
   }

   // entrar
   public void entrar(int pessoas) {
       if ((capacidadeAtual + pessoas) >= nMaxPessoas) {
           JOptionPane.showMessageDialog(null, "Capacidade Máxima Atingida");
           JOptionPane.showMessageDialog(null, "Pessoas para fora"
                   + (capacidadeAtual + pessoas - nMaxPessoas));
       } else {
           capacidadeAtual += pessoas;
       }
   }

   // sair
   public void sair(int pessoas) {
       if (pessoas < capacidadeAtual) {
           capacidadeAtual -= pessoas;
       } else {
           JOptionPane.showMessageDialog(null, "Informe um nº válido, Quantidade atual: "
           +capacidadeAtual);
       }
   }
   //subir
   public void subir(int nAndares) {
       if(nAndares+andarAtual>nMaxAndares){
           JOptionPane.showMessageDialog(null, "Não Pode subir");
           JOptionPane.showMessageDialog(null, "Andar Atual "+andarAtual);
       }else{
           andarAtual+=nAndares;
       }
   }
   //descer
   public void descer(int nAndares) {
       if (nAndares< andarAtual) {
           andarAtual -= nAndares;
       } else {
           JOptionPane.showMessageDialog(null, "Informe um nº válido, Andar atual: "
           +andarAtual);
       }
   }

}
