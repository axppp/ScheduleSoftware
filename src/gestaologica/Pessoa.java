package gestaologica;




import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class Pessoa implements Serializable{
    
    private String nome;
    
    private String email;

    /**
     * 
     * @param nome
     * @param email 
     * Construtor Pessoa
     */
    public Pessoa(String nome, String email) {
        this.nome = nome;
       
        this.email = email;
    }

    /**
     * Construtor vazio
     */
    public Pessoa() {
    }

    /**
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    
    
    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param nome 
     * Metodo para definir o nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   /**
    * 
    * @param email 
    * Metodo para definir o email
    */
    public void setEmail(String email) {
        this.email = email;
    }

   
    @Override
    /**
     * Metodo toString
     */
    public String toString() {
        return "A pessoa com o nome "+ nome + ", tem o email: " + email;

    }

    
            
}
