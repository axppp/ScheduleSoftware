/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author axppp
 */
public class ListarDados extends JFrame {

    private Imagens img = new Imagens();
    private AppConfig appconfig;

    public ListarDados() {
        super("Listar Dados");
        ListarDados();
        setProperties(300, 150, 1, true);


    }

    private void ListarDados() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        //Painel panelbtn = new Painel(img.background2);
        panel.setImage(img.background);

        // Panels customization
        panel.setLayout(new GridLayout(2, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);



        JLabel la5 = new JLabel("Professor");
        String[] v5 = new String[m.professores.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.professores.size() + 1; i++) {
            v5[i] = m.professores.get(i - 1).toString();
        }
        final JComboBox te5 = new JComboBox(v5);

        // panel.add(lb2);
        panel.add(lb);
        panel.add(te5);




        add(panel, BorderLayout.NORTH);
    }

    private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }
}
