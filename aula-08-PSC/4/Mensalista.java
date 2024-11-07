public class Mensalista extends Empregado {
    private double salarioMensal;

    public Mensalista(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }
}
