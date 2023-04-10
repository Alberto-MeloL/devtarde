package IteracaoWhile;

import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class ExercicioWhile {
    public void ExercicioWhile() {
        int vetorA[] = new int[] { 5, 7, 9, 10, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < 5) {
            vetorB[i] = vetorA[i];
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
        }
    }

    public void ExercicioWhile2() {
        int vetorA[] = new int[] { 2, 4, 8, 16, 32, 64, 128, 256 };
        int vetorB[] = new int[8];
        int i = 0;
        while (i < 8) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void ExercicioWhile3() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < 15) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void ExercicioWhile4() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < 15) {
            vetorB[i] = (vetorA[i]);
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void ExercicioWhile5() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < 15) {
            vetorB[i] = vetorA[i] + i;
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void ExercicioWhile6() {
        int vetorA[] = new int[] {0,1,2,3,4,5,6,7,8,9};
        int vetorB[] = new int[]{0,1,2,3,4,5,6,7,8,9};
        int vetorC[] = new int[10];
        int i = 0;
        while(i<10){
            vetorC[i]=vetorA[i]+vetorB[i];
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
            i++;
        } 
    }
}