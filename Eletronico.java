//4. Herança
public class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(String nome, double precoBase, int garantiaMeses) {
        super(nome, precoBase); //chama o construtor da classe pai (Produto)
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularValorFinal() {
        //Eletrônicos podem ter um acréscimo de 10% no preço base devido à garantia e outros fatores.
        return getPrecoBase() + (getPrecoBase() * 0.10);
    }

    public void exibirDetalhesGarantia() {
        System.out.println("Produto: " + getNome() + ", Garantia: " + garantiaMeses + " meses");
    }

    
}
