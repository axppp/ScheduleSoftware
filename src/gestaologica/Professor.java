package gestaologica;

import gestaologica.Data;
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
 * @author Paulo Ponciano
 */
public class Professor extends Pessoa implements Serializable {

    /**
     * variavel que guarda a sigla do professor
     */
    private String sigla;
    /**
     * variavel que guarda a data de contratacao
     */
    private Data datacontratacao;
    /**
     * variavel que guarda a lista de disciplinas
     */
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();

    /**
     *
     * @param sigla
     * @param nome
     * @param dia
     * @param mes
     * @param ano
     * @param email Construtor Professor
     */
    public Professor(String sigla, String nome, int dia, int mes, int ano, String email) {
        super(nome, email);
        this.sigla = sigla;
        this.datacontratacao = new Data(dia, mes, ano);
    }

    /**
     * Construtor Professor vazio
     */
    public Professor() {
    }

    /**
     *
     * @param turma
     * @param disciplina
     * @param a
     * @param horario
     * @return lista de disciplinas leccionadas pelo professor Metodo que lista
     * as disciplinas de um dado professor
     */
    public String ListarDisciplinaProfessor(ArrayList<Turma> turma, ArrayList<Disciplina> disciplina, ArrayList<Horario> horario) {
        ArrayList<Disciplina> h = new ArrayList<>();
        ArrayList<Turma> t = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_professor().equalsIgnoreCase(this.sigla)) {
                for (int j = 0; j < disciplina.size(); j++) {
                    if (disciplina.get(j).getSigla().equalsIgnoreCase(horario.get(i).getSigla_disciplina()) && !h.contains(disciplina.get(j))) {
                        h.add(disciplina.get(j));
                        for (int k = 0; k < turma.size(); k++) {
                            if (turma.get(k).getDesignacao().equalsIgnoreCase(horario.get(i).getDesignacao())) {
                                if (t.isEmpty()) {
                                    t.add(turma.get(k));
                                } else {
                                    for (int l = 0; l < t.size(); l++) {
                                        if (!t.get(l).equals(turma.get(k))) {
                                            t.add(turma.get(k));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "O Professor " + this.getNome() + " lecciona a(s) \n" + h.toString() + " na(s) turma(s) \n" + t.toString();
    }

    /**
     *
     * @param prof
     * @param horario
     * @return arraylist do tipo de horarios Metodo para Listar o Horario de um
     * determinado professor
     */
    public ArrayList<Horario> listarHorarioProfessor(ArrayList<Professor> prof, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < prof.size(); i++) {
            if (sigla.equalsIgnoreCase(prof.get(i).getSigla())) {
                t = prof.get(i).getSigla();
//                System.out.println(alunos);
            }
        }

        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_professor().equalsIgnoreCase(t)) {
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
        System.out.println(h + "\n");
        return h;
    }

    /**
     *
     * @param prof
     * @return objecto professor Metodo para listar dados de um dado professor
     */
    public String listarDadosProfessor() {
//        Professor professor = new Professor();
//        boolean flag = false;
//        for (int i = 0; i < professores.size(); i++) {
//            if (sigla.equalsIgnoreCase(professores.get(i).getSigla())) {
//                professor = professores.get(i);
//                flag = true;
//            }
//        }
//        if (flag == false) {
//            System.out.println("Professor nao encontrado." + "\n");
//        }
//        System.out.println(professor.toStringProfessor() + "\n");
        return this.toStringProfessor();
    }

    /**
     *
     * @param prof
     * @param horario
     * @return numero de horas que um professor tem durante a semana Metodo para
     * calcular a carga horaria de um determinado professor
     */
    public int CargaHorariaProfessor(ArrayList<Professor> prof, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < prof.size(); i++) {
            if (sigla.equalsIgnoreCase(prof.get(i).getSigla())) {
                t = prof.get(i).getSigla();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_professor().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        System.out.println("O Professor " + super.getNome() + " tem " + j + " horas de carga horaria semanal." + "\n");
        return j;
    }

    /**
     *
     * @return
     */
    public String getSigla() {
        return sigla;
    }

    /**
     *
     * @return
     */
    public Data getDatacontratacao() {
        return datacontratacao;
    }

    /**
     *
     * @return
     */
    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     *
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     *
     * @param datacontratacao
     */
    public void setDataContratacao(Data datacontratacao) {
        this.datacontratacao = datacontratacao;
    }

    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return " " + sigla;
    }

    /**
     *
     * @return
     */
    public String toStringProfessor() {
        return super.toString() + " é o professor que contem a sigla " + sigla + " e a data da sua contratação foi no dia " + datacontratacao.getDia() + ", do " + datacontratacao.getMes() + ", de " + datacontratacao.getAno() + ".";
    }
}
