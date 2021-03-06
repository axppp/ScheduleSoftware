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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author axppp
 */
public class ListarDados extends JFrame {

    private Imagens img = new Imagens();
    private AppConfig appconfig;

    public ListarDados(String nome) {
        super("Listar Dados");
        if (nome.equalsIgnoreCase("professor")) {
            ListarDadosProf();
            
        } else if (nome.equalsIgnoreCase("aluno")) {
            ListarDadosAluno();
            
        } else if (nome.equalsIgnoreCase("turma")) {
            ListarDadosTurma();
            
        } else if (nome.equalsIgnoreCase("disciplina")) {
            ListarDadosDisciplina();
            
        } else if (nome.equalsIgnoreCase("sala")) {
            ListarDadosSala();
            

        }

        setProperties(300, 200, 1, true);   

    }

    private void ListarDadosProf() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);
        
         final Botao cancelar = new Botao(img.cancel, img.cancelO);
        Botao[] botoes = {cancelar};

         configButtons(botoes);
        panelbtn.setOpaque(false);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

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
         cancelar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            dispose();
        }
        });
         
          panelbtn.add(cancelar);
        panel.add(panelbtn);


        add(panel, BorderLayout.NORTH);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.professores.get(te5.getSelectedIndex() - 1).listarDadosProfessor());
                }
            }
        });
    }

    private void ListarDadosAluno() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);
        
        final Botao cancelar = new Botao(img.cancel, img.cancelO);
        Botao[] botoes = {cancelar};

         configButtons(botoes);
         panelbtn.setOpaque(false);

        // Panels customization
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(new EmptyBorder(20, 20, 30, 20));
        panel.setOpaque(false);
        // Empty border
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel lb = new JLabel("Listar Dados");

        // Title customization
        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);



        JLabel la5 = new JLabel("Aluno");
        String[] v5 = new String[m.alunos.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.alunos.size() + 1; i++) {
            v5[i] = m.alunos.get(i - 1).toStringNumeroAluno();
        }
        final JComboBox te5 = new JComboBox(v5);

        // panel.add(lb2);
        panel.add(lb);
        panel.add(te5);
        
          cancelar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            dispose();
        }
        });
         
          panelbtn.add(cancelar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.alunos.get(te5.getSelectedIndex() - 1).listarDadosAluno());
                }
            }
        });
    }

    private void ListarDadosTurma() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);

        
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



        JLabel la5 = new JLabel("Turma");
        String[] v5 = new String[m.turmas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.turmas.size() + 1; i++) {
            v5[i] = m.turmas.get(i - 1).toStringSigla();
        }
        final JComboBox te5 = new JComboBox(v5);

        // panel.add(lb2);
        panel.add(lb);
        panel.add(te5);
        
         cancelar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            dispose();
        }
        });
         
          panelbtn.add(cancelar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.turmas.get(te5.getSelectedIndex() - 1).listarDadosTurma());
                }
            }
        });
    }

    private void ListarDadosSala() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);
        
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
        
         cancelar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            dispose();
        }
        });
         
          panelbtn.add(cancelar);
        panel.add(panelbtn);

        add(panel, BorderLayout.NORTH);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.salas.get(te5.getSelectedIndex() - 1).listarDadosSala());
                }
            }
        });
    }

    private void ListarDadosDisciplina() {

        final Main m = new Main();
        // Panels
        Painel panel = new Painel();
        JPanel panelbtn = new JPanel();
        panel.setImage(img.background);
        
        
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



        JLabel la5 = new JLabel("Disciplinas");
        String[] v5 = new String[m.disciplinas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.disciplinas.size() + 1; i++) {
            v5[i] = m.disciplinas.get(i - 1).toStringSigla();
        }
        final JComboBox te5 = new JComboBox(v5);

        // panel.add(lb2);
        panel.add(lb);
        panel.add(te5);

        add(panel, BorderLayout.NORTH);
        
         cancelar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            dispose();
        }
        });
         
          panelbtn.add(cancelar);
        panel.add(panelbtn);

        te5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (te5.getSelectedIndex() > 0) {
                    JOptionPane.showMessageDialog(null, m.disciplinas.get(te5.getSelectedIndex() - 1).listarDadosDisciplina());
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
