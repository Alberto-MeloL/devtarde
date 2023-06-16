/*package AtividadeArray03;

public class App {
  //construir o elevador
   // construir o elevador
   Elevador elevador1 = new Elevador(10, 10);
   elevador1.iniciar();
   boolean ligado = true;
   int acao = 0; //44
   
   while (ligado) {
       System.out.println(
               "1-Entrar\n 2-Sair\n 3-Subir\n 4-Descer\n 5-Desligar");
       acao = System.out.println("");
       switch (acao) {
           case 1:
               elevador1.entrar(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantas Pessoas")));
               break;
           case 2:
               elevador1.sair(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantas Pessoas")));
               break;
           case 3:
               elevador1.subir(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantos Andares")));
               break;
           case 4:
               elevador1.descer(
               Integer.parseInt(JOptionPane.showInputDialog(
               "Informe Quantos Andares")));
               break;
           case 5:
               ligado = false;
           default:
               JOptionPane.showMessageDialog(
                   null,"Informe Uma Ação Existente");
               break;
       }
   }
}
}
*/

