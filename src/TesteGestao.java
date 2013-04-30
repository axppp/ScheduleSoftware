
import java.util.ArrayList;
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
        
        
      
       
       Aluno paulo = new Aluno(1100456,"paulo",1,12,2002,911844375,"a","paulo@gmail.com");
         System.out.println(paulo.toString());
         
       Professor aurtur = new Professor("ART","artur",2,5,1998,"artur@gmail.com");
       Professor aurtur1 = new Professor("ART2","art2ur",2,5,1998,"artur@gmail.com");
       Professor aurtu = new Professor("ART3","artu3r",2,5,1998,"artur@gmail.com");
       Professor aurtu3 = new Professor("ART4","art4ur",2,5,1998,"artur@gmail.com");
         //System.out.println(aurtur.toString());
         
        ArrayList<Professor> professoresPL = new ArrayList<Professor>();
        professoresPL.add(aurtur);
        professoresPL.add(aurtu);
        professoresPL.add(aurtu3);
        Disciplina amata = new Disciplina("AMA","analise matematica",2,6,"AJM",professoresPL);
        System.out.println(amata.toString());
        
    }
    
}
