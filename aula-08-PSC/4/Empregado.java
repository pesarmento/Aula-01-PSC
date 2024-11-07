public class Empregado extends PessoaFisica {
    public Empregado(String nome, String cpf) {
        super(nome, cpf);
    }

    public double calcularPagamento() {
        return 0.0; // Método que será sobrecarregado nas subclasses
    }
}
