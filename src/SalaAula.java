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
    public enum tipoSala {ANFITIATRO , LABORATORIO} // Laboratorio/ anfitiatro
    private int capacidade;

    public SalaAula(String codigo, String tipoSala, int capacidade) {
        this.codigo = codigo;
        this.tipoSala = tipoSala;
        this.capacidade = capacidade;
    }   
    
    
    
    
    
}
