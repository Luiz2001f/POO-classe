public class App {
    public static void main(String[] args) {
        Fornecedor feirante = new Fornecedor();
        Cliente maria = new Cliente();

        Produto p = new Produto("Peras", 3);
        Produto m = new Produto("Macas", 5);

        System.out.println("peras = "+ p.pegaEstoque());
        System.out.println("macas = "+ m.pegaEstoque());

        PedidoCompra pc = new PedidoCompra(feirante);
        pc.AdicionarProduto(p,5);
        pc.AdicionarProduto(m,4);
        pc.processar();
        System.out.println(feirante.pegaSaldo());

        System.out.println("peras = " + p.pegaEstoque());
        System.out.println("macas = " + p.pegaEstoque());

        PedidoVenda pv = new PedidoVenda(maria);
        pv.AdicionarProduto(p,2);
        pv.AdicionarProduto(m,7);
        pv.listaPedido();
        pv.faturar();

        System.out.println("peras = " + p.pegaEstoque());
        System.out.println("macas = " + m.pegaEstoque());

    }
}