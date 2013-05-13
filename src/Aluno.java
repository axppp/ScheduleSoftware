
import data.Data;
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
public class Aluno extends Pessoa {

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
    * @param email 
    * Construtor Pessoa
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
     * Metodo para listar alunos de forma crescente
     */
    public void listarAlunosCrescente(ArrayList<Aluno> alunos) {
        Collections.sort(alunos, new Comparator<Aluno>() {

            public int compare(Aluno p1, Aluno p2) {
                return p1.getNumeroAluno() - p2.getNumeroAluno();
            }
        });
        System.out.println(alunos);
    }

    /**
     * 
     * @param alunos 
     * metodo para listar aluno de forma decrescente
     */
    public void listarAlunosDecrescente(ArrayList<Aluno> alunos) {
        Collections.sort(alunos, new Comparator<Aluno>() {

            public int compare(Aluno p1, Aluno p2) {
                return p2.getNumeroAluno() - p1.getNumeroAluno();
            }
        });
        System.out.println(alunos);
    }

    /**
     * 
     * @param alunos
     * metodo para listar alunos por nome crescente
     */
    public void listarAlunosNomeCrescente(ArrayList<Aluno> alunos) {

        Collections.sort(alunos, new Comparator() {

            public int compare(Object o1, Object o2) {
                Aluno p1 = (Aluno) o1;
                Aluno p2 = (Aluno) o2;
                return p1.getNome().compareToIgnoreCase(p2.getNome());
            }
        });
        System.out.println(alunos);
    }

    /**
     * 
     * @param alunos 
     * Metodo para listar alunos por nome decrescente
     */
    public void listarAlunosNomeDecrescente(ArrayList<Aluno> alunos) {

        Collections.sort(alunos, new Comparator() {

            public int compare(Object o1, Object o2) {
                Aluno p1 = (Aluno) o1;
                Aluno p2 = (Aluno) o2;
                return p2.getNome().compareToIgnoreCase(p1.getNome());
            }
        });
        System.out.println(alunos);
    }
    

    /**
     * @return  numeroAluno
     */
    public int getNumeroAluno() {
        return numeroAluno;
    }

    /**
     * @param numeroAluno 
     * Metodo para definir o numero de aluno
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
     * @param dataNasc the dataNasc to set
     *Metodo para definir a data de nascimento
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
     * @param Telefone the Telefone to set
     * Metodo para definir a contacto telefonico
     */
    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * 
     * @param turma 
     * Metodo para definir a turma
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    
    
    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return super.toString() + " é aluno e o seu numero é " + numeroAluno + " e nasceu no dia " + dataNasc.getDia() + " no mes de " + dataNasc.getMes() + " e no ano " + dataNasc.getAno() + "\n O contacto telefonico é " + Telefone + "\n";
    }

    /**
     * 
     * @return toStrig super
     */
    public String toStringNome() {
        return super.toString();
    }
}
