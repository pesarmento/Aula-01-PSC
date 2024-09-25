import java.util.Scanner;

// Exercicio 25

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contadores de votos
        int[] votos = new int[4];
        int totalEleitores = 0;

        System.out.println("Urna Eletrônica - Escolha o candidato:");
        System.out.println("1: Candidato 1");
        System.out.println("2: Candidato 2");
        System.out.println("3: Candidato 3");
        System.out.println("4: Candidato 4");
        System.out.println("-1: Encerrar a votação");

        while (true) {
            System.out.print("Digite o número do candidato: ");
            int voto = scanner.nextInt();

            // Verifica se o voto é para encerrar a votação
            if (voto == -1) {
                break;
            }

            // Verifica se o voto é válido
            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++; // Incrementa o voto do candidato
                totalEleitores++; // Incrementa o total de eleitores
            } else {
                System.out.println("Voto inválido! Por favor, digite um número entre 1 e 4.");
            }
        }

        // Exibe os resultados
        System.out.println("\nResultados da votação:");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalEleitores > 0) ? (votos[i] * 100.0 / totalEleitores) : 0;
            System.out.printf("Candidato %d: %d voto(s) (%.2f%%)%n", (i + 1), votos[i], percentual);
        }

        System.out.println("Total de eleitores: " + totalEleitores);
        scanner.close();
    }
}
