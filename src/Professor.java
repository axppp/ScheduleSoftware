
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo Ponciano
 */
public class Professor extends Pessoa {
  
    
    private String sigla;
    private Date datacontratacao;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();

    
    /**
     * Construtor Professor
     */
    public Professor(String sigla, Date datacontratacao, String nome, Horario horario, String email) {
        super(nome, horario, email);
        this.sigla = sigla;
        this.datacontratacao = datacontratacao;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the datacontratacao
     */
    public Date getDatacontratacao() {
        return datacontratacao;
    }

    /**
     * @param datacontratacao the datacontratacao to set
     */
    public void setDatacontratacao(Date datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    /**
     * @return the listaDisciplinas
     */
    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     * @param listaDisciplinas the listaDisciplinas to set
     */
    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
    
    
}
