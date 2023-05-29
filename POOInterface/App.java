package POOInterface;

public class App {
    public static void main(String[] args) {
       Quadrado figura1 = new Quadrado(7);
       System.out.println("Nome Figura é "+figura1.getNomeFigura()
       +"\n Area = "+figura1.getArea()
       +"\n Perimetro = "+figura1.getPerimetro());
       //
       Retangulo figura2 = new Retangulo(7, 7);
       System.out.println("Nome Figura é "+figura2.getNomeFigura()
       +"\n Area = "+figura2.getArea()
       +"\n Perimetro = "+figura2.getPerimetro());
    }
}
