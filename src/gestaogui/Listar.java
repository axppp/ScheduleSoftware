/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author axppp
 */
public class Listar extends JFrame {
    private Imagens img = new Imagens();
   
    private AppConfig appconfig;

    public Listar() {
        super("Listagem");
        listagem();
        setProperties(600, 500, 1, true);
        
        
    }
    
    private void listagem ()
    {
        
         // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 55, 120));
        Painel panelbtn = new Painel(img.background);
        
        // Panels customization
        panelbtn.setLayout(new GridLayout(4, 1, 10, 10));
        panelbtn.setBorder(new EmptyBorder(20, 20, 30, 20));
        panelbtn.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        
        JLabel lb = new JLabel("Listagem");
          // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        
        panel.add(panelbtn);
        panelbtn.add(lb);
        
       
        add(panel, BorderLayout.CENTER);
    }
    
     private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }
}
