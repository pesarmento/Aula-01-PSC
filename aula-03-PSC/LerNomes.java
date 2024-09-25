import java.util.Scanner;

// Exercico 5

public class LerNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite os nomes (digite 'FIM' para encerrar):");

        while (true) {
            nome = scanner.nextLine(); // Lê o nome

            if (nome.equalsIgnoreCase("FIM")) { // Verifica se o nome é "FIM"
                break; // Sai do loop se o nome for "FIM"
            }

            System.out.println("Nome digitado: " + nome); // Imprime o nome
        }

        scanner.close();
    }
}
