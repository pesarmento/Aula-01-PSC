import java.util.Scanner;

// Exercicio 3

public class RaizOuQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verificar se o número é positivo ou negativo e calcular o resultado
        if (numero > 0) {
            double raizQuadrada = Math.sqrt(numero); // Calcula a raiz quadrada
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        } else {
            double quadrado = numero * numero; // Calcula o quadrado
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        }

        scanner.close();
    }
}
