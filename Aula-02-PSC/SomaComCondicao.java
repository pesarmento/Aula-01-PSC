import java.util.Scanner;

// Exercicio 2

public class SomaComCondicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Realizar a soma
        int soma = numero1 + numero2;

        // Verificar a condição e calcular o resultado
        if (soma <= 20) {
            soma -= 5; // Subtrai 5 se a soma for menor ou igual a 20
        }

        // Apresentar o resultado
        System.out.println("O resultado é: " + soma);
        
        scanner.close();
    }
}
