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
public class Turma implements Serializable {

    private String designacao;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    /**
     *
     * @param designacao
     * @param aluno
     */
    public Turma(String designacao, ArrayList<Aluno> aluno) {
        this.designacao = designacao;
//        for (int i = 0; i < alunos.size(); i++) {
//            this.alunos.add(aluno.get(i));
//        }   
        this.alunos = aluno;
    }

    /**
     * Construtor Turma vazio
     */
    public Turma() {
    }

    /**
     *
     * @param alunos Metodo para listar alunos de forma crescente
     */
    public ArrayList<Aluno> listarAlunosCrescenteNR() {
        Collections.sort(alunos, new Comparator<Aluno>() {

            public int compare(Aluno p1, Aluno p2) {
                return p1.getNumeroAluno() - p2.getNumeroAluno();
            }
        });
//        System.out.println(alunos + "\n");
        return alunos;
    }

    /**
     *
     * @param alunos metodo para listar aluno de forma decrescente
     */
    public ArrayList<Aluno> listarAlunosDecrescenteNR() {
        Collections.sort(alunos, new Comparator<Aluno>() {

            public int compare(Aluno p1, Aluno p2) {
                return p2.getNumeroAluno() - p1.getNumeroAluno();
            }
        });
//        System.out.println(alunos + "\n");
        return alunos;
    }

    /**
     *
     * @param alunos metodo para listar alunos por nome crescente
     */
    public ArrayList<Aluno> listarAlunosNomeCrescente() {

        Collections.sort(alunos, new Comparator() {

            public int compare(Object o1, Object o2) {
                Aluno p1 = (Aluno) o1;
                Aluno p2 = (Aluno) o2;
                return p1.getNome().compareToIgnoreCase(p2.getNome());
            }
        });
//        System.out.println(alunos + "\n");
        return alunos;
    }

    /**
     *
     * @param alunos Metodo para listar alunos por nome decrescente
     */
    public ArrayList<Aluno> listarAlunosNomeDecrescente() {

        Collections.sort(alunos, new Comparator() {

            public int compare(Object o1, Object o2) {
                Aluno p1 = (Aluno) o1;
                Aluno p2 = (Aluno) o2;
                return p2.getNome().compareToIgnoreCase(p1.getNome());
            }
        });
//        System.out.println(alunos + "\n");
        return alunos;
    }

    /**
     *
     * @param horario
     * @return arraylist de horarios Metodo para Listar o Horario de uma
     * determinada turma
     */
    public ArrayList<Horario> listarHorarioTurma(ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();

        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(designacao)) {
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
     * @param turmas
     * @return objecto turma Metodo para listar os dados de uma dada turma
     */
    public String listarDadosTurma() {
//        Turma turma = new Turma();
//        boolean flag = false;
//        for (int i = 0; i < turmas.size(); i++) {
//            if (designacao.equalsIgnoreCase(turmas.get(i).getDesignacao())) {
//                turma = turmas.get(i);
//                flag = true;
//            }
//        }
//        if (flag == false) {
//            System.out.println("Turma nao encontrado." + "\n");
//        }
//        System.out.println(turma + "\n");
        return this.toString();
    }

    /**
     *
     * @param prof
     * @param a
     * @param horario
     * @return
     */
    public String listarProfessorTurma(ArrayList<Professor> prof, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        ArrayList<Horario> ho = new ArrayList<>();
        ArrayList<Professor> p = new ArrayList<>();
        String St = "";
        int teoricas = 0, praticas = 0;
        for (int i = 0; i < horario.size(); i++) {
            if (this.designacao.equalsIgnoreCase(horario.get(i).getDesignacao())) {
                h.add(horario.get(i));
                for (int j = 0; j < prof.size(); j++) {
                    if (prof.get(j).getSigla().equalsIgnoreCase(horario.get(i).getSigla_professor()) && !p.contains(prof.get(j))) {
                        p.add(prof.get(j));
                    }
                }
            }
        }
        if (p.isEmpty() && h.isEmpty()) {
            return "Essa turma não tem professores.";
        } else {
            ho.add(h.get(0));
            boolean f = true;
            for (int i = 1; i < h.size(); i++) {
                h.get(i).getSigla_disciplina();
                h.get(i).getDuracaoAula();
                for (int j = 0; j < ho.size(); j++) {
                    if (h.get(i).getSigla_disciplina().equalsIgnoreCase(ho.get(j).getSigla_disciplina()) || ho.contains(h.get(i))) {
                        f = false;
                    }
                }
                if (f == true) {
                    ho.add(h.get(i));
                } else {
                    f = true;
                }
            }
            for (int i = 0; i < ho.size(); i++) {
                praticas = 0;
                teoricas = 0;
                for (int j = 0; j < h.size(); j++) {
                    if (h.get(j).getSigla_disciplina().equalsIgnoreCase(ho.get(i).getSigla_disciplina())) {
                        if (h.get(j).getDuracaoAula() == 2) {
                            praticas++;
                        } else if (h.get(j).getDuracaoAula() == 1) {
                            teoricas++;
                        }
                    }
                }
                St += "\n, tem a disciplina " + ho.get(i).getSigla_disciplina() + " com " + praticas + " praticas e " + teoricas + " teoricas,";
            }
//            System.out.println("A turma " + this.getDesignacao() + " tem como Professores " + p.toString() + St);
            return "A turma " + this.getDesignacao() + " tem como Professores " + p.toString() + "" + St;
        }
    }

    /**
     *
     * @param Turma
     * @param horario
     * @return numero de horas que uma turma tem durante a semana Metodo para
     * calcular a carga horario de uma determinada turma
     */
    public String CargaHorariaTurma(ArrayList<Turma> Turma, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(designacao)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }

        return "A Turma " + designacao + " tem " + j + " horas de carga horaria semanal." + "\n";
    }

    @Override
    public String toString() {
        return "Turma com " + "designacao=" + designacao + ", tem " + alunos.size() + " Alunos.";
    }

    /**
     *
     * @return sigla
     */
    public String toStringSigla() {
        return designacao;
    }

    /**
     *
     * @return
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     *
     * @return
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     *
     * @param designacao
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     *
     * @param alunos
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     *
     * @param aluno
     */
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
