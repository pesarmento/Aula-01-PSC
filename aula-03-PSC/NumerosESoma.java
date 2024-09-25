// Exercicio 9

public class NumerosESoma {
    public static void main(String[] args) {
        int soma = 0; // Inicializa a soma

        System.out.println("Números de 1 a 100:");

        // Loop para imprimir os números de 1 a 100 e calcular a soma
        for (int i = 1; i <= 100; i++) {
            System.out.println(i); // Imprime o número atual
            soma += i; // Adiciona o número atual à soma
        }

        // Imprime a soma total
        System.out.println("A soma de todos os números de 1 a 100 é: " + soma);
    }
}
