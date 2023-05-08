package MatrizExemplos;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // exemplo de criação/preenchimento/impressão de matriz
        // declara a minha matriz de 2 dimensões
        int tab[][] = new int[10][9];
        // preencher a matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                // System.out.print("tab["+i+"]["+j+"]=");
                tab[i][j] = rd.nextInt(9);
                // preencher o valor na posição
            }
        }
        // Imprimir a minha matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.println("tab[" + i + "][" + j + "]=" + tab[i][j]);
            }
        }
        // Imprimindo em Formato de Matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void Exemplo2() {
        int tab[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    tab[i][j] = 1;

                } else {
                    tab[i][j] = 0;
                }

            }
            
        }

        for (

                int i = 0; i < 5; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void Exemplo3() {
        int A[][] = new int[4][4];// length porq sao =
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.println(1234);
                }

            }
    
        }
        for (

        int i = 0; i < 4; i++) {
    // laço vai percorrer a 1ª dimensão da matriz
    System.out.print("| ");
    for (int j = 0; j < 4; j++) {
        // laço vai preencher a 2º dimensão da matriz
        System.out.print(+A[i][j] + " ");
    }
    System.out.println("|");
}
}

public void Exemplo4() {
    
}



public class MatrizExemplo1 {
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
                tab[i][j]=rd.nextInt(9);//preencher o valor na posição               
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
            System.out.println("|");       
        }
    }
        // criar um matriz identidade 5x5 
        //diagonal principal é igual a 1 e d+ 0
    public void exemplo2a() {
        //declarar a matriz
        int matriz [][]=new int [5][5];
        //preencher a matriz
        for (int i = 0; i < matriz.length; i++) {//linha
            for (int j = 0; j < matriz.length; j++) {//coluna
                //comparação usando if
                if(i==j){ // diagonal principal
                    matriz[i][j]=1;
                } else{ // d+ elementos
                    matriz[i][j]=0;
                }
            }
        }
        //imprimir a Matriz
        for (int i = 0; i < matriz.length; i++) {//linha
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {//coluna
                //Imprimir linha por linha
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" |");
        }

    }
    //criar uma matriz 4x4 imprimri ela e sua transposta
    public void ex3() {
        //declarar a matriz
        int matriz[][]= new int[4][4];
        //preenchimento da matriz
        for (int i = 0; i < matriz.length; i++) {
            //precorrer as linhas
            for (int j = 0; j < matriz.length; j++) {
                //percorrer as colunas da linha
                matriz[i][j]=rd.nextInt(10);
            }
        }
        System.out.println("+++++++++++++++++++++++++++++");
        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {//linha
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {//coluna
                //Imprimir linha por linha
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("++++++++++++++++++++++");
        //imprimir a matriz transposta
        for (int i = 0; i < matriz.length; i++) {//linha
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {//coluna
                //Imprimir linha por linha
                System.out.print(" "+matriz[j][i]);
            }
            System.out.println(" |");
        }
        System.out.println("++++++++++++++++++++");
        //soma dos elementos da diagonal principal
        int somaDig = 0;
        int somaDigInf = 0;
        int somaDigSup = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //diagonal principal é i==j
                if(i==j){//diagonal principal
                    somaDig+=matriz[i][j];
                } else if(i>j){//nº da inferior diagonal
                    somaDigInf+=matriz[i][j];
                } else{//nº da superior diagonal
                    somaDigSup+=matriz[i][j];
                }
            }
        }
        System.out.println(" A soma da Diagonal é "+somaDig);
        System.out.println(" A soma dos nº Inferiores a diagonal é "+somaDigInf);
        System.out.println(" A soma dos nº Superiores a diagonal é "+somaDigSup);
    }
}

    }


