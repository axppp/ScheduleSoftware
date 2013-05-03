
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

    Professor() {
        
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
    
    // temos que introduzir metodo para adicionar disciplinas a leccionar

    @Override
    public String toString() {
        return " "+ sigla;
    } 
    
    public String toStringProfessor()
    {
        return super.toString() + " é o professor que contem a sigla " + sigla + " e a data da sua contratacao foi "+ datacontratacao.getDia() + " do mes "+ datacontratacao.getMes()+" do ano de "+datacontratacao.getAno();
    }

    
   
    
}
