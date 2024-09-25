import java.util.Scanner;

// Exercicio 21

public class FiltrarPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop para ler os dados de 20 pessoas
        for (int i = 0; i < 20; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa o buffer do scanner

            // Verifica se é masculino e tem mais de 21 anos
            if (sexo == 'M' || sexo == 'm') {
                if (idade > 21) {
                    System.out.println("Nome: " + nome);
                }
            }
        }

        scanner.close();
    }
}
