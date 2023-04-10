package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void Exemplo1() {
        int i = 0;
        while (i > -1) {
            System.out.println("o nº de Iteraçao é " + i);
            i++;
            // i++ acrescenta mais 1
        }

    }

    public void Exemplo2() {
        int vetor[] = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("Informe o valor do indice" + i + " do vetor");
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i > 0) {
            System.out.println("O vetor[" + i + "]=" + vetor[i]);
            i++;
        }
        // while(i>0){
        // i--;
        // System.out.println("O vetor["+i+"]="+vetor[i]);

    }

    public void Exemplo3() {
        Random rd = new Random();
        int valorSorteado = rd.nextInt(10);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um numero:");
            int nDigitado = sc.nextInt();
            if (nDigitado == valorSorteado) {
                System.out.println("Acertou,parabens^_^");
                tenteNovamente = false;
            } else {
                System.out.println("Hmm,nao foi dessa vez:-(");
            }
        }
    }

}
