public class Comissionado extends Empregado {
    private double vendas;
    private double percentualComissao;

    public Comissionado(String nome, String cpf, double vendas, double percentualComissao) {
        super(nome, cpf);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularPagamento() {
        return vendas * percentualComissao;
    }
}
