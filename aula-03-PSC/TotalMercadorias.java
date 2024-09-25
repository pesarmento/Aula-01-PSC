import java.util.Scanner;

// Exercicio 24

public class TotalMercadorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            double preco;
            int quantidade;

            // Leitura do preço
            do {
                System.out.print("Digite o preço da mercadoria (ou um valor negativo para sair): ");
                preco = scanner.nextDouble();
                if (preco < 0) {
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return; // Encerra o programa
                }
                if (preco < 0) {
                    System.out.println("Por favor, digite um preço válido (não negativo).");
                }
            } while (preco < 0);

            // Leitura da quantidade
            do {
                System.out.print("Digite a quantidade de itens comprados: ");
                quantidade = scanner.nextInt();
                if (quantidade < 0) {
                    System.out.println("Por favor, digite uma quantidade válida (não negativa).");
                }
            } while (quantidade < 0);

            // Se a quantidade for zero, encerra o loop e calcula o total
            if (quantidade == 0) {
                break;
            }

            // Calcula o total
            total += preco * quantidade;
        }

        // Mostra o total a ser pago
        System.out.printf("Total a ser pago: R$ %.2f%n", total);
        scanner.close();
    }
}
