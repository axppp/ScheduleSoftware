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
    public static ArrayList<SalaAula> s;
    public static ArrayList<Aluno> a;
    public static ArrayList<Professor> p;
    public static ArrayList<Turma> t;
    public static ArrayList<Disciplina> d;
    public static ArrayList<Horario> h;
    static CSV ola = new CSV();

    /**
     * The main method to start the program. This method will show a splash
     * image while loads the previous state of the program.
     *
     * @param args command line parameters
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Inserção dos ficheiros de alunos, professores, disciplinas, salas, turmas, e horários.

        ola.LerMemoriaFicheiro();

        if (!ola.getAluno().isEmpty() && !ola.getDisciplina().isEmpty() && !ola.getHorario().isEmpty() && !ola.getProfessor().isEmpty() && !ola.getSalaAula().isEmpty() && !ola.getTurma().isEmpty()) {
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
        }

        ola.testTXT();
        ola.test();

        Imagens img = new Imagens();

        if (ola.isDfgh() == true || ola.isGhjk() == true) {
            @SuppressWarnings("unused")
            SplashScreen splash = new SplashScreen(3000, img.splash, true);
            //lerEstadoAnterior();
            //adicionarLinguas();
            try {
                maingui = new JanelaPrincipal();
            } catch (URISyntaxException e) {
            }
        }
    }

    public static void gravarEstado() {
        try {
            ola.GravarMemoriaFicheiro();
            /*
             * try { ObjectOutputStream out = new ObjectOutputStream(new
             * FileOutputStream("estado.bin")); out.writeObject(atleta);
             * out.writeObject(modalidades); out.writeObject(provas);
             * out.writeObject(paises); out.writeObject(equipas);
             * out.writeObject(disciplinas); out.writeObject(jogos);
             * out.writeObject(lingua); out.close(); } catch (IOException exc) {
             * JOptionPane.showMessageDialog(maingui, "Status not saved!",
             * "Closing Application", JOptionPane.ERROR_MESSAGE);
             */
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the s
     */
    public static ArrayList<SalaAula> getS() {
        return s;
    }

    /**
     * @return the a
     */
    public static ArrayList<Aluno> getA() {
        return a;
    }

    /**
     * @return the p
     */
    public static ArrayList<Professor> getP() {
        return p;
    }

    /**
     * @return the t
     */
    public static ArrayList<Turma> getT() {
        return t;
    }

    /**
     * @return the d
     */
    public static ArrayList<Disciplina> getD() {
        return d;
    }

    /**
     * @return the h
     */
    public static ArrayList<Horario> getH() {
        return h;
    }
}
