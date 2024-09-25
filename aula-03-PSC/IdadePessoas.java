import java.util.Scanner;

// Exercicio 12

public class IdadePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int totalMenor21 = 0;
        int totalMaior50 = 0;

        System.out.println("Digite as idades das pessoas (digite uma idade fora da faixa 0-120 para encerrar):");

        while (true) {
            idade = scanner.nextInt(); // Lê a idade

            // Verifica se a idade está fora da faixa
            if (idade < 0 || idade > 120) {
                break; // Encerra o loop se a idade for inválida
            }

            // Conta as idades conforme os critérios
            if (idade < 21) {
                totalMenor21++; // Incrementa o contador de pessoas com menos de 21 anos
            }
            if (idade > 50) {
                totalMaior50++; // Incrementa o contador de pessoas com mais de 50 anos
            }
        }

        // Imprime os totais
        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);

        scanner.close();
    }
}
