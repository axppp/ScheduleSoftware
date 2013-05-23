package gestaologica;




import gestaologica.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author axppp
 */
public class Aluno extends Pessoa implements Serializable{

    /**
     * variavel que guarda o numero de aluno
     */
    private int numeroAluno;
    /**
     * variavel que guarda a data de nascimento
     */
    private Data dataNasc;
    /**
     * variavel que guarda o contacto telefonico
     */
    private int Telefone;
    private String turma;

    /**
     *
     * @param numeroAluno
     * @param nome
     * @param dia
     * @param mes
     * @param ano
     * @param Telefone
     * @param email Construtor Pessoa
     */
    public Aluno(int numeroAluno, String nome, int dia, int mes, int ano, int Telefone, String email) {
        super(nome, email);
        this.numeroAluno = numeroAluno;
        this.dataNasc = new Data(dia, mes, ano);
        this.Telefone = Telefone;
    }

    /**
     * Construtor vazio
     */
    public Aluno() {
    }

    /**
     *
     * @param alunos
     * @param horario
     * @return arraylist do tipo de horarios Metodo para Listar o Horario de um
     * determinado aluno que retorna um
     */
    public ArrayList<Horario> listarHorarioAluno(ArrayList<Aluno> alunos, ArrayList<Horario> horario) {
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
     * @param alunos
     * @return objecto aluno Metodo para listar dados de um determinado aluno
     */
    public Aluno listarDadosAluno(ArrayList<Aluno> alunos) {
        Aluno aluno = new Aluno();
        boolean flag = false;
        for (int i = 0; i < alunos.size(); i++) {
            if (numeroAluno == alunos.get(i).getNumeroAluno()) {
                aluno = alunos.get(i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Aluno nao encontrado." + "\n");
        }
        System.out.println(aluno);
        return aluno;
    }

    /**
     *
     * @param alunos
     * @param horario
     * @return numero de horas que um aluno tem durante a semana Metodo para
     * calcular a carga horaria de um determinado aluno
     */
    public int CargaHorariaAluno(ArrayList<Aluno> alunos, ArrayList<Horario> horario) {
        int j = 0;
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
                j += horario.get(i).getDuracaoAula();
            }
        }
        System.out.println("O Aluno " + super.getNome() + " tem " + j + " horas de carga horaria semanal." + "\n");
        return j;
    }
    

    /**
     * @return numeroAluno
     */
    public int getNumeroAluno() {
        return numeroAluno;
    }

    /**
     * @param numeroAluno Metodo para definir o numero de aluno
     */
    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    /**
     * @return the dataNasc
     */
    public Data getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set Metodo para definir a data de
     * nascimento
     */
    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     *
     * @return
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @return the Telefone
     */
    public int getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set Metodo para definir a contacto
     * telefonico
     */
    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    /**
     *
     * @param turma Metodo para definir a turma
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return super.toString() + " o seu numero é " + numeroAluno + " e nasceu no dia " + dataNasc.getDia() + " no mês de " + dataNasc.getMes() + " e no ano " + dataNasc.getAno() + "\n O contacto telefonico é " + Telefone + " e encontrasse colocado na turma " + turma + "." + " \n";
    }

    /**
     *
     * @return toStrig super
     */
    public String toStringNome() {
        return super.toString();
    }
    
    public String toStringNumeroAluno()
    {
        return getNumeroAluno() +"";
    }
}
