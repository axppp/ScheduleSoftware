
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
         
        
        Date b = new Date();
        
        
        
       
       Aluno paulo = new Aluno(1100456,"paulo",1,12,2002,911844375,"a","paulo@gmail.com");
       Aluno vitor = new Aluno(110123,"vitor",22,10,2008,291183131,"s","vitor@gmail.com");

       ArrayList<Aluno> alunos = new ArrayList<Aluno>();
       alunos.add(vitor);
       alunos.add(paulo);;
       Turma d1 = new Turma("1DA",alunos);
         
       Professor aurtur = new Professor("ART","artur",2,5,1998,"artur@gmail.com");
       Professor aurtur1 = new Professor("ART2","art2ur",2,5,1998,"artur@gmail.com");
       Professor aurtu = new Professor("ART3","artu3r",2,5,1998,"artur@gmail.com");
       Professor aurtu3 = new Professor("ART4","art4ur",2,5,1998,"artur@gmail.com");
         
        ArrayList<Professor> professoresPL = new ArrayList<Professor>();
        professoresPL.add(aurtur);
        professoresPL.add(aurtu);
        professoresPL.add(aurtu3);
        Disciplina amata = new Disciplina("AMA","analise matematica",2,6,"AJM",professoresPL);
        SalaAula b102 = new SalaAula("b102",1,200);
        
        Horario a = new Horario(d1,amata,1,4,11,2,aurtur,b102);
        
         System.out.println(a.toString()); 
    }
    
}
