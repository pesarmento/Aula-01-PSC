import java.util.Scanner;

// Exercicio 14

public class MultiploDeQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número inteiro de 4 dígitos
        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = scanner.nextInt();

        // Verificar se o número está entre 1000 e 9999
        if (numero < 1000 || numero > 9999) {
            System.out.println("Por favor, insira um número de 4 dígitos.");
        } else {
            // Extrair os algarismos das casas das unidades de milhar e das centenas
            int unidadesMilhar = numero / 1000; // Algoritmo da casa das unidades de milhar
            int centenas = (numero / 100) % 10;  // Algoritmo da casa das centenas
            
            // Formar o novo número
            int novoNumero = unidadesMilhar * 10 + centenas;

            // Verificar se o novo número é múltiplo de 4
            if (novoNumero % 4 == 0) {
                System.out.println("O número " + novoNumero + " formado pelas casas das unidades de milhar e das centenas é múltiplo de 4.");
            } else {
                System.out.println("O número " + novoNumero + " formado pelas casas das unidades de milhar e das centenas não é múltiplo de 4.");
            }
        }

        scanner.close();
    }
}
