import java.util.Scanner;

// Exercicio 13

public class ParOuImparDezenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número inteiro de 3 dígitos
        System.out.print("Digite um número inteiro de 3 dígitos: ");
        int numero = scanner.nextInt();

        // Verificar se o número está entre 100 e 999
        if (numero < 100 || numero > 999) {
            System.out.println("Por favor, insira um número de 3 dígitos.");
        } else {
            // Extrair o algarismo da casa das dezenas
            int dezenas = (numero / 10) % 10;

            // Verificar se o algarismo da casa das dezenas é par ou ímpar
            if (dezenas % 2 == 0) {
                System.out.println("O algarismo da casa das dezenas (" + dezenas + ") é par.");
            } else {
                System.out.println("O algarismo da casa das dezenas (" + dezenas + ") é ímpar.");
            }
        }

        scanner.close();
    }
}
