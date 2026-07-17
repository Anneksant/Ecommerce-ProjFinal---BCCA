public class Vestuario extends Produto {
    private String tamanho;
    

    public Vestuario(String nome, double precoBase, String tamanho) {
        super(nome, precoBase);
        this.tamanho = tamanho;
        }

    @Override
    public double calcularValorFinal() {
        // Roupas podem ter um acréscimo de 5% no preço base devido à marca e outros fatores.
        return getPrecoBase() + (getPrecoBase() * 0.05);
    }

    public void exibirDetalhesVestuario() {
        System.out.println("Produto: " + getNome() + ", Tamanho: " + tamanho );
    }
    
}
