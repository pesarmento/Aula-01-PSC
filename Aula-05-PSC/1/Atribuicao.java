public class Atribuicao {
    // Atributos privados
    private Professor professor;
    private Disciplina disciplina;

    // Construtor
    public Atribuicao(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    // Métodos de acesso (getters)
    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    // Métodos modificadores (setters)
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // Método para retornar os dados
    public String getDados() {
        return "Professor: " + professor.getNome() + ", Disciplina: " + disciplina.getNome();
    }
}
