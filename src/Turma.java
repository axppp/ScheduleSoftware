
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
    
    
    
    
    // to string da turma tem que ser a descricao
}
