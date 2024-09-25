import java.util.Scanner;

// Exercicio 24

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa as variáveis para maior e menor
        int maior = Integer.MIN_VALUE; // Valor mínimo possível para inicializar
        int menor = Integer.MAX_VALUE;  // Valor máximo possível para inicializar

        // Ler cinco números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Atualiza o maior e o menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Imprimir o maior e o menor número
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
