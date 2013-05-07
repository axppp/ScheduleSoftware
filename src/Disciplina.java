
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
    // variaveis de instancia

    private String sigla;
    private String designacao;
    private int numHorasTeoricas;
    private int numHorasPraticas;
    private String sigla_prof_t;
    private ArrayList<Professor> professores = new ArrayList<Professor>();

    /**
     * Construtor Disciplina
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

    Disciplina() {
    }

    /**
     * get getSigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * get getDesignacao
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * get getNumHorasTeoricas
     */
    public int getNumHorasTeoricas() {
        return numHorasTeoricas;
    }

    /**
     * get getNumHorasPraticas
     */
    public int getNumHorasPraticas() {
        return numHorasPraticas;
    }

    /**
     * get getSigla_prof_t
     */
    public String getSigla_prof_t() {
        return sigla_prof_t;
    }

    /**
     * get getProfessores
     */
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    /**
     * set getSigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * et getDesignacao
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * set getNumHorasTeoricas
     */
    public void setNumHorasTeoricas(int numHorasTeoricas) {
        this.numHorasTeoricas = numHorasTeoricas;
    }

    /**
     * set getNumHorasPraticas
     */
    public void setNumHorasPraticas(int numHorasPraticas) {
        this.numHorasPraticas = numHorasPraticas;
    }

    /**
     * set getSigla_prof_t
     */
    public void setSigla_prof_t(String sigla_prof_t) {
        this.sigla_prof_t = sigla_prof_t;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        for (int i = 0; i < professores.size(); i++) {
            this.professores.add(professores.get(i));
        }
    }

    @Override
    public String toString() {
        return "Disciplina com a sigla " + sigla + " e a designacao de " + designacao + " , tem " + numHorasTeoricas + "horas teoricas e " + numHorasPraticas + " horas praticas. O professor que lecciona as aulas teorica é " + sigla_prof_t + " , e os  professores das aulas praticas sao " + professores.toString() +"\n";

    }
}
