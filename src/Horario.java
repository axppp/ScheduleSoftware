
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

    /**
     * variavel que guarda o nome da turma
     */
    private String designacao;
    /**
     * sigla da disciplina
     */
    private String sigla_disciplina;
    /**
     * tipo de aulas "ANFITIATRO" ou "LABORATORIO"
     */
    private enum tipo_aula {

        T, P
    };
    tipo_aula aulas;
    /**
     * variavel que guarda o dia da semana do horario
     */
    private int dia_semana;
    /**
     * variavel que guarda a hora de inicio do horario
     */
    private int hora_inicio;
    /**
     * variavel que guarda a durançao da aula
     */
    private int duracaoAula;
    /**
     * variavel que guarda a sigla do professor
     */
    private String sigla_professor;
    /**
     * variavel que guarda o codigo da sala
     */
    private String codigo_sala;
    
    
    /**
     * construtor vazio
     */
    public Horario() {
    }

    /**
     * 
     * @param turma
     * @param disciplina
     * @param tipo_aula
     * @param dia_semana
     * @param hora_inicio
     * @param duracaoAula
     * @param professor
     * @param sala 
     * 
     * Construtor Horario
     */
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

    /**
     * 
     * @param alunos
     * @param numeroAluno
     * @param horario
     * @return arraylist do tipo de horarios
     * Metodo para Listar o Horario de um determinado aluno que retorna um 
     */
    public ArrayList<Horario> listarHorarioAluno(ArrayList<Aluno> alunos, int numeroAluno, ArrayList<Horario> horario)  {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (numeroAluno == alunos.get(i).getNumeroAluno()) {
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

    /**
     * 
     * @param prof
     * @param siglaProf
     * @param horario
     * @return arraylist do tipo de horarios
     * Metodo para Listar o Horario de um determinado professor
     */
    public ArrayList<Horario> listarHorarioProfessor(ArrayList<Professor> prof, String siglaProf, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < prof.size(); i++) {
            if (siglaProf.equalsIgnoreCase(prof.get(i).getSigla())) {
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

    /**
     * 
     * @param prof
     * @param turma
     * @param horario
     * @return arraylist de horarios
     * Metodo para Listar o Horario de uma determinada turma
     */
    public ArrayList<Horario> listarHorarioTurma(ArrayList<Turma> prof, String turma, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();

        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(turma)) {
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

    /**
     * 
     * @param disc
     * @param siglaDis
     * @param horario
     * @return arraylist de horarios
     * Metodo para listar o horario de uma determinada disciplina
     */
    public ArrayList<Horario> listarHorarioDisciplina(ArrayList<Disciplina> disc, String siglaDis, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < disc.size(); i++) {
            if (siglaDis.equalsIgnoreCase(disc.get(i).getSigla())) {
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

    /**
     * 
     * @param sala
     * @param cod_sala
     * @param horario
     * @return arraylist de horarios
     * Metodo para listar o horario de uma determinada sala
     */
    public ArrayList<Horario> listarHorarioSala(ArrayList<SalaAula> sala, String cod_sala, ArrayList<Horario> horario) {
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (cod_sala.equalsIgnoreCase(sala.get(i).getCodigo())) {
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

    /**
     * 
     * @param numAluno
     * @param alunos
     * @return objecto aluno
     * Metodo para listar dados de um determinado aluno
     */
    public Aluno listarDadosAluno(int numAluno, ArrayList<Aluno> alunos) {
        Aluno aluno = new Aluno();
        for (int i = 0; i < alunos.size(); i++) {
            if (numAluno == alunos.get(i).getNumeroAluno()) {
                aluno = alunos.get(i);
            }
        }
        return aluno;
    }

    /**
     * 
     * @param siglaProf
     * @param prof
     * @return objecto professor
     * Metodo para listar dados de um dado professor
     */
    public Professor listarDadosProfessor(String siglaProf, ArrayList<Professor> professores) {
        Professor professor = new Professor();
        for (int i = 0; i < professores.size(); i++) {
            if (siglaProf.equalsIgnoreCase(professores.get(i).getSigla())) {
                professor = professores.get(i);
            }
        }
        return professor;
    }

    
    /**
     * 
     * @param codSala
     * @param Salas
     * @return objecto sala de aula
     * Metodo para listar dados de uma determinada sala de aula
     */
    public SalaAula listarDadosSala(String codSala, ArrayList<SalaAula> Salas) {
        SalaAula salaAula = new SalaAula();
        for (int i = 0; i < Salas.size(); i++) {
            if (codSala.equalsIgnoreCase(Salas.get(i).getCodigo())) {
                salaAula = Salas.get(i);
            }
        }
        return salaAula;
    }

    
    /**
     * 
     * @param codTurma
     * @param turmas
     * @return objecto turma
     * Metodo para listar os dados de uma dada turma
     */
    public Turma listarDadosTurma(String codTurma, ArrayList<Turma> turmas) {
        Turma turma = new Turma();
        for (int i = 0; i < turmas.size(); i++) {
            if (codTurma.equalsIgnoreCase(turmas.get(i).getDesignacao())) {
                turma = turmas.get(i);
            }
        }
        return turma;
    }

    /**
     * 
     * @param siglaDisc
     * @param disciplinas
     * @return objecto disciplina
     * Metodo para listar os dados de uma dada disciplina
     */
    public Disciplina listarDadosDisciplina(String siglaDisc, ArrayList<Disciplina> disciplinas) {
        Disciplina disciplina = new Disciplina();
        for (int i = 0; i < disciplinas.size(); i++) {
            if (siglaDisc.equalsIgnoreCase(disciplinas.get(i).getSigla())) {
                disciplina = disciplinas.get(i);
            }
        }
        return disciplina;
    }

    /**
     * 
     * @param alunos
     * @param numAluno
     * @param horario
     * @return numero de horas que um aluno tem durante a semana
     * Metodo para calcular a carga horaria de um determinado aluno
     */
    public int CargaHorariaAluno(ArrayList<Aluno> alunos, int numAluno, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (numAluno == alunos.get(i).getNumeroAluno()) {
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

    /**
     * 
     * @param prof
     * @param siglaProf
     * @param horario
     * @return numero de horas que um professor tem durante a semana
     * Metodo para calcular a carga horaria de um determinado professor
     */
    public int CargaHorariaProfessor(ArrayList<Professor> prof, String siglaProf, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < prof.size(); i++) {
            if (siglaProf.equalsIgnoreCase(prof.get(i).getSigla())) {
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

    /**
     * 
     * @param Turma
     * @param siglaTurma
     * @param horario
     * @return numero de horas que uma turma tem durante a semana
     * Metodo para calcular a carga horario de uma determinada turma
     */
    public int CargaHorariaTurma(ArrayList<Turma> Turma, String siglaTurma, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        for (int i = 0; i < horario.size(); i++) {
            if (horario.get(i).getDesignacao().equalsIgnoreCase(siglaTurma)) {
                h.add(horario.get(i));
                j += horario.get(i).getDuracaoAula();
            }
        }
        return j;
    }

    /**
     * 
     * @param disc
     * @param siglaDisc
     * @param horario
     * @return numero de horas que uma disciplina tem durante a semana
     * Metodo para calcular a carga horaria de uma determinada disciplina
     */
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

    /**
     * 
     * @param sala
     * @param codSala
     * @param horario
     * @return numero de horas que uma sala tem durante a semana
     * Metodo para calcular a carga horaria de uma determinada sala
     */
    public int CargaHorariaSala(ArrayList<SalaAula> sala, String codSala, ArrayList<Horario> horario) {
        int j = 0;
        ArrayList<Horario> h = new ArrayList<>();
        String t = null;
        for (int i = 0; i < sala.size(); i++) {
            if (codSala.equalsIgnoreCase(sala.get(i).getCodigo())) {
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
     * @param horarioNovo
     * @param horarios 
     * Metodo para alterar um horario
     */
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
            System.out.println("Impossivel alterar horario, porque o horario nao é valido!!!");
        }
    }

    /**
     * 
     * @param horarioANT
     * @param novo
     * @param horarios
     * @return uma boolean que é o resultado da validacao da sala
     * Metodo que verifica se uma sala é usada em simultaneo por 2 turmas,professores, disciplinas 
     */
    public Boolean validaHorario(Horario horarioANT, Horario novo, ArrayList<Horario> horarios) {

        Boolean validacao = true;
        int i = 0;
        do {
            System.out.println(i);
            if (horarioANT.equals(novo)) {
                System.out.println("1");
                validacao = false;
            } else if (novo.getCodigo_sala().equalsIgnoreCase(horarios.get(i).getCodigo_sala()) && (novo.getSigla_professor().equalsIgnoreCase(horarios.get(i).getSigla_professor()))) {
                if (novo.getDia_semana() == horarios.get(i).getDia_semana() && novo.getHora_inicio() == horarios.get(i).getHora_inicio() || novo.getDesignacao().equalsIgnoreCase(horarios.get(i).getDesignacao())) {
                    System.out.println("2-estourou");
                    validacao = false;
                }
            } else {
                //System.out.println("3");
                validacao = true;
            }
            i++;
        } while (i < horarios.size() && validacao == true);

        return validacao;


    }

    /**
     * 
     * @param horarios
     * @param num
     * Metodo que apaga um determinado horario
     */
    public void apagarHorario(ArrayList<Horario> horarios, int num) {
        horarios.remove(num);
    }

    /**
     * 
     * @param dia_semana 
     * Metodo para definir o dia da semana
     */
    public void setDia_semana(int dia_semana) {
        if (dia_semana >= 2 && dia_semana <= 6) {
            this.dia_semana = dia_semana;
        }
    }

    /**
     * 
     * @return a designaçao da turam
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * 
     * @return sigla da disciplina
     */
    public String getSigla_disciplina() {
        return sigla_disciplina;
    }

    /**
     * 
     * @return inteiro que caracteriza o tipo de sala 1-Teorica 2-Pratica
     */
    public int getAulas() {

        if (aulas.equals(aulas.T)) {
            return 1;
        } else if (aulas.equals(aulas.P)) {
            return 2;
        }
        return 0;
    }

    /**
     * 
     * @return o dia da semana
     */
    public int getDia_semana() {
        return dia_semana;
    }

    /**
     * 
     * @return a hora de inicio da aula
     */
    public int getHora_inicio() {
        return hora_inicio;
    }

    /**
     * 
     * @return durancao da aula 
     */
    public int getDuracaoAula() {
        return duracaoAula;
    }

    /**
     * 
     * @return sigla do professor 
     */
    public String getSigla_professor() {
        return sigla_professor;
    }

    /**
     * 
     * @return codigo da sala
     */
    public String getCodigo_sala() {
        return codigo_sala;
    }

    /**
     * 
     * @param designacao 
     * Metodo para definir a designaçao da turma
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * 
     * @param sigla_disciplina 
     * Metodo para definir a sigla da disciplina
     */
    public void setSigla_disciplina(String sigla_disciplina) {
        this.sigla_disciplina = sigla_disciplina;
    }

    /**
     * 
     * @param aula 
     * Metodo para definir o tipo de aula
     */
    public void setAulas(int aula) {
        if (aula == 1) {
            this.aulas = aulas.T;
        } else if (aula == 2) {
            this.aulas = aulas.P;
        }
    }

    /**
     * 
     * @param hora_inicio 
     * Metodo para definir a hora de inicio da aula
     */
    public void setHora_inicio(int hora_inicio) {
        if (hora_inicio > 8 || hora_inicio < 17) {
            this.hora_inicio = hora_inicio;
        } else {
            //deve mandar uma excepcao
            System.out.println("aula nao pode ser lecionada");
        }
    }

    /**
     * 
     * @param duracaoAula 
     * Metodo para definir a duracao da aula
     */
    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    /**
     * 
     * @param sigla_professor 
     * Metodo para definir a sigla do professor
     */
    public void setSigla_professor(String sigla_professor) {
        this.sigla_professor = sigla_professor;
    }

    /**
     * 
     * @param codigo_sala 
     * Metodo para definir o codigo da sala
     */
    public void setCodigo_sala(String codigo_sala) {
        this.codigo_sala = codigo_sala;
    }

    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return "Horario{" + "designacao=" + designacao + ", sigla_disciplina=" + sigla_disciplina + ", aulas=" + aulas + ", dia_semana=" + dia_semana + ", hora_inicio=" + hora_inicio + ", duracaoAula=" + duracaoAula + ", sigla_professor=" + sigla_professor + ", codigo_sala=" + codigo_sala + "\n";
    }

    /**
     * 
     * @return 
     * Metodo toString para uma aula extra
     */
    public String toStringAulaExtra() {
        return "Sala esta acessivel das " + hora_inicio + " ate as " + (hora_inicio + duracaoAula);
    }
}
