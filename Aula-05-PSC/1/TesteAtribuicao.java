public class TesteAtribuicao {
    public static void main(String[] args) {
        // Instanciando um Professor
        Professor professor = new Professor("João Silva", 35);

        // Instanciando uma Disciplina
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", true);

        // Instanciando uma Atribuicao
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        // Imprimindo os dados da Atribuicao
        System.out.println(atribuicao.getDados());
    }
}
