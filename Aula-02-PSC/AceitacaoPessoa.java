import java.util.Scanner;

// Exercicio 7

public class AceitacaoPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o nome
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Ler o sexo
        System.out.print("Digite o seu sexo (f/F para feminino, m/M para masculino): ");
        char sexo = scanner.next().charAt(0);

        // Ler a idade
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Verificar as condições
        if ((sexo == 'f' || sexo == 'F') && idade < 25) {
            System.out.println(nome + ", ACEITA.");
        } else {
            System.out.println(nome + ", NÃO ACEITA.");
        }

        scanner.close();
    }
}
