package Array.AtividadeArray;

import javax.swing.JOptionPane;

public abstract class Pessoa {
    private String nome; //ela e maiuscula pq ela nao e primitiva
    private double altura;
    private int diaNaccimento;
    private int mesNascimento;
    private int anoNascimento; // por norma criar sempre em linha separada
    //Construtor mesmo nome da classe:
    public Pessoa(String nome, double altura, int diaNaccimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.diaNaccimento = diaNaccimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
   //Construtor vazio:
   //posso ter quanto eu quiser / get, set:um para cada metodo.
   public Pessoa(){
    
   }
   //getters and setters: (get sao para pegar, set para atribuir)
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}
public int getDiaNaccimento() {
    return diaNaccimento;
}
public void setDiaNaccimento(int diaNaccimento) {
    this.diaNaccimento = diaNaccimento;
}
public int getMesNascimento() {
    return mesNascimento;
}
public void setMesNascimento(int mesNascimento) {
    this.mesNascimento = mesNascimento;
}
public int getAnoNascimento() {
    return anoNascimento;
}
public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
}
//métodos imprimir
public void imprimir(){
   // System.out.println("Nome:" +nome+""); // O JOptionPane não funciona no codespace.
   JOptionPane.showMessageDialog(null, "Nome:"+nome);
   JOptionPane.showMessageDialog(null, "Altura:"+altura);
   JOptionPane.showMessageDialog(null, "Nascimento:"+diaNaccimento+"/"+mesNascimento+"/"+anoNascimento);
}
//metodo para calcular a idade:
public int idade(){
    int calculo;
    if(diaNaccimento<=5 && mesNascimento<=6){
         calculo = 2023 - anoNascimento;
    }else{
        calculo = 2023 - anoNascimento - 1;
    }
    return calculo;
}
 
}
   

