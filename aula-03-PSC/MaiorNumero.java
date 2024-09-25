import java.util.Scanner;

// Exercicio 15

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor inteiro

        System.out.println("Digite vários números (digite -9999 para encerrar):");

        while (true) {
            numero = scanner.nextInt(); // Lê o número

            if (numero == -9999) { // Verifica se o número é -9999
                break; // Encerra o loop
            }

            // Verifica se o número atual é maior que o maior registrado
            if (numero > maior) {
                maior = numero; // Atualiza o maior número
            }
        }

        // Verifica se algum número válido foi digitado
        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}
