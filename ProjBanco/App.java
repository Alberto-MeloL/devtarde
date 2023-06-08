package ProjBanco;

public class App {
    public static void main(String[] args) {
     Acao acao1 = new Acao(0, 0); 
     acao1.inicio();
   boolean online = true;
   int acao = 0; //44
   while (online) {
       System.out.println(
               "1-Entrar\n 2-Sair\n 3-Buscar\n 4-Saque\n 5-Emprestimo");
       acao = System.out.println("");
       switch (acao) {
           case 1:
               acao1.entrar(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantas Pessoas")));
               break;
           case 2:
           acao1.sair(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantas Pessoas")));
               break;
           case 3:
               acao1.subir(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantos Andares")));
               break;
           case 4:
               acao1.descer(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantos Andares")));
               break;
           case 5:
               online = false;
           default:
               System.out.println("Informe uma ação existente");
               break;
       }
   }
}
}
}
}