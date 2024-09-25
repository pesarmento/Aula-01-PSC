// Exercicio 8

public class ProdutoNumeros {
    public static void main(String[] args) {
        long produto = 1; // Inicializa o produto como 1

        // Loop para calcular o produto dos números de 120 a 300
        for (int i = 120; i <= 300; i++) {
            produto *= i; // Multiplica o número atual ao produto
        }

        // Imprime o resultado
        System.out.println("O produto de todos os números de 120 a 300 é: " + produto);
    }
}
