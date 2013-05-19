
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
    ArrayList<SalaAula> salaAula = new ArrayList<SalaAula>();
    /**
     * Arraylist temporarios do tipo Aluno
     */
    ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    /**
     * Arraylist temporarios do tipo Professor
     */
    ArrayList<Professor> professor = new ArrayList<Professor>();
    /**
     * Arraylist temporarios do tipo Turma
     */
    ArrayList<Turma> turma = new ArrayList<Turma>();
    /**
     * Arraylist temporarios do tipo Disciplina
     */
    ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    /**
     * Arraylist temporarios do tipo Horario
     */
    ArrayList<Horario> horario = new ArrayList<Horario>();

    //codigo para leitura de salas a partir do ficheiro
    /**
     *
     * @return arraylist de salas
     * @throws FileNotFoundException Metodo para ler do ficheiro salas.txt
     */
    public ArrayList<SalaAula> Sala() throws FileNotFoundException {

        Scanner fi = new Scanner(new File("./Ficheiros/salas.txt"));
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
            salaAula.add(a);
        } while (fi.hasNextLine());

        return salaAula;
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


        Scanner fi = new Scanner(new File("./Ficheiros/alunos.txt"));
        String bb = fi.nextLine();
        String[] c;
        String[] c1;
        do {
            String b = fi.nextLine();
            c = b.split(";");
            c1 = c[2].split("/");
            Aluno a = new Aluno(Integer.parseInt(c[0]), c[1], Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), Integer.parseInt(c[3]), c[4]);
            aluno.add(a);
        } while (fi.hasNextLine());
        return aluno;
    }

    //codigo para leitura de Professores a partir do ficheiro
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * professores.txt
     */
    public ArrayList<Professor> Professor() throws FileNotFoundException {


        Scanner fi = new Scanner(new File("./Ficheiros/professores.txt"));
        String bb = fi.nextLine();

        String[] c;
        String[] c1;
        do {
            String b = fi.nextLine();
            c = b.split(";");
            c1 = c[2].split("/");
            Professor a = new Professor(c[0], c[1], Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), c[3]);

            professor.add(a);
        } while (fi.hasNextLine());
        return professor;
    }

    //codigo para leitura de turmas a partir do ficheiro
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * turmas.txt
     */
    public ArrayList<Turma> Turmas() throws FileNotFoundException {

        Scanner fi = new Scanner(new File("./Ficheiros/turmas.txt"));
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
                    int o = aluno.get(j).getNumeroAluno();
                    if (Integer.parseInt(c[i]) == o) {
                        y.add(aluno.get(j));
                        aluno.get(j).setTurma(c[0]);
//                        System.out.println(aluno.get(j));
                        t++;
                        // System.out.println(x1.get(j));
//                        System.out.println(t);
//                        System.out.println(j);
                    }
                    j++;
                } while (aluno.size() > j);
                //                System.out.println(c[0] + " " + c[i]);
                i++;
            } while (i < c.length);
//            System.out.println(c[1]);
            Turma a = new Turma(c[0], y);

            turma.add(a);


        } while (fi.hasNextLine());
        return turma;
    }
    //codigo para leitura de Disciplinas a partir do ficheiro
    //nota: tambem atribui as Disciplinas aos Professores ja existentes se tiverem a sigla na lista

    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * disciplinas.txt
     */
    public ArrayList<Disciplina> Disciplinas() throws FileNotFoundException {


        Scanner fi = new Scanner(new File("./Ficheiros/disciplinas.txt"));
        Scanner ji = new Scanner(new File("./Ficheiros/disciplinas.txt"));
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
                    String o = professor.get(j).getSigla();
                    if (c[i].equalsIgnoreCase(o)) {
                        y.add(professor.get(j));
//                        x2.get(j).getListaDisciplinas().add(x4.get(t));
                    }
                    j++;
                } while (professor.size() > j);
                i++;
            } while (i < c.length);
