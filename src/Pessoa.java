/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class Pessoa {
    
    private String nome;
    
    private String email;

    /**
     * Construtor Pessoa
     */
    public Pessoa(String nome, String email) {
        this.nome = nome;
       
        this.email = email;
    }

    /**
     * getNome
     */
    public String getNome() {
        return nome;
    }
    
    
    /**
     * getEmail
     */
    public String getEmail() {
        return email;
    }

    /**
     * setNome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * setEmail
     */
    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
=======
    @Override
    public String toString() {
        return "A pessoa com o nome "+ nome + ", tem o email: " + email;
>>>>>>> 02a0f0a854dd45cb6affabf69d33ead9ab2266bd
    }

    
            
}
