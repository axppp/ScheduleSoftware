
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    public Disciplina(String sigla,String designacao, int numHorasTeoricas, int numHorasPraticas, String sigla_prof_t, ArrayList<Professor> professores) {
        this.sigla = sigla;
        this.designacao = designacao;
        this.numHorasTeoricas = numHorasTeoricas;
        this.numHorasPraticas = numHorasPraticas;
        this.sigla_prof_t = sigla_prof_t;
        for (int i = 0; i < professores.size(); i++) {
            this.professores.add(professores.get(i));
        }
    }
     
    @Override
    public String toString() {
        return "Disciplina com a sigla "+ sigla + " e a designacao de " + designacao + " , tem " + numHorasTeoricas + "horas teoricas e " + numHorasPraticas + " horas praticas.\n O professor que lecciona as aulas teorica é " + sigla_prof_t + " , e os  professores das aulas praticas sao "+ professores.toString();
        
    }
    
    
}
