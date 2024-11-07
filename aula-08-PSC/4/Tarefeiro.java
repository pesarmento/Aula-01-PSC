public class Tarefeiro extends Empregado {
    private double valorPorTarefa;
    private int tarefasConcluidas;

    public Tarefeiro(String nome, String cpf, double valorPorTarefa, int tarefasConcluidas) {
        super(nome, cpf);
        this.valorPorTarefa = valorPorTarefa;
        this.tarefasConcluidas = tarefasConcluidas;
    }

    @Override
    public double calcularPagamento() {
        return valorPorTarefa * tarefasConcluidas;
    }
}
