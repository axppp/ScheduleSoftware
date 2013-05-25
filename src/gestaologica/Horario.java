package gestaologica;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author axppp
 */
public class Horario implements Serializable {

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
    Horario.tipo_aula aulas;
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
     * @param horarioNovo
     * @param horarios
     * @param sala
     * @param disc
     * @return Metodo para alterar um horario
     */
    public int alterarHorario(Horario horarioNovo, ArrayList<Horario> horarios, ArrayList<SalaAula> sala, ArrayList<Disciplina> disc) {

        if (validaHorario(this, horarioNovo, horarios, sala, disc) == true) {
            this.setDesignacao(horarioNovo.getDesignacao());
            this.setSigla_disciplina(horarioNovo.getSigla_disciplina());
            this.setAulas(horarioNovo.getAulas());
            this.setDia_semana(horarioNovo.getDia_semana());
            this.setHora_inicio(horarioNovo.getHora_inicio());
            this.setDuracaoAula(horarioNovo.getDuracaoAula());
            this.setSigla_professor(horarioNovo.getSigla_professor());
            this.setCodigo_sala(horarioNovo.getCodigo_sala());
            JOptionPane.showMessageDialog(null, "Horario alterado com sucesso!\n");
//            System.out.println("Horario alterado com sucesso!\n");
            return 1;
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel alterar horario, porque o horario nao é valido!!!" + "\n");
//            System.out.println("Impossivel alterar horario, porque o horario nao é valido!!!" + "\n");
            return 2;
        }

    }

    /**
     *
     * @param horarioNovo
     * @param horarios
     * @param sala
     * @param disc
     * @return Metodo para adicionar um horario com validaçao
     */
    public void addHorario(ArrayList<Horario> horarios, ArrayList<SalaAula> sala, ArrayList<Disciplina> disc) {
        if (validaHorarioNovo(horarios, sala, disc) == true) {
            horarios.add(this);
            JOptionPane.showMessageDialog(null, "O horario foi aprovado!\n");
//            System.out.println("O horario foi aprovado!\n");
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel criar horario, porque o horario nao é valido!!!" + "\n");
//            System.out.println("Impossivel criar horario, porque o horario nao é valido!!!" + "\n");
        }
//        return horarios;
    }

