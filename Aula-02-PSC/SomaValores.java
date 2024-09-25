import java.util.Scanner;

// Exercicio 1

public class SomaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos valores inteiros
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();
        
        // Realiza a adição
        int soma = valor1 + valor2;
        
        // Verifica se o resultado é maior que 10
        if (soma > 10) {
            System.out.println("A soma é: " + soma);
        } else {
            System.out.println("A soma não é maior que 10.");
        }
        
        scanner.close();
    }
}
