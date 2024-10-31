public class Professor {
    // Atributos privados
    private String nome;
    private int idade;

    // Construtor
    public Professor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para retornar os dados
    public String getDados() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
