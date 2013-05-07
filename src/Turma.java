
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class Turma {
    
    private String designacao;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(String designacao, ArrayList<Aluno> aluno) {
        this.designacao = designacao;
        for (int i = 0; i < alunos.size(); i++) {
            this.alunos.add(aluno.get(i));
        }   
    }

    Turma() {
        
    }
    
    /**
     * Get Designação
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Get Alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
    
    
    /**
     * Adiciona Aluno
     */
    public void addAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
    }
}
