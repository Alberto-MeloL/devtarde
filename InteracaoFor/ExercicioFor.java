/*package ExemploFor;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);
    public void exercicio1(){
        int vetor[]=new int[10];
        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.next().charAt(0);
        }

        int contadorConsoantes = 0;
        String consoantes = "";

        for (int c : vetor) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                contadorConsoantes++;
                consoantes += c + " ";
            }
        }

        System.out.println("Foram lidas " + contadorConsoantes + " consoantes:");
        System.out.println(consoantes);
    }
}
*/
