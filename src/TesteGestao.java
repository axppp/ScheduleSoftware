
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class TesteGestao {
    
     public static void main(String[] args) throws Exception {
         
    ArrayList<SalaAula> salas = new ArrayList<SalaAula>();
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Professor> professores = new ArrayList<Professor>();
    ArrayList<Turma> turmas = new ArrayList<Turma>();
    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    ArrayList<Horario> horarios = new ArrayList<Horario>();
         
          //  System.out.println("ola");
            
            CSV ola = new CSV();
            salas = ola.Sala();
            System.out.println(salas.toString());
            System.out.println("\n\n");
            alunos = ola.Alunos();
            System.out.println(alunos.toString());
             System.out.println("\n\n");
            professores = ola.Professor();
            System.out.println(professores.toString());
             System.out.println("\n\n");
            disciplinas = ola.Disciplinas();
            System.out.println(disciplinas.toString());
             System.out.println("\n\n");
            turmas = ola.Turmas();
            System.out.println(turmas.toString());
             System.out.println("\n\n");
            horarios = ola.Horario();
            System.out.println(horarios.toString());
            
    }
    
}
