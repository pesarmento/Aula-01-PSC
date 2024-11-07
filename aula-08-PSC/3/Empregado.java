public class Empregado {
    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPagamento() {
        return 0.0; // Método que será sobrecarregado nas subclasses
    }
}
