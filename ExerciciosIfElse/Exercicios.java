package ExerciciosIfElse;

import java.util.Scanner;

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
        int resultado = 2023-anoNascimento;
        if (resultado >= 16)
        {
         System.out.println(" voce pode votar");   
        }
        else{
            System.out.println(" voce nao pode votar");
        }

        public void exercicio3() {
            System.out.println("voce pode votar");
            int senha = sc.nextInt();
           if (senha == 1234)
           {
            System.out.println("acesso permitido");
           }else{
            System.out.println("acesso negado");
           }
           

        }

    }

}
