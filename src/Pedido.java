import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens;

    public Pedido(){
        this.itens = new ArrayList<>();
    }

    public void AdicionarProduto (Produto p, int quantidade){
        Item i = new Item(p, quantidade);
        this.itens.add(i);
    }

    public void listaPedido() {
        for (Item item : this.itens) {
            System.out.println(item.pegaNomeProduto() + " " + item.pegaQuantidade());
        }
    }
    public float somaPedido() {
        float soma = 0;
        for (Item item : this.itens);
        return soma;

    }

    public void atualizaEstoque (int sinal){
        for (Item item : this.itens){
            Produto p = item.pegaProduto();
            p.setaEstoque (p.pegaEstoque() + (sinal * item.pegaQuantidade()));
        }
    }
}
