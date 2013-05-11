
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class SalaAula {
    private String codigo;

    SalaAula() {
        
    }
    public enum tipoSala {ANFITIATRO , LABORATORIO} 
    tipoSala a;
    public String tipoSala;
    private int capacidade;

    public SalaAula(String codigo, int tipoSala, int capacidade) {
        this.codigo = codigo;
        verificaTipoSala(tipoSala);
        this.capacidade = capacidade;
    }   

    public void verificaTipoSala(int tipoSala)
    {
        if(tipoSala == 1)
        {
            this.tipoSala = a.ANFITIATRO.name();
        }
        else if(tipoSala == 2)
        {
            this.tipoSala = a.LABORATORIO.name();
        }
    }
    
    public String getCodigo() {
        return codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
      public String[] disciplinasSala(String sala, ArrayList<Horario> horarios, ArrayList<Disciplina> disciplinas)
    {
        String vector[] = new String[disciplinas.size()];
        int count=0;
        for (int i = 0; i < horarios.size(); i++) {
            
            if(horarios.get(i).getCodigo_sala().equalsIgnoreCase(sala))
                    {
                       if(horarios.get(i).getSigla_disciplina().contains(vector[i]))
                       {
                           System.out.println("hey");
                       }
                        vector[count] = horarios.get(i).getSigla_disciplina();
                        count++;
                        /*if(i>0)
                        {
                        for (int j = 0; j < i; j++) {
                            if(vector[j].equalsIgnoreCase(horarios.get(j).getSigla_disciplina()))
                            {
                                System.out.println("boda");
                            }
                            
                        }*/
                        }
                    //}
            
        }
        return vector;
        
        
    }

    @Override
    public String toString() {
        return "SalaAula{" + "codigo=" + codigo + ", a=" + a + ", tipoSala=" + tipoSala + ", capacidade=" + capacidade + '}';
    }
    
    
    
    
    
}
