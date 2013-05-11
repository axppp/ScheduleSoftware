
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
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
        alunos = ola.Alunos();
        professores = ola.Professor();
        disciplinas = ola.Disciplinas();
        turmas = ola.Turmas();
        horarios = ola.Horario();
        
        


        //System.out.println(horarios.toString());
       // Horario h = new Horario(turmas.get(2),disciplinas.get(2),1,2,10,2,professores.get(2),salas.get(2));
       // Aluno a = new Aluno(1120845, "FRANCISCO BARROS BARROSO", 04, 03, 1993, 918004570, "franciscobarros@esi.pt");
        //h.listarHoraraioAluno(a);
        //System.out.println(horarios);
        //horarios.get(1).alterarHorario(h);
        
        //System.out.println(horarios.toString());
        //System.out.println(horarios.get(1));
        //horarios.get(1).apagarHorario(horarios,1);
        //System.out.println(horarios.toString());
        //for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(salas.get(0).disciplinasSala(salas.get(0).getCodigo(), horarios, disciplinas));
            
            
        //}
        
    }
}
