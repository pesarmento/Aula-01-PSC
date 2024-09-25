import java.util.Scanner;

// Exercicio 4

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Digite vários números (digite 0 para sair):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // Sai do loop se o número for 0
            }

            // Verifica se o número está entre 100 e 200
            if (numero >= 100 && numero <= 200) {
                contador++; // Incrementa o contador
            }
        }

        // Imprime a quantidade de números entre 100 e 200
        System.out.println("Foram digitados " + contador + " números entre 100 e 200.");

        scanner.close();
    }
}
