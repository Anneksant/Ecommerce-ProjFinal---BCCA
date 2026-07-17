import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
    private String nomeCliente;
    // O Carrinho "tem" uma lista de Produtos
    private List<Produto> itens; 

    public CarrinhoDeCompras(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>(); // Inicializa a lista vazia
    }

    public void adicionarProduto(Produto p) {
        itens.add(p);
        System.out.println(p.getNome() + " adicionado ao carrinho de " + nomeCliente);
    }

    // 6. POLIMORFISMO
    public void fecharCompra() {
        double total = 0;
        System.out.println("\n Fechamento de Compra do(a) " + nomeCliente); 
        
        for (Produto item : itens) {
            // Chamada polimórfica!
            double valorItem = item.calcularValorFinal(); 
            System.out.println("Item: " + item.getNome() + " | Valor Final: R$ " + valorItem);
            total += valorItem;
        }
        System.out.println("Total a pagar: R$ " + total);
        System.out.println("----------------------------------------\n");
    }
}