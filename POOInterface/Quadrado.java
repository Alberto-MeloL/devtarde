package POOInterface;

public class Quadrado implements FigurasGeometricas{
    int lado;
    

    public int getLado() {
        return lado;
    }
//p lugar que o construtor gera não faz diferença
    @Override // ele esta sobrepondo algo ja conhecido
    public Double getArea() {
        // TODO Auto-generated method stub
        int area = lado*lado;
        return area;
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub

        return "quadrado";
    }

    @Override
    public Double getPerimetro() {
        // TODO Auto-generated method stub
        int perimetro = lado*4;
        return perimetro;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
