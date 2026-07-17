

// 1. Interface
// Define um "contrato" que qualquer classe que implemente essa interface deve seguir.
public interface ProdutoComercializavel {
    // Todo produto comercializável precisa saber calcular seu valor final.
    double calcularValorFinal();
}
