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
    /**
     * Flag para mensagem de erro em caso de o programa nao ter ficheiros
     * basicos ou não conter informação nos ficheiros binarios
     */
    boolean ghjk = true, dfgh = true;

    //codigo para leitura de salas a partir do ficheiro
    /**
     *
     * @return arraylist de salas
     * @throws FileNotFoundException Metodo para ler do ficheiro salas.txt
     */
    public ArrayList<SalaAula> Sala() throws FileNotFoundException {
        try {
            Scanner fi = new Scanner(new File("../pot/Ficheiros/salas.txt"));
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
            JOptionPane.showMessageDialog(null, "Ficheiro basico das salas não encontrado.");
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
            Scanner fi = new Scanner(new File("../pot/Ficheiros/alunos.txt"));
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
            JOptionPane.showMessageDialog(null, "Ficheiro basico dos alunos não encontrado.");
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

            Scanner fi = new Scanner(new File("../pot/Ficheiros/professores.txt"));
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
            JOptionPane.showMessageDialog(null, "Ficheiro basico dos professores não encontrado.");
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
            Scanner fi = new Scanner(new File("../pot/Ficheiros/turmas.txt"));
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
            JOptionPane.showMessageDialog(null, "Ficheiro basico das turmas não encontrado.");
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
            Scanner fi = new Scanner(new File("../pot/Ficheiros/disciplinas.txt"));
            Scanner ji = new Scanner(new File("../pot/Ficheiros/disciplinas.txt"));
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
            JOptionPane.showMessageDialog(null, "Ficheiro basico das disciplinas não encontrado.");
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
            Scanner fi = new Scanner(new File("../pot/Ficheiros/horarios.txt"));
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
            JOptionPane.showMessageDialog(null, "Ficheiro basico dos horarios não encontrado.");
            ghjk = false;
        }
        return getHorario();
    }

    public void GravarMemoriaFicheiro() throws IOException {
        try {
            File h = new File("../pot/Ficheiros/Horario");
            FileOutputStream ho = new FileOutputStream(h);
            ObjectOutputStream hoo = new ObjectOutputStream(ho);
            hoo.writeObject(getHorario());
            ho.close();

            File a = new File("../pot/Ficheiros/Aluno");
            FileOutputStream al = new FileOutputStream(a);
            ObjectOutputStream alu = new ObjectOutputStream(al);
            alu.writeObject(getAluno());
            al.close();

            File p = new File("../pot/Ficheiros/Professor");
            FileOutputStream pr = new FileOutputStream(p);
            ObjectOutputStream pro = new ObjectOutputStream(pr);
            pro.writeObject(getProfessor());
            pr.close();

            File d = new File("../pot/Ficheiros/Disciplina");
            FileOutputStream di = new FileOutputStream(d);
            ObjectOutputStream dis = new ObjectOutputStream(di);
            dis.writeObject(getDisciplina());
            di.close();

            File s = new File("../pot/Ficheiros/Salas");
            FileOutputStream sa = new FileOutputStream(s);
            ObjectOutputStream sal = new ObjectOutputStream(sa);
            sal.writeObject(getSalaAula());
            sa.close();

            File t = new File("../pot/Ficheiros/Turma");
            FileOutputStream tu = new FileOutputStream(t);
            ObjectOutputStream tur = new ObjectOutputStream(tu);
            tur.writeObject(getTurma());
            tu.close();
        } catch (IOException e) {
//            System.out.println("Nada para gravar.");
            JOptionPane.showMessageDialog(null, "Nada para gravar.");
        }
    }

    public void LerMemoriaFicheiro() throws IOException, ClassNotFoundException {
        try {
            FileInputStream h = new FileInputStream("../pot/Ficheiros/Horario");
            ObjectInputStream ho = new ObjectInputStream(h);
            this.horario = (ArrayList<Horario>) ho.readObject();
            h.close();

            FileInputStream a = new FileInputStream("../pot/Ficheiros/Aluno");
            ObjectInputStream al = new ObjectInputStream(a);
            this.aluno = (ArrayList<Aluno>) al.readObject();
            a.close();

            FileInputStream p = new FileInputStream("../pot/Ficheiros/Professor");
            ObjectInputStream po = new ObjectInputStream(p);
            this.professor = (ArrayList<Professor>) po.readObject();
            p.close();

            FileInputStream s = new FileInputStream("../pot/Ficheiros/Salas");
            ObjectInputStream sa = new ObjectInputStream(s);
            this.salaAula = (ArrayList<SalaAula>) sa.readObject();
            s.close();

            FileInputStream d = new FileInputStream("../pot/Ficheiros/Disciplina");
            ObjectInputStream di = new ObjectInputStream(d);
            this.disciplina = (ArrayList<Disciplina>) di.readObject();
            d.close();

            FileInputStream t = new FileInputStream("../pot/Ficheiros/Turma");
            ObjectInputStream tu = new ObjectInputStream(t);
            this.turma = (ArrayList<Turma>) tu.readObject();
            t.close();
        } catch (IOException e) {
//            System.out.println("Ficheiro não encontrado.");
            JOptionPane.showMessageDialog(null, "Ficheiros binários não encontrado.");
            dfgh = false;
        }
    }

    public void test() {
        if (dfgh == false && ghjk == false) {
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
}