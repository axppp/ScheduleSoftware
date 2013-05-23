package gestaogui;

import gestaologica.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Main class of the program.
 *
 */
public class Main {

    private static JanelaPrincipal maingui;
    public static ArrayList<SalaAula> salas;
    public static ArrayList<Aluno> alunos;
    public static ArrayList<Professor> professores;
    public static ArrayList<Turma> turmas;
    public static ArrayList<Disciplina> disciplinas;
    public static ArrayList<Horario> horarios;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Inserção dos ficheiros de alunos, professores, disciplinas, salas, turmas, e horários.
        lerEstado();

        Imagens img = new Imagens();
        CSV ola = new CSV();
        //if (ola.isDfgh() == true || ola.isGhjk() == true) {
            @SuppressWarnings("unused")
            SplashScreen splash = new SplashScreen(3000, img.splash, true);

            try {
                maingui = new JanelaPrincipal();
            } catch (URISyntaxException e) {
           }
        }
    


    private static void lerEstado() throws IOException, ClassNotFoundException {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("estado.bin"));
            salas = (ArrayList<SalaAula>) in.readObject();
            alunos = (ArrayList<Aluno>) in.readObject();
            professores = (ArrayList<Professor>) in.readObject();
            turmas = (ArrayList) in.readObject();
            disciplinas = (ArrayList<Disciplina>) in.readObject();
            horarios = (ArrayList<Horario>) in.readObject();
            in.close();
        } catch (IOException exc) {
            JOptionPane.showMessageDialog(maingui, "Estado Anterior Nao Lido", "A Carregar", JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException exc) {
            JOptionPane.showMessageDialog(maingui, "Estado Anterior Nao Lido", "A Carregar", JOptionPane.ERROR_MESSAGE);
        }
        
        /*if (!ola.getAluno().isEmpty() && !ola.getDisciplina().isEmpty() && !ola.getHorario().isEmpty() && !ola.getProfessor().isEmpty() && !ola.getSalaAula().isEmpty() && !ola.getTurma().isEmpty()) {
         s = ola.getSalaAula();
         a = ola.getAluno();
         p = ola.getProfessor();
         d = ola.getDisciplina();
         t = ola.getTurma();
         h = ola.getHorario();
         System.out.println("Ficheiros guardados da utilização anterior.");
         } else {
         s = ola.Sala();
         a = ola.Alunos();
         p = ola.Professor();
         d = ola.Disciplinas();
         t = ola.Turmas();
         h = ola.Horario();
         System.out.println("Novo.");
         }*/
    }
    
    public static void gravarEstado() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("estado.bin"));
			out.writeObject(salas);
			out.writeObject(alunos);
			out.writeObject(professores);
			out.writeObject(turmas);
			out.writeObject(disciplinas);
			out.writeObject(horarios);
			out.close();
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(maingui, "Status not saved!", "Closing Application", JOptionPane.ERROR_MESSAGE);
		}
	}

 

}
