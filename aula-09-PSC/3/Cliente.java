public class Cliente {
    // Atributos privados
    private String nome;
    private String fone;
    private int id;

    // Construtor que recebe valores para os atributos
    public Cliente(String nome, String fone, int id) {
        this.nome = nome;
        this.fone = fone;
        this.id = id;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public int getId() {
        return id;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método toString para exibir os dados do cliente de maneira legível
    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nome=" + nome + ", Fone=" + fone + "]";
    }

    // Método para exibir as informações do cliente
    public void exibirInformacoes() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        // Criando um objeto Cliente para testar
        Cliente cliente1 = new Cliente("João Silva", "1234-5678", 1);

        // Exibindo as informações do cliente
        cliente1.exibirInformacoes();

        // Alterando os dados usando os setters
        cliente1.setNome("Maria Souza");
        cliente1.setFone("9876-5432");
        cliente1.setId(2);

        // Exibindo as informações após alteração
        cliente1.exibirInformacoes();
    }
}
