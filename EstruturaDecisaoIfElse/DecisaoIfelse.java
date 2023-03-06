package EstruturaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfelse {
    Scanner sc = new Scanner(System.in);

    public void decisaoIf() {
        System.out.println("Informe Preco do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProdutofor>=100 entao desconto =5
        if (precoProduto >= 100) {
            desconto = 5.0;
        }

        // realizar a Conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto e $" + precoFinal);
    }
}