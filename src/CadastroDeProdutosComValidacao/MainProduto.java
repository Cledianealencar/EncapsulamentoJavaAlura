package CadastroDeProdutosComValidacao;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("==========================");
        System.out.println("   Digite os produtos:");
        System.out.println("==========================");

        System.out.print("Nome do  produto: ");
        String nome = sc.nextLine();
        produto.setNome(nome);

        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();
        produto.setPreco(preco);

        produto.exibirProdutos();
        sc.close();
    }
}
