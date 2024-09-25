import java.util.Scanner;

// Exercicio 6

public class RaizEInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Digite vários números (digite -999 para encerrar):");

        while (true) {
            numero = scanner.nextDouble(); // Lê o número

            if (numero == -999) { // Verifica se o número é -999
                break; // Sai do loop se o número for -999
            }

            // Verifica se o número é não negativo antes de calcular a raiz quadrada
            if (numero >= 0) {
                double raizQuadrada = Math.sqrt(numero); // Calcula a raiz quadrada
                System.out.println("Raiz quadrada de " + numero + " é: " + raizQuadrada);
            } else {
                System.out.println("Raiz quadrada de " + numero + " não é válida (número negativo).");
            }

            // Calcula e imprime o inverso
            if (numero != 0) {
                double inverso = 1 / numero; // Calcula o inverso
                System.out.println("Inverso de " + numero + " é: " + inverso);
            } else {
                System.out.println("Inverso de 0 não é definido.");
            }
        }

        scanner.close();
    }
}
