public class Horista extends Empregado {
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(String nome, String cpf, double valorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
