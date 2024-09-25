import java.util.Scanner;

// Exercicio 20

public class QuadradoERaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Determinar o menor e o maior número
        double menor = Math.min(numero1, numero2);
        double maior = Math.max(numero1, numero2);

        // Calcular e imprimir o quadrado do menor número
        double quadrado = menor * menor;
        System.out.println("O quadrado do menor número (" + menor + ") é: " + quadrado);

        // Calcular e imprimir a raiz quadrada do maior número, se for possível
        if (maior >= 0) {
            double raizQuadrada = Math.sqrt(maior);
            System.out.println("A raiz quadrada do maior número (" + maior + ") é: " + raizQuadrada);
        } else {
            System.out.println("O maior número (" + maior + ") é negativo. Raiz quadrada não é possível.");
        }

        scanner.close();
    }
}
