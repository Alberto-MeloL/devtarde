package ExerciciosIfElse;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Primeiro Valor");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Segundo Valor");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("o primeiro valor e maior " + valor1);

        } else {
            System.out.println("o segundo valor e maior " + valor2);
        }

    }

    public void exercicio2() {
        System.out.println("qual ano voce nasceu");
        int anoNascimento = sc.nextInt();
        int resultado = 2023 - anoNascimento;
        if (resultado >= 16) {
            System.out.println(" voce pode votar");
        } else {
            System.out.println(" voce nao pode votar");
        }
    }

    public void exercicio3() {
        System.out.println("qual e sua senha");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("acesso permitido");
        } else {
            System.out.println("acesso negado");
        }

    }

    public void exercicio4() {
        System.out.println("Quantos macas voce pegou");
        double macaPegado = sc.nextDouble();
        if (macaPegado >= 12) {
            double total = macaPegado * 0.25;
            System.out.println("O valor que voce pagara e " + total);
        } else if (macaPegado < 12) {
            double total = macaPegado * 0.30;
            System.out.println("O valor que voce pagara e " + total);
        }

    }

    public void exercicio5() {

        System.out.println("Insira um valor");
        int num1 = sc.nextInt();

        System.out.println("Insira um segundo valor");
        int num2 = sc.nextInt();

        System.out.println("Insira um terceiro valor");
        int num3 = sc.nextInt();

        if (num1 >= num2 & num2 >= num3) {
            System.out
                    .println("Os valores dados escritos em ordem crescente será:\n" + num3 + ", " + num2 + ", " + num1);
        } else if (num1 >= num3 & num3 >= num2) {
            System.out
                    .println("Os valores dados escritos em ordem crescente será:\n" + num2 + ", " + num3 + ", " + num1);
        } else if (num2 >= num1 & num1 >= num3) {
            System.out
                    .println("Os valores dados escritos em ordem crescente será:\n" + num3 + ", " + num1 + ", " + num2);
        } else if (num2 >= num3 & num3 >= num1) {
            System.out
                    .println("Os valores dados escritos em ordem crescente será:\n" + num1 + ", " + num3 + ", " + num2);
        } else if (num3 >= num2 & num2 >= num1) {
            System.out
                    .println("Os valores dados escritos em ordem crescente será:\n" + num1 + ", " + num2 + ", " + num3);
        } else {
            System.out
                    .println("Os valores dados escritos em ordem crescente será:\n" + num2 + ", " + num1 + ", " + num3);
        }

    }

    public void exercicio6() {

        System.out.println("Insira seu sexo\n[1]-Feminino [2]-Masculino");
        int sexo = sc.nextInt();

        System.out.println("Insira sua altura (em metros)\n[Apenas números]");
        double altura = sc.nextDouble();

        if (sexo == 1) {
            System.out.println("O seu peso ideal seria de " + ((72.7 * altura) - 58) + " kg");
        } else if (sexo == 2) {
            System.out.println("O seu peso ideal seria de " + ((62.1 * altura) - 44.7) + " kg");

        }

    }

    public void exercicio7() {
        System.out.println("Informe a Nota 1 do Aluno");
        int Nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do Aluno");
        int Nota2 = sc.nextInt();
        double media = (Nota1 + Nota2) / 2;
        System.out.println("A media do Aluno e " + media);
        boolean mediaAprovada = media >= 50;
        System.out.println("O Aluno esta aprovado por Nota? " + mediaAprovada);
        System.out.println("Informe a Frequencia do Aluno:");
        int Frequencia = sc.nextInt();
        boolean FrequenciaAprovada = Frequencia >= 75;
        System.out.println("O Aluno esta aprovado por Frequencia:"
                + FrequenciaAprovada);
        Boolean resultadoFinal = (mediaAprovada == true) && (FrequenciaAprovada == true);
        System.out.println("O Aluno estra aprovado no Curso?"
                + resultadoFinal);

    }
}
