public class PedidoCompra extends Pedido{
    private Fornecedor fornecedor;

    public PedidoCompra(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;

    }
    public void processar(){
        float total =this.somaPedido();
        this.atualizaEstoque(1);
        this.fornecedor.somaSaldo(total);
    }
    public void faturar() {

    }

}

