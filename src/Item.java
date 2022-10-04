public class Item {
    private Produto produto;
    private int quantidade;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public String pegaNomeProduto(){
        return produto.pegaNome();
    }

    public int pegaQuantidade(){
        return quantidade;
    }

    public Produto pegaProduto(){
        return this.produto;
    }


}
