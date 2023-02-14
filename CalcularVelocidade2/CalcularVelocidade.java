package CalcularVelocidade2;
import java.util.Scanner;


public class CalcularVelocidade {
    Scanner sc = new Scanner(System.in);
    public void calcular(){
        System.out.println("Informe a distancia percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("informe o tempo gasto");
        double tempoGasto = sc.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("a velocidade media e" + velocidadeMedia +  "km/h");

    }
    public void destino(){
        System.out.println("Informe o Ponto de Partida");
        String origem = sc.nextLine();
        System.out.println("Informe o Ponto de Destino");
        String destino = sc.nextLine();
        System.out.println("Sua Viagem e de " + origem + " a " + destino);

    }
}
