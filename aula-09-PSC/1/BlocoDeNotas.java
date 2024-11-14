import java.util.ArrayList;

public class BlocoDeNotas {
    // Atributo que armazena as notas
    private ArrayList<String> notas;

    // Construtor que inicializa a lista de notas
    public BlocoDeNotas() {
        this.notas = new ArrayList<>();
    }

    // Método para inserir uma nota
    public void inserirNota(String nota) {
        notas.add(nota);
    }

    // Método para remover uma nota
    public boolean removerNota(String nota) {
        return notas.remove(nota);
    }

    // Método para buscar uma nota
    public boolean buscarNota(String nota) {
        return notas.contains(nota);
    }

    // Método para imprimir todas as notas
    public void imprimirNotas() {
        if (notas.isEmpty()) {
            System.out.println("Não há notas registradas.");
        } else {
            System.out.println("Notas registradas:");
            for (String nota : notas) {
                System.out.println("- " + nota);
            }
        }
    }

    public static void main(String[] args) {
        // Testando a classe BlocoDeNotas
        BlocoDeNotas bloco = new BlocoDeNotas();
        
        // Inserir algumas notas
        bloco.inserirNota("Comprar leite");
        bloco.inserirNota("Estudar Java");
        bloco.inserirNota("Ir ao mercado");

        // Imprimir todas as notas
        bloco.imprimirNotas();
        
        // Buscar uma nota
        boolean encontrou = bloco.buscarNota("Estudar Java");
        System.out.println("Nota 'Estudar Java' encontrada? " + encontrou);

        // Remover uma nota
        boolean removed = bloco.removerNota("Comprar leite");
        System.out.println("Nota 'Comprar leite' removida? " + removed);

        // Imprimir todas as notas novamente
        bloco.imprimirNotas();
    }
}
