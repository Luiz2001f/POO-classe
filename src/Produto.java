public class Produto {
    private String nome;
    private int estoque;
    private float preco;

    Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public int pegaEstoque() {
        return this.estoque;
    }

    public float pegaPreco() {
        return this.preco;
    }

    public String pegaNome() {
        return this.nome;
    }

    public void setaEstoque (int estoque) {
        this.estoque = estoque;
    }
}
