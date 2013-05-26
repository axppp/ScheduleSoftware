/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import gestaologica.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Ed
 */
public class Outros extends JFrame {

    private Imagens img = new Imagens();
    private AppConfig appconfig;
    DefaultListModel ModeloListaHorario = new DefaultListModel();

    public Outros(String nome) {
        super("Listar Dados");
        if (nome.equalsIgnoreCase("professor")) {
            ListarDiscProf();
        } else if (nome.equalsIgnoreCase("taxa")) {
            Taxa();
        } else if (nome.equalsIgnoreCase("disciplina")) {
            ListarDiscSala();
        } else if (nome.equalsIgnoreCase("turma")) {
            ListarTurmaProf();
        }

        setProperties(300, 300, 1, true);

    }

    private void ListarDiscProf() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel(img.background2);
        JPanel panelbtn = new JPanel();

        final Botao cancelar = new Botao(img.cancel, img.cancelO);
        Botao[] botoes = {cancelar};

        configButtons(botoes);
        panelbtn.setOpaque(false);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel.setOpaque(false);
        // Empty border
//        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Listar Dados");

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

        cancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panelbtn.add(cancelar);
        panel.add(panelbtn);

        add(panel, BorderLayout.CENTER);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.professores.get(te5.getSelectedIndex() - 1).ListarDisciplinaProfessor(m.turmas, m.disciplinas, m.horarios));
                }
            }
        });
    }

    private void Taxa() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background2);


        final Botao cancelar = new Botao(img.cancel, img.cancelO);
        final Botao ok = new Botao(img.ok, img.okO);
        Botao[] botoes = {ok, cancelar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(1, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 10, 20));
        panel.setOpaque(false);

        panelbtn.setOpaque(false);
        panelbtn.setLayout(new GridLayout(4, 2, 20, 20));
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Listar Dados");
        JLabel lbespaço = new JLabel();
        final JTextField te = new JTextField();
        JLabel lb1 = new JLabel("Insira Taxa:");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        lb1.setFont(new Font("Arial", Font.BOLD, 10));
        lb1.setForeground(Color.white);

        panelbtn.add(lb);
        panelbtn.add(lbespaço);
        panelbtn.add(lb1);
        panelbtn.add(te);


        cancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panelbtn.add(ok);
        panelbtn.add(cancelar);
        panel.add(panelbtn, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);

        ok.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                SalaAula sala = new SalaAula();
                JOptionPane.showMessageDialog(null, sala.ocupacaoSala(m.salas, Integer.parseInt(te.getText()), m.horarios));

            }
        });
    }

    private void ListarDiscSala() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel(img.background2);
        JPanel panelbtn = new JPanel();

        final Botao cancelar = new Botao(img.cancel, img.cancelO);
        Botao[] botoes = {cancelar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        panelbtn.setOpaque(false);

        JLabel lb = new JLabel("Listar Dados");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);



        JLabel la5 = new JLabel("Sala");
        String[] v5 = new String[m.salas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.salas.size() + 1; i++) {
            v5[i] = m.salas.get(i - 1).toStringSigla();
        }
        final JComboBox te5 = new JComboBox(v5);

        // panel.add(lb2);
        panel.add(lb);
        panel.add(te5);

        cancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panelbtn.add(cancelar);
        panel.add(panelbtn);

        add(panel, BorderLayout.CENTER);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.salas.get(te5.getSelectedIndex() - 1).ListarDisciplinaSala(m.disciplinas, m.horarios));
                }
            }
        });
    }

    private void ListarTurmaProf() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel(img.background2);
        JPanel panelbtn = new JPanel();

        final Botao cancelar = new Botao(img.cancel, img.cancelO);
        Botao[] botoes = {cancelar};

        configButtons(botoes);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        panelbtn.setOpaque(false);

        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Listar Dados");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);



        JLabel la5 = new JLabel("Turmas");
        String[] v5 = new String[m.turmas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.turmas.size() + 1; i++) {
            v5[i] = m.turmas.get(i - 1).toStringSigla();
        }
        final JComboBox te5 = new JComboBox(v5);

        // panel.add(lb2);
        panel.add(lb);
        panel.add(te5);

        add(panel, BorderLayout.CENTER);

        cancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panelbtn.add(cancelar);
        panel.add(panelbtn);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.turmas.get(te5.getSelectedIndex() - 1).listarProfessorTurma(m.professores, m.horarios));
                }
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
