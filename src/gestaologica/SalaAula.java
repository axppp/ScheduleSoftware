package gestaologica;




import java.io.Serializable;
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
public class SalaAula implements Serializable{

    /**
     * variavel que vai guardar o codigo da sala
     */
    private String codigo;

    /**
     * variavel enum que vai guarda o tipo de sala
     */
    public enum tipoSala {

        ANFITIATRO, LABORATORIO
    }
    tipoSala a;
    private String tipoSala;
    /**
     * variavel que guarda a capacidade
     */
    private int capacidade;

    /**
     *
     * @param codigo
     * @param tipoSala
     * @param capacidade Construtor SalaAula
     */
    public SalaAula(String codigo, int tipoSala, int capacidade) {
        this.codigo = codigo;
        verificaTipoSala(tipoSala);
        this.capacidade = capacidade;
    }

    /**
     * Construtor SalaAula vazio
     */
    public SalaAula() {
    }

    /**
     *
     * @param sala
     * @param x
     * @param horario
     * @return Devolve um ArrayList de salas com a percentagem de ocupaçao
     * superior aquela que foi dada pelo utilizador
     *
     */
    public ArrayList<SalaAula> ocupacaoSala(ArrayList<SalaAula> sala, int x, ArrayList<Horario> horario) {
        Horario h = new Horario();
        ArrayList<SalaAula> s = new ArrayList<>();
        for (int i = 0; i < sala.size(); i++) {
//            System.out.println(sala.get(i).getCodigo());
            double j = sala.get(i).CargaHorariaSalaE(sala, horario);
//            System.out.println(j);
//            System.out.println((j / 50) * 100);
            if (((j / 50) * 100) > x) {
                System.out.println(sala.get(i));
                System.out.println("Ocupaçao é de " + (j / 50) * 100 + "\n");
                s.add(sala.get(i));
            }
        }
        if (s.isEmpty()) {
            System.out.println("Não existe salas com ocupação superior a " + x + "%.\n");
        }
//        System.out.println(s);
        return s;
    }

    /**
     *
     * @param disciplina
     * @param a
     * @param horario
     * @return lista de disciplinas que sao lecionadas numa sala Metodo que
     * lista as disciplinas de uma dada sala
     */
    public String ListarDisciplinaSala(ArrayList<Disciplina> disciplina, ArrayList<Horario> horario) {
        ArrayList<Disciplina> h = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(this.codigo)) {
                for (int j = 0; j < disciplina.size(); j++) {
                    if (disciplina.get(j).getSigla().equalsIgnoreCase(horario.get(i).getSigla_disciplina()) && !h.contains(disciplina.get(j))) {
                        h.add(disciplina.get(j));
//                h.add(horario.get(i).getSigla_disciplina());
                    }
                }
            }
        }
        return h.toString();
    }

    /**
     *
     * @param sala
     * @param horario
     * @return arraylist de horarios Metodo para listar o horario de uma
     * determinada sala
     */
    public ArrayList<Horario> listarHorarioSala(ArrayList<SalaAula> sala, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (codigo.equalsIgnoreCase(sala.get(i).getCodigo())) {
                t = sala.get(i).getCodigo();
            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
            }
        }

        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.getHora_inicio() - p2.getHora_inicio();
            }
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.getDia_semana() - p2.getDia_semana();
            }
        });
        if (h.isEmpty()) {
            System.out.println("Sala sem horario.\n");
        } else {
            System.out.println(h + "\n");
        }
        return h;
    }

    /**
     *
     * @param Salas
     * @return objecto sala de aula Metodo para listar dados de uma determinada
     * sala de aula
     */
    public SalaAula listarDadosSala(ArrayList<SalaAula> Salas) {
        SalaAula salaAula = new SalaAula();
        boolean flag = false;
        for (int i = 0; i < Salas.size(); i++) {
            if (codigo.equalsIgnoreCase(Salas.get(i).getCodigo())) {
                salaAula = Salas.get(i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Sala nao encontrado.\n");
        }
        System.out.println(salaAula + "\n");
        return salaAula;
    }

    /**
     *
     * @param sala
     * @param horario
     * @return numero de horas que uma sala tem durante a semana Metodo para
     * calcular a carga horaria de uma determinada sala
     */
    public int CargaHorariaSala(ArrayList<SalaAula> sala, ArrayList<Horario> horario) {
        int j = 0;
//        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (codigo.equalsIgnoreCase(sala.get(i).getCodigo())) {
                t = sala.get(i).getCodigo();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(t)) {
//                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        System.out.println("A Sala " + codigo + " tem " + j + " horas de carga horaria semanal." + "\n");
        return j;
    }

    /**
     *
     * @param sala
     * @param horario
     * @return numero de horas que uma sala tem durante a semana Metodo para
     * calcular a carga horaria especial para o metodo ocupacaoSala, de modo a
     * que nao apareça o System.out.println do metodo original na consola.
     */
    public int CargaHorariaSalaE(ArrayList<SalaAula> sala, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (codigo.equalsIgnoreCase(sala.get(i).getCodigo())) {
                t = sala.get(i).getCodigo();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        return j;
    }

    /**
     *
     * @param tipoSala Metodo que verifica o tipo de sala
     */
    public void verificaTipoSala(int tipoSala) {
        if (tipoSala == 1) {
            this.setTipoSala(a.ANFITIATRO.name());
        } else if (tipoSala == 2) {
            this.setTipoSala(a.LABORATORIO.name());
        }
    }

    /**
     * @return the tipoSala
     */
    public String getTipoSala() {
        return tipoSala;
    }

    /**
     * @param tipoSala the tipoSala to set
     */
    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    /**
     *
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @return
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @param capacidade
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     *
     * @param a
     * @param s
     * @param b
     * @param sala
     * @param horario
     * @return
     */
    public String SalaAulaExtra(int a, int b, ArrayList<SalaAula> sala, ArrayList<Horario> horario) {
        SalaAula salaaula = new SalaAula();
        Turma tur = new Turma();
        Professor prof = new Professor();
        Aluno aluno = new Aluno();
        Disciplina disc = new Disciplina();

        ArrayList<Horario> hor = new ArrayList<>();
        for (int i = 0; i < sala.size(); i++) {
            if (this.codigo.equalsIgnoreCase(sala.get(i).getCodigo())) {
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
            if (this.codigo.equalsIgnoreCase(horario.get(i).getCodigo_sala())) {
                if (a == horario.get(i).getDia_semana()) {
                    if (horario.get(i).getHora_inicio() > temp) {
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
        if (hor.size() == 0) {
            return "Sala disponivel das " + temp + " ate as 18.\n";
        }
        for (int i = 0; i < hor.size(); i++) {
            if (hor.get(i).getHora_inicio() >= b) {
                return hor.get(i).toStringAulaExtra();
            }
            if (hor.size() == i + 1 && 18 > temp) {
                return "Sala disponivel das " + temp + " ate as 18.\n";
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
        return "SalaAula{" + "codigo=" + codigo + ", tipoSala=" + getTipoSala() + ", capacidade=" + capacidade + '}';
    }
}
