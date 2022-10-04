public class PedidoVenda extends Pedido {
    private Cliente cliente;

    public PedidoVenda(Cliente cliente) {
        this.cliente = cliente;

    }
    public void faturar(){
        float total =this.somaPedido();
        this.atualizaEstoque(-1);
        this.cliente.somaSaldo(total);
    }
}