//            System.out.println(c[1]);
            Disciplina a = new Disciplina(c[0], c[1], Integer.parseInt(c[2]), Integer.parseInt(c[3]), c[4], y);
            disciplina.add(a);
        } while (fi.hasNextLine());

        do {
            String b = ji.nextLine();
            t++;
            c = b.split(";");

            int i = 5;
            do {
                int j = 0;
                do {
                    String o = professor.get(j).getSigla();
                    if (c[i].equalsIgnoreCase(o)) {
                        professor.get(j).getListaDisciplinas().add(disciplina.get(t));
                    }
                    j++;
                } while (professor.size() > j);
                i++;
            } while (i < c.length);
        } while (ji.hasNextLine());
        //System.out.println(professor.get(2).toStringProfessor());
        return disciplina;
    }

    //codigo para leitura de Horarios a partir do ficheiro
    /**
     *
     * @return @throws FileNotFoundException Metodo para ler do ficheiro
     * horarios.txt
     */
    public ArrayList<Horario> Horario() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("./Ficheiros/horarios.txt"));
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

            for (int l = 0; l < turma.size(); l++) {
                if (c[0].equalsIgnoreCase(turma.get(l).getDesignacao())) {
                    t = turma.get(l);
                }
            }
            for (int q = 0; q < disciplina.size(); q++) {
                if (c[1].equalsIgnoreCase(disciplina.get(q).getSigla())) {
                    d = disciplina.get(q);
                }
            }

            for (int k = 0; k < professor.size(); k++) {
                if (c[6].equalsIgnoreCase(professor.get(k).getSigla())) {
                    p = professor.get(k);
                }
            }

            for (int u = 0; u < c.length; u++) {
                if (c[7].equalsIgnoreCase(salaAula.get(u).getCodigo())) {
                    s = salaAula.get(u);
                }
            }
            if (c[2].equalsIgnoreCase("t")) {
                tipo = 1;
            }

            Horario a = new Horario(t, d, tipo, Integer.parseInt(c[3]), Integer.parseInt(c[4]), Integer.parseInt(c[5]), p, s);
            horario.add(a);
        } while (fi.hasNextLine());
        return horario;
    }

    public void GravarMemoriaFicheiro() throws IOException {
        File h = new File("Ficheiros/Horario");
        FileOutputStream ho = new FileOutputStream(h);
        ObjectOutputStream hoo = new ObjectOutputStream(ho);
        hoo.writeObject(horario);
        ho.close();

        File a = new File("Ficheiros/Aluno");
        FileOutputStream al = new FileOutputStream(a);
        ObjectOutputStream alu = new ObjectOutputStream(al);
        alu.writeObject(aluno);
        al.close();

        File p = new File("Ficheiros/Professor");
        FileOutputStream pr = new FileOutputStream(p);
        ObjectOutputStream pro = new ObjectOutputStream(pr);
        pro.writeObject(professor);
        pr.close();

        File d = new File("Ficheiros/Disciplina");
        FileOutputStream di = new FileOutputStream(d);
        ObjectOutputStream dis = new ObjectOutputStream(di);
        dis.writeObject(disciplina);
        di.close();

        File s = new File("Ficheiros/Salas");
        FileOutputStream sa = new FileOutputStream(s);
        ObjectOutputStream sal = new ObjectOutputStream(sa);
        sal.writeObject(salaAula);
        sa.close();

        File t = new File("Ficheiros/Turma");
        FileOutputStream tu = new FileOutputStream(t);
        ObjectOutputStream tur = new ObjectOutputStream(tu);
        tur.writeObject(turma);
        tu.close();
    }

    public void LerMemoriaFicheiro() throws IOException, ClassNotFoundException {
        try {
            FileInputStream h = new FileInputStream("Ficheiros/Horario");
            ObjectInputStream ho = new ObjectInputStream(h);
            this.horario = (ArrayList<Horario>) ho.readObject();
            h.close();

            FileInputStream a = new FileInputStream("Ficheiros/Aluno");
            ObjectInputStream al = new ObjectInputStream(a);
            this.aluno = (ArrayList<Aluno>) al.readObject();
            a.close();

            FileInputStream p = new FileInputStream("Ficheiros/Professor");
            ObjectInputStream po = new ObjectInputStream(p);
            this.professor = (ArrayList<Professor>) po.readObject();
            p.close();

            FileInputStream s = new FileInputStream("Ficheiros/Salas");
            ObjectInputStream sa = new ObjectInputStream(s);
            this.salaAula = (ArrayList<SalaAula>) sa.readObject();
            s.close();

            FileInputStream d = new FileInputStream("Ficheiros/Disciplina");
            ObjectInputStream di = new ObjectInputStream(d);
            this.disciplina = (ArrayList<Disciplina>) di.readObject();
            d.close();

            FileInputStream t = new FileInputStream("Ficheiros/Turma");
            ObjectInputStream tu = new ObjectInputStream(t);
            this.turma = (ArrayList<Turma>) tu.readObject();
            t.close();
        } catch (IOException e) {
            System.out.println("Ficheiro não encontrado.");
        }
    }
}
