
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
    
    
}
