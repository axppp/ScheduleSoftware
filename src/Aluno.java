
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

    /**
     * @return the numeroAluno
     */
    public int getNumeroAluno() {
        return numeroAluno;
    }

    /**
     * @param numeroAluno the numeroAluno to set
     */
    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    /**
     * @return the dataNasc
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the Telefone
     */
    public int getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
    
}
