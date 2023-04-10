package ExemploVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    String Letra;

    public void exemplo1() {
        // Criar um Vetor com 5 nº inteiros
        int vetorInt[] = new int[5];// vetor vazio
        int vetorInt2[] = new int[] { 1, 2, 3, 4, 5 };
        // preenchendo o vetor Int 1º
        System.out.println("Preencha o vetor de 5 posições");
        vetorInt[0] = sc.nextInt();// 1º posicao indice 0
        vetorInt[1] = sc.nextInt();// 1º posicao indice 1
        vetorInt[2] = sc.nextInt();// 1º posicao indice 2
        vetorInt[3] = sc.nextInt();// 1º posicao indice 3
        vetorInt[4] = sc.nextInt();// 1º posicao indice 4
        System.out.println("O valor da primeira posição 0 é:" + vetorInt[0]);
        System.out.println("O valor da primeira posição 1 é:" + vetorInt[1]);
        System.out.println("O valor da primeira posição 2 é:" + vetorInt[2]);
        System.out.println("O valor da primeira posição 3 é:" + vetorInt[3]);
        System.out.println("O valor da primeira posição 4 é:" + vetorInt[4]);

    }

    public void exemplo2() {
        double vetorDouble[] = new double[10];
        System.out.println("Preencha o vetor de 10 posições");
        vetorDouble[9] = sc.nextDouble();
        vetorDouble[8] = sc.nextDouble();
        vetorDouble[7] = sc.nextDouble();
        vetorDouble[6] = sc.nextDouble();
        vetorDouble[5] = sc.nextDouble();
        vetorDouble[4] = sc.nextDouble();
        vetorDouble[3] = sc.nextDouble();
        vetorDouble[2] = sc.nextDouble();
        vetorDouble[1] = sc.nextDouble();
        vetorDouble[0] = sc.nextDouble();
        System.out.println("O valor da 10ª posição   9 é:" + vetorDouble[0]);
        System.out.println("O valor da 9ª  posição   8 é:" + vetorDouble[1]);
        System.out.println("O valor da 8ª  posição   7 é:" + vetorDouble[2]);
        System.out.println("O valor da 7ª  posição   6 é:" + vetorDouble[3]);
        System.out.println("O valor da 6ª  posição   5 é:" + vetorDouble[4]);
        System.out.println("O valor da 5ª  posição   4 é:" + vetorDouble[5]);
        System.out.println("O valor da 4ª  posição   3 é:" + vetorDouble[6]);
        System.out.println("O valor da 3ª  posição   2 é:" + vetorDouble[7]);
        System.out.println("O valor da 2ª  posição   1 é:" + vetorDouble[8]);
        System.out.println("O valor da 1ª  posição   0 é:" + vetorDouble[9]);

    }

    public void extra1() {

       int vetorA[]= new int[]{5,10,15,20,25};
       int vetorB[]= new int[5];
       vetorA[0] =  vetorB[0];
       vetorA[1] =  vetorB[1];
       vetorA[2] =  vetorB[2];
       vetorA[3] =  vetorB[3];
       vetorA[4] =  vetorB[4];
       System.out.println("O valor da primeira posição 0 é:" + vetorA[0] );
        System.out.println("O valor da primeira posição 1 é:" + vetorA[1]);
        System.out.println("O valor da primeira posição 2 é:" + vetorA[2]);
        System.out.println("O valor da primeira posição 3 é:" + vetorA[3]);
        System.out.println("O valor da primeira posição 4 é:" + vetorA[4]);


    }

}
