package AtividadePOO;

import java.util.Random;
import java.util.Scanner;

public class AtividadePOO {
    private static final int Sortear = 0;
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int bound;

    public void att1() {
        System.out.println("Informe o tamanho da linha");
        int linha = sc.nextInt();
        System.out.println("Informe o tamanho da coluna");
        int coluna = sc.nextInt();
        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("|");
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("|");
            }
        }
    }

    public void att2() {
        int contador = 0;
        int nSorteado = rd.nextInt(1000) + 1;
       System.out.println("Digite o nº");
        int nDig = 0;
        while (nSorteado != nDig) {
            if (nDig == nSorteado) {
                System.out.println("Acertou.");
                System.out.println("em "+contador+" tentativas");
            } else if (nDig > nSorteado) {
                System.out.println("O nº digitado e menor que o numero sortedo");
                System.out.println("em "+contador+" tentativas");
            } else  {
                System.out.println("O nº digitado e menor que o numero sorteado");
                System.out.println("em "+contador+" tentativas");
            }
            contador++;
        }
    }

    public void att3() {

        Random random = new Random();

        int tamanho = random.nextInt(901) + 100;

        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Números pares:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        int paresImpares = 0;
        for (int i = 1; i < tamanho; i += 2) {
            if (vetor[i] % 2 == 0) {
                paresImpares++;
            }
        }
        System.out.println("Quantidade de números pares nas posições ímpares: " + paresImpares);

        int imparesPares = 0;
        for (int i = 0; i < tamanho; i += 2) {
            if (vetor[i] % 2 != 0) {
                imparesPares++;
            }
        }
        System.out.println("Quantidade de números ímpares nas posições pares: " + imparesPares);
    }
    ////////////////////////////////////////////////////////////////////////C-O-R-R-E-Ç-Ã-O/////////////////////////////////////////////////////////////////////////////////////

}
