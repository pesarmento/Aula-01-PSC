import java.util.Scanner;

// Exercicio 6

public class ComparacaoComVinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar a condição e imprimir a mensagem correspondente
        if (numero > 20) {
            System.out.println("O número " + numero + " é maior do que 20.");
        } else if (numero == 20) {
            System.out.println("O número " + numero + " é igual a 20.");
        } else {
            System.out.println("O número " + numero + " é menor do que 20.");
        }

        scanner.close();
    }
}
