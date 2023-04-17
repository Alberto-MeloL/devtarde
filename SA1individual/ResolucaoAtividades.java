package SA1individual;

import java.util.Scanner;

public class ResolucaoAtividades {
   Scanner sc =  new Scanner(System.in);

   public void exc1() {
    //1. Digitar o 1° ´nº
    System.out.println("Informe o 1º Valor");
  double n1 = sc.nextDouble();
  //2. Digitar o 2º numero
  System.out.println("Informe o 2º Valor"); 
  double n2 = sc.nextDouble();
  //3. Escolher  a operacao
  System.out.println("Informe a opracao Desejada");
  System.out.println("1-Adicao 2-Subtracao 3-Multiplicao 4-Divisao");
  int operacao = sc.nextInt();
  double resultado;
  if(operacao==1){
    resultado = n1+n2;
    System.out.println("O Resultado e:"+resultado);
  }else if(operacao==2){
    resultado = n1-n2;
    System.out.println("O Resultado e:"+resultado);
  }else if(operacao==3){
    resultado = n1*n2;
    System.out.println("O Resultado e:"+resultado);
  }else if(operacao==4 && n2!=0){
    resultado = n1/n2;
    System.out.println("O Resultado e:"+resultado);
  }else{
    System.out.println("Opercao Invalida ou Valor Irregular(0)");
  }
   }

   public void exercicio2() {
    //1. Declare o nº de matricula
    System.out.println("Informe seu n° de Matricula");
    int nMatricula = sc.nextInt();
    
    if (nMatricula % 4 == 0 ) {
     System.out.println("Time do Chris");
    }
    else if (nMatricula % 4 == 1) {
        System.out.println("Time do Greg");
    }
    else if (nMatricula % 4 == 2) {
        System.out.println("Time do Caruso");
    }
    else if (nMatricula % 4 == 3) {
        System.out.println("Time do Jerome");
    }
    
   }
}
