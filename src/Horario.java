
import java.io.FileNotFoundException;
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
public class Horario {

    private String designacao;
    private String sigla_disciplina;

    private enum tipo_aula {

        T, P
    };
    tipo_aula aulas;
    private int dia_semana;
    private int hora_inicio;
    private int duracaoAula;
    private String sigla_professor;
    private String codigo_sala;

    public Horario() {
    }

    public Horario(Turma turma, Disciplina disciplina, int tipo_aula, int dia_semana, int hora_inicio, int duracaoAula, Professor professor, SalaAula sala) {
        setDesignacao(turma.getDesignacao());
        setSigla_disciplina(disciplina.getSigla());
        setAulas(tipo_aula);
        setDia_semana(dia_semana);
        setHora_inicio(hora_inicio);
        setDuracaoAula(duracaoAula);
        setSigla_professor(professor.getSigla());
        setCodigo_sala(sala.getCodigo());
    }

    public void listarHorarioAluno(ArrayList<Aluno> alunos, int a, ArrayList<Horario> horario) throws FileNotFoundException {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (a == alunos.get(i).getNumeroAluno()) {
                t = alunos.get(i).getTurma();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
            }
        }

        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.hora_inicio - p2.hora_inicio;
            }
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.dia_semana - p2.dia_semana;
            }
        });
        if (h.isEmpty()) {
            System.out.println("Aluno nao existente ou sem aulas.");
        } else {
            System.out.println(h);
        }
    }

    public void listarHorarioProfessor(ArrayList<Professor> prof, String a, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < prof.size(); i++) {
            if (a.equalsIgnoreCase(prof.get(i).getSigla())) {
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
                return p1.hora_inicio - p2.hora_inicio;
            }
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.dia_semana - p2.dia_semana;
            }
        });
        if (h.isEmpty()) {
            System.out.println("Professor nao existente ou sem carga de Trabalho.");
        } else {
            System.out.println(h);
        }
    }

    public void listarHorarioTurma(ArrayList<Turma> prof, String t, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();

        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
            }
        }

        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.hora_inicio - p2.hora_inicio;
            }
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.dia_semana - p2.dia_semana;
            }
        });
        if (h.isEmpty()) {
            System.out.println("Turma nao existente ou nao leccionada.");
        } else {
            System.out.println(h);
        }
    }

    public void listarHorarioDisciplina(ArrayList<Disciplina> disc, String a, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < disc.size(); i++) {
            if (a.equalsIgnoreCase(disc.get(i).getSigla())) {
                t = disc.get(i).getSigla();
            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_disciplina().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
            }
        }

        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.hora_inicio - p2.hora_inicio;
            }
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.dia_semana - p2.dia_semana;
            }
        });
        if (h.isEmpty()) {
            System.out.println("Disciplina nao existente ou nao exercida.");
        } else {
            System.out.println(h);
        }
    }

    public void listarHorarioSala(ArrayList<SalaAula> sala, String a, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (a.equalsIgnoreCase(sala.get(i).getCodigo())) {
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
                return p1.hora_inicio - p2.hora_inicio;
            }
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.dia_semana - p2.dia_semana;
            }
        });
        if (h.isEmpty()) {
            System.out.println("Sala nao existente ou nao ocupada.");
        } else {
            System.out.println(h);
        }
    }

    public void CargaHorariaAluno(ArrayList<Aluno> alunos, int a, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (a == alunos.get(i).getNumeroAluno()) {
                t = alunos.get(i).getTurma();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        if (h.isEmpty()) {
            System.out.println("Aluno nao existente ou sem aulas.");
        } else {
            System.out.println("O Aluno tem " + j + " horas de carga horaria por semana.");
        }
    }

    public void CargaHorariaProfessor(ArrayList<Professor> prof, String a, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < prof.size(); i++) {
            if (a.equalsIgnoreCase(prof.get(i).getSigla())) {
                t = prof.get(i).getSigla();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_professor().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        if (h.isEmpty()) {
            System.out.println("Professor nao existente ou sem aulas.");
        } else {
            System.out.println("O Professor tem " + j + " horas de carga horaria por semana.");
        }
    }

    public void CargaHorariaTurma(ArrayList<Turma> Turma, String t, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        if (h.isEmpty()) {
            System.out.println("Turma nao existente ou sem aulas.");
        } else {
            System.out.println("A Turma tem " + j + " horas de carga horaria por semana.");
        }
    }

    public void CargaHorariaDisciplina(ArrayList<Disciplina> disc, String a, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < disc.size(); i++) {
            if (a.equalsIgnoreCase(disc.get(i).getSigla())) {
                t = disc.get(i).getSigla();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getSigla_disciplina().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        if (h.isEmpty()) {
            System.out.println("Disciplina nao existente ou nao Leccionada.");
        } else {
            System.out.println("A Disciplina tem " + j + " horas de carga horaria por semana.");
        }
    }

    public void CargaHorariaSala(ArrayList<SalaAula> sala, String a, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (a.equalsIgnoreCase(sala.get(i).getCodigo())) {
                t = sala.get(i).getCodigo();

            }
        }
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getCodigo_sala().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        if (h.isEmpty()) {
            System.out.println("Sala nao existente ou nao usada.");
        } else {
            System.out.println("A Sala tem " + j + " horas de carga horaria por semana.");
        }
    }

    public void alterarHorario(Horario horarioNovo) {
        this.setDesignacao(horarioNovo.getDesignacao());
        this.setSigla_disciplina(horarioNovo.getSigla_disciplina());
        this.setAulas(horarioNovo.getAulas());
        this.setDia_semana(horarioNovo.getDia_semana());
        this.setHora_inicio(horarioNovo.getHora_inicio());
        this.setDuracaoAula(horarioNovo.getDuracaoAula());
        this.setSigla_professor(horarioNovo.getSigla_professor());
        this.setCodigo_sala(horarioNovo.getCodigo_sala());
    }

    public void apagarHorario(ArrayList<Horario> horarios, int num) {
        horarios.remove(num);
    }

    public void setDia_semana(int dia_semana) {
        if (dia_semana >= 2 && dia_semana <= 6) {
            this.dia_semana = dia_semana;
        }
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getSigla_disciplina() {
        return sigla_disciplina;
    }

    public int getAulas() {

        if (aulas.equals(aulas.T)) {
            return 1;
        } else if (aulas.equals(aulas.P)) {
            return 2;
        }
        return 0;
    }

    public int getDia_semana() {
        return dia_semana;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public int getDuracaoAula() {
        return duracaoAula;
    }

    public String getSigla_professor() {
        return sigla_professor;
    }

    public String getCodigo_sala() {
        return codigo_sala;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setSigla_disciplina(String sigla_disciplina) {
        this.sigla_disciplina = sigla_disciplina;
    }

    public void setAulas(int aula) {
        if (aula == 1) {
            this.aulas = aulas.T;
        } else if (aula == 2) {
            this.aulas = aulas.P;
        }
    }

    public void setHora_inicio(int hora_inicio) {
        if (hora_inicio > 8 || hora_inicio < 17) {
            this.hora_inicio = hora_inicio;
        } else {
            //deve mandar uma excepcao
            System.out.println("aula nao pode ser lecionada");
        }
    }

    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public void setSigla_professor(String sigla_professor) {
        this.sigla_professor = sigla_professor;
    }

    public void setCodigo_sala(String codigo_sala) {
        this.codigo_sala = codigo_sala;
    }

    @Override
    public String toString() {
        return "Horario{" + "designacao=" + designacao + ", sigla_disciplina=" + sigla_disciplina + ", aulas=" + aulas + ", dia_semana=" + dia_semana + ", hora_inicio=" + hora_inicio + ", duracaoAula=" + duracaoAula + ", sigla_professor=" + sigla_professor + ", codigo_sala=" + codigo_sala + "\n";
    }
}
