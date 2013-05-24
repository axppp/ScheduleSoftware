/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

;

/**
 *
 * @author Ed
 */
public class SalaLivre extends JFrame {

    private Imagens img = new Imagens();
    private AppConfig appconfig;

    public SalaLivre() {
        super("Listar Sala");
        SalaLivrep("ola");
        setProperties(300, 250, 1, true);
    }

    private void SalaLivrep(String ola) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel buttons_panel = new JPanel(new GridLayout(1, 3, 5, 5));
        buttons_panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Painel panelbtn = new Painel(img.background2);
        panel.setImage(img.background);

        // Panels customization
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Carga Horária:");
        JLabel lbespaço = new JLabel();

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 16));
        lb.setForeground(Color.white);

        JLabel la5 = new JLabel("Sala");
        la5.setFont(new Font("Arial", Font.BOLD, 14));
        la5.setForeground(Color.white);
        String[] v5 = new String[m.salas.size()];
        for (int i = 0; i < m.salas.size(); i++) {
            v5[i] = m.salas.get(i).toStringSigla();
        }
        final JComboBox te5 = new JComboBox(v5);


        JLabel la = new JLabel("Horas");
        la.setFont(new Font("Arial", Font.BOLD, 14));
        la.setForeground(Color.white);
        String[] v = new String[11];
        for (int i = 8; i < 18; i++) {
            v[i - 8] = i + "H";
        }
        final JComboBox te = new JComboBox(v);


        JLabel la1 = new JLabel("Dias da semana");
        la1.setFont(new Font("Arial", Font.BOLD, 14));
        la1.setForeground(Color.white);
        String[] v1 = new String[5];
        for (int i = 2; i < 7; i++) {
            v1[i - 2] = i + "ª Feira";
        }
        final JComboBox te1 = new JComboBox(v1);


        Botao calc = new Botao(img.ok, img.okO);
        Botao[] botoes = {calc};

        configButtons(botoes);




        panel.add(lb);
        panel.add(lbespaço);
        panel.add(la5);
        panel.add(te5);
        panel.add(la);
        panel.add(te);
        panel.add(la1);
        panel.add(te1);
        panel.add(calc);


        add(panel, BorderLayout.CENTER);


        calc.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int b = te.getSelectedIndex() + 8, a = te1.getSelectedIndex() + 2;
                JOptionPane.showMessageDialog(null, m.salas.get(te5.getSelectedIndex()).SalaAulaExtra(a, b, m.salas, m.horarios));

            }
        });
    }

    private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }

    private void configButtons(Botao[] botoes) {
        final Border emptyBorder = BorderFactory.createEmptyBorder();
        for (Botao bt : botoes) {
            bt.setContentAreaFilled(false);
            bt.setBorderPainted(false);
            bt.setBorder(emptyBorder);
        }
    }
}
