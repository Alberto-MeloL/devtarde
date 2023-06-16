package PastaTeste.POOInterface;

public class Trapezio implements FigurasGeometricas{
   int baseMaior;
   int baseMenor;
   int altura;
   int lado1;
   int lado2; 
   public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
    this.baseMaior = baseMaior;
    this.baseMenor = baseMenor;
    this.altura = altura;
    this.lado1 = lado1;
    this.lado2 = lado2;
    
}
@Override
public Double getArea() {
    // TODO Auto-generated method stub
    return (double) ((baseMaior+baseMenor)*altura/2);

}
@Override
public String getNomeFigura() {
    // TODO Auto-generated method stub
    return "Trapézio";
}
@Override
public Double getPerimetro() {
    // TODO Auto-generated method stub
    return (double) (baseMaior+baseMenor+lado1+lado2);
}

   
}
