
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
    private String turma;

    /**
     * Construtor Professor
     */
    public Aluno(int numeroAluno, Date dataNasc, int Telefone, String turma, String nome, String email) {
        super(nome,email);
        this.numeroAluno = numeroAluno;
        this.dataNasc = dataNasc;
        this.Telefone = Telefone;
        this.turma = turma;
    }
    // gets e sets

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public int getTelefone() {
        return Telefone;
    }

    public String getTurma() {
        return turma;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    //metodo toString

    @Override
    public String toString() {
        return "Aluno{" + "numeroAluno=" + numeroAluno + ", dataNasc=" + dataNasc + ", Telefone=" + Telefone + ", turma=" + turma + '}';
    }
    
    
    
    
}
