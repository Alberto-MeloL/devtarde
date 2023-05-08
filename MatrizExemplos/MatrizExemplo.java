package MatrizExemplos;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    public void exemplo1() {
        //exemplo de criação/preenchimento/impressão de matriz
        //declara a minha matriz de 2 dimensões
        int tab[][]=new int[10][9];
        //preencher a matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                //System.out.print("tab["+i+"]["+j+"]=");
                tab[i][j]=rd.nextInt(1,9);//preencher o valor na posição               
            }          
        }
        //Imprimir a minha matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.println("tab["+i+"]["+j+"]="+tab[i][j]);              
            }          
        }
        //Imprimindo em Formato de Matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");   
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j]+" ");              
            }   
            System.out.println(" |");       
        }
    }
}
