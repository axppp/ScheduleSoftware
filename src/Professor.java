
import data.Data;
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo Ponciano
 */
public class Professor extends Pessoa {
  
    /**
     * variavel que guarda a sigla do professor
     */
    private String sigla;
    /**
     * variavel que guarda a data de contratacao
     */
    private Data datacontratacao;
    /**
     * variavel que guarda a lista de disciplinas
     */
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();


    
    /**
     * 
     * @param sigla
     * @param nome
     * @param dia
     * @param mes
     * @param ano
     * @param email 
     * Construtor Professor
     */
    public Professor(String sigla,String nome,int dia, int mes, int ano,String email){
        super(nome, email);
        this.sigla = sigla;
        this.datacontratacao = new Data(dia,mes,ano);
    }

    /**
     * Construtor Professor vazio
     */
    public Professor() {
        
    }
    
    /**
     * 
     * @return 
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * 
     * @return 
     */
    public Data getDatacontratacao() {
        return datacontratacao;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
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
     * @param datacontratacao 
     */
    public void setDataContratacao(Data datacontratacao) {
        this.datacontratacao = datacontratacao;
    }
    
    

    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return " "+ sigla;
    } 
    
    /**
     * 
     * @return 
     */
    public String toStringProfessor()
    {
        return super.toString() + " é o professor que contem a sigla " + sigla + " e a data da sua contratacao foi "+ datacontratacao.getDia() + " do mes "+ datacontratacao.getMes()+" do ano de "+datacontratacao.getAno();
    }

    
   
    
}
