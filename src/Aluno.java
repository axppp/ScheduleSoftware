
import data.Data;
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
    private Data dataNasc;
    private int Telefone;
    private String turma;

    /**
     * Construtor Aluno
     */
    public Aluno(int numeroAluno,String nome,int dia,int mes, int ano,int Telefone,String email,String turma) {
        super(nome,email);
        this.numeroAluno = numeroAluno;
        this.dataNasc = new Data(dia,mes,ano);
        this.Telefone = Telefone;
        this.turma = turma;
    }
    // gets e sets

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public Data getDataNasc() {
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

    public void setDataNasc(Data dataNasc) {
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
        return super.toString() + " é aluno e o seu numero é " + numeroAluno + " e nasceu no dia " + dataNasc.getDia() +" no mes de "+ dataNasc.getMes() +" e no ano "+ dataNasc.getAno() + "\n O contacto telefonico é "+ Telefone + "e esta colocado na turma " + turma ;
    }
    
    
    
    
}
