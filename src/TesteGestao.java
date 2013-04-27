
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class TesteGestao {
     public static void main(String[] args) {
         
        Horario a = new Horario();
        Date b = new Date();
        
        //Pessoa x = new Pessoa("paulo",a,"paulo@gmail.com");
        
        
      
       
       Aluno paulo = new Aluno(1100456,b,10,"paulo","a","paulo@gmail.com");
         System.out.println(paulo.toString());
    }
    
}
