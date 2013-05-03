
import java.io.File;
import java.io.FileNotFoundException;
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

    private ArrayList<SalaAula> x = new ArrayList<SalaAula>();
    private ArrayList<Aluno> x1 = new ArrayList<Aluno>();
    private ArrayList<Professor> x2 = new ArrayList<Professor>();
    private ArrayList<Turma> x3 = new ArrayList<Turma>();
    private ArrayList<Disciplina> x4 = new ArrayList<Disciplina>();
    private ArrayList<Horario> x5 = new ArrayList<Horario>();

    //Codigo para testes..
//    SalaAula a = new SalaAula();
//    Aluno a1 = new Aluno();
//    Professor a2 = new Professor();
//    Turma a3 = new Turma();
//    Disciplina a4 = new Disciplina();
//    Horario a5 = new Horario();
    //Main para testes
    //Para testes na classe TesteGestao, tens de primeiro criar um objecto do tipo CSV
    public static void main(String[] args) throws Exception {
        CSV c = new CSV();
        c.Sala();
        c.Alunos();
        c.Professor();
        c.Turmas();
        c.Disciplinas();
        c.Horario();
    }

    //codigo para leitura de salas a partir do ficheiro
    private void Sala() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("ficheiros\\salas.txt"));
        String bb = fi.nextLine();
//        String ax = fi.nextLine();
//        System.out.println(a);
// leitura de ficheiro linha-a-linha
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
            x.add(a);
        } while (fi.hasNextLine());
    }

    //codigo para leitura de alunos a partir do ficheiro
    //nota: A o metodo de classe Aluno, nao precisa de turma como requesito de construcçao
    //sendo que a turma do aluno é atribuida quando é lido ficheiro Turma.
    private void Alunos() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("ficheiros\\alunos.txt"));
        String bb = fi.nextLine();
//        String ax = fi.nextLine();
//        System.out.println(a);
// leitura de ficheiro linha-a-linha
        String[] c;
        String[] c1;
        do {
            String b = fi.nextLine();
            c = b.split(";");
            c1 = c[2].split("/");
//            if (c[1].equals("anfiteatro")) {
//                SalaAula a = new SalaAula(c[0], metodo_convert_String_to_enum("anfiteatro"), Integer.parseInt(c[2]));
//            }
//            System.out.println(c[1]);
//            System.out.println(c1[0] + " " + c1[1] + " " + c1[2]);
            Aluno a = new Aluno(Integer.parseInt(c[0]), c[1], Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), Integer.parseInt(c[3]), c[4]);
//            System.out.println(fi.next());
//            System.out.println(fi.nextLine());
            x1.add(a);
        } while (fi.hasNextLine());
    }

    //codigo para leitura de Professores a partir do ficheiro
    private void Professor() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("ficheiros\\professores.txt"));
        String bb = fi.nextLine();

        String[] c;
        String[] c1;
        do {
            String b = fi.nextLine();
            c = b.split(";");
            c1 = c[2].split("/");
            Professor a = new Professor(c[0], c[1], Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), c[3]);

            x2.add(a);
        } while (fi.hasNextLine());
    }

    //codigo para leitura de turmas a partir do ficheiro
    private void Turmas() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("ficheiros\\turmas.txt"));
        String bb = fi.nextLine();
//        String ax = fi.nextLine();
//        System.out.println(a);
// leitura de ficheiro linha-a-linha
        String[] c;

        ArrayList<Aluno> y = new ArrayList<Aluno>();

        int t = 0;
        do {
            String b = fi.nextLine();
            c = b.split(";");

            int i = 1;
            do {
                int j = 0;
//                System.out.println(Integer.parseInt(c[i]));
                do {
//                    System.out.println(j);
                    int o = x1.get(j).getNumeroAluno();
                    if (Integer.parseInt(c[i]) == o) {
                        y.add(x1.get(j));
                        x1.get(j).setTurma(c[0]);
                        t++;
                        System.out.println(x1.get(j));
//                        System.out.println(t);
//                        System.out.println(j);
                    }
                    j++;
                } while (x1.size() > j);
                //                System.out.println(c[0] + " " + c[i]);
                i++;
            } while (i < c.length);
//            System.out.println(c[1]);
            Turma a = new Turma(c[0], y);
//            System.out.println(fi.next());
//            System.out.println(fi.nextLine());
            x3.add(a);

        } while (fi.hasNextLine());
    }

    //codigo para leitura de Disciplinas a partir do ficheiro
    //nota: tambem atribui as Disciplinas aos Professores ja existentes se tiverem a sigla na lista
    private void Disciplinas() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("ficheiros\\disciplinas.txt"));
        Scanner ji = new Scanner(new File("ficheiros\\disciplinas.txt"));
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
                    String o = x2.get(j).getSigla();
                    if (c[i].equalsIgnoreCase(o)) {
                        y.add(x2.get(j));
//                        x2.get(j).getListaDisciplinas().add(x4.get(t));
                    }
                    j++;
                } while (x2.size() > j);
                i++;
            } while (i < c.length);
//            System.out.println(c[1]);
            Disciplina a = new Disciplina(c[0], c[1], Integer.parseInt(c[2]), Integer.parseInt(c[3]), c[4], y);
            x4.add(a);
        } while (fi.hasNextLine());

        do {
            String b = ji.nextLine();
            t++;
            c = b.split(";");

            int i = 5;
            do {
                int j = 0;
                do {
                    String o = x2.get(j).getSigla();
                    if (c[i].equalsIgnoreCase(o)) {
                        x2.get(j).getListaDisciplinas().add(x4.get(t));
                    }
                    j++;
                } while (x2.size() > j);
                i++;
            } while (i < c.length);
        } while (ji.hasNextLine());
        System.out.println(x2.get(2).toStringProfessor());
    }

    //codigo para leitura de Horarios a partir do ficheiro
    private void Horario() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("ficheiros\\horarios.txt"));
        String bb = fi.nextLine();

        int tipo = 2;
        Turma t = new Turma();
        Disciplina d = new Disciplina();
        Professor p = new Professor();
        SalaAula s = new SalaAula();

// leitura de ficheiro linha-a-linha
        String[] c;
        int j = 0;
        do {
            String b = fi.nextLine();
            c = b.split(";");
            int i = 0;
            do {
                if (c[0].equalsIgnoreCase(x3.get(i).getDesignacao())) {
                    t = x3.get(i);
                }
                i++;
            } while (i < x3.size());

            do {
                if (c[1].equalsIgnoreCase(x4.get(i).getSigla())) {
                    d = x4.get(i);
                }
                i++;
            } while (i < x4.size());

            do {
                if (c[6].equalsIgnoreCase(x2.get(i).getSigla())) {
                    p = x2.get(i);
                }
                i++;
            } while (i < x2.size());
            do {
                if (c[7].equalsIgnoreCase(x.get(i).getCodigo())) {
                    s = x.get(i);
                }
                i++;
            } while (i < x.size());

            if (c[2].equalsIgnoreCase("t")) {
                tipo = 1;
            }
            Horario a = new Horario(t, d, tipo, Integer.parseInt(c[3]), Integer.parseInt(c[4]), Integer.parseInt(c[5]), p, s);
            x5.add(a);
            j++;
        } while (fi.hasNextLine());
        System.out.println(j);
        System.out.println(x5);
    }
}