    /**
     *
     * @param horarioANT
     * @param novo
     * @param horarios
     * @param sala
     * @param disc
     * @return uma boolean que é o resultado da validacao da sala Metodo que
     * verifica se uma sala é usada em simultaneo por 2 turmas,professores,
     * disciplinas
     */
    public Boolean validaHorario(Horario horarioANT, Horario novo, ArrayList<Horario> horarios, ArrayList<SalaAula> sala, ArrayList<Disciplina> disc) {

        Boolean validacao = true, nome = false;
        int i = 0;

        String tsala = null;
        int cont = 0;
        for (int j = 0; j < sala.size(); j++) {
            if (novo.getCodigo_sala().equalsIgnoreCase(sala.get(j).getCodigo())) {
                tsala = sala.get(j).getTipoSala();
            }
        }
        for (int t = 0; t < disc.size(); t++) {
            if (novo.getSigla_professor().equalsIgnoreCase(disc.get(t).getSigla_prof_t())) {
                if (tsala.equalsIgnoreCase("ANFITIATRO")) {
                    nome = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Este Professor so da Aulas teoricas nesta disciplina.");
//                    System.out.println("Este Professor so da Aulas teoricas nesta disciplina.");
                    validacao = false;
                }
            }
            for (int j = 0; j < disc.get(t).getProfessores().size(); j++) {
                if (novo.getSigla_professor().equalsIgnoreCase(disc.get(t).getProfessores().get(j).getSigla()) && novo.getSigla_disciplina().equalsIgnoreCase(disc.get(i).getSigla())) {
                    nome = true;
                }
            }
        }
        if (nome == false) {
            validacao = false;
            JOptionPane.showMessageDialog(null, "Esse Professor não exerce essa disciplina.");
//            System.out.println("Esse Professor não exerce essa disciplina.");
        }
        if (tsala.equalsIgnoreCase("ANFITIATRO")) {
            cont = 1;
        } else {
            cont = 2;
        }
        do {
            if (horarioANT.equals(novo)) {
                validacao = false;
                JOptionPane.showMessageDialog(null, "Esse horario é igual ao que quer alterar.");
//                System.out.println("Esse horario é igual ao que quer alterar.");
            } else {
                if (novo.getCodigo_sala().equalsIgnoreCase(horarios.get(i).getCodigo_sala()) && novo.getDia_semana() == horarios.get(i).getDia_semana() && novo.getHora_inicio() == horarios.get(i).getHora_inicio()) {
                    validacao = false;
                    JOptionPane.showMessageDialog(null, "A sala ja ta a ser ocupada.");
//                    System.out.println("A sala ja ta a ser ocupada.");
                } else {
                    if (novo.getDesignacao().equalsIgnoreCase(horarios.get(i).getDesignacao()) && novo.getDia_semana() == horarios.get(i).getDia_semana() && novo.getHora_inicio() == horarios.get(i).getHora_inicio()) {
                        validacao = false;
                        JOptionPane.showMessageDialog(null, "A turma ja tem aula.");
//                        System.out.println("A turma ja tem aula.");
                    } else {
                        if (novo.getSigla_professor().equalsIgnoreCase(horarios.get(i).getSigla_professor()) && novo.getDia_semana() == horarios.get(i).getDia_semana() && novo.getHora_inicio() == horarios.get(i).getHora_inicio()) {
                            validacao = false;
                            JOptionPane.showMessageDialog(null, "O professor ja ta a dar aula.");
//                            System.out.println("O professor ja ta a dar aula.");
//                            System.out.println(i);
                        } else {
                            if (novo.getAulas() != cont) {
                                JOptionPane.showMessageDialog(null, "A sala não é propria para " + tsala);
//                                System.out.println("A sala não é propria para " + tsala);
                                validacao = false;
                            }
                        }
                    }
                }
            }
            i++;
        } while (i < horarios.size() && validacao == true);

        if (novo.getHora_inicio() == 17 && novo.getDuracaoAula() == 2) {
            validacao = false;
            JOptionPane.showMessageDialog(null, "A aula não é valida pois começa às 17h e tem 2 horas de duração.\n Sendo que as Aulas terminam as 18h.");
        }
        return validacao;


    }

