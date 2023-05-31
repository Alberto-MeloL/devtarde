package EstruturaDecisaSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + "E uma vogal");
                break;
            case "e":
                System.out.println(letra + "E uma vogal");
                break;
            case "i":
                System.out.println(letra + "E uma vogal");
                break;
            case "o":
                System.out.println(letra + "E uma vogal");
                break;
            case "u":
                System.out.println(letra + "E uma vogal");
                break;

            default:
                System.out.println(letra + "E uma consoante");
                break;
        }
    }
}

    /*public void mes() {
       String letra = sc.nextLine();
        /*switch (letra);{
            case 1: Janeiro = "Domingo";
            break;
           case 2: Fevereiro = "Segunda-feira";
            break;
           case 3: Março = "Terça-feira";
           break;
           case 4:  Abril = "Quarta-feira";
           break;
           case 5: Maio = "Quinta-feira";
           break;
           case 6: Junho = "Sexta-feira";
           break;
           case 7:Julho = "Sábado";
           break;
           case 8: Julho = "Sábado";
           break;
           case 9: Julho = "Sábado";
           break;
           case 10: Julho = "Sábado";
           break;
           case 11: Julho = "Sábado";
           break;
           case 12: Julho = "Sábado";
           break;
           
           default: nomeDoDiaDaSemana = "[Não encontrado!]";
           System.out.println("O dia da semana é: "+nomeDoDiaDaSemana);
        }
       
    
        }

}*/
