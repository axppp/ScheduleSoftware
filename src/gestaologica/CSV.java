package gestaologica;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Ed
 */
public class CSV {
//codigo generico necessario ao funcionamento

    /**
     * Arraylist temporarios do tipo SalaAula
     */
    private ArrayList<SalaAula> salaAula = new ArrayList<SalaAula>();
    /**
     * Arraylist temporarios do tipo Aluno
     */
    private ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    /**
     * Arraylist temporarios do tipo Professor
     */
    private ArrayList<Professor> professor = new ArrayList<Professor>();
    /**
     * Arraylist temporarios do tipo Turma
     */
    private ArrayList<Turma> turma = new ArrayList<Turma>();
    /**
     * Arraylist temporarios do tipo Disciplina
     */
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    /**
     * Arraylist temporarios do tipo Horario
     */
    private ArrayList<Horario> horario = new ArrayList<Horario>();
    private boolean ghjk = true;
    private boolean dfgh = true;
    /**
     * Flag para mensagem de erro em caso de o programa nao ter ficheiros
     * basicos ou não conter informação nos ficheiros binarios
     */
    boolean fiAluno = true, fiProfessor = true, fiTurma = true, fiHorario = true, fiDisciplina = true, fiSala = true;
    /**
     * String que devolve o erro dos ficheiros .txt nao encontrados
     */
    String textoErro = "";

    //codigo para leitura de salas a partir do ficheiro
    /**
     *
     * @return arraylist de salas
     * @throws FileNotFoundException Metodo para ler do ficheiro salas.txt
     */
    public ArrayList<SalaAula> Sala() throws FileNotFoundException {
        try {
            Scanner fi = new Scanner(new File("src/Ficheiros/salas.txt"));
            String bb = fi.nextLine();

            String[] c;
            do {
                String b = fi.nextLine();
                c = b.split(";");
                SalaAula a = new SalaAula();
                if (c[1].equals("anfiteatro")) {
                    a = new SalaAula(c[0], 1, Integer.parseInt(c[2]));
                } else {
                    a = new SalaAula(c[0], 2, Integer.parseInt(c[2]));
                }
//            System.out.println(fi.next());
//            System.out.println(fi.nextLine());
                getSalaAula().add(a);
            } while (fi.hasNextLine());
        } catch (FileNotFoundException e) {
//            System.out.println("Ficheiro basico Salas não encontrado.");
            fiSala = false;
            ghjk = false;
        }
        return getSalaAula();

    }

