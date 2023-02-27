package Operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);

    public void calcular() {
        System.out.println("Informe a Nota 1 do Aluno");
        int Nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do Aluno");
        int Nota2 = sc.nextInt();
        // Operacao Aritmetica
        double media = (Nota1 + Nota2) / 2;
        // media = nota1
        // media += nota2
        // media /=2
        System.out.println("A media do Aluno e " + media);
        boolean mediaAprovada = media >=50;
        System.out.println("O Aluno esta aprovado por Nota? " + mediaAprovada);
        System.out.println("Informe a Frequencia do Aluno:");
        int Frequencia = sc.nextInt();
        boolean FrequenciaAprovada = Frequencia >=75;
        System.out.println("O Aluno esta aprovado por Frequencia:"
                + FrequenciaAprovada);
        Boolean resultadoFinal = (mediaAprovada == true) && (FrequenciaAprovada == true);
        System.out.println("O Aluno estra aprovado no Curso?"
                + resultadoFinal);
    

    }
}
