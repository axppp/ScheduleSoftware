
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author axppp
 */
public class Turma {

    private String designacao;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(String designacao, ArrayList<Aluno> aluno) {
        this.designacao = designacao;
//        for (int i = 0; i < alunos.size(); i++) {
//            this.alunos.add(aluno.get(i));
//        }   
        this.alunos = aluno;
    }

    Turma() {
    }

    public String listarProfessorTurma(ArrayList<Professor> prof, String a, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        ArrayList<Professor> p = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (a.equalsIgnoreCase(horario.get(i).getDesignacao())) {
                h.add(horario.get(i));
                for (int j = 0; j < prof.size(); j++) {
                    if (prof.get(j).getSigla().equalsIgnoreCase(horario.get(i).getSigla_professor()) && !p.contains(prof.get(j))) {
                        p.add(prof.get(j));
                    }

                }
            }
        }
        return p.toString() + h.toString();
    }

    @Override
    public String toString() {
        return "Turma{" + "designacao=" + designacao + ", tem " + alunos.size() + " Alunos " + '}';
    }

    public String toStringSigla() {
        return designacao;
    }

    /**
     * Get Designação
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Get Alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * Adiciona Aluno
     */
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
