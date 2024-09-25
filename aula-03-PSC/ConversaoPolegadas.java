// Exercicio 17

public class ConversaoPolegadas {
    public static void main(String[] args) {
        // Cabeçalho da tabela
        System.out.printf("%-10s %-10s%n", "Polegadas", "Centímetros");
        System.out.println("--------------------------");

        // Loop para converter de polegadas para centímetros
        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = polegadas * 2.54; // Conversão
            System.out.printf("%-10d %-10.2f%n", polegadas, centimetros); // Impressão formatada
        }
    }
}
