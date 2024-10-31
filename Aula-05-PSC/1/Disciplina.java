public class Disciplina {
    // Atributos privados
    private String nome;
    private boolean pratica;

    // Construtor
    public Disciplina(String nome, boolean pratica) {
        this.nome = nome;
        this.pratica = pratica;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public boolean isPratica() {
        return pratica;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    // Método para retornar os dados
    public String getDados() {
        return "Nome: " + nome + ", Prática: " + (pratica ? "Sim" : "Não");
    }
}
