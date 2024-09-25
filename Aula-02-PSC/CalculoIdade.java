import java.util.Scanner;

// Exercicio 15

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Ler o ano atual
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        // Verificar se o ano de nascimento é válido
        if (anoNascimento < 0 || anoNascimento > anoAtual) {
            System.out.println("Ano de nascimento inválido. Por favor, insira um ano válido.");
        } else {
            // Calcular a idade
            int idade = anoAtual - anoNascimento;
            System.out.println("A idade da pessoa é: " + idade + " anos.");
        }

        scanner.close();
    }
}
