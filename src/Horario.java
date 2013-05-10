
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
        this.designacao = turma.getDesignacao();
        this.sigla_disciplina = disciplina.getSigla();

        if (tipo_aula == 1) {
            this.aulas = aulas.T;
        } else if (tipo_aula == 2) {
            this.aulas = aulas.P;
        }
        verificaDiaSemana(dia_semana);
        verificaHoraAula(hora_inicio);
        this.duracaoAula = duracaoAula;
        this.sigla_professor = professor.getSigla();
        this.codigo_sala = sala.getCodigo();
    }

    public void listarHoraraioAluno(Aluno a) throws FileNotFoundException {
        CSV ola = new CSV();
        ArrayList<SalaAula> sala = ola.Sala();
        ArrayList<Professor> professores = ola.Professor();
        ArrayList<Aluno> alunos = ola.Alunos();
        ArrayList<Turma> turmas = ola.Turmas();
        ArrayList<Disciplina> disciplinas = ola.Disciplinas();
        ArrayList<Horario> horario = ola.Horario();
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (a.getNumeroAluno() == alunos.get(i).getNumeroAluno()) {
                t = alunos.get(i).getTurma();
//                System.out.println(alunos);
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
//            System.out.println (h);
//        System.out.println(h.get(0).getDesignacao());
        });
        Collections.sort(h, new Comparator<Horario>() {

            public int compare(Horario p1, Horario p2) {
                return p1.dia_semana - p2.dia_semana;
            }
//            System.out.println (h);
//        System.out.println(h.get(0).getDesignacao());
        });
        System.out.println(h);
    }

    public void verificaDiaSemana(int dia_semana) {
        if (dia_semana >= 2 && dia_semana <= 6) {
            this.dia_semana = dia_semana;
        }
    }

    public void verificaHoraAula(int horainicio) {
        if (horainicio > 8 || horainicio < 17) {
            this.hora_inicio = horainicio;
        } else {
            //deve mandar uma excepcao
            System.out.println("aula nao pode ser lecionada");
        }
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getSigla_disciplina() {
        return sigla_disciplina;
    }

    public tipo_aula getAulas() {
        return aulas;
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

    public void setAulas(tipo_aula aulas) {
        this.aulas = aulas;
    }

    public void setDia_semana(int dia_semana) {
        this.dia_semana = dia_semana;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
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
