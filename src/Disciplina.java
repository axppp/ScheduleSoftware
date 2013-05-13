
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Paulo Ponciano
 */
public class Disciplina {

    /**
     * variavel que guarda a sigla da disciplina
     */
    private String sigla;
    /**
     * variavel que guarda a designacao da disciplina
     */
    private String designacao;
    /**
     * variavel que guarda o numeros de horas teoricas
     */
    private int numHorasTeoricas;
    /**
     * variavel que guarda o numero de horas praticas
     */
    private int numHorasPraticas;
    /**
     * variavel que guarda a sigla do professor das teoricas
     */
    private String sigla_prof_t;
    /**
     * variavel que guarda a lista de professores das aulas praticas
     */
    private ArrayList<Professor> professores = new ArrayList<Professor>();

    /**
     *
     * @param sigla
     * @param designacao
     * @param numHorasTeoricas
     * @param numHorasPraticas
     * @param sigla_prof_t
     * @param professores Construtor Disciplina
     */
    public Disciplina(String sigla, String designacao, int numHorasTeoricas, int numHorasPraticas, String sigla_prof_t, ArrayList<Professor> professores) {
        this.sigla = sigla;
        this.designacao = designacao;
        this.numHorasTeoricas = numHorasTeoricas;
        this.numHorasPraticas = numHorasPraticas;
        this.sigla_prof_t = sigla_prof_t;
        for (int i = 0; i < professores.size(); i++) {
            this.professores.add(professores.get(i));
        }
    }

    /**
     * Construtor Disciplina vazio
     */
    public Disciplina() {
    }

    /**
     *
     * @param turma
     * @param disciplina
     * @param a
     * @param horario
     * @return lista de disciplinas leccionadas pelo professor Metodo que lista
     * as disciplinas de um dado professor
     */
    public String ListarDisciplinaProfessor(ArrayList<Turma> turma, ArrayList<Disciplina> disciplina, String a, ArrayList<Horario> horario) {
        ArrayList<Disciplina> h = new ArrayList<>();
        ArrayList<Turma> t = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_professor().equalsIgnoreCase(a)) {
                for (int j = 0; j < disciplina.size(); j++) {
                    if (disciplina.get(j).getSigla().equalsIgnoreCase(horario.get(i).getSigla_disciplina()) && !h.contains(disciplina.get(j))) {
                        h.add(disciplina.get(j));
                        for (int k = 0; k < turma.size(); k++) {
                            if (turma.get(k).getDesignacao().equalsIgnoreCase(horario.get(i).getDesignacao())) {
                                t.add(turma.get(k));
                            }
                        }
                    }
                }
            }
        }
        return h.toString() + t.toString();
    }

    /**
     *
     * @param disciplina
     * @param a
     * @param horario
     * @return lista de disciplinas que sao lecionadas numa sala Metodo que
     * lista as disciplinas de uma dada sala
     */
    public String ListarDisciplinaSala(ArrayList<Disciplina> disciplina, String a, ArrayList<Horario> horario) {
        ArrayList<Disciplina> h = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(a)) {
                for (int j = 0; j < disciplina.size(); j++) {
                    if (disciplina.get(j).getSigla().equalsIgnoreCase(horario.get(i).getSigla_disciplina()) && !h.contains(disciplina.get(j))) {
                        h.add(disciplina.get(j));
//                h.add(horario.get(i).getSigla_disciplina());
                    }
                }
            }
        }
        return h.toString();
    }

   /**
    * 
    * @return sigla
    */
    public String getSigla() {
        return sigla;
    }

   /**
    * 
    * @return  designaçao
    */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * 
     * @return numero de horas teoricas
     */
    public int getNumHorasTeoricas() {
        return numHorasTeoricas;
    }

    /**
     * 
     * @return numero de horas praticas
     */
    public int getNumHorasPraticas() {
        return numHorasPraticas;
    }

    /**
     * 
     * @return sigla do professor
     */
    public String getSigla_prof_t() {
        return sigla_prof_t;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    /**
     * 
     * @param sigla 
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * 
     * @param designacao 
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * 
     * @param numHorasTeoricas 
     */
    public void setNumHorasTeoricas(int numHorasTeoricas) {
        this.numHorasTeoricas = numHorasTeoricas;
    }

    /**
     * 
     * @param numHorasPraticas 
     */
    public void setNumHorasPraticas(int numHorasPraticas) {
        this.numHorasPraticas = numHorasPraticas;
    }

    /**
     * 
     * @param sigla_prof_t 
     */
    public void setSigla_prof_t(String sigla_prof_t) {
        this.sigla_prof_t = sigla_prof_t;
    }

    /**
     * 
     * @param professores 
     */
    public void setProfessores(ArrayList<Professor> professores) {
        for (int i = 0; i < professores.size(); i++) {
            this.professores.add(professores.get(i));
        }
    }

    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return "Disciplina com a sigla " + sigla + " e a designacao de " + designacao + " , tem " + numHorasTeoricas + "horas teoricas e " + numHorasPraticas + " horas praticas. O professor que lecciona as aulas teorica é " + sigla_prof_t + " , e os  professores das aulas praticas sao " + professores.toString() + "\n";

    }
}
