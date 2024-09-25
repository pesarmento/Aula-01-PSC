import java.util.Scanner;

// Exercicio 19

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Imprimir os números em ordem decrescente
        if (numero1 > numero2) {
            System.out.println("Números em ordem decrescente: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Números em ordem decrescente: " + numero2 + ", " + numero1);
        }

        scanner.close();
    }
}
