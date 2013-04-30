
import data.Data;
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
    private Data datacontratacao;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();


    
    /**
     * Construtor Professor
     */
    public Professor(String sigla,String nome,int dia, int mes, int ano,String email){
        super(nome, email);
        this.sigla = sigla;
        this.datacontratacao = new Data(dia, mes,ano);
    }
    
    /**
     * get getSigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     *get getDataContratacao
     */
    public Data getDatacontratacao() {
        return datacontratacao;
    }
    
    /**
     * get getListaDisciplinas
     */
    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    
    /**
     * set setSigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * set setDataContratacao
     */
    public void setDataContratacao(Data datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    /**
<<<<<<< HEAD
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
=======
     * set setListaDisciplinas
>>>>>>> 02a0f0a854dd45cb6affabf69d33ead9ab2266bd
     */
    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
<<<<<<< HEAD
=======
    
    // temos que introduzir metodo para adicionar disciplinas a leccionar

    @Override
    public String toString() {
        return " "+ sigla;
    } 
    
    public String toStringProfessor()
    {
        return super.toString() + " é o professor que contem a sigla " + sigla + " e a data da sua contratacao foi "+ datacontratacao.getDia() + " do mes "+ datacontratacao.getMes()+" do ano de "+datacontratacao.getAno();
    }
>>>>>>> 02a0f0a854dd45cb6affabf69d33ead9ab2266bd
    
   
    
}
