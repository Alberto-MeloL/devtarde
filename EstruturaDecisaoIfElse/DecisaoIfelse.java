package EstruturaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfelse {
    Scanner sc = new Scanner(System.in);

    // If desencadeado
    public void decisaoIf() {
        System.out.println("Informe Preco do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProdutofor>=100 entao desconto =5
        if (precoProduto >= 100 && precoProduto < 200) {
            desconto = 5.0;
        }
        // se precoproduto>=200 entao desconto =10
        if (precoProduto >= 200 && precoProduto < 300) {
            desconto = 10;
        }
        // se precoproduto>=300 entao desconto 15
        if (precoProduto >= 300) {
            desconto = 15;
        }
        // realizar a Conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto e $" + precoFinal);

    }

    // If encadeado
    public void DecisaoIfelse() {
        System.out.println("Informe Preco do Produto");
        double precoProduto = sc.nextDouble();
        double desconto;
        // Estrutura de decisao encadeada If-else
        if (precoProduto >= 200) { //1° condicao
            desconto = 10;

        } else if (precoProduto >= 100) { //2° condicao
            desconto = 5;
        } else {
            desconto = 0;
        }
        // realizar a Conta
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do Produto e $" + precoFinal);
    }
}