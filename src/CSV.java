
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
//                    //System.out.println(j);
                    int o = aluno.get(j).getNumeroAluno();
                    if (Integer.parseInt(c[i]) == o) {
                        y.add(aluno.get(j));
                        turma.get(j).setDesignacao(c[0]);
                        t++;
                       // System.out.println(x1.get(j));
//                        System.out.println(t);
//                        System.out.println(j);
                    }
                    j++;
                } while (turma.size() > j);
                //                System.out.println(c[0] + " " + c[i]);
                i++;
            } while (i < c.length);
//            System.out.println(c[1]);
            Turma a = new Turma(c[0], y);
//            System.out.println(fi.next());
//            System.out.println(fi.nextLine());
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

        // leitura de ficheiro linha-a-linha
        String[] c;
       
        do {
            
        
            String b = fi.nextLine();
            c = b.split(";");

           
            for (int l = 0; l <turma.size(); l++) {
               
                if (c[0].equalsIgnoreCase(turma.get(l).getDesignacao())) {
                    t = turma.get(l);
                
            }

           for(int q = 0; q < disciplina.size(); q++){                
                if (c[1].equalsIgnoreCase(disciplina.get(q).getSigla())) {
                    d = disciplina.get(q);
                }                              
            } 
           
            for (int k = 0; k < professor.size(); k++) {
                if (c[6].equalsIgnoreCase(professor.get(k).getSigla())) {
                    p = professor.get(k);
                }
            }
           
            for ( int u = 0; u < c.length; u++) {
                if (c[7].equalsIgnoreCase(salaAula.get(u).getCodigo())) {
                    s = salaAula.get(u);
                }              
            }
            if (c[2].equalsIgnoreCase("t")) {
                tipo = 1;
            }
            Horario a = new Horario(t, d, tipo, Integer.parseInt(c[3]), Integer.parseInt(c[4]), Integer.parseInt(c[5]), p, s);
            horario.add(a);
            
        }} while (fi.hasNextLine());
        
        
        return horario;
    }
}
