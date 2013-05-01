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
    
    
    
    
    
}
