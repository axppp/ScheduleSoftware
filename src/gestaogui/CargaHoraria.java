/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

        if (tipo.equalsIgnoreCase("aluno")) {
            CarHorariaAluno(tipo);
        }
        else if (tipo.equalsIgnoreCase("professor"))
            CarHorariaProf(tipo);
        else if (tipo.equalsIgnoreCase("turma"))
            CarHorariaTurma(tipo);
        //CarHoraria(tipo);
        else if (tipo.equalsIgnoreCase("disciplina"))
            CarHorariaDisciplina(tipo);
        else if (tipo.equalsIgnoreCase("sala"))
            CarHorariaSala(tipo);
        setProperties(300, 200, 1, true);


    }

    private void CarHorariaAluno(final String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        final Botao adicionar = new Botao(img.ver, img.verO);
        Botao[] botoes = {adicionar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);


        final JComboBox te5;
        panel.add(lb);


        String[] v5 = new String[m.alunos.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.alunos.size() + 1; i++) {
            v5[i] = m.alunos.get(i - 1).toStringNumeroAluno();
        }
        te5 = new JComboBox(v5);

        panel.add(te5);


        te5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null, m.alunos.get(te5.getSelectedIndex()).CargaHorariaAluno(m.alunos, m.horarios));
            }
        });


        panelbtn.add(adicionar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

    }
    
    
    private void CarHorariaProf(final String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        final Botao adicionar = new Botao(img.ver, img.verO);
        Botao[] botoes = {adicionar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);


        final JComboBox te5;
        panel.add(lb);
<<<<<<< HEAD


        String[] v5 = new String[m.professores.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.professores.size() + 1; i++) {
            v5[i] = m.professores.get(i - 1).toString();
        }
        te5 = new JComboBox(v5);

        panel.add(te5);


        te5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null, m.professores.get(te5.getSelectedIndex()).CargaHorariaProfessor(m.professores, m.horarios));
            }
        });


        panelbtn.add(adicionar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

    }

     private void CarHorariaTurma(final String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        final Botao adicionar = new Botao(img.ver, img.verO);
        Botao[] botoes = {adicionar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);


        final JComboBox te5;
        panel.add(lb);


        String[] v5 = new String[m.turmas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.turmas.size() + 1; i++) {
            v5[i] = m.turmas.get(i - 1).toStringSigla();
        }
        te5 = new JComboBox(v5);

        panel.add(te5);


        te5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null, m.turmas.get(te5.getSelectedIndex()).CargaHorariaTurma(m.turmas, m.horarios));
            }
        });


        panelbtn.add(adicionar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

    }
     
     
     private void CarHorariaDisciplina(final String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        final Botao adicionar = new Botao(img.ver, img.verO);
        Botao[] botoes = {adicionar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);


        final JComboBox te5;
        panel.add(lb);


        String[] v5 = new String[m.disciplinas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.disciplinas.size() + 1; i++) {
            v5[i] = m.disciplinas.get(i - 1).toStringSigla();
        }
        te5 = new JComboBox(v5);

        panel.add(te5);


        te5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null, m.disciplinas.get(te5.getSelectedIndex()).CargaHorariaDisciplina(m.disciplinas, m.horarios));
            }
        });


        panelbtn.add(adicionar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

    }
     
     private void CarHorariaSala(final String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        final Botao adicionar = new Botao(img.ver, img.verO);
        Botao[] botoes = {adicionar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);


        final JComboBox te5;
        panel.add(lb);


        String[] v5 = new String[m.salas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.salas.size() + 1; i++) {
            v5[i] = m.salas.get(i - 1).toStringSigla();
        }
        te5 = new JComboBox(v5);

        panel.add(te5);


        te5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(null, m.salas.get(te5.getSelectedIndex()).CargaHorariaSala(m.salas, m.horarios));
            }
        });


        panelbtn.add(adicionar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

    }
     
     
     
    private void CarHoraria(final String tipo) {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        final Botao adicionar = new Botao(img.ver, img.verO);
        Botao[] botoes = {adicionar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Carga Horária");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);


        final JComboBox te5;
        panel.add(lb);
=======
>>>>>>> eda6e76b528d888771bbf7ffef6a846f08ace0c4
        if (tipo.equalsIgnoreCase("professor")) {

            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.professores.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.professores.size() + 1; i++) {
                v5[i] = m.professores.get(i - 1).toString();
            }
<<<<<<< HEAD
            te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);


=======
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);

            te5.addActionListener(te5);
>>>>>>> eda6e76b528d888771bbf7ffef6a846f08ace0c4
        } else if (tipo.equalsIgnoreCase("aluno")) {
            JLabel la5 = new JLabel(tipo);
            la5.setFont(new Font("Arial", Font.BOLD, 14));
            la5.setForeground(Color.white);
            String[] v5 = new String[m.alunos.size() + 1];
            v5[0] = " ";
            for (int i = 1; i < m.alunos.size() + 1; i++) {
                v5[i] = m.alunos.get(i - 1).toStringNumeroAluno();
            }
<<<<<<< HEAD
            te5 = new JComboBox(v5);
=======
            final JComboBox te5 = new JComboBox(v5);
>>>>>>> eda6e76b528d888771bbf7ffef6a846f08ace0c4
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
<<<<<<< HEAD
            te5 = new JComboBox(v5);
=======
            final JComboBox te5 = new JComboBox(v5);
>>>>>>> eda6e76b528d888771bbf7ffef6a846f08ace0c4
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
<<<<<<< HEAD
            te5 = new JComboBox(v5);
=======
            final JComboBox te5 = new JComboBox(v5);
>>>>>>> eda6e76b528d888771bbf7ffef6a846f08ace0c4
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
<<<<<<< HEAD
            te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);
        }
=======
            final JComboBox te5 = new JComboBox(v5);
            panel.add(la5);
            panel.add(te5);
        }

>>>>>>> eda6e76b528d888771bbf7ffef6a846f08ace0c4


        adicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //te5.getSelectedItem();
                if (tipo.equalsIgnoreCase("professor")) {
                } else if (tipo.equalsIgnoreCase("aluno")) {
                } else if (tipo.equalsIgnoreCase("disciplina")) {
                } else if (tipo.equalsIgnoreCase("turma")) {
                } else if (tipo.equalsIgnoreCase("sala")) {
                }

            }
        });




        panelbtn.add(adicionar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

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
