public class Desempregado extends PessoaFisica {
    public Desempregado(String nome, String cpf) {
        super(nome, cpf);
    }

    public String status() {
        return "Desempregado";
    }
}
