public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private int pedido;
    private int newEstoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String processarVenda(int pedido) {
        if (estoque > pedido) {
            estoque -= pedido;
            return "Estoque atualizado: " + estoque;
        }
        else {
            return "Estoque insuficiente para realizar a venda.";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }
}