    /**
     *
     * @param horarioNovo
     * @param Horario
     * @param sala
     * @param disc
     * @return um Metodo boolean, o resultado da validacao da sala Metodo que
     * verifica se uma sala é usada em simultaneo por 2 turmas,professores,
     * disciplinas, mas para inserçao de horarios
     */
    public boolean validaHorarioNovo(ArrayList<Horario> horario, ArrayList<SalaAula> sala, ArrayList<Disciplina> disc) {
        boolean flag = true, nome = false;
//        System.out.println(horario.size());
//        System.out.println(horario.get(0));
        String tsala = null;
        int cont = 0;
        for (int i = 0; i < sala.size(); i++) {
            if (this.getCodigo_sala().equalsIgnoreCase(sala.get(i).getCodigo())) {
                tsala = sala.get(i).getTipoSala();
            }
        }
        for (int i = 0; i < disc.size(); i++) {
            if (this.getSigla_professor().equalsIgnoreCase(disc.get(i).getSigla_prof_t())) {
                if (tsala.equalsIgnoreCase("ANFITIATRO")) {
                    nome = true;
                } else {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Esse Professor só da teoricas.");
//                    System.out.println("Esse Professor só da teoricas.");
                }
            }
            for (int j = 0; j < disc.get(i).getProfessores().size(); j++) {
                if (this.getSigla_professor().equalsIgnoreCase(disc.get(i).getProfessores().get(j).getSigla()) && this.getSigla_disciplina().equalsIgnoreCase(disc.get(i).getSigla())) {
                    nome = true;
                }
            }
        }
        if (nome == false) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Esse Professor não exerce essa disciplina.");
//            System.out.println("Esse Professor não exerce essa disciplina.");
        }
        if (tsala.equalsIgnoreCase("ANFITIATRO")) {
            cont = 1;
        } else {
            cont = 2;
        }
        for (int i = 0; i < horario.size(); i++) {
            if (this.getCodigo_sala().equalsIgnoreCase(horario.get(i).getCodigo_sala()) && this.getDia_semana() == horario.get(i).getDia_semana() && this.getHora_inicio() == horario.get(i).getHora_inicio()) {
                flag = false;
                JOptionPane.showMessageDialog(null, "A sala ja ta a ser ocupada.");
//                System.out.println("A sala ja ta a ser ocupada.");
            } else {
                if (this.getDesignacao().equalsIgnoreCase(horario.get(i).getDesignacao()) && this.getDia_semana() == horario.get(i).getDia_semana() && this.getHora_inicio() == horario.get(i).getHora_inicio()) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "A turma ja tem aula.");
//                    System.out.println("A turma ja tem aula.");
                } else {
                    if (this.getSigla_professor().equalsIgnoreCase(horario.get(i).getSigla_professor()) && this.getDia_semana() == horario.get(i).getDia_semana() && this.getHora_inicio() == horario.get(i).getHora_inicio()) {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "O professor ja ta a dar aula.");
//                        System.out.println("O professor ja ta a dar aula.");
                    } else {
                        if (this.getAulas() != cont && this.getCodigo_sala().equalsIgnoreCase(horario.get(i).getCodigo_sala())) {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "A sala não é propria para " + tsala);
//                            System.out.println("A sala não é propria para " + tsala);
                        }
                    }
                }
            }
        }
        if (this.getHora_inicio() == 17 && this.getDuracaoAula() == 2) {
            flag = false;
            JOptionPane.showMessageDialog(null, "A aula não é valida pois começa às 17h e tem 2 horas de duração.\n Sendo que as Aulas terminam as 18h.");
        }
        return flag;
    }

    /**
     *
     * @param horarios
     * @param num
     * @return Metodo que apaga um determinado horario
     */
    public void apagarHorario(ArrayList<Horario> horarios) {
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).equals(this)) {
                JOptionPane.showMessageDialog(null, "Horario[" + horarios.get(i).toString() + "] apagado com sucesso!\n");
//                System.out.println(horarios.get(i) + " apagado com sucesso!\n");
                horarios.remove(i);

            }
        }

    }

    /**
     *
     * @param dia_semana Metodo para definir o dia da semana
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
     * @param designacao Metodo para definir a designaçao da turma
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     *
     * @param sigla_disciplina Metodo para definir a sigla da disciplina
     */
    public void setSigla_disciplina(String sigla_disciplina) {
        this.sigla_disciplina = sigla_disciplina;
    }

    /**
     *
     * @param aula Metodo para definir o tipo de aula
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
     * @param hora_inicio Metodo para definir a hora de inicio da aula
     */
    public void setHora_inicio(int hora_inicio) {
        if (hora_inicio > 8 || hora_inicio < 17) {
            this.hora_inicio = hora_inicio;
        } else {
            //deve mandar uma excepcao
            System.out.println("aula nao pode ser lecionada" + "\n");
        }
    }

    /**
     *
     * @param duracaoAula Metodo para definir a duracao da aula
     */
    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    /**
     *
     * @param sigla_professor Metodo para definir a sigla do professor
     */
    public void setSigla_professor(String sigla_professor) {
        this.sigla_professor = sigla_professor;
    }

    /**
     *
     * @param codigo_sala Metodo para definir o codigo da sala
     */
    public void setCodigo_sala(String codigo_sala) {
        this.codigo_sala = codigo_sala;
    }

    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return "Turma=" + designacao + ", Disciplina=" + sigla_disciplina + ", Aula tipo=" + aulas + ", Dia da semana=" + dia_semana + ", Hora de inicio=" + hora_inicio + ", Duração=" + duracaoAula + ", Professor=" + sigla_professor + ", Sala=" + codigo_sala + "\n";
    }

    public String toStringLista() {
        return "" + designacao + ", " + sigla_disciplina + ", " + aulas + ", " + dia_semana + ", " + hora_inicio + ", " + duracaoAula + ", " + sigla_professor + ", " + codigo_sala + "\n";
    }

    /**
     *
     * @return Metodo toString para uma aula extra
     */
    public String toStringAulaExtra() {
        return "Sala esta acessivel das " + hora_inicio + "H ate as " + (hora_inicio + duracaoAula) + "H";
    }
}
