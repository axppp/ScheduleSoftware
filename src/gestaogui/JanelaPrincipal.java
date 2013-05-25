package gestaogui;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.*;


@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {

  
    private Imagens img = new Imagens();
   
    private AppConfig appconfig;

    public JanelaPrincipal() throws URISyntaxException {
        super("Gestão Horarios");
        addButtons();
        setProperties(640,480,0,true);
        
    }

 
    private void close() {
        String[] opt = {"Ok", "Cancelar"};
        if (JOptionPane.showOptionDialog(this, "Deseja mesmo fechar a aplicação?", "Gestão Horário", 0, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(img.exit), opt, opt[0]) == 0) {
            Main.gravarEstado();
            dispose();
            System.exit(0);
        }
    }

    
    private void setProperties(int w, int h, int opcao, boolean v) {
        setSize(w, h);
        
        setDefaultCloseOperation(opcao);
       
        setVisible(v);
        
        setLocationRelativeTo(null);
        
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                close();
            }
        });
    }

   
    private void addButtons() {
        // Buttons
        Botao btn1 = new Botao(img.gestor, img.gestorO);
        Botao btn2 = new Botao(img.sobreNos, img.sobreNosO);
        Botao btn3 = new Botao(img.sair, img.sairO);
        // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 55, 120));
        Painel panelbtn = new Painel(img.background);
        panel.setImage(img.background2);
        
        // Panels customization
        panelbtn.setLayout(new GridLayout(4, 1, 10, 10));
        panelbtn.setBorder(new EmptyBorder(20, 20, 30, 20));
        panelbtn.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        // Menu title
        JLabel lb = new JLabel("Menu");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);

        // appconfig customization/ actionlistener
        btn1.setContentAreaFilled(false);
        btn1.setBorder(emptyBorder);
        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (appconfig == null) {
                    appconfig = new AppConfig();
                } else {
                    appconfig.setVisible(true);
                }
            }
         });

        // about customization/ actionlistener
        btn2.setContentAreaFilled(false);
        btn2.setBorder(emptyBorder);
        btn2.addActionListener(new ActionListener() {

            @SuppressWarnings("unused")
            public void actionPerformed(ActionEvent e) {
                try {
                    About about = new About(JanelaPrincipal.this);
                } catch (URISyntaxException e1) {
                }
            }
        });

        // exitapp customization/ actionlistener
        btn3.setContentAreaFilled(false);
        btn3.setBorder(emptyBorder);
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                close();
            }
        });

        // adding components to the panels
        
        panel.add(panelbtn);
        panelbtn.add(lb);
        panelbtn.add(btn1);
        panelbtn.add(btn2);
        panelbtn.add(btn3);
        add(panel, BorderLayout.CENTER);
    }
}
