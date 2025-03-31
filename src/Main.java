import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.next();

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade em estoque desse produto: ");
        int estoque = sc.nextInt();
        System.out.println();

        Produto p = new Produto(nome, preco, estoque);

        System.out.println("Produto: " + p.getNome()
                + "\nPreço: " + p.getPreco()
                + "\nEstoque antes da venda: " + p.getEstoque());
        System.out.println();

        System.out.print("Digite a quantidade que deseja comprar: ");
        int pedido = sc.nextInt();

        System.out.println("Produto: " + p.getNome()
                + "\nEstoque antes da venda: " + p.getEstoque()
                + "\nPedido: " + pedido + " unidades"
                + "\n" + p.processarVenda(pedido));

        sc.close();
    }
}
