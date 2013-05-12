
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

    ArrayList<SalaAula> salaAula = new ArrayList<SalaAula>();
    ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    ArrayList<Professor> professor = new ArrayList<Professor>();
    ArrayList<Turma> turma = new ArrayList<Turma>();
    ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    ArrayList<Horario> horario = new ArrayList<Horario>();

    //codigo para leitura de salas a partir do ficheiro
    public ArrayList<SalaAula> Sala() throws FileNotFoundException {

        Scanner fi = new Scanner(new File("./salas.txt"));
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
    public ArrayList<Aluno> Alunos() throws FileNotFoundException {


        Scanner fi = new Scanner(new File("./alunos.txt"));
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
    public ArrayList<Professor> Professor() throws FileNotFoundException {


        Scanner fi = new Scanner(new File("./professores.txt"));
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
    public ArrayList<Turma> Turmas() throws FileNotFoundException {

        Scanner fi = new Scanner(new File("./turmas.txt"));
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

    public ArrayList<Disciplina> Disciplinas() throws FileNotFoundException {


        Scanner fi = new Scanner(new File("./disciplinas.txt"));
        Scanner ji = new Scanner(new File("./disciplinas.txt"));
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
    public ArrayList<Horario> Horario() throws FileNotFoundException {
        Scanner fi = new Scanner(new File("./horarios.txt"));
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
<<<<<<< HEAD
            
        } while (fi.hasNextLine());
        return horario;
    }
=======
            //System.out.println(valida);
            /*
             * if (valida == false) {
             *
             * } else if (valida == true) { System.out.println("pumbaz numa
             * vista"); //String ola = fi.nextLine(); //valida = false; }
             */

            //System.out.println("estou no fim.");
        } while (fi.hasNextLine());
        return horario;
    }

    public boolean validacaoSala(ArrayList<Horario> horario, Horario horarioADD) {

        for (int i = 0; i < horario.size(); i++) {

            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(horarioADD.getCodigo_sala()) && horario.get(i).getDesignacao().equalsIgnoreCase(horarioADD.getDesignacao()) && (horario.get(i).getSigla_professor().equalsIgnoreCase(horarioADD.getSigla_professor()) || horario.get(i).getDia_semana() == horarioADD.getDia_semana() || horario.get(i).getHora_inicio() == horarioADD.getHora_inicio())) {
                return true;
            } else if (valida == true) {
                System.out.println("pumbaz numa vista");
                //String ola = fi.nextLine();
                //valida = false;
            }
              
                    //System.out.println("estou no fim.");
        }
        while (fi.hasNextLine());
        return horario;
    }

    public void validacaoSala(ArrayList<Horario> horario) {
        for (int j = 0; j < horario.size(); j++) {
            for (int i = 0; i < horario.size(); i++) {
                if (horario.get(j).getCodigo_sala().equalsIgnoreCase(horario.get(i).getCodigo_sala()) && horario.get(j).getDesignacao().equalsIgnoreCase(horario.get(i).getDesignacao()) && horario.get(j).getSigla_professor().equalsIgnoreCase(horario.get(i).getSigla_professor()) && horario.get(j).getDia_semana() == horario.get(i).getDia_semana() && horario.get(j).getHora_inicio() == horario.get(i).getHora_inicio()) {
//                    System.out.println("a linha " + j+"e igual a " + i);
                    //System.out.println(horario.get(i).getSigla_disciplina());
                }

            }

        }
        return false;
    }
>>>>>>> 2bc9ef9b3b595b493a24642795bc7193f7b2e602
}
