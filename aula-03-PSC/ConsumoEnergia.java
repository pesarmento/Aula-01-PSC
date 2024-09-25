import java.util.Scanner;

// Exercicio 11

public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        double consumo;
        int tipo;
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        double somaConsumoTipo1 = 0, somaConsumoTipo2 = 0;
        int contadorTipo1 = 0, contadorTipo2 = 0;

        while (true) {
            System.out.print("Digite o código do consumidor (0 para sair): ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break; // Encerra a leitura se o código for 0
            }

            System.out.print("Digite a quantidade de kWh consumidos: ");
            consumo = scanner.nextDouble();

            System.out.print("Digite o tipo do consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            tipo = scanner.nextInt();

            double custo = 0;

            // Calcula o custo com base no tipo de consumidor
            switch (tipo) {
                case 1:
                    custo = consumo * 0.3; // Residencial
                    totalResidencial += consumo;
                    somaConsumoTipo1 += consumo;
                    contadorTipo1++;
                    break;
                case 2:
                    custo = consumo * 0.5; // Comercial
                    totalComercial += consumo;
                    somaConsumoTipo2 += consumo;
                    contadorTipo2++;
                    break;
                case 3:
                    custo = consumo * 0.7; // Industrial
                    totalIndustrial += consumo;
                    break;
                default:
                    System.out.println("Tipo inválido. Tente novamente.");
                    continue; // Volta para o início do loop
            }

            // Imprime o custo total para o consumidor
            System.out.printf("Custo total para o consumidor %d: R$ %.2f%n", codigo, custo);
        }

        // Imprime os totais de consumo
        System.out.printf("Total de consumo residencial: %.2f kWh%n", totalResidencial);
        System.out.printf("Total de consumo comercial: %.2f kWh%n", totalComercial);
        System.out.printf("Total de consumo industrial: %.2f kWh%n", totalIndustrial);

        // Calcula e imprime a média de consumo dos tipos 1 e 2
        double mediaTipo1 = (contadorTipo1 > 0) ? somaConsumoTipo1 / contadorTipo1 : 0;
        double mediaTipo2 = (contadorTipo2 > 0) ? somaConsumoTipo2 / contadorTipo2 : 0;

        System.out.printf("Média de consumo do tipo 1 (residencial): %.2f kWh%n", mediaTipo1);
        System.out.printf("Média de consumo do tipo 2 (comercial): %.2f kWh%n", mediaTipo2);

        scanner.close();
    }
}
