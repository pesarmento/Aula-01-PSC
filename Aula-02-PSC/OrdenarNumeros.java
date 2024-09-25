import java.util.Scanner;

// Exercicio 23

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler três números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Variáveis para armazenar os números em ordem
        int maior, intermediario, menor;

        // Determinar o maior, intermediário e menor
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
            if (numero2 > numero3) {
                intermediario = numero2;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
            if (numero1 > numero3) {
                intermediario = numero1;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 > numero2) {
                intermediario = numero1;
                menor = numero2;
            } else {
                intermediario = numero2;
                menor = numero1;
            }
        }

        // Imprimir os números em ordem
        System.out.println("Maior: " + maior);
        System.out.println("Intermediário: " + intermediario);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
