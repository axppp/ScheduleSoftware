
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author axppp
 */
public class SalaAula {

    private String codigo;

    SalaAula() {
    }

    public enum tipoSala {

        ANFITIATRO, LABORATORIO
    }
    tipoSala a;
    public String tipoSala;
    private int capacidade;

    public SalaAula(String codigo, int tipoSala, int capacidade) {
        this.codigo = codigo;
        verificaTipoSala(tipoSala);
        this.capacidade = capacidade;
    }

    public ArrayList<SalaAula> ocupacaoSala(ArrayList<SalaAula> sala, int x, ArrayList<Horario> horario) {
        Horario h = new Horario();
        ArrayList<SalaAula> s = new ArrayList<>();
        for (int i = 0; i < sala.size(); i++) {
//            System.out.println(sala.get(i).getCodigo());
            double j = h.CargaHorariaSala(sala, sala.get(i).getCodigo(), horario);
//            System.out.println(j);
            System.out.println((j / 50) * 100);
            if (((j / 50) * 100) > x) {
                s.add(sala.get(i));
            }
        }
//        System.out.println(s);
        return s;
    }

    public void verificaTipoSala(int tipoSala) {
        if (tipoSala == 1) {
            this.tipoSala = a.ANFITIATRO.name();
        } else if (tipoSala == 2) {
            this.tipoSala = a.LABORATORIO.name();
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String SalaAulaExtra(int a, String s, int b, ArrayList<SalaAula> sala, ArrayList<Horario> horario) {
        SalaAula salaaula = new SalaAula();
        Turma tur = new Turma();
        Professor prof = new Professor();
        Aluno aluno = new Aluno();
        Disciplina disc = new Disciplina();
        ArrayList<Horario> hor = new ArrayList<>();
        for (int i = 0; i < sala.size(); i++) {
            if (s.equalsIgnoreCase(sala.get(i).getCodigo())) {
                salaaula = sala.get(i);
            }
        }

        int temp = 8, duracao = 0;
        boolean flag = false;
        Collections.sort(horario, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.getHora_inicio() - p2.getHora_inicio();
            }
        });
        Collections.sort(horario, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.getDia_semana() - p2.getDia_semana();
            }
        });

        for (int i = 0; i < horario.size(); i++) {
//            System.out.println(horario.get(i).getHora_inicio());
            if (s.equalsIgnoreCase(horario.get(i).getCodigo_sala())) {
                System.out.println(1);
                if (a == horario.get(i).getDia_semana()) {
                    System.out.println(2);
                    if (horario.get(i).getHora_inicio() > temp) {
                        System.out.println(3);
                        duracao = horario.get(i).getHora_inicio() - temp;
                        temp = temp + duracao;

                        Horario ho = new Horario(tur, disc, 1, a, temp - duracao, duracao, prof, salaaula);
                        hor.add(ho);
                        temp = temp + horario.get(i).getDuracaoAula();

                    } else {
                        if (horario.get(i).getHora_inicio() == temp) {
                            duracao = horario.get(i).getDuracaoAula();
                            temp = temp + duracao;
                        }
                    }
                }
            }
        }
        System.out.println(hor.size());
        if (hor.size() == 0) {
//            System.out.println("me cocky cocky");
            return "Sala disponivel das " + temp + " ate as 18.";
        }
        for (int i = 0; i < hor.size(); i++) {
            System.out.println(i);
            if (hor.get(i).getHora_inicio() >= b) {
//                System.out.println("yo sucki sucki");
                return hor.get(i).toStringAulaExtra();
            }
            if (hor.size() == i + 1 && 18 > temp) {
//                System.out.println("me cocky cocky");
                return "Sala disponivel das " + temp + " ate as 18.";
            }
        }
        return "Sala nao disponivel.";
    }

//    public String[] disciplinasSala(String sala, ArrayList<Horario> horarios, ArrayList<Disciplina> disciplinas) {
//        String vector[] = new String[disciplinas.size()];
//        int count = 0;
//        for (int i = 0; i < horarios.size(); i++) {
//
//            if (horarios.get(i).getCodigo_sala().equalsIgnoreCase(sala)) {
//                if (horarios.get(i).getSigla_disciplina().contains(vector[i])) {
//                    System.out.println("hey");
//                }
//                vector[count] = horarios.get(i).getSigla_disciplina();
//                count++;
//                /*
//                 * if(i>0) { for (int j = 0; j < i; j++) {
//                 * if(vector[j].equalsIgnoreCase(horarios.get(j).getSigla_disciplina()))
//                 * { System.out.println("boda"); }
//                 *
//                 * }
//                 */
//            }
//            //}
//
//        }
//        return vector;
//    }

    @Override
    public String toString() {
        return "SalaAula{" + "codigo=" + codigo + ", tipoSala=" + tipoSala + ", capacidade=" + capacidade + '}';
    }
}
