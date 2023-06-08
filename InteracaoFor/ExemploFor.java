/*package InteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void Exemplo1() {
        int i = 0;
        for (i = 0; i < 100; i++) {
            System.out.println("O nº da Interacao é " + i);
        }
    }

    public void Exercicio2() {
        double vetor[] = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + (i + 1) + "]=");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 9; 1 >= 0; i--) {
            System.out.println("vetor[" + (i + 1) + "]=" + vetor[i]);
        }
    }

    public void Exercicio3() {

        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a Nota " + (i + 1) + "do Aluno:");
            notas[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + "= " + notas[i]);
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("A media do Aluno e " + media);
    }

    public void Exercicio4() {
        int vetor[] = new int[10];
        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.next().charAt(0);
        }

        int contadorConsoantes = 0;
        String consoantes = "";

        for (int c : vetor) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O'
                    && c != 'U') {
                contadorConsoantes++;
                consoantes += c + " ";
            }
        }

        System.out.println("Foram lidas " + contadorConsoantes + " consoantes:");
        System.out.println(consoantes);
    }

    public void Exercicio5() {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        int impares[] = new int[10];

    }

    public void Palavra() {
        System.out.println("Digite uma Palavra");
        String palavra = sc.next();
        palavra.toLowerCase();
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            } else {
                cont++;
                System.out.println(c + " e consoante");
            }
        }
        System.out.println("O nº de Consoante é " + cont);
    }

    public void Exercicio6() {
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int vetorNPar[]=new int[20];
        int vetorNImpar[] = new int[20];
        for (int i = 0; i < vetorNumeros.length; i++){
            if(vetorNumeros[i]%2==0){
                vetorNPar[i]=vetorNumeros[i]{
                } else{
                    vetorNImpar[i]=vetorNumeros[i];
                }
            }
            for (int i = 0; i < vetorNumeros.length; i++) {
                System.out.println("vetor["+i+"]="+vetorNumeros[i]);
                System.out.println("vetorPar["+i+"]="+vetorNPar[i]);
                System.out.println("vetorImoar["+i+"]="+vetorNImpar[i]);
            }
        }
    }
    //exercico 5 com contador ctrl :; marca comentario
    public void Exercicio5contdor() {
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contImpar=0;
        int contPar=0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i]%2==0){
                contPar++;
            }else {
                contImpar++;
            }
            // criando os vetores com o tamanho correto
            int vetorNPar[] = new int[contPar];
            int vetorNImpar[] = new int[contImpar];
            // distribuindo os valores nos vetores
            contImpar=0;
            contPar=0;
            for (int i = 0; < vetorNumeros.length; i++) {
                if (vetorNumeros)
            }

        }
    }
}
*/