
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class Aluno extends Pessoa {
   
    
    private int numeroAluno;
    private Date dataNasc;
    private int Telefone;
    private Turma turma;

    /**
     * Construtor Professor
     */
    public Aluno(int numeroAluno, Date dataNasc, int Telefone, Turma turma, String nome, Horario horario, String email) {
        super(nome,horario,email);
        this.numeroAluno = numeroAluno;
        this.dataNasc = dataNasc;
        this.Telefone = Telefone;
        this.turma = turma;
    }
    
    
    
}
