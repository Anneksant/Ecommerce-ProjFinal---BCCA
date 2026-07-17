
//2. Classe abstrata e encapsulamento 
public abstract class Produto implements ProdutoComercializavel {
    private String nome;
    private double precoBase;
    // Construtor
    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
    // Encapsulamento 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    //3. Overloading
    public void aplicarDesconto(double percentual) {
        this.precoBase -= this.precoBase * (percentual / 100);
        System.out.println("Desconto de " + percentual + "% aplicado. Novo preço: " + this.precoBase);
    }
    public void aplicarDesconto(String cumpomPromocional) {
        if (cumpomPromocional.equals("PROMO10")) {
            this.precoBase -= 10.0;
            System.out.println("Cumpom PROMO10 aplicado. Novo preço: " + this.precoBase);
        }else {
            System.out.println("Cumpom inválido.");
        }
        }

    
}