    //codigo para leitura de alunos a partir do ficheiro
    //nota: A o metodo de classe Aluno, nao precisa de turma como requesito de construcçao
    //sendo que a turma do aluno é atribuida quando é lido ficheiro Turma.
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * alunos.txt
     */
    public ArrayList<Aluno> Alunos() throws FileNotFoundException {

        try {
            Scanner fi = new Scanner(new File("src/Ficheiros/alunos.txt"));
            String bb = fi.nextLine();
            String[] c;
            String[] c1;
            do {
                String b = fi.nextLine();
                c = b.split(";");
                c1 = c[2].split("/");
                Aluno a = new Aluno(Integer.parseInt(c[0]), c[1], Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), Integer.parseInt(c[3]), c[4]);
                getAluno().add(a);
            } while (fi.hasNextLine());
        } catch (FileNotFoundException e) {
//            System.out.println("Ficheiro basico de alunos não encontrado.");
//            JOptionPane.showMessageDialog(null, "Ficheiro basico dos alunos não encontrado.");
            fiAluno = false;
            ghjk = false;
        }
        return getAluno();
    }

    //codigo para leitura de Professores a partir do ficheiro
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * professores.txt
     */
    public ArrayList<Professor> Professor() throws FileNotFoundException {
        try {

            Scanner fi = new Scanner(new File("src/Ficheiros/professores.txt"));
            String bb = fi.nextLine();

            String[] c;
            String[] c1;
            do {
                String b = fi.nextLine();
                c = b.split(";");
                c1 = c[2].split("/");
                Professor a = new Professor(c[0], c[1], Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), c[3]);

                getProfessor().add(a);
            } while (fi.hasNextLine());
        } catch (FileNotFoundException e) {
//            System.out.println("Ficheiro basico de professores não encontrado.");
//            JOptionPane.showMessageDialog(null, "Ficheiro basico dos professores não encontrado.");
            fiProfessor = false;
            ghjk = false;
        }
        return getProfessor();
    }

    //codigo para leitura de turmas a partir do ficheiro
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * turmas.txt
     */
    public ArrayList<Turma> Turmas() throws FileNotFoundException {
        try {
            Scanner fi = new Scanner(new File("src/Ficheiros/turmas.txt"));
            String bb = fi.nextLine();

            String[] c;



            int t = 0;
            do {
                ArrayList<Aluno> y = new ArrayList<Aluno>();
                String b = fi.nextLine();
                c = b.split(";");

                int i = 1;
                do {
                    int j = 0;
//                System.out.println(Integer.parseInt(c[i]));
                    do {
//                    //System.out.println(j);
                        int o = getAluno().get(j).getNumeroAluno();
                        if (Integer.parseInt(c[i]) == o) {
                            y.add(getAluno().get(j));
                            getAluno().get(j).setTurma(c[0]);
//                        System.out.println(aluno.get(j));
                            t++;
                            // System.out.println(x1.get(j));
//                        System.out.println(t);
//                        System.out.println(j);
                        }
                        j++;
                    } while (getAluno().size() > j);
                    //                System.out.println(c[0] + " " + c[i]);
                    i++;
                } while (i < c.length);
//            System.out.println(c[1]);
                Turma a = new Turma(c[0], y);

                getTurma().add(a);


            } while (fi.hasNextLine());
        } catch (FileNotFoundException e) {
//            System.out.println("Ficheiro basico de turmas não encontrado.");
//            JOptionPane.showMessageDialog(null, "Ficheiro basico das turmas não encontrado.");
            fiTurma = false;
            ghjk = false;
        }
        return getTurma();
    }
    //codigo para leitura de Disciplinas a partir do ficheiro
    //nota: tambem atribui as Disciplinas aos Professores ja existentes se tiverem a sigla na lista

    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * disciplinas.txt
     */
    public ArrayList<Disciplina> Disciplinas() throws FileNotFoundException {

        try {
            Scanner fi = new Scanner(new File("src/Ficheiros/disciplinas.txt"));
            Scanner ji = new Scanner(new File("src/Ficheiros/disciplinas.txt"));
            String bb = fi.nextLine();
            String bbb = ji.nextLine();
// leitura de ficheiro linha-a-linha
            String[] c;
            int t = -1;
            do {

                ArrayList<Professor> y = new ArrayList<Professor>();
                String b = fi.nextLine();
                c = b.split(";");

                int i = 5;
                do {
                    int j = 0;
                    do {
                        String o = getProfessor().get(j).getSigla();
                        if (c[i].equalsIgnoreCase(o)) {
                            y.add(getProfessor().get(j));
//                        x2.get(j).getListaDisciplinas().add(x4.get(t));
                        }
                        j++;
                    } while (getProfessor().size() > j);
                    i++;
                } while (i < c.length);
//            System.out.println(c[1]);
                Disciplina a = new Disciplina(c[0], c[1], Integer.parseInt(c[2]), Integer.parseInt(c[3]), c[4], y);
                getDisciplina().add(a);
            } while (fi.hasNextLine());

            do {
                String b = ji.nextLine();
                t++;
                c = b.split(";");

                int i = 5;
                do {
                    int j = 0;
                    do {
                        String o = getProfessor().get(j).getSigla();
                        if (c[i].equalsIgnoreCase(o)) {
                            getProfessor().get(j).getListaDisciplinas().add(getDisciplina().get(t));
                        }
                        j++;
                    } while (getProfessor().size() > j);
                    i++;
                } while (i < c.length);
            } while (ji.hasNextLine());
            //System.out.println(professor.get(2).toStringProfessor());
        } catch (FileNotFoundException e) {
//            System.out.println("Ficheiro basico de disciplinas não encontrado.");
//            JOptionPane.showMessageDialog(null, "Ficheiro basico das disciplinas não encontrado.");
            fiDisciplina = false;
            ghjk = false;
        }
        return getDisciplina();
    }

    //codigo para leitura de Horarios a partir do ficheiro
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * horarios.txt
     */
    public ArrayList<Horario> Horario() throws FileNotFoundException {
        try {
            Scanner fi = new Scanner(new File("src/Ficheiros/horarios.txt"));
            String bb = fi.nextLine();

            int tipo = 2;
            Turma t = new Turma();
            Disciplina d = new Disciplina();
            Professor p = new Professor();
            SalaAula s = new SalaAula();
            Boolean valida;

            // leitura de ficheiro linha-a-linha
            String[] c;
            do {

                tipo = 2;
                String b = fi.nextLine();
                c = b.split(";");

                for (int l = 0; l < getTurma().size(); l++) {
                    if (c[0].equalsIgnoreCase(getTurma().get(l).getDesignacao())) {
                        t = getTurma().get(l);
                    }
                }
                for (int q = 0; q < getDisciplina().size(); q++) {
                    if (c[1].equalsIgnoreCase(getDisciplina().get(q).getSigla())) {
                        d = getDisciplina().get(q);
                    }
                }

                for (int k = 0; k < getProfessor().size(); k++) {
                    if (c[6].equalsIgnoreCase(getProfessor().get(k).getSigla())) {
                        p = getProfessor().get(k);
                    }
                }

                for (int u = 0; u < c.length; u++) {
                    if (c[7].equalsIgnoreCase(getSalaAula().get(u).getCodigo())) {
                        s = getSalaAula().get(u);
                    }
                }
                if (c[2].equalsIgnoreCase("t")) {
                    tipo = 1;
                }

                Horario a = new Horario(t, d, tipo, Integer.parseInt(c[3]), Integer.parseInt(c[4]), Integer.parseInt(c[5]), p, s);
                getHorario().add(a);
            } while (fi.hasNextLine());
        } catch (FileNotFoundException e) {
//            System.out.println("Ficheiro basico de horarios não encontrado.");
//            JOptionPane.showMessageDialog(null, "Ficheiro basico dos horarios não encontrado.");
            fiHorario = false;
            ghjk = false;
        }
        return getHorario();
    }

    public void lerEstado() throws IOException, ClassNotFoundException {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("estado.bin"));
            salaAula = (ArrayList<SalaAula>) in.readObject();
            aluno = (ArrayList<Aluno>) in.readObject();
            professor = (ArrayList<Professor>) in.readObject();
            turma = (ArrayList<Turma>) in.readObject();
            disciplina = (ArrayList<Disciplina>) in.readObject();
            horario = (ArrayList<Horario>) in.readObject();
            in.close();
        } catch (IOException exc) {
            JOptionPane.showMessageDialog(null, "Estado Anterior Nao Lido", "A Carregar", JOptionPane.ERROR_MESSAGE);
            dfgh = false;
        } catch (ClassNotFoundException exc) {
            JOptionPane.showMessageDialog(null, "Estado Anterior Nao Lido", "A Carregar", JOptionPane.ERROR_MESSAGE);
            dfgh = false;
        }
    }

    public void gravarEstado() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("estado.bin"));
            out.writeObject(salaAula);
            out.writeObject(aluno);
            out.writeObject(professor);
            out.writeObject(turma);
            out.writeObject(disciplina);
            out.writeObject(horario);
            out.close();
            System.out.println("ola");
        } catch (IOException exc) {
            JOptionPane.showMessageDialog(null, "Status not saved!", "Closing Application", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void testTXT() {
        if (isGhjk() == false) {
            if (fiAluno == false) {
                textoErro += "Ficheiro basico dos alunos não encontrado.\n";
            }
            if (fiProfessor == false) {
                textoErro += "Ficheiro basico dos professores não encontrado.\n";
            }
            if (fiTurma == false) {
                textoErro += "Ficheiro basico das turmas não encontrado.\n";
            }
            if (fiHorario == false) {
                textoErro += "Ficheiro basico dos horarios não encontrado.\n";
            }
            if (fiDisciplina == false) {
                textoErro += "Ficheiro basico das disciplinas não encontrado.\n";
            }
            if (fiSala == false) {
                textoErro += "Ficheiro basico das salas não encontrado.\n";
            }
            JOptionPane.showMessageDialog(null, textoErro);
        }
    }

    public void test() {
        if (isDfgh() == false && isGhjk() == false) {
            JOptionPane.showMessageDialog(null, "Não é possível arrancar o programa "
                    + "sem ficheiros binários\n e/ou sem os ficheiros basicos, por favor "
                    + "adicione os ficheiros\n basicos/binários para que o programa funcione.\n"
                    + "Obrigado pela atenção.");
        }
    }

    /**
     * @return the salaAula
     */
    public ArrayList<SalaAula> getSalaAula() {
        return salaAula;
    }

    /**
     * @return the aluno
     */
    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    /**
     * @return the professor
     */
    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    /**
     * @return the turma
     */
    public ArrayList<Turma> getTurma() {
        return turma;
    }

    /**
     * @return the disciplina
     */
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    /**
     * @return the horario
     */
    public ArrayList<Horario> getHorario() {
        return horario;
    }

    /**
     * @return the ghjk
     */
    public boolean isGhjk() {
        return ghjk;
    }

    /**
     * @return the dfgh
     */
    public boolean isDfgh() {
        return dfgh;
    }
}
