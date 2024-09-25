import java.util.Scanner;

// Exercicio 19

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verifica se o número é negativo
        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

    // Método para calcular o fatorial
    public static long calcularFatorial(int n) {
        long resultado = 1; // Inicializa o resultado como 1
        for (int i = 2; i <= n; i++) {
            resultado *= i; // Multiplica os números
        }
        return resultado; // Retorna o fatorial
    }
}
