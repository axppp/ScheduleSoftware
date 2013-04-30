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

   
    @Override
    public String toString() {
        return "A pessoa com o nome "+ nome + ", tem o email: " + email;

    }

    
            
}
