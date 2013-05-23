/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author Ed
 */
public class ListarDados extends JFrame {

    private Imagens img = new Imagens();
    private JTextArea TextArea = new JTextArea();
    private JComboBox CProfessor = new JComboBox();
    private Main m = new Main();
    Component c = null;

    public ListarDados() {
        super("Listar Professores");
        setProperties(640, 480, 0, true);

        Painel main_panel = new Painel(img.background2);
        main_panel.setBounds(50, 50, 25, 25);

        String[] v5 = new String[m.professores.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.professores.size() + 1; i++) {
            v5[i] = m.professores.get(i-1).toString();
        }
        CProfessor = new JComboBox(v5);

        CProfessor.setBounds(5, 5, 20, 20);

        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());
        TextArea.setBounds(50, 50, 20, 20);

        main_panel.add(TextArea, BorderLayout.NORTH);
        main_panel.add(CProfessor, BorderLayout.SOUTH);

        add(main_panel);
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

    private void close() {
        dispose();
    }
}
