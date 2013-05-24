/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class CargaHoraria extends JFrame {

    private Imagens img = new Imagens();
    private AppConfig appconfig;

    public CargaHoraria(String tipo) {
        super("Carga Horaria");
        CarHoraria(tipo);
        setProperties(300, 170, 1, true);


    }

    private void CarHoraria(String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        //Painel panelbtn = new Painel(img.background2);
        panel.setImage(img.background);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);



        panel.add(lb);
        if (tipo.equalsIgnoreCase("professor")) {

            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.professores.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.professores.size() + 1; i++) {
                v5[i] = m.professores.get(i - 1).toString();
            }
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);

            te5.addActionListener(te5);
        } else if (tipo.equalsIgnoreCase("aluno")) {
            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.alunos.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.alunos.size() + 1; i++) {
                v5[i] = m.alunos.get(i - 1).toStringNumeroAluno();
            }
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);
        } else if (tipo.equalsIgnoreCase("turma")) {
            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.turmas.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.turmas.size() + 1; i++) {
                v5[i] = m.turmas.get(i - 1).getDesignacao();
            }
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);
        } else if (tipo.equalsIgnoreCase("disciplina")) {
            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.disciplinas.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.disciplinas.size() + 1; i++) {
                v5[i] = m.disciplinas.get(i - 1).getDesignacao();
            }
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);
        } else if (tipo.equalsIgnoreCase("sala")) {
            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.salas.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.salas.size() + 1; i++) {
                v5[i] = m.salas.get(i - 1).getCodigo();
            }
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);
        }


        // panel.add(lb2);




        add(panel, BorderLayout.NORTH);
    }

    private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }
}
