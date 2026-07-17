public class Teste {
    public static void main(String[] args) {
        
        // Instanciando objetos das subclasses
        Eletronico celular = new Eletronico("Smartphone Galaxy", 2000.00, 12);
        Vestuario camiseta = new Vestuario("Camiseta Polo", 100.00, "M");

        // Testando o Overloading (Sobrecarga)
        celular.aplicarDesconto(10.0); // Passando double (10% de desconto)
        camiseta.aplicarDesconto("PROMO10"); // Passando String (Desconto fixo R$10)

        celular.exibirDetalhesGarantia();

        // Comunicação entre Objetos
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras("Anne");
        
        meuCarrinho.adicionarProduto(celular);
        meuCarrinho.adicionarProduto(camiseta);

        // Testando o Polimorfismo
        meuCarrinho.fecharCompra();
    }
}