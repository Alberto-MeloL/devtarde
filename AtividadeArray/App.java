package AtividadeArray;
import javax.swing.JOptionPane;
public class App {
  public static void main(String[] args) {
//criar um objeto para a classe Pessoa.
Pessoa pessoa1 = new Pessoa("Fabiana", 1.67, 15 , 4 , 1997);
pessoa1.imprimir();
pessoa1.idade();
JOptionPane.showMessageDialog(null,"Idade: "+pessoa1.idade());
    }
  }


