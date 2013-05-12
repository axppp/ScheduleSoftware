
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

    public ArrayList<Horario> listarHorarioAluno(ArrayList<Aluno> alunos, int a, ArrayList<Horario> horario) throws FileNotFoundException {

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
        return h;
    }

    public ArrayList<Horario> listarHorarioProfessor(ArrayList<Professor> prof, String a, ArrayList<Horario> horario) {
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
        return h;
    }

    public ArrayList<Horario> listarHorarioTurma(ArrayList<Turma> prof, String t, ArrayList<Horario> horario) {
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
        return h;
    }

    public ArrayList<Horario> listarHorarioDisciplina(ArrayList<Disciplina> disc, String a, ArrayList<Horario> horario) {
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
        return h;
    }

    public ArrayList<Horario> listarHorarioSala(ArrayList<SalaAula> sala, String a, ArrayList<Horario> horario) {
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
        return h;
    }

    public Aluno listarDadosAluno(int a, ArrayList<Aluno> alu) {
        Aluno aluno = new Aluno();
        for (int i = 0; i < alu.size(); i++) {
            if (a == alu.get(i).getNumeroAluno()) {
                aluno = alu.get(i);
            }
        }
        return aluno;
    }

    public Professor listarDadosProfessor(String a, ArrayList<Professor> prof) {
        Professor professor = new Professor();
        for (int i = 0; i < prof.size(); i++) {
            if (a.equalsIgnoreCase(prof.get(i).getSigla())) {
                professor = prof.get(i);
            }
        }
        return professor;
    }

    public SalaAula listarDadosSala(String a, ArrayList<SalaAula> Sala) {
        SalaAula salaaula = new SalaAula();
        for (int i = 0; i < Sala.size(); i++) {
            if (a.equalsIgnoreCase(Sala.get(i).getCodigo())) {
                salaaula = Sala.get(i);
            }
        }
        return salaaula;
    }

    public Turma listarDadosTurma(String a, ArrayList<Turma> tur) {
        Turma turma = new Turma();
        for (int i = 0; i < tur.size(); i++) {
            if (a.equalsIgnoreCase(tur.get(i).getDesignacao())) {
                turma = tur.get(i);
            }
        }
        return turma;
    }

    public Disciplina listarDadosDisciplina(String a, ArrayList<Disciplina> disc) {
        Disciplina disciplina = new Disciplina();
        for (int i = 0; i < disc.size(); i++) {
            if (a.equalsIgnoreCase(disc.get(i).getSigla())) {
                disciplina = disc.get(i);
            }
        }
        return disciplina;
    }

    public int CargaHorariaAluno(ArrayList<Aluno> alunos, int a, ArrayList<Horario> horario) {
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
        return j;
    }

    public int CargaHorariaProfessor(ArrayList<Professor> prof, String a, ArrayList<Horario> horario) {
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
        return j;
    }

    public int CargaHorariaTurma(ArrayList<Turma> Turma, String t, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(t)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        return j;
    }

    public int CargaHorariaDisciplina(ArrayList<Disciplina> disc, String a, ArrayList<Horario> horario) {
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
        return j;
    }

    public int CargaHorariaSala(ArrayList<SalaAula> sala, String a, ArrayList<Horario> horario) {
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
        return j;
    }

    public void alterarHorario(Horario horarioNovo, ArrayList<Horario> horarios) {

        if (validaHorario(this, horarioNovo, horarios) == true) {
            this.setDesignacao(horarioNovo.getDesignacao());
            this.setSigla_disciplina(horarioNovo.getSigla_disciplina());
            this.setAulas(horarioNovo.getAulas());
            this.setDia_semana(horarioNovo.getDia_semana());
            this.setHora_inicio(horarioNovo.getHora_inicio());
            this.setDuracaoAula(horarioNovo.getDuracaoAula());
            this.setSigla_professor(horarioNovo.getSigla_professor());
            this.setCodigo_sala(horarioNovo.getCodigo_sala());

        } else {
            System.out.println("pumbaz");
        }
    }

    public Boolean validaHorario(Horario horarioANT, Horario novo, ArrayList<Horario> horarios) {
        
        Boolean validacao=true;
        int i=0;
        do
        {
            System.out.println(i);
            if (horarioANT.equals(novo)) {
                System.out.println("1");
                validacao = false;
            } else if (novo.getCodigo_sala().equalsIgnoreCase(horarios.get(i).getCodigo_sala()) && (novo.getSigla_professor().equalsIgnoreCase(horarios.get(i).getSigla_professor()))) 
            {
                if(novo.getDia_semana() == horarios.get(i).getDia_semana() && novo.getHora_inicio() == horarios.get(i).getHora_inicio() || novo.getDesignacao().equalsIgnoreCase(horarios.get(i).getDesignacao()))
                {
                System.out.println("2-estourou");
                validacao = false;    
                }
            } else {
                //System.out.println("3");
                validacao = true;
            }
            i++;
        }while(i < horarios.size() && validacao == true);
        
        return validacao;
        

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
