// Exercicio 7

public class MultiplosDeCinco {
    public static void main(String[] args) {
        System.out.println("Números múltiplos de 5 entre 1 e 500:");

        // Loop para encontrar e imprimir os múltiplos de 5
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) { // Verifica se i é múltiplo de 5
                System.out.println(i);
            }
        }
    }
}
