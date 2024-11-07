public class Tarefeiro extends Empregado {
    private double valorPorTarefa;
    private int tarefasConcluidas;

    public Tarefeiro(String nome, double valorPorTarefa, int tarefasConcluidas) {
        super(nome);
        this.valorPorTarefa = valorPorTarefa;
        this.tarefasConcluidas = tarefasConcluidas;
    }

    @Override
    public double calcularPagamento() {
        return valorPorTarefa * tarefasConcluidas;
    }
}
