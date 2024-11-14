public class Caixa {
    // Atributos privados
    private String corredor;
    private int posicao;
    private double peso;
    private String dono;

    // Construtor para inicializar os atributos
    public Caixa(String corredor, int posicao, double peso, String dono) {
        this.corredor = corredor;
        this.posicao = posicao;
        this.peso = peso;
        this.dono = dono;
    }

    // Métodos de acesso (getters)
    public String getCorredor() {
        return corredor;
    }

    public int getPosicao() {
        return posicao;
    }

    public double getPeso() {
        return peso;
    }

    public String getDono() {
        return dono;
    }

    // Métodos modificadores (setters)
    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    // Método toString para exibir as informações da caixa
    @Override
    public String toString() {
        return "Caixa [Corredor=" + corredor + ", Posição=" + posicao + ", Peso=" + peso + " kg, Dono=" + dono + "]";
    }

    // Método para exibir as informações detalhadas da caixa
    public void exibirInformacoes() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        // Testando a classe Caixa
        Caixa caixa1 = new Caixa("Corredor A", 10, 25.5, "João");
        
        // Exibindo as informações da caixa
        caixa1.exibirInformacoes();
        
        // Modificando os atributos utilizando setters
        caixa1.setCorredor("Corredor B");
        caixa1.setPosicao(15);
        caixa1.setPeso(30.0);
        caixa1.setDono("Maria");

        // Exibindo as informações modificadas
        caixa1.exibirInformacoes();
    }
}
