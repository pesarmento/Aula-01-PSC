import java.util.Scanner;

// Exercicio 26

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois números reais
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        int opcao;

        do {
            // Apresenta o menu de operações
            System.out.println("\nOperações Disponíveis:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair do Programa");
            System.out.print("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();

            // Realiza a operação escolhida
            switch (opcao) {
                case 1:
                    System.out.printf("Resultado da adição: %.2f%n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("Resultado da subtração: %.2f%n", num1 - num2);
                    break;
                case 3:
                    System.out.printf("Resultado da multiplicação: %.2f%n", num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Resultado da divisão: %.2f%n", num1 / num2);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }

        } while (opcao != 9); // Repete enquanto não for escolhida a opção 9

        scanner.close();
    }
}
