/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaogui;

import gestaologica.Horario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.ArrayList;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author axppp
 */
public class Listar extends JFrame {

    private Imagens img = new Imagens();
    private AppConfig appconfig;

    public Listar(String nome) {
        super("Listagem");
                if (nome.equalsIgnoreCase("professor")) {
            listagemProf();
            
        } else if (nome.equalsIgnoreCase("aluno")) {
            listagemAluno();
            
        } else if (nome.equalsIgnoreCase("turma")) {
            listagemTurma();
            
        } else if (nome.equalsIgnoreCase("disciplina")) {
            listagemDisciplina();
            
        } else if (nome.equalsIgnoreCase("sala")) {
            listagemSala();
            

        }
        setProperties(850, 400, 1, true);


    }

    private void listagemProf() {
        final Main m = new Main();

        // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 60, 120));
        Painel panelbtn = new Painel(img.background2);
        panel.setLayout(new GridLayout(1, 0, 0, 10));

        // Panels customization
        panelbtn.setLayout(new GridLayout(15, 11, 0, 0));
//        panelbtn.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelbtn.setOpaque(false);
        // Empty border
//        Border emptyBorder = BorderFactory.createEmptyBorder();
        JLabel NomeCom = new JLabel("Professores:", JLabel.CENTER);
        String[] v5 = new String[m.professores.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.professores.size() + 1; i++) {
            v5[i] = m.professores.get(i - 1).toString();
        }
        final JComboBox com = new JComboBox(v5);

        // Title customization

        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        NomeCom.setFont(new Font("Arial", Font.BOLD, 12));
        NomeCom.setForeground(Color.white);

        HorarioVazio();

        panel.add(panelbtn, BorderLayout.CENTER);
        panelbtn.add(lb, BorderLayout.NORTH);
        panelbtn.add(lb1, BorderLayout.CENTER);
        panelbtn.add(lb2, BorderLayout.CENTER);
        panelbtn.add(lb3, BorderLayout.CENTER);
        panelbtn.add(lb4, BorderLayout.CENTER);
        panelbtn.add(lb5, BorderLayout.CENTER);
        panelbtn.add(lb6, BorderLayout.CENTER);
        panelbtn.add(lb7, BorderLayout.CENTER);
        panelbtn.add(lb8, BorderLayout.CENTER);
        panelbtn.add(lb9, BorderLayout.CENTER);
        panelbtn.add(lb10, BorderLayout.CENTER);
        panelbtn.add(lb0, BorderLayout.CENTER);
        panelbtn.add(lb01, BorderLayout.CENTER);
        panelbtn.add(lb02, BorderLayout.CENTER);
        panelbtn.add(lb03, BorderLayout.CENTER);
        panelbtn.add(lb04, BorderLayout.CENTER);
        panelbtn.add(lb05, BorderLayout.CENTER);
        panelbtn.add(lb06, BorderLayout.CENTER);
        panelbtn.add(lb07, BorderLayout.CENTER);
        panelbtn.add(lb08, BorderLayout.CENTER);
        panelbtn.add(lb09, BorderLayout.CENTER);
        panelbtn.add(lb010, BorderLayout.CENTER);
        panelbtn.add(lb11, BorderLayout.CENTER);
        panelbtn.add(P8Seg, BorderLayout.CENTER);
        panelbtn.add(lb13, BorderLayout.CENTER);
        panelbtn.add(P8Ter, BorderLayout.CENTER);
        panelbtn.add(lb15, BorderLayout.CENTER);
        panelbtn.add(P8Qua, BorderLayout.CENTER);
        panelbtn.add(lb17, BorderLayout.CENTER);
        panelbtn.add(P8Qui, BorderLayout.CENTER);
        panelbtn.add(lb19, BorderLayout.CENTER);
        panelbtn.add(P8Sex, BorderLayout.CENTER);
        panelbtn.add(lb21, BorderLayout.CENTER);
        panelbtn.add(lb22, BorderLayout.CENTER);
        panelbtn.add(lb23, BorderLayout.CENTER);
        panelbtn.add(lb24, BorderLayout.CENTER);
        panelbtn.add(lb25, BorderLayout.CENTER);
        panelbtn.add(lb26, BorderLayout.CENTER);
        panelbtn.add(lb27, BorderLayout.CENTER);
        panelbtn.add(lb28, BorderLayout.CENTER);
        panelbtn.add(lb29, BorderLayout.CENTER);
        panelbtn.add(lb30, BorderLayout.CENTER);
        panelbtn.add(lb31, BorderLayout.CENTER);
        panelbtn.add(lb32, BorderLayout.CENTER);
        panelbtn.add(lb33, BorderLayout.CENTER);
        panelbtn.add(lb34, BorderLayout.CENTER);
        panelbtn.add(lb35, BorderLayout.CENTER);
        panelbtn.add(lb36, BorderLayout.CENTER);
        panelbtn.add(lb37, BorderLayout.CENTER);
        panelbtn.add(lb38, BorderLayout.CENTER);
        panelbtn.add(lb39, BorderLayout.CENTER);
        panelbtn.add(lb40, BorderLayout.CENTER);
        panelbtn.add(lb41, BorderLayout.CENTER);
        panelbtn.add(lb42, BorderLayout.CENTER);
        panelbtn.add(lb43, BorderLayout.CENTER);
        panelbtn.add(lb44, BorderLayout.CENTER);
        panelbtn.add(lb45, BorderLayout.CENTER);
        panelbtn.add(lb46, BorderLayout.CENTER);
        panelbtn.add(lb47, BorderLayout.CENTER);
        panelbtn.add(lb48, BorderLayout.CENTER);
        panelbtn.add(lb49, BorderLayout.CENTER);
        panelbtn.add(lb50, BorderLayout.CENTER);
        panelbtn.add(lb51, BorderLayout.CENTER);
        panelbtn.add(lb52, BorderLayout.CENTER);
        panelbtn.add(lb53, BorderLayout.CENTER);
        panelbtn.add(lb54, BorderLayout.CENTER);
        panelbtn.add(lb55, BorderLayout.CENTER);
        panelbtn.add(lb56, BorderLayout.CENTER);
        panelbtn.add(lb57, BorderLayout.CENTER);
        panelbtn.add(lb58, BorderLayout.CENTER);
        panelbtn.add(lb59, BorderLayout.CENTER);
        panelbtn.add(lb60, BorderLayout.CENTER);
        panelbtn.add(lb61, BorderLayout.CENTER);
        panelbtn.add(lb62, BorderLayout.CENTER);
        panelbtn.add(lb63, BorderLayout.CENTER);
        panelbtn.add(lb64, BorderLayout.CENTER);
        panelbtn.add(lb65, BorderLayout.CENTER);
        panelbtn.add(lb66, BorderLayout.CENTER);
        panelbtn.add(lb67, BorderLayout.CENTER);
        panelbtn.add(lb68, BorderLayout.CENTER);
        panelbtn.add(lb69, BorderLayout.CENTER);
        panelbtn.add(lb70, BorderLayout.CENTER);
        panelbtn.add(lb71, BorderLayout.CENTER);
        panelbtn.add(lb72, BorderLayout.CENTER);
        panelbtn.add(lb73, BorderLayout.CENTER);
        panelbtn.add(lb74, BorderLayout.CENTER);
        panelbtn.add(lb75, BorderLayout.CENTER);
        panelbtn.add(lb76, BorderLayout.CENTER);
        panelbtn.add(lb77, BorderLayout.CENTER);
        panelbtn.add(lb78, BorderLayout.CENTER);
        panelbtn.add(lb79, BorderLayout.CENTER);
        panelbtn.add(lb80, BorderLayout.CENTER);
        panelbtn.add(lb81, BorderLayout.CENTER);
        panelbtn.add(lb82, BorderLayout.CENTER);
        panelbtn.add(lb83, BorderLayout.CENTER);
        panelbtn.add(lb84, BorderLayout.CENTER);
        panelbtn.add(lb85, BorderLayout.CENTER);
        panelbtn.add(lb86, BorderLayout.CENTER);
        panelbtn.add(lb87, BorderLayout.CENTER);
        panelbtn.add(lb88, BorderLayout.CENTER);
        panelbtn.add(lb89, BorderLayout.CENTER);
        panelbtn.add(lb90, BorderLayout.CENTER);
        panelbtn.add(lb91, BorderLayout.CENTER);
        panelbtn.add(lb92, BorderLayout.CENTER);
        panelbtn.add(lb93, BorderLayout.CENTER);
        panelbtn.add(lb94, BorderLayout.CENTER);
        panelbtn.add(lb95, BorderLayout.CENTER);
        panelbtn.add(lb96, BorderLayout.CENTER);
        panelbtn.add(lb97, BorderLayout.CENTER);
        panelbtn.add(lb98, BorderLayout.CENTER);
        panelbtn.add(lb99, BorderLayout.CENTER);
        panelbtn.add(lb100, BorderLayout.CENTER);
        panelbtn.add(lb101, BorderLayout.CENTER);
        panelbtn.add(lb102, BorderLayout.CENTER);
        panelbtn.add(lb103, BorderLayout.CENTER);
        panelbtn.add(lb104, BorderLayout.CENTER);
        panelbtn.add(lb105, BorderLayout.CENTER);
        panelbtn.add(lb106, BorderLayout.CENTER);
        panelbtn.add(lb107, BorderLayout.CENTER);
        panelbtn.add(lb108, BorderLayout.CENTER);
        panelbtn.add(lb109, BorderLayout.CENTER);
        panelbtn.add(lb110, BorderLayout.CENTER);
        panelbtn.add(lb111, BorderLayout.CENTER);
        panelbtn.add(lb112, BorderLayout.CENTER);
        panelbtn.add(lb113, BorderLayout.CENTER);
        panelbtn.add(lb114, BorderLayout.CENTER);
        panelbtn.add(lb115, BorderLayout.CENTER);
        panelbtn.add(lb116, BorderLayout.CENTER);
        panelbtn.add(lb117, BorderLayout.CENTER);
        panelbtn.add(lb118, BorderLayout.CENTER);
        panelbtn.add(lb119, BorderLayout.CENTER);
        panelbtn.add(lb120, BorderLayout.CENTER);
        panelbtn.add(lb121, BorderLayout.CENTER);
        panelbtn.add(lb122, BorderLayout.CENTER);
        panelbtn.add(lb123, BorderLayout.CENTER);
        panelbtn.add(lb124, BorderLayout.CENTER);
        panelbtn.add(lb125, BorderLayout.CENTER);
        panelbtn.add(lb126, BorderLayout.CENTER);
        panelbtn.add(lb127, BorderLayout.CENTER);
        panelbtn.add(lb128, BorderLayout.CENTER);
        panelbtn.add(lb129, BorderLayout.CENTER);
        panelbtn.add(lb130, BorderLayout.CENTER);
        panelbtn.add(lb131, BorderLayout.CENTER);
        panelbtn.add(lb000, BorderLayout.CENTER);
        panelbtn.add(lb001, BorderLayout.CENTER);
        panelbtn.add(lb002, BorderLayout.CENTER);
        panelbtn.add(lb003, BorderLayout.CENTER);
        panelbtn.add(lb004, BorderLayout.CENTER);
        panelbtn.add(lb005, BorderLayout.CENTER);
        panelbtn.add(lb006, BorderLayout.CENTER);
        panelbtn.add(lb007, BorderLayout.CENTER);
        panelbtn.add(lb008, BorderLayout.CENTER);
        panelbtn.add(lb009, BorderLayout.CENTER);
        panelbtn.add(lb0010, BorderLayout.CENTER);

        panelbtn.add(NomeCom);
//        panelbtn.add(null);
        panelbtn.add(com);
        panelbtn.add(lb0011, BorderLayout.CENTER);
        panelbtn.add(lb0012, BorderLayout.CENTER);
        panelbtn.add(lb0013, BorderLayout.CENTER);
        panelbtn.add(lb0014, BorderLayout.CENTER);
        panelbtn.add(lb0015, BorderLayout.CENTER);
        panelbtn.add(lb0016, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);

        com.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> h = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    h = m.professores.get(com.getSelectedIndex() - 1).listarHorarioProfessor(m.professores, m.horarios);
                    for (int i = 0; i < h.size(); i++) {
                        if (h.get(i).getDia_semana() == 2) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText(h.get(i).getDesignacao());
                                    lb24.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(161, 62, 3));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(161, 62, 3));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText("-");
                                    lb24.setText("-");
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(88, 97, 102));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(88, 97, 102));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText("-");
                                    lb35.setText("-");
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText("-");
                                    lb46.setText("-");
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText("-");
                                    lb57.setText("-");
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText("-");
                                    lb68.setText("-");
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText("-");
                                    lb79.setText("-");
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText("-");
                                    lb90.setText("-");
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText("-");
                                    lb101.setText("-");
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText("-");
                                    lb112.setText("-");
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(88, 97, 102));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(88, 97, 102));
                                    lb123.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb111.setText(h.get(i).getSigla_professor());
                                    lb112.setText(h.get(i).getSigla_disciplina());
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(161, 62, 3));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(161, 62, 3));
                                    lb123.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 3) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText(h.get(i).getDesignacao());
                                    lb26.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(161, 62, 3));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(161, 62, 3));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText("-");
                                    lb26.setText("-");
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(88, 97, 102));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(88, 97, 102));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText("-");
                                    lb37.setText("-");
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText("-");
                                    lb48.setText("-");
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText("-");
                                    lb59.setText("-");
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText("-");
                                    lb70.setText("-");
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText("-");
                                    lb81.setText("-");
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText("-");
                                    lb92.setText("-");
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText("-");
                                    lb103.setText("-");
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText("-");
                                    lb114.setText("-");
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(88, 97, 102));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(88, 97, 102));
                                    lb125.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb113.setText(h.get(i).getSigla_professor()+"\n"+h.get(i).getSigla_disciplina());
                                    lb114.setText(h.get(i).getSigla_disciplina());
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(161, 62, 3));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(161, 62, 3));
                                    lb125.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 4) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText(h.get(i).getDesignacao());
                                    lb28.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(161, 62, 3));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(161, 62, 3));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText("-");
                                    lb28.setText("-");
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(88, 97, 102));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(88, 97, 102));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText("-");
                                    lb39.setText("-");
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText("-");
                                    lb50.setText("-");
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText("-");
                                    lb61.setText("-");
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText("-");
                                    lb72.setText("-");
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText("-");
                                    lb83.setText("-");
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText("-");
                                    lb94.setText("-");
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText("-");
                                    lb105.setText("-");
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText("-");
                                    lb116.setText("-");
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(88, 97, 102));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(88, 97, 102));
                                    lb127.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb115.setText(h.get(i).getSigla_professor());
                                    lb116.setText(h.get(i).getSigla_disciplina());
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(161, 62, 3));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(161, 62, 3));
                                    lb127.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 5) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText(h.get(i).getDesignacao());
                                    lb30.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(161, 62, 3));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(161, 62, 3));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText("-");
                                    lb30.setText("-");
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(88, 97, 102));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(88, 97, 102));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText("-");
                                    lb41.setText("-");
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText("-");
                                    lb52.setText("-");
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText("-");
                                    lb63.setText("-");
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText("-");
                                    lb74.setText("-");
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText("-");
                                    lb85.setText("-");
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText("-");
                                    lb96.setText("-");
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText("-");
                                    lb107.setText("-");
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText("-");
                                    lb118.setText("-");
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(88, 97, 102));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(88, 97, 102));
                                    lb129.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb117.setText(h.get(i).getSigla_professor());
                                    lb118.setText(h.get(i).getSigla_disciplina());
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(161, 62, 3));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(161, 62, 3));
                                    lb129.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 6) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText(h.get(i).getDesignacao());
                                    lb32.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(161, 62, 3));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(161, 62, 3));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText("-");
                                    lb32.setText("-");
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(88, 97, 102));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(88, 97, 102));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText("-");
                                    lb43.setText("-");
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));;
                                    lb54.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText("-");
                                    lb54.setText("-");
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText("-");
                                    lb65.setText("-");
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText("-");
                                    lb76.setText("-");
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText("-");
                                    lb87.setText("-");
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText("-");
                                    lb98.setText("-");
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText("-");
                                    lb109.setText("-");
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText("-");
                                    lb120.setText("-");
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(88, 97, 102));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(88, 97, 102));
                                    lb131.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb119.setText(h.get(i).getSigla_professor());
                                    lb120.setText(h.get(i).getSigla_disciplina());
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(161, 62, 3));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(161, 62, 3));
                                    lb131.setOpaque(true);
                                }
                            }
                        }
                    }
                } else {
                    HorarioVazio();
                }
            }
        });
    }

    private void listagemAluno() {
        final Main m = new Main();

        // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 60, 120));
        Painel panelbtn = new Painel(img.background2);
        panel.setLayout(new GridLayout(1, 0, 0, 10));

        // Panels customization
        panelbtn.setLayout(new GridLayout(15, 11, 0, 0));
//        panelbtn.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelbtn.setOpaque(false);
        // Empty border
//        Border emptyBorder = BorderFactory.createEmptyBorder();
        JLabel NomeCom = new JLabel("Alunos:", JLabel.CENTER);
        String[] v5 = new String[m.alunos.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.alunos.size() + 1; i++) {
            v5[i] = m.alunos.get(i - 1).toStringNumeroAluno();
        }
        final JComboBox com = new JComboBox(v5);

        // Title customization

        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        NomeCom.setFont(new Font("Arial", Font.BOLD, 12));
        NomeCom.setForeground(Color.white);

        HorarioVazio();

        panel.add(panelbtn, BorderLayout.CENTER);
        panelbtn.add(lb, BorderLayout.NORTH);
        panelbtn.add(lb1, BorderLayout.CENTER);
        panelbtn.add(lb2, BorderLayout.CENTER);
        panelbtn.add(lb3, BorderLayout.CENTER);
        panelbtn.add(lb4, BorderLayout.CENTER);
        panelbtn.add(lb5, BorderLayout.CENTER);
        panelbtn.add(lb6, BorderLayout.CENTER);
        panelbtn.add(lb7, BorderLayout.CENTER);
        panelbtn.add(lb8, BorderLayout.CENTER);
        panelbtn.add(lb9, BorderLayout.CENTER);
        panelbtn.add(lb10, BorderLayout.CENTER);
        panelbtn.add(lb0, BorderLayout.CENTER);
        panelbtn.add(lb01, BorderLayout.CENTER);
        panelbtn.add(lb02, BorderLayout.CENTER);
        panelbtn.add(lb03, BorderLayout.CENTER);
        panelbtn.add(lb04, BorderLayout.CENTER);
        panelbtn.add(lb05, BorderLayout.CENTER);
        panelbtn.add(lb06, BorderLayout.CENTER);
        panelbtn.add(lb07, BorderLayout.CENTER);
        panelbtn.add(lb08, BorderLayout.CENTER);
        panelbtn.add(lb09, BorderLayout.CENTER);
        panelbtn.add(lb010, BorderLayout.CENTER);
        panelbtn.add(lb11, BorderLayout.CENTER);
        panelbtn.add(P8Seg, BorderLayout.CENTER);
        panelbtn.add(lb13, BorderLayout.CENTER);
        panelbtn.add(P8Ter, BorderLayout.CENTER);
        panelbtn.add(lb15, BorderLayout.CENTER);
        panelbtn.add(P8Qua, BorderLayout.CENTER);
        panelbtn.add(lb17, BorderLayout.CENTER);
        panelbtn.add(P8Qui, BorderLayout.CENTER);
        panelbtn.add(lb19, BorderLayout.CENTER);
        panelbtn.add(P8Sex, BorderLayout.CENTER);
        panelbtn.add(lb21, BorderLayout.CENTER);
        panelbtn.add(lb22, BorderLayout.CENTER);
        panelbtn.add(lb23, BorderLayout.CENTER);
        panelbtn.add(lb24, BorderLayout.CENTER);
        panelbtn.add(lb25, BorderLayout.CENTER);
        panelbtn.add(lb26, BorderLayout.CENTER);
        panelbtn.add(lb27, BorderLayout.CENTER);
        panelbtn.add(lb28, BorderLayout.CENTER);
        panelbtn.add(lb29, BorderLayout.CENTER);
        panelbtn.add(lb30, BorderLayout.CENTER);
        panelbtn.add(lb31, BorderLayout.CENTER);
        panelbtn.add(lb32, BorderLayout.CENTER);
        panelbtn.add(lb33, BorderLayout.CENTER);
        panelbtn.add(lb34, BorderLayout.CENTER);
        panelbtn.add(lb35, BorderLayout.CENTER);
        panelbtn.add(lb36, BorderLayout.CENTER);
        panelbtn.add(lb37, BorderLayout.CENTER);
        panelbtn.add(lb38, BorderLayout.CENTER);
        panelbtn.add(lb39, BorderLayout.CENTER);
        panelbtn.add(lb40, BorderLayout.CENTER);
        panelbtn.add(lb41, BorderLayout.CENTER);
        panelbtn.add(lb42, BorderLayout.CENTER);
        panelbtn.add(lb43, BorderLayout.CENTER);
        panelbtn.add(lb44, BorderLayout.CENTER);
        panelbtn.add(lb45, BorderLayout.CENTER);
        panelbtn.add(lb46, BorderLayout.CENTER);
        panelbtn.add(lb47, BorderLayout.CENTER);
        panelbtn.add(lb48, BorderLayout.CENTER);
        panelbtn.add(lb49, BorderLayout.CENTER);
        panelbtn.add(lb50, BorderLayout.CENTER);
        panelbtn.add(lb51, BorderLayout.CENTER);
        panelbtn.add(lb52, BorderLayout.CENTER);
        panelbtn.add(lb53, BorderLayout.CENTER);
        panelbtn.add(lb54, BorderLayout.CENTER);
        panelbtn.add(lb55, BorderLayout.CENTER);
        panelbtn.add(lb56, BorderLayout.CENTER);
        panelbtn.add(lb57, BorderLayout.CENTER);
        panelbtn.add(lb58, BorderLayout.CENTER);
        panelbtn.add(lb59, BorderLayout.CENTER);
        panelbtn.add(lb60, BorderLayout.CENTER);
        panelbtn.add(lb61, BorderLayout.CENTER);
        panelbtn.add(lb62, BorderLayout.CENTER);
        panelbtn.add(lb63, BorderLayout.CENTER);
        panelbtn.add(lb64, BorderLayout.CENTER);
        panelbtn.add(lb65, BorderLayout.CENTER);
        panelbtn.add(lb66, BorderLayout.CENTER);
        panelbtn.add(lb67, BorderLayout.CENTER);
        panelbtn.add(lb68, BorderLayout.CENTER);
        panelbtn.add(lb69, BorderLayout.CENTER);
        panelbtn.add(lb70, BorderLayout.CENTER);
        panelbtn.add(lb71, BorderLayout.CENTER);
        panelbtn.add(lb72, BorderLayout.CENTER);
        panelbtn.add(lb73, BorderLayout.CENTER);
        panelbtn.add(lb74, BorderLayout.CENTER);
        panelbtn.add(lb75, BorderLayout.CENTER);
        panelbtn.add(lb76, BorderLayout.CENTER);
        panelbtn.add(lb77, BorderLayout.CENTER);
        panelbtn.add(lb78, BorderLayout.CENTER);
        panelbtn.add(lb79, BorderLayout.CENTER);
        panelbtn.add(lb80, BorderLayout.CENTER);
        panelbtn.add(lb81, BorderLayout.CENTER);
        panelbtn.add(lb82, BorderLayout.CENTER);
        panelbtn.add(lb83, BorderLayout.CENTER);
        panelbtn.add(lb84, BorderLayout.CENTER);
        panelbtn.add(lb85, BorderLayout.CENTER);
        panelbtn.add(lb86, BorderLayout.CENTER);
        panelbtn.add(lb87, BorderLayout.CENTER);
        panelbtn.add(lb88, BorderLayout.CENTER);
        panelbtn.add(lb89, BorderLayout.CENTER);
        panelbtn.add(lb90, BorderLayout.CENTER);
        panelbtn.add(lb91, BorderLayout.CENTER);
        panelbtn.add(lb92, BorderLayout.CENTER);
        panelbtn.add(lb93, BorderLayout.CENTER);
        panelbtn.add(lb94, BorderLayout.CENTER);
        panelbtn.add(lb95, BorderLayout.CENTER);
        panelbtn.add(lb96, BorderLayout.CENTER);
        panelbtn.add(lb97, BorderLayout.CENTER);
        panelbtn.add(lb98, BorderLayout.CENTER);
        panelbtn.add(lb99, BorderLayout.CENTER);
        panelbtn.add(lb100, BorderLayout.CENTER);
        panelbtn.add(lb101, BorderLayout.CENTER);
        panelbtn.add(lb102, BorderLayout.CENTER);
        panelbtn.add(lb103, BorderLayout.CENTER);
        panelbtn.add(lb104, BorderLayout.CENTER);
        panelbtn.add(lb105, BorderLayout.CENTER);
        panelbtn.add(lb106, BorderLayout.CENTER);
        panelbtn.add(lb107, BorderLayout.CENTER);
        panelbtn.add(lb108, BorderLayout.CENTER);
        panelbtn.add(lb109, BorderLayout.CENTER);
        panelbtn.add(lb110, BorderLayout.CENTER);
        panelbtn.add(lb111, BorderLayout.CENTER);
        panelbtn.add(lb112, BorderLayout.CENTER);
        panelbtn.add(lb113, BorderLayout.CENTER);
        panelbtn.add(lb114, BorderLayout.CENTER);
        panelbtn.add(lb115, BorderLayout.CENTER);
        panelbtn.add(lb116, BorderLayout.CENTER);
        panelbtn.add(lb117, BorderLayout.CENTER);
        panelbtn.add(lb118, BorderLayout.CENTER);
        panelbtn.add(lb119, BorderLayout.CENTER);
        panelbtn.add(lb120, BorderLayout.CENTER);
        panelbtn.add(lb121, BorderLayout.CENTER);
        panelbtn.add(lb122, BorderLayout.CENTER);
        panelbtn.add(lb123, BorderLayout.CENTER);
        panelbtn.add(lb124, BorderLayout.CENTER);
        panelbtn.add(lb125, BorderLayout.CENTER);
        panelbtn.add(lb126, BorderLayout.CENTER);
        panelbtn.add(lb127, BorderLayout.CENTER);
        panelbtn.add(lb128, BorderLayout.CENTER);
        panelbtn.add(lb129, BorderLayout.CENTER);
        panelbtn.add(lb130, BorderLayout.CENTER);
        panelbtn.add(lb131, BorderLayout.CENTER);
        panelbtn.add(lb000, BorderLayout.CENTER);
        panelbtn.add(lb001, BorderLayout.CENTER);
        panelbtn.add(lb002, BorderLayout.CENTER);
        panelbtn.add(lb003, BorderLayout.CENTER);
        panelbtn.add(lb004, BorderLayout.CENTER);
        panelbtn.add(lb005, BorderLayout.CENTER);
        panelbtn.add(lb006, BorderLayout.CENTER);
        panelbtn.add(lb007, BorderLayout.CENTER);
        panelbtn.add(lb008, BorderLayout.CENTER);
        panelbtn.add(lb009, BorderLayout.CENTER);
        panelbtn.add(lb0010, BorderLayout.CENTER);

        panelbtn.add(NomeCom);
//        panelbtn.add(null);
        panelbtn.add(com);
        panelbtn.add(lb0011, BorderLayout.CENTER);
        panelbtn.add(lb0012, BorderLayout.CENTER);
        panelbtn.add(lb0013, BorderLayout.CENTER);
        panelbtn.add(lb0014, BorderLayout.CENTER);
        panelbtn.add(lb0015, BorderLayout.CENTER);
        panelbtn.add(lb0016, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);

        com.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> h = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    h = m.alunos.get(com.getSelectedIndex() - 1).listarHorarioAluno(m.alunos, m.horarios);
                    for (int i = 0; i < h.size(); i++) {
                        if (h.get(i).getDia_semana() == 2) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText(h.get(i).getDesignacao());
                                    lb24.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(161, 62, 3));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(161, 62, 3));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText("-");
                                    lb24.setText("-");
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(88, 97, 102));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(88, 97, 102));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText("-");
                                    lb35.setText("-");
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText("-");
                                    lb46.setText("-");
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText("-");
                                    lb57.setText("-");
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText("-");
                                    lb68.setText("-");
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText("-");
                                    lb79.setText("-");
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText("-");
                                    lb90.setText("-");
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText("-");
                                    lb101.setText("-");
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText("-");
                                    lb112.setText("-");
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(88, 97, 102));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(88, 97, 102));
                                    lb123.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb111.setText(h.get(i).getSigla_professor());
                                    lb112.setText(h.get(i).getSigla_disciplina());
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(161, 62, 3));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(161, 62, 3));
                                    lb123.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 3) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText(h.get(i).getDesignacao());
                                    lb26.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(161, 62, 3));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(161, 62, 3));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText("-");
                                    lb26.setText("-");
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(88, 97, 102));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(88, 97, 102));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText("-");
                                    lb37.setText("-");
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText("-");
                                    lb48.setText("-");
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText("-");
                                    lb59.setText("-");
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText("-");
                                    lb70.setText("-");
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText("-");
                                    lb81.setText("-");
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText("-");
                                    lb92.setText("-");
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText("-");
                                    lb103.setText("-");
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText("-");
                                    lb114.setText("-");
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(88, 97, 102));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(88, 97, 102));
                                    lb125.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb113.setText(h.get(i).getSigla_professor());
                                    lb114.setText(h.get(i).getSigla_disciplina());
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(161, 62, 3));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(161, 62, 3));
                                    lb125.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 4) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText(h.get(i).getDesignacao());
                                    lb28.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(161, 62, 3));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(161, 62, 3));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText("-");
                                    lb28.setText("-");
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(88, 97, 102));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(88, 97, 102));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText("-");
                                    lb39.setText("-");
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText("-");
                                    lb50.setText("-");
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText("-");
                                    lb61.setText("-");
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText("-");
                                    lb72.setText("-");
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText("-");
                                    lb83.setText("-");
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText("-");
                                    lb94.setText("-");
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText("-");
                                    lb105.setText("-");
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText("-");
                                    lb116.setText("-");
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(88, 97, 102));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(88, 97, 102));
                                    lb127.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb115.setText(h.get(i).getSigla_professor());
                                    lb116.setText(h.get(i).getSigla_disciplina());
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(161, 62, 3));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(161, 62, 3));
                                    lb127.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 5) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText(h.get(i).getDesignacao());
                                    lb30.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(161, 62, 3));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(161, 62, 3));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText("-");
                                    lb30.setText("-");
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(88, 97, 102));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(88, 97, 102));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText("-");
                                    lb41.setText("-");
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText("-");
                                    lb52.setText("-");
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText("-");
                                    lb63.setText("-");
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText("-");
                                    lb74.setText("-");
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText("-");
                                    lb85.setText("-");
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText("-");
                                    lb96.setText("-");
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText("-");
                                    lb107.setText("-");
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText("-");
                                    lb118.setText("-");
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(88, 97, 102));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(88, 97, 102));
                                    lb129.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb117.setText(h.get(i).getSigla_professor());
                                    lb118.setText(h.get(i).getSigla_disciplina());
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(161, 62, 3));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(161, 62, 3));
                                    lb129.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 6) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText(h.get(i).getDesignacao());
                                    lb32.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(161, 62, 3));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(161, 62, 3));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText("-");
                                    lb32.setText("-");
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(88, 97, 102));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(88, 97, 102));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText("-");
                                    lb43.setText("-");
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));;
                                    lb54.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText("-");
                                    lb54.setText("-");
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText("-");
                                    lb65.setText("-");
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText("-");
                                    lb76.setText("-");
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText("-");
                                    lb87.setText("-");
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText("-");
                                    lb98.setText("-");
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText("-");
                                    lb109.setText("-");
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText("-");
                                    lb120.setText("-");
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(88, 97, 102));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(88, 97, 102));
                                    lb131.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb119.setText(h.get(i).getSigla_professor());
                                    lb120.setText(h.get(i).getSigla_disciplina());
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(161, 62, 3));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(161, 62, 3));
                                    lb131.setOpaque(true);
                                }
                            }
                        }
                    }
                } else {
                    HorarioVazio();
                }
            }
        });
    }

    private void listagemTurma() {
        final Main m = new Main();

        // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 60, 120));
        Painel panelbtn = new Painel(img.background2);
        panel.setLayout(new GridLayout(1, 0, 0, 10));

        // Panels customization
        panelbtn.setLayout(new GridLayout(15, 11, 0, 0));
//        panelbtn.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelbtn.setOpaque(false);
        // Empty border
//        Border emptyBorder = BorderFactory.createEmptyBorder();
        JLabel NomeCom = new JLabel("Turmas:", JLabel.CENTER);
        String[] v5 = new String[m.turmas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.turmas.size() + 1; i++) {
            v5[i] = m.turmas.get(i - 1).toStringSigla();
        }
        final JComboBox com = new JComboBox(v5);

        // Title customization

        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        NomeCom.setFont(new Font("Arial", Font.BOLD, 12));
        NomeCom.setForeground(Color.white);

        HorarioVazio();

        panel.add(panelbtn, BorderLayout.CENTER);
        panelbtn.add(lb, BorderLayout.NORTH);
        panelbtn.add(lb1, BorderLayout.CENTER);
        panelbtn.add(lb2, BorderLayout.CENTER);
        panelbtn.add(lb3, BorderLayout.CENTER);
        panelbtn.add(lb4, BorderLayout.CENTER);
        panelbtn.add(lb5, BorderLayout.CENTER);
        panelbtn.add(lb6, BorderLayout.CENTER);
        panelbtn.add(lb7, BorderLayout.CENTER);
        panelbtn.add(lb8, BorderLayout.CENTER);
        panelbtn.add(lb9, BorderLayout.CENTER);
        panelbtn.add(lb10, BorderLayout.CENTER);
        panelbtn.add(lb0, BorderLayout.CENTER);
        panelbtn.add(lb01, BorderLayout.CENTER);
        panelbtn.add(lb02, BorderLayout.CENTER);
        panelbtn.add(lb03, BorderLayout.CENTER);
        panelbtn.add(lb04, BorderLayout.CENTER);
        panelbtn.add(lb05, BorderLayout.CENTER);
        panelbtn.add(lb06, BorderLayout.CENTER);
        panelbtn.add(lb07, BorderLayout.CENTER);
        panelbtn.add(lb08, BorderLayout.CENTER);
        panelbtn.add(lb09, BorderLayout.CENTER);
        panelbtn.add(lb010, BorderLayout.CENTER);
        panelbtn.add(lb11, BorderLayout.CENTER);
        panelbtn.add(P8Seg, BorderLayout.CENTER);
        panelbtn.add(lb13, BorderLayout.CENTER);
        panelbtn.add(P8Ter, BorderLayout.CENTER);
        panelbtn.add(lb15, BorderLayout.CENTER);
        panelbtn.add(P8Qua, BorderLayout.CENTER);
        panelbtn.add(lb17, BorderLayout.CENTER);
        panelbtn.add(P8Qui, BorderLayout.CENTER);
        panelbtn.add(lb19, BorderLayout.CENTER);
        panelbtn.add(P8Sex, BorderLayout.CENTER);
        panelbtn.add(lb21, BorderLayout.CENTER);
        panelbtn.add(lb22, BorderLayout.CENTER);
        panelbtn.add(lb23, BorderLayout.CENTER);
        panelbtn.add(lb24, BorderLayout.CENTER);
        panelbtn.add(lb25, BorderLayout.CENTER);
        panelbtn.add(lb26, BorderLayout.CENTER);
        panelbtn.add(lb27, BorderLayout.CENTER);
        panelbtn.add(lb28, BorderLayout.CENTER);
        panelbtn.add(lb29, BorderLayout.CENTER);
        panelbtn.add(lb30, BorderLayout.CENTER);
        panelbtn.add(lb31, BorderLayout.CENTER);
        panelbtn.add(lb32, BorderLayout.CENTER);
        panelbtn.add(lb33, BorderLayout.CENTER);
        panelbtn.add(lb34, BorderLayout.CENTER);
        panelbtn.add(lb35, BorderLayout.CENTER);
        panelbtn.add(lb36, BorderLayout.CENTER);
        panelbtn.add(lb37, BorderLayout.CENTER);
        panelbtn.add(lb38, BorderLayout.CENTER);
        panelbtn.add(lb39, BorderLayout.CENTER);
        panelbtn.add(lb40, BorderLayout.CENTER);
        panelbtn.add(lb41, BorderLayout.CENTER);
        panelbtn.add(lb42, BorderLayout.CENTER);
        panelbtn.add(lb43, BorderLayout.CENTER);
        panelbtn.add(lb44, BorderLayout.CENTER);
        panelbtn.add(lb45, BorderLayout.CENTER);
        panelbtn.add(lb46, BorderLayout.CENTER);
        panelbtn.add(lb47, BorderLayout.CENTER);
        panelbtn.add(lb48, BorderLayout.CENTER);
        panelbtn.add(lb49, BorderLayout.CENTER);
        panelbtn.add(lb50, BorderLayout.CENTER);
        panelbtn.add(lb51, BorderLayout.CENTER);
        panelbtn.add(lb52, BorderLayout.CENTER);
        panelbtn.add(lb53, BorderLayout.CENTER);
        panelbtn.add(lb54, BorderLayout.CENTER);
        panelbtn.add(lb55, BorderLayout.CENTER);
        panelbtn.add(lb56, BorderLayout.CENTER);
        panelbtn.add(lb57, BorderLayout.CENTER);
        panelbtn.add(lb58, BorderLayout.CENTER);
        panelbtn.add(lb59, BorderLayout.CENTER);
        panelbtn.add(lb60, BorderLayout.CENTER);
        panelbtn.add(lb61, BorderLayout.CENTER);
        panelbtn.add(lb62, BorderLayout.CENTER);
        panelbtn.add(lb63, BorderLayout.CENTER);
        panelbtn.add(lb64, BorderLayout.CENTER);
        panelbtn.add(lb65, BorderLayout.CENTER);
        panelbtn.add(lb66, BorderLayout.CENTER);
        panelbtn.add(lb67, BorderLayout.CENTER);
        panelbtn.add(lb68, BorderLayout.CENTER);
        panelbtn.add(lb69, BorderLayout.CENTER);
        panelbtn.add(lb70, BorderLayout.CENTER);
        panelbtn.add(lb71, BorderLayout.CENTER);
        panelbtn.add(lb72, BorderLayout.CENTER);
        panelbtn.add(lb73, BorderLayout.CENTER);
        panelbtn.add(lb74, BorderLayout.CENTER);
        panelbtn.add(lb75, BorderLayout.CENTER);
        panelbtn.add(lb76, BorderLayout.CENTER);
        panelbtn.add(lb77, BorderLayout.CENTER);
        panelbtn.add(lb78, BorderLayout.CENTER);
        panelbtn.add(lb79, BorderLayout.CENTER);
        panelbtn.add(lb80, BorderLayout.CENTER);
        panelbtn.add(lb81, BorderLayout.CENTER);
        panelbtn.add(lb82, BorderLayout.CENTER);
        panelbtn.add(lb83, BorderLayout.CENTER);
        panelbtn.add(lb84, BorderLayout.CENTER);
        panelbtn.add(lb85, BorderLayout.CENTER);
        panelbtn.add(lb86, BorderLayout.CENTER);
        panelbtn.add(lb87, BorderLayout.CENTER);
        panelbtn.add(lb88, BorderLayout.CENTER);
        panelbtn.add(lb89, BorderLayout.CENTER);
        panelbtn.add(lb90, BorderLayout.CENTER);
        panelbtn.add(lb91, BorderLayout.CENTER);
        panelbtn.add(lb92, BorderLayout.CENTER);
        panelbtn.add(lb93, BorderLayout.CENTER);
        panelbtn.add(lb94, BorderLayout.CENTER);
        panelbtn.add(lb95, BorderLayout.CENTER);
        panelbtn.add(lb96, BorderLayout.CENTER);
        panelbtn.add(lb97, BorderLayout.CENTER);
        panelbtn.add(lb98, BorderLayout.CENTER);
        panelbtn.add(lb99, BorderLayout.CENTER);
        panelbtn.add(lb100, BorderLayout.CENTER);
        panelbtn.add(lb101, BorderLayout.CENTER);
        panelbtn.add(lb102, BorderLayout.CENTER);
        panelbtn.add(lb103, BorderLayout.CENTER);
        panelbtn.add(lb104, BorderLayout.CENTER);
        panelbtn.add(lb105, BorderLayout.CENTER);
        panelbtn.add(lb106, BorderLayout.CENTER);
        panelbtn.add(lb107, BorderLayout.CENTER);
        panelbtn.add(lb108, BorderLayout.CENTER);
        panelbtn.add(lb109, BorderLayout.CENTER);
        panelbtn.add(lb110, BorderLayout.CENTER);
        panelbtn.add(lb111, BorderLayout.CENTER);
        panelbtn.add(lb112, BorderLayout.CENTER);
        panelbtn.add(lb113, BorderLayout.CENTER);
        panelbtn.add(lb114, BorderLayout.CENTER);
        panelbtn.add(lb115, BorderLayout.CENTER);
        panelbtn.add(lb116, BorderLayout.CENTER);
        panelbtn.add(lb117, BorderLayout.CENTER);
        panelbtn.add(lb118, BorderLayout.CENTER);
        panelbtn.add(lb119, BorderLayout.CENTER);
        panelbtn.add(lb120, BorderLayout.CENTER);
        panelbtn.add(lb121, BorderLayout.CENTER);
        panelbtn.add(lb122, BorderLayout.CENTER);
        panelbtn.add(lb123, BorderLayout.CENTER);
        panelbtn.add(lb124, BorderLayout.CENTER);
        panelbtn.add(lb125, BorderLayout.CENTER);
        panelbtn.add(lb126, BorderLayout.CENTER);
        panelbtn.add(lb127, BorderLayout.CENTER);
        panelbtn.add(lb128, BorderLayout.CENTER);
        panelbtn.add(lb129, BorderLayout.CENTER);
        panelbtn.add(lb130, BorderLayout.CENTER);
        panelbtn.add(lb131, BorderLayout.CENTER);
        panelbtn.add(lb000, BorderLayout.CENTER);
        panelbtn.add(lb001, BorderLayout.CENTER);
        panelbtn.add(lb002, BorderLayout.CENTER);
        panelbtn.add(lb003, BorderLayout.CENTER);
        panelbtn.add(lb004, BorderLayout.CENTER);
        panelbtn.add(lb005, BorderLayout.CENTER);
        panelbtn.add(lb006, BorderLayout.CENTER);
        panelbtn.add(lb007, BorderLayout.CENTER);
        panelbtn.add(lb008, BorderLayout.CENTER);
        panelbtn.add(lb009, BorderLayout.CENTER);
        panelbtn.add(lb0010, BorderLayout.CENTER);

        panelbtn.add(NomeCom);
//        panelbtn.add(null);
        panelbtn.add(com);
        panelbtn.add(lb0011, BorderLayout.CENTER);
        panelbtn.add(lb0012, BorderLayout.CENTER);
        panelbtn.add(lb0013, BorderLayout.CENTER);
        panelbtn.add(lb0014, BorderLayout.CENTER);
        panelbtn.add(lb0015, BorderLayout.CENTER);
        panelbtn.add(lb0016, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);

        com.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> h = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    h = m.turmas.get(com.getSelectedIndex() - 1).listarHorarioTurma(m.horarios);
                    for (int i = 0; i < h.size(); i++) {
                        if (h.get(i).getDia_semana() == 2) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText(h.get(i).getDesignacao());
                                    lb24.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(161, 62, 3));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(161, 62, 3));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText("-");
                                    lb24.setText("-");
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(88, 97, 102));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(88, 97, 102));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText("-");
                                    lb35.setText("-");
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText("-");
                                    lb46.setText("-");
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText("-");
                                    lb57.setText("-");
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText("-");
                                    lb68.setText("-");
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText("-");
                                    lb79.setText("-");
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText("-");
                                    lb90.setText("-");
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText("-");
                                    lb101.setText("-");
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText("-");
                                    lb112.setText("-");
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(88, 97, 102));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(88, 97, 102));
                                    lb123.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb111.setText(h.get(i).getSigla_professor());
                                    lb112.setText(h.get(i).getSigla_disciplina());
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(161, 62, 3));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(161, 62, 3));
                                    lb123.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 3) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText(h.get(i).getDesignacao());
                                    lb26.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(161, 62, 3));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(161, 62, 3));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText("-");
                                    lb26.setText("-");
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(88, 97, 102));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(88, 97, 102));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText("-");
                                    lb37.setText("-");
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText("-");
                                    lb48.setText("-");
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText("-");
                                    lb59.setText("-");
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText("-");
                                    lb70.setText("-");
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText("-");
                                    lb81.setText("-");
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText("-");
                                    lb92.setText("-");
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText("-");
                                    lb103.setText("-");
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText("-");
                                    lb114.setText("-");
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(88, 97, 102));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(88, 97, 102));
                                    lb125.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb113.setText(h.get(i).getSigla_professor());
                                    lb114.setText(h.get(i).getSigla_disciplina());
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(161, 62, 3));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(161, 62, 3));
                                    lb125.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 4) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText(h.get(i).getDesignacao());
                                    lb28.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(161, 62, 3));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(161, 62, 3));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText("-");
                                    lb28.setText("-");
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(88, 97, 102));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(88, 97, 102));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText("-");
                                    lb39.setText("-");
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText("-");
                                    lb50.setText("-");
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText("-");
                                    lb61.setText("-");
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText("-");
                                    lb72.setText("-");
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText("-");
                                    lb83.setText("-");
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText("-");
                                    lb94.setText("-");
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText("-");
                                    lb105.setText("-");
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText("-");
                                    lb116.setText("-");
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(88, 97, 102));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(88, 97, 102));
                                    lb127.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb115.setText(h.get(i).getSigla_professor());
                                    lb116.setText(h.get(i).getSigla_disciplina());
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(161, 62, 3));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(161, 62, 3));
                                    lb127.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 5) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText(h.get(i).getDesignacao());
                                    lb30.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(161, 62, 3));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(161, 62, 3));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText("-");
                                    lb30.setText("-");
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(88, 97, 102));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(88, 97, 102));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText("-");
                                    lb41.setText("-");
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText("-");
                                    lb52.setText("-");
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText("-");
                                    lb63.setText("-");
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText("-");
                                    lb74.setText("-");
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText("-");
                                    lb85.setText("-");
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText("-");
                                    lb96.setText("-");
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText("-");
                                    lb107.setText("-");
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText("-");
                                    lb118.setText("-");
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(88, 97, 102));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(88, 97, 102));
                                    lb129.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb117.setText(h.get(i).getSigla_professor());
                                    lb118.setText(h.get(i).getSigla_disciplina());
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(161, 62, 3));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(161, 62, 3));
                                    lb129.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 6) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText(h.get(i).getDesignacao());
                                    lb32.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(161, 62, 3));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(161, 62, 3));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText("-");
                                    lb32.setText("-");
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(88, 97, 102));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(88, 97, 102));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText("-");
                                    lb43.setText("-");
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));;
                                    lb54.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText("-");
                                    lb54.setText("-");
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText("-");
                                    lb65.setText("-");
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText("-");
                                    lb76.setText("-");
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText("-");
                                    lb87.setText("-");
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText("-");
                                    lb98.setText("-");
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText("-");
                                    lb109.setText("-");
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText("-");
                                    lb120.setText("-");
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(88, 97, 102));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(88, 97, 102));
                                    lb131.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb119.setText(h.get(i).getSigla_professor());
                                    lb120.setText(h.get(i).getSigla_disciplina());
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(161, 62, 3));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(161, 62, 3));
                                    lb131.setOpaque(true);
                                }
                            }
                        }
                    }
                } else {
                    HorarioVazio();
                }
            }
        });
    }

    private void listagemDisciplina() {
        final Main m = new Main();

        // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 60, 120));
        Painel panelbtn = new Painel(img.background2);
        panel.setLayout(new GridLayout(1, 0, 0, 10));

        // Panels customization
        panelbtn.setLayout(new GridLayout(15, 11, 0, 0));
//        panelbtn.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelbtn.setOpaque(false);
        // Empty border
//        Border emptyBorder = BorderFactory.createEmptyBorder();
        JLabel NomeCom = new JLabel("Disciplina:", JLabel.CENTER);
        String[] v5 = new String[m.disciplinas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.disciplinas.size() + 1; i++) {
            v5[i] = m.disciplinas.get(i - 1).toStringSigla();
        }
        final JComboBox com = new JComboBox(v5);

        // Title customization

        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        NomeCom.setFont(new Font("Arial", Font.BOLD, 12));
        NomeCom.setForeground(Color.white);

        HorarioVazio();

        panel.add(panelbtn, BorderLayout.CENTER);
        panelbtn.add(lb, BorderLayout.NORTH);
        panelbtn.add(lb1, BorderLayout.CENTER);
        panelbtn.add(lb2, BorderLayout.CENTER);
        panelbtn.add(lb3, BorderLayout.CENTER);
        panelbtn.add(lb4, BorderLayout.CENTER);
        panelbtn.add(lb5, BorderLayout.CENTER);
        panelbtn.add(lb6, BorderLayout.CENTER);
        panelbtn.add(lb7, BorderLayout.CENTER);
        panelbtn.add(lb8, BorderLayout.CENTER);
        panelbtn.add(lb9, BorderLayout.CENTER);
        panelbtn.add(lb10, BorderLayout.CENTER);
        panelbtn.add(lb0, BorderLayout.CENTER);
        panelbtn.add(lb01, BorderLayout.CENTER);
        panelbtn.add(lb02, BorderLayout.CENTER);
        panelbtn.add(lb03, BorderLayout.CENTER);
        panelbtn.add(lb04, BorderLayout.CENTER);
        panelbtn.add(lb05, BorderLayout.CENTER);
        panelbtn.add(lb06, BorderLayout.CENTER);
        panelbtn.add(lb07, BorderLayout.CENTER);
        panelbtn.add(lb08, BorderLayout.CENTER);
        panelbtn.add(lb09, BorderLayout.CENTER);
        panelbtn.add(lb010, BorderLayout.CENTER);
        panelbtn.add(lb11, BorderLayout.CENTER);
        panelbtn.add(P8Seg, BorderLayout.CENTER);
        panelbtn.add(lb13, BorderLayout.CENTER);
        panelbtn.add(P8Ter, BorderLayout.CENTER);
        panelbtn.add(lb15, BorderLayout.CENTER);
        panelbtn.add(P8Qua, BorderLayout.CENTER);
        panelbtn.add(lb17, BorderLayout.CENTER);
        panelbtn.add(P8Qui, BorderLayout.CENTER);
        panelbtn.add(lb19, BorderLayout.CENTER);
        panelbtn.add(P8Sex, BorderLayout.CENTER);
        panelbtn.add(lb21, BorderLayout.CENTER);
        panelbtn.add(lb22, BorderLayout.CENTER);
        panelbtn.add(lb23, BorderLayout.CENTER);
        panelbtn.add(lb24, BorderLayout.CENTER);
        panelbtn.add(lb25, BorderLayout.CENTER);
        panelbtn.add(lb26, BorderLayout.CENTER);
        panelbtn.add(lb27, BorderLayout.CENTER);
        panelbtn.add(lb28, BorderLayout.CENTER);
        panelbtn.add(lb29, BorderLayout.CENTER);
        panelbtn.add(lb30, BorderLayout.CENTER);
        panelbtn.add(lb31, BorderLayout.CENTER);
        panelbtn.add(lb32, BorderLayout.CENTER);
        panelbtn.add(lb33, BorderLayout.CENTER);
        panelbtn.add(lb34, BorderLayout.CENTER);
        panelbtn.add(lb35, BorderLayout.CENTER);
        panelbtn.add(lb36, BorderLayout.CENTER);
        panelbtn.add(lb37, BorderLayout.CENTER);
        panelbtn.add(lb38, BorderLayout.CENTER);
        panelbtn.add(lb39, BorderLayout.CENTER);
        panelbtn.add(lb40, BorderLayout.CENTER);
        panelbtn.add(lb41, BorderLayout.CENTER);
        panelbtn.add(lb42, BorderLayout.CENTER);
        panelbtn.add(lb43, BorderLayout.CENTER);
        panelbtn.add(lb44, BorderLayout.CENTER);
        panelbtn.add(lb45, BorderLayout.CENTER);
        panelbtn.add(lb46, BorderLayout.CENTER);
        panelbtn.add(lb47, BorderLayout.CENTER);
        panelbtn.add(lb48, BorderLayout.CENTER);
        panelbtn.add(lb49, BorderLayout.CENTER);
        panelbtn.add(lb50, BorderLayout.CENTER);
        panelbtn.add(lb51, BorderLayout.CENTER);
        panelbtn.add(lb52, BorderLayout.CENTER);
        panelbtn.add(lb53, BorderLayout.CENTER);
        panelbtn.add(lb54, BorderLayout.CENTER);
        panelbtn.add(lb55, BorderLayout.CENTER);
        panelbtn.add(lb56, BorderLayout.CENTER);
        panelbtn.add(lb57, BorderLayout.CENTER);
        panelbtn.add(lb58, BorderLayout.CENTER);
        panelbtn.add(lb59, BorderLayout.CENTER);
        panelbtn.add(lb60, BorderLayout.CENTER);
        panelbtn.add(lb61, BorderLayout.CENTER);
        panelbtn.add(lb62, BorderLayout.CENTER);
        panelbtn.add(lb63, BorderLayout.CENTER);
        panelbtn.add(lb64, BorderLayout.CENTER);
        panelbtn.add(lb65, BorderLayout.CENTER);
        panelbtn.add(lb66, BorderLayout.CENTER);
        panelbtn.add(lb67, BorderLayout.CENTER);
        panelbtn.add(lb68, BorderLayout.CENTER);
        panelbtn.add(lb69, BorderLayout.CENTER);
        panelbtn.add(lb70, BorderLayout.CENTER);
        panelbtn.add(lb71, BorderLayout.CENTER);
        panelbtn.add(lb72, BorderLayout.CENTER);
        panelbtn.add(lb73, BorderLayout.CENTER);
        panelbtn.add(lb74, BorderLayout.CENTER);
        panelbtn.add(lb75, BorderLayout.CENTER);
        panelbtn.add(lb76, BorderLayout.CENTER);
        panelbtn.add(lb77, BorderLayout.CENTER);
        panelbtn.add(lb78, BorderLayout.CENTER);
        panelbtn.add(lb79, BorderLayout.CENTER);
        panelbtn.add(lb80, BorderLayout.CENTER);
        panelbtn.add(lb81, BorderLayout.CENTER);
        panelbtn.add(lb82, BorderLayout.CENTER);
        panelbtn.add(lb83, BorderLayout.CENTER);
        panelbtn.add(lb84, BorderLayout.CENTER);
        panelbtn.add(lb85, BorderLayout.CENTER);
        panelbtn.add(lb86, BorderLayout.CENTER);
        panelbtn.add(lb87, BorderLayout.CENTER);
        panelbtn.add(lb88, BorderLayout.CENTER);
        panelbtn.add(lb89, BorderLayout.CENTER);
        panelbtn.add(lb90, BorderLayout.CENTER);
        panelbtn.add(lb91, BorderLayout.CENTER);
        panelbtn.add(lb92, BorderLayout.CENTER);
        panelbtn.add(lb93, BorderLayout.CENTER);
        panelbtn.add(lb94, BorderLayout.CENTER);
        panelbtn.add(lb95, BorderLayout.CENTER);
        panelbtn.add(lb96, BorderLayout.CENTER);
        panelbtn.add(lb97, BorderLayout.CENTER);
        panelbtn.add(lb98, BorderLayout.CENTER);
        panelbtn.add(lb99, BorderLayout.CENTER);
        panelbtn.add(lb100, BorderLayout.CENTER);
        panelbtn.add(lb101, BorderLayout.CENTER);
        panelbtn.add(lb102, BorderLayout.CENTER);
        panelbtn.add(lb103, BorderLayout.CENTER);
        panelbtn.add(lb104, BorderLayout.CENTER);
        panelbtn.add(lb105, BorderLayout.CENTER);
        panelbtn.add(lb106, BorderLayout.CENTER);
        panelbtn.add(lb107, BorderLayout.CENTER);
        panelbtn.add(lb108, BorderLayout.CENTER);
        panelbtn.add(lb109, BorderLayout.CENTER);
        panelbtn.add(lb110, BorderLayout.CENTER);
        panelbtn.add(lb111, BorderLayout.CENTER);
        panelbtn.add(lb112, BorderLayout.CENTER);
        panelbtn.add(lb113, BorderLayout.CENTER);
        panelbtn.add(lb114, BorderLayout.CENTER);
        panelbtn.add(lb115, BorderLayout.CENTER);
        panelbtn.add(lb116, BorderLayout.CENTER);
        panelbtn.add(lb117, BorderLayout.CENTER);
        panelbtn.add(lb118, BorderLayout.CENTER);
        panelbtn.add(lb119, BorderLayout.CENTER);
        panelbtn.add(lb120, BorderLayout.CENTER);
        panelbtn.add(lb121, BorderLayout.CENTER);
        panelbtn.add(lb122, BorderLayout.CENTER);
        panelbtn.add(lb123, BorderLayout.CENTER);
        panelbtn.add(lb124, BorderLayout.CENTER);
        panelbtn.add(lb125, BorderLayout.CENTER);
        panelbtn.add(lb126, BorderLayout.CENTER);
        panelbtn.add(lb127, BorderLayout.CENTER);
        panelbtn.add(lb128, BorderLayout.CENTER);
        panelbtn.add(lb129, BorderLayout.CENTER);
        panelbtn.add(lb130, BorderLayout.CENTER);
        panelbtn.add(lb131, BorderLayout.CENTER);
        panelbtn.add(lb000, BorderLayout.CENTER);
        panelbtn.add(lb001, BorderLayout.CENTER);
        panelbtn.add(lb002, BorderLayout.CENTER);
        panelbtn.add(lb003, BorderLayout.CENTER);
        panelbtn.add(lb004, BorderLayout.CENTER);
        panelbtn.add(lb005, BorderLayout.CENTER);
        panelbtn.add(lb006, BorderLayout.CENTER);
        panelbtn.add(lb007, BorderLayout.CENTER);
        panelbtn.add(lb008, BorderLayout.CENTER);
        panelbtn.add(lb009, BorderLayout.CENTER);
        panelbtn.add(lb0010, BorderLayout.CENTER);

        panelbtn.add(NomeCom);
//        panelbtn.add(null);
        panelbtn.add(com);
        panelbtn.add(lb0011, BorderLayout.CENTER);
        panelbtn.add(lb0012, BorderLayout.CENTER);
        panelbtn.add(lb0013, BorderLayout.CENTER);
        panelbtn.add(lb0014, BorderLayout.CENTER);
        panelbtn.add(lb0015, BorderLayout.CENTER);
        panelbtn.add(lb0016, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);

        com.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> h = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    h = m.disciplinas.get(com.getSelectedIndex() - 1).listarHorarioDisciplina(m.disciplinas, m.horarios);
                    for (int i = 0; i < h.size(); i++) {
                        if (h.get(i).getDia_semana() == 2) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText(h.get(i).getDesignacao());
                                    lb24.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(161, 62, 3));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(161, 62, 3));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText("-");
                                    lb24.setText("-");
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(88, 97, 102));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(88, 97, 102));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText("-");
                                    lb35.setText("-");
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText("-");
                                    lb46.setText("-");
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText("-");
                                    lb57.setText("-");
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText("-");
                                    lb68.setText("-");
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText("-");
                                    lb79.setText("-");
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText("-");
                                    lb90.setText("-");
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText("-");
                                    lb101.setText("-");
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText("-");
                                    lb112.setText("-");
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(88, 97, 102));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(88, 97, 102));
                                    lb123.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb111.setText(h.get(i).getSigla_professor());
                                    lb112.setText(h.get(i).getSigla_disciplina());
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(161, 62, 3));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(161, 62, 3));
                                    lb123.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 3) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText(h.get(i).getDesignacao());
                                    lb26.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(161, 62, 3));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(161, 62, 3));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText("-");
                                    lb26.setText("-");
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(88, 97, 102));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(88, 97, 102));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText("-");
                                    lb37.setText("-");
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText("-");
                                    lb48.setText("-");
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText("-");
                                    lb59.setText("-");
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText("-");
                                    lb70.setText("-");
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText("-");
                                    lb81.setText("-");
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText("-");
                                    lb92.setText("-");
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText("-");
                                    lb103.setText("-");
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText("-");
                                    lb114.setText("-");
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(88, 97, 102));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(88, 97, 102));
                                    lb125.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb113.setText(h.get(i).getSigla_professor());
                                    lb114.setText(h.get(i).getSigla_disciplina());
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(161, 62, 3));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(161, 62, 3));
                                    lb125.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 4) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText(h.get(i).getDesignacao());
                                    lb28.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(161, 62, 3));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(161, 62, 3));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText("-");
                                    lb28.setText("-");
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(88, 97, 102));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(88, 97, 102));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText("-");
                                    lb39.setText("-");
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText("-");
                                    lb50.setText("-");
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText("-");
                                    lb61.setText("-");
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText("-");
                                    lb72.setText("-");
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText("-");
                                    lb83.setText("-");
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText("-");
                                    lb94.setText("-");
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText("-");
                                    lb105.setText("-");
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText("-");
                                    lb116.setText("-");
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(88, 97, 102));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(88, 97, 102));
                                    lb127.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb115.setText(h.get(i).getSigla_professor());
                                    lb116.setText(h.get(i).getSigla_disciplina());
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(161, 62, 3));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(161, 62, 3));
                                    lb127.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 5) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText(h.get(i).getDesignacao());
                                    lb30.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(161, 62, 3));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(161, 62, 3));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText("-");
                                    lb30.setText("-");
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(88, 97, 102));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(88, 97, 102));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText("-");
                                    lb41.setText("-");
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText("-");
                                    lb52.setText("-");
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText("-");
                                    lb63.setText("-");
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText("-");
                                    lb74.setText("-");
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText("-");
                                    lb85.setText("-");
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText("-");
                                    lb96.setText("-");
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText("-");
                                    lb107.setText("-");
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText("-");
                                    lb118.setText("-");
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(88, 97, 102));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(88, 97, 102));
                                    lb129.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb117.setText(h.get(i).getSigla_professor());
                                    lb118.setText(h.get(i).getSigla_disciplina());
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(161, 62, 3));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(161, 62, 3));
                                    lb129.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 6) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText(h.get(i).getDesignacao());
                                    lb32.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(161, 62, 3));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(161, 62, 3));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText("-");
                                    lb32.setText("-");
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(88, 97, 102));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(88, 97, 102));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText("-");
                                    lb43.setText("-");
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));;
                                    lb54.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText("-");
                                    lb54.setText("-");
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText("-");
                                    lb65.setText("-");
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText("-");
                                    lb76.setText("-");
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText("-");
                                    lb87.setText("-");
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText("-");
                                    lb98.setText("-");
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText("-");
                                    lb109.setText("-");
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText("-");
                                    lb120.setText("-");
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(88, 97, 102));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(88, 97, 102));
                                    lb131.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb119.setText(h.get(i).getSigla_professor());
                                    lb120.setText(h.get(i).getSigla_disciplina());
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(161, 62, 3));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(161, 62, 3));
                                    lb131.setOpaque(true);
                                }
                            }
                        }
                    }
                } else {
                    HorarioVazio();
                }
            }
        });
    }

    
    private void listagemSala() {
        final Main m = new Main();

        // Panels
        Painel panel = new Painel(new FlowLayout(FlowLayout.CENTER, 60, 120));
        Painel panelbtn = new Painel(img.background2);
        panel.setLayout(new GridLayout(1, 0, 0, 10));

        // Panels customization
        panelbtn.setLayout(new GridLayout(15, 11, 0, 0));
//        panelbtn.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelbtn.setOpaque(false);
        // Empty border
//        Border emptyBorder = BorderFactory.createEmptyBorder();
        JLabel NomeCom = new JLabel("Sala:", JLabel.CENTER);
        String[] v5 = new String[m.salas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.salas.size() + 1; i++) {
            v5[i] = m.salas.get(i - 1).toStringSigla();
        }
        final JComboBox com = new JComboBox(v5);

        // Title customization

        lb.setFont(new Font("Arial", Font.BOLD, 14));
        lb.setForeground(Color.white);
        NomeCom.setFont(new Font("Arial", Font.BOLD, 12));
        NomeCom.setForeground(Color.white);

        HorarioVazio();

        panel.add(panelbtn, BorderLayout.CENTER);
        panelbtn.add(lb, BorderLayout.NORTH);
        panelbtn.add(lb1, BorderLayout.CENTER);
        panelbtn.add(lb2, BorderLayout.CENTER);
        panelbtn.add(lb3, BorderLayout.CENTER);
        panelbtn.add(lb4, BorderLayout.CENTER);
        panelbtn.add(lb5, BorderLayout.CENTER);
        panelbtn.add(lb6, BorderLayout.CENTER);
        panelbtn.add(lb7, BorderLayout.CENTER);
        panelbtn.add(lb8, BorderLayout.CENTER);
        panelbtn.add(lb9, BorderLayout.CENTER);
        panelbtn.add(lb10, BorderLayout.CENTER);
        panelbtn.add(lb0, BorderLayout.CENTER);
        panelbtn.add(lb01, BorderLayout.CENTER);
        panelbtn.add(lb02, BorderLayout.CENTER);
        panelbtn.add(lb03, BorderLayout.CENTER);
        panelbtn.add(lb04, BorderLayout.CENTER);
        panelbtn.add(lb05, BorderLayout.CENTER);
        panelbtn.add(lb06, BorderLayout.CENTER);
        panelbtn.add(lb07, BorderLayout.CENTER);
        panelbtn.add(lb08, BorderLayout.CENTER);
        panelbtn.add(lb09, BorderLayout.CENTER);
        panelbtn.add(lb010, BorderLayout.CENTER);
        panelbtn.add(lb11, BorderLayout.CENTER);
        panelbtn.add(P8Seg, BorderLayout.CENTER);
        panelbtn.add(lb13, BorderLayout.CENTER);
        panelbtn.add(P8Ter, BorderLayout.CENTER);
        panelbtn.add(lb15, BorderLayout.CENTER);
        panelbtn.add(P8Qua, BorderLayout.CENTER);
        panelbtn.add(lb17, BorderLayout.CENTER);
        panelbtn.add(P8Qui, BorderLayout.CENTER);
        panelbtn.add(lb19, BorderLayout.CENTER);
        panelbtn.add(P8Sex, BorderLayout.CENTER);
        panelbtn.add(lb21, BorderLayout.CENTER);
        panelbtn.add(lb22, BorderLayout.CENTER);
        panelbtn.add(lb23, BorderLayout.CENTER);
        panelbtn.add(lb24, BorderLayout.CENTER);
        panelbtn.add(lb25, BorderLayout.CENTER);
        panelbtn.add(lb26, BorderLayout.CENTER);
        panelbtn.add(lb27, BorderLayout.CENTER);
        panelbtn.add(lb28, BorderLayout.CENTER);
        panelbtn.add(lb29, BorderLayout.CENTER);
        panelbtn.add(lb30, BorderLayout.CENTER);
        panelbtn.add(lb31, BorderLayout.CENTER);
        panelbtn.add(lb32, BorderLayout.CENTER);
        panelbtn.add(lb33, BorderLayout.CENTER);
        panelbtn.add(lb34, BorderLayout.CENTER);
        panelbtn.add(lb35, BorderLayout.CENTER);
        panelbtn.add(lb36, BorderLayout.CENTER);
        panelbtn.add(lb37, BorderLayout.CENTER);
        panelbtn.add(lb38, BorderLayout.CENTER);
        panelbtn.add(lb39, BorderLayout.CENTER);
        panelbtn.add(lb40, BorderLayout.CENTER);
        panelbtn.add(lb41, BorderLayout.CENTER);
        panelbtn.add(lb42, BorderLayout.CENTER);
        panelbtn.add(lb43, BorderLayout.CENTER);
        panelbtn.add(lb44, BorderLayout.CENTER);
        panelbtn.add(lb45, BorderLayout.CENTER);
        panelbtn.add(lb46, BorderLayout.CENTER);
        panelbtn.add(lb47, BorderLayout.CENTER);
        panelbtn.add(lb48, BorderLayout.CENTER);
        panelbtn.add(lb49, BorderLayout.CENTER);
        panelbtn.add(lb50, BorderLayout.CENTER);
        panelbtn.add(lb51, BorderLayout.CENTER);
        panelbtn.add(lb52, BorderLayout.CENTER);
        panelbtn.add(lb53, BorderLayout.CENTER);
        panelbtn.add(lb54, BorderLayout.CENTER);
        panelbtn.add(lb55, BorderLayout.CENTER);
        panelbtn.add(lb56, BorderLayout.CENTER);
        panelbtn.add(lb57, BorderLayout.CENTER);
        panelbtn.add(lb58, BorderLayout.CENTER);
        panelbtn.add(lb59, BorderLayout.CENTER);
        panelbtn.add(lb60, BorderLayout.CENTER);
        panelbtn.add(lb61, BorderLayout.CENTER);
        panelbtn.add(lb62, BorderLayout.CENTER);
        panelbtn.add(lb63, BorderLayout.CENTER);
        panelbtn.add(lb64, BorderLayout.CENTER);
        panelbtn.add(lb65, BorderLayout.CENTER);
        panelbtn.add(lb66, BorderLayout.CENTER);
        panelbtn.add(lb67, BorderLayout.CENTER);
        panelbtn.add(lb68, BorderLayout.CENTER);
        panelbtn.add(lb69, BorderLayout.CENTER);
        panelbtn.add(lb70, BorderLayout.CENTER);
        panelbtn.add(lb71, BorderLayout.CENTER);
        panelbtn.add(lb72, BorderLayout.CENTER);
        panelbtn.add(lb73, BorderLayout.CENTER);
        panelbtn.add(lb74, BorderLayout.CENTER);
        panelbtn.add(lb75, BorderLayout.CENTER);
        panelbtn.add(lb76, BorderLayout.CENTER);
        panelbtn.add(lb77, BorderLayout.CENTER);
        panelbtn.add(lb78, BorderLayout.CENTER);
        panelbtn.add(lb79, BorderLayout.CENTER);
        panelbtn.add(lb80, BorderLayout.CENTER);
        panelbtn.add(lb81, BorderLayout.CENTER);
        panelbtn.add(lb82, BorderLayout.CENTER);
        panelbtn.add(lb83, BorderLayout.CENTER);
        panelbtn.add(lb84, BorderLayout.CENTER);
        panelbtn.add(lb85, BorderLayout.CENTER);
        panelbtn.add(lb86, BorderLayout.CENTER);
        panelbtn.add(lb87, BorderLayout.CENTER);
        panelbtn.add(lb88, BorderLayout.CENTER);
        panelbtn.add(lb89, BorderLayout.CENTER);
        panelbtn.add(lb90, BorderLayout.CENTER);
        panelbtn.add(lb91, BorderLayout.CENTER);
        panelbtn.add(lb92, BorderLayout.CENTER);
        panelbtn.add(lb93, BorderLayout.CENTER);
        panelbtn.add(lb94, BorderLayout.CENTER);
        panelbtn.add(lb95, BorderLayout.CENTER);
        panelbtn.add(lb96, BorderLayout.CENTER);
        panelbtn.add(lb97, BorderLayout.CENTER);
        panelbtn.add(lb98, BorderLayout.CENTER);
        panelbtn.add(lb99, BorderLayout.CENTER);
        panelbtn.add(lb100, BorderLayout.CENTER);
        panelbtn.add(lb101, BorderLayout.CENTER);
        panelbtn.add(lb102, BorderLayout.CENTER);
        panelbtn.add(lb103, BorderLayout.CENTER);
        panelbtn.add(lb104, BorderLayout.CENTER);
        panelbtn.add(lb105, BorderLayout.CENTER);
        panelbtn.add(lb106, BorderLayout.CENTER);
        panelbtn.add(lb107, BorderLayout.CENTER);
        panelbtn.add(lb108, BorderLayout.CENTER);
        panelbtn.add(lb109, BorderLayout.CENTER);
        panelbtn.add(lb110, BorderLayout.CENTER);
        panelbtn.add(lb111, BorderLayout.CENTER);
        panelbtn.add(lb112, BorderLayout.CENTER);
        panelbtn.add(lb113, BorderLayout.CENTER);
        panelbtn.add(lb114, BorderLayout.CENTER);
        panelbtn.add(lb115, BorderLayout.CENTER);
        panelbtn.add(lb116, BorderLayout.CENTER);
        panelbtn.add(lb117, BorderLayout.CENTER);
        panelbtn.add(lb118, BorderLayout.CENTER);
        panelbtn.add(lb119, BorderLayout.CENTER);
        panelbtn.add(lb120, BorderLayout.CENTER);
        panelbtn.add(lb121, BorderLayout.CENTER);
        panelbtn.add(lb122, BorderLayout.CENTER);
        panelbtn.add(lb123, BorderLayout.CENTER);
        panelbtn.add(lb124, BorderLayout.CENTER);
        panelbtn.add(lb125, BorderLayout.CENTER);
        panelbtn.add(lb126, BorderLayout.CENTER);
        panelbtn.add(lb127, BorderLayout.CENTER);
        panelbtn.add(lb128, BorderLayout.CENTER);
        panelbtn.add(lb129, BorderLayout.CENTER);
        panelbtn.add(lb130, BorderLayout.CENTER);
        panelbtn.add(lb131, BorderLayout.CENTER);
        panelbtn.add(lb000, BorderLayout.CENTER);
        panelbtn.add(lb001, BorderLayout.CENTER);
        panelbtn.add(lb002, BorderLayout.CENTER);
        panelbtn.add(lb003, BorderLayout.CENTER);
        panelbtn.add(lb004, BorderLayout.CENTER);
        panelbtn.add(lb005, BorderLayout.CENTER);
        panelbtn.add(lb006, BorderLayout.CENTER);
        panelbtn.add(lb007, BorderLayout.CENTER);
        panelbtn.add(lb008, BorderLayout.CENTER);
        panelbtn.add(lb009, BorderLayout.CENTER);
        panelbtn.add(lb0010, BorderLayout.CENTER);

        panelbtn.add(NomeCom);
//        panelbtn.add(null);
        panelbtn.add(com);
        panelbtn.add(lb0011, BorderLayout.CENTER);
        panelbtn.add(lb0012, BorderLayout.CENTER);
        panelbtn.add(lb0013, BorderLayout.CENTER);
        panelbtn.add(lb0014, BorderLayout.CENTER);
        panelbtn.add(lb0015, BorderLayout.CENTER);
        panelbtn.add(lb0016, BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);

        com.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> h = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    h = m.salas.get(com.getSelectedIndex() - 1).listarHorarioSala(m.salas, m.horarios);
                    for (int i = 0; i < h.size(); i++) {
                        if (h.get(i).getDia_semana() == 2) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText(h.get(i).getDesignacao());
                                    lb24.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(161, 62, 3));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(161, 62, 3));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Seg.setText(h.get(i).getSigla_professor());
                                    lb13.setText(h.get(i).getSigla_disciplina());
                                    lb23.setText("-");
                                    lb24.setText("-");
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    P8Seg.setBackground(new Color(88, 97, 102));
                                    P8Seg.setOpaque(true);
                                    lb13.setBackground(new Color(88, 97, 102));
                                    lb13.setOpaque(true);
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText(h.get(i).getDesignacao());
                                    lb35.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(161, 62, 3));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(161, 62, 3));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb23.setText(h.get(i).getSigla_professor());
                                    lb24.setText(h.get(i).getSigla_disciplina());
                                    lb34.setText("-");
                                    lb35.setText("-");
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb23.setBackground(new Color(88, 97, 102));
                                    lb23.setOpaque(true);
                                    lb24.setBackground(new Color(88, 97, 102));
                                    lb24.setOpaque(true);
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText(h.get(i).getDesignacao());
                                    lb46.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(161, 62, 3));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(161, 62, 3));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb34.setText(h.get(i).getSigla_professor());
                                    lb35.setText(h.get(i).getSigla_disciplina());
                                    lb45.setText("-");
                                    lb46.setText("-");
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb34.setBackground(new Color(88, 97, 102));
                                    lb34.setOpaque(true);
                                    lb35.setBackground(new Color(88, 97, 102));
                                    lb35.setOpaque(true);
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText(h.get(i).getDesignacao());
                                    lb57.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(161, 62, 3));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(161, 62, 3));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb45.setText(h.get(i).getSigla_professor());
                                    lb46.setText(h.get(i).getSigla_disciplina());
                                    lb56.setText("-");
                                    lb57.setText("-");
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb45.setBackground(new Color(88, 97, 102));
                                    lb45.setOpaque(true);
                                    lb46.setBackground(new Color(88, 97, 102));
                                    lb46.setOpaque(true);
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText(h.get(i).getDesignacao());
                                    lb68.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(161, 62, 3));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(161, 62, 3));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb56.setText(h.get(i).getSigla_professor());
                                    lb57.setText(h.get(i).getSigla_disciplina());
                                    lb67.setText("-");
                                    lb68.setText("-");
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb56.setBackground(new Color(88, 97, 102));
                                    lb56.setOpaque(true);
                                    lb57.setBackground(new Color(88, 97, 102));
                                    lb57.setOpaque(true);
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText(h.get(i).getDesignacao());
                                    lb79.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(161, 62, 3));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(161, 62, 3));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb67.setText(h.get(i).getSigla_professor());
                                    lb68.setText(h.get(i).getSigla_disciplina());
                                    lb78.setText("-");
                                    lb79.setText("-");
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb67.setBackground(new Color(88, 97, 102));
                                    lb67.setOpaque(true);
                                    lb68.setBackground(new Color(88, 97, 102));
                                    lb68.setOpaque(true);
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText(h.get(i).getDesignacao());
                                    lb90.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(161, 62, 3));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(161, 62, 3));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb78.setText(h.get(i).getSigla_professor());
                                    lb79.setText(h.get(i).getSigla_disciplina());
                                    lb89.setText("-");
                                    lb90.setText("-");
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb78.setBackground(new Color(88, 97, 102));
                                    lb78.setOpaque(true);
                                    lb79.setBackground(new Color(88, 97, 102));
                                    lb79.setOpaque(true);
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText(h.get(i).getDesignacao());
                                    lb101.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(161, 62, 3));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(161, 62, 3));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb89.setText(h.get(i).getSigla_professor());
                                    lb90.setText(h.get(i).getSigla_disciplina());
                                    lb100.setText("-");
                                    lb101.setText("-");
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb89.setBackground(new Color(88, 97, 102));
                                    lb89.setOpaque(true);
                                    lb90.setBackground(new Color(88, 97, 102));
                                    lb90.setOpaque(true);
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText(h.get(i).getDesignacao());
                                    lb112.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(161, 62, 3));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(161, 62, 3));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb100.setText(h.get(i).getSigla_professor());
                                    lb101.setText(h.get(i).getSigla_disciplina());
                                    lb111.setText("-");
                                    lb112.setText("-");
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb100.setBackground(new Color(88, 97, 102));
                                    lb100.setOpaque(true);
                                    lb101.setBackground(new Color(88, 97, 102));
                                    lb101.setOpaque(true);
                                    lb111.setBackground(new Color(88, 97, 102));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(88, 97, 102));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(88, 97, 102));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(88, 97, 102));
                                    lb123.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb111.setText(h.get(i).getSigla_professor());
                                    lb112.setText(h.get(i).getSigla_disciplina());
                                    lb122.setText(h.get(i).getDesignacao());
                                    lb123.setText(h.get(i).getCodigo_sala());
                                    lb111.setBackground(new Color(161, 62, 3));
                                    lb111.setOpaque(true);
                                    lb112.setBackground(new Color(161, 62, 3));
                                    lb112.setOpaque(true);
                                    lb122.setBackground(new Color(161, 62, 3));
                                    lb122.setOpaque(true);
                                    lb123.setBackground(new Color(161, 62, 3));
                                    lb123.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 3) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText(h.get(i).getDesignacao());
                                    lb26.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(161, 62, 3));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(161, 62, 3));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Ter.setText(h.get(i).getSigla_professor());
                                    lb15.setText(h.get(i).getSigla_disciplina());
                                    lb25.setText("-");
                                    lb26.setText("-");
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    P8Ter.setBackground(new Color(88, 97, 102));
                                    P8Ter.setOpaque(true);
                                    lb15.setBackground(new Color(88, 97, 102));
                                    lb15.setOpaque(true);
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText(h.get(i).getDesignacao());
                                    lb37.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(161, 62, 3));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(161, 62, 3));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb25.setText(h.get(i).getSigla_professor());
                                    lb26.setText(h.get(i).getSigla_disciplina());
                                    lb36.setText("-");
                                    lb37.setText("-");
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb25.setBackground(new Color(88, 97, 102));
                                    lb25.setOpaque(true);
                                    lb26.setBackground(new Color(88, 97, 102));
                                    lb26.setOpaque(true);
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText(h.get(i).getDesignacao());
                                    lb48.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(161, 62, 3));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(161, 62, 3));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb36.setText(h.get(i).getSigla_professor());
                                    lb37.setText(h.get(i).getSigla_disciplina());
                                    lb47.setText("-");
                                    lb48.setText("-");
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb36.setBackground(new Color(88, 97, 102));
                                    lb36.setOpaque(true);
                                    lb37.setBackground(new Color(88, 97, 102));
                                    lb37.setOpaque(true);
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText(h.get(i).getDesignacao());
                                    lb59.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(161, 62, 3));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(161, 62, 3));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb47.setText(h.get(i).getSigla_professor());
                                    lb48.setText(h.get(i).getSigla_disciplina());
                                    lb58.setText("-");
                                    lb59.setText("-");
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb47.setBackground(new Color(88, 97, 102));
                                    lb47.setOpaque(true);
                                    lb48.setBackground(new Color(88, 97, 102));
                                    lb48.setOpaque(true);
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText(h.get(i).getDesignacao());
                                    lb70.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(161, 62, 3));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(161, 62, 3));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb58.setText(h.get(i).getSigla_professor());
                                    lb59.setText(h.get(i).getSigla_disciplina());
                                    lb69.setText("-");
                                    lb70.setText("-");
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb58.setBackground(new Color(88, 97, 102));
                                    lb58.setOpaque(true);
                                    lb59.setBackground(new Color(88, 97, 102));
                                    lb59.setOpaque(true);
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText(h.get(i).getDesignacao());
                                    lb81.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(161, 62, 3));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(161, 62, 3));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb69.setText(h.get(i).getSigla_professor());
                                    lb70.setText(h.get(i).getSigla_disciplina());
                                    lb80.setText("-");
                                    lb81.setText("-");
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb69.setBackground(new Color(88, 97, 102));
                                    lb69.setOpaque(true);
                                    lb70.setBackground(new Color(88, 97, 102));
                                    lb70.setOpaque(true);
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText(h.get(i).getDesignacao());
                                    lb92.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(161, 62, 3));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(161, 62, 3));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb80.setText(h.get(i).getSigla_professor());
                                    lb81.setText(h.get(i).getSigla_disciplina());
                                    lb91.setText("-");
                                    lb92.setText("-");
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb80.setBackground(new Color(88, 97, 102));
                                    lb80.setOpaque(true);
                                    lb81.setBackground(new Color(88, 97, 102));
                                    lb81.setOpaque(true);
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText(h.get(i).getDesignacao());
                                    lb103.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(161, 62, 3));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(161, 62, 3));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb91.setText(h.get(i).getSigla_professor());
                                    lb92.setText(h.get(i).getSigla_disciplina());
                                    lb102.setText("-");
                                    lb103.setText("-");
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb91.setBackground(new Color(88, 97, 102));
                                    lb91.setOpaque(true);
                                    lb92.setBackground(new Color(88, 97, 102));
                                    lb92.setOpaque(true);
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText(h.get(i).getDesignacao());
                                    lb114.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(161, 62, 3));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(161, 62, 3));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb102.setText(h.get(i).getSigla_professor());
                                    lb103.setText(h.get(i).getSigla_disciplina());
                                    lb113.setText("-");
                                    lb114.setText("-");
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb102.setBackground(new Color(88, 97, 102));
                                    lb102.setOpaque(true);
                                    lb103.setBackground(new Color(88, 97, 102));
                                    lb103.setOpaque(true);
                                    lb113.setBackground(new Color(88, 97, 102));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(88, 97, 102));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(88, 97, 102));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(88, 97, 102));
                                    lb125.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb113.setText(h.get(i).getSigla_professor());
                                    lb114.setText(h.get(i).getSigla_disciplina());
                                    lb124.setText(h.get(i).getDesignacao());
                                    lb125.setText(h.get(i).getCodigo_sala());
                                    lb113.setBackground(new Color(161, 62, 3));
                                    lb113.setOpaque(true);
                                    lb114.setBackground(new Color(161, 62, 3));
                                    lb114.setOpaque(true);
                                    lb124.setBackground(new Color(161, 62, 3));
                                    lb124.setOpaque(true);
                                    lb125.setBackground(new Color(161, 62, 3));
                                    lb125.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 4) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText(h.get(i).getDesignacao());
                                    lb28.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(161, 62, 3));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(161, 62, 3));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qua.setText(h.get(i).getSigla_professor());
                                    lb17.setText(h.get(i).getSigla_disciplina());
                                    lb27.setText("-");
                                    lb28.setText("-");
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    P8Qua.setBackground(new Color(88, 97, 102));
                                    P8Qua.setOpaque(true);
                                    lb17.setBackground(new Color(88, 97, 102));
                                    lb17.setOpaque(true);
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText(h.get(i).getDesignacao());
                                    lb39.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(161, 62, 3));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(161, 62, 3));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb27.setText(h.get(i).getSigla_professor());
                                    lb28.setText(h.get(i).getSigla_disciplina());
                                    lb38.setText("-");
                                    lb39.setText("-");
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb27.setBackground(new Color(88, 97, 102));
                                    lb27.setOpaque(true);
                                    lb28.setBackground(new Color(88, 97, 102));
                                    lb28.setOpaque(true);
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText(h.get(i).getDesignacao());
                                    lb50.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(161, 62, 3));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(161, 62, 3));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb38.setText(h.get(i).getSigla_professor());
                                    lb39.setText(h.get(i).getSigla_disciplina());
                                    lb49.setText("-");
                                    lb50.setText("-");
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb38.setBackground(new Color(88, 97, 102));
                                    lb38.setOpaque(true);
                                    lb39.setBackground(new Color(88, 97, 102));
                                    lb39.setOpaque(true);
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText(h.get(i).getDesignacao());
                                    lb61.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(161, 62, 3));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(161, 62, 3));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb49.setText(h.get(i).getSigla_professor());
                                    lb50.setText(h.get(i).getSigla_disciplina());
                                    lb60.setText("-");
                                    lb61.setText("-");
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb49.setBackground(new Color(88, 97, 102));
                                    lb49.setOpaque(true);
                                    lb50.setBackground(new Color(88, 97, 102));
                                    lb50.setOpaque(true);
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText(h.get(i).getDesignacao());
                                    lb72.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(161, 62, 3));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(161, 62, 3));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb60.setText(h.get(i).getSigla_professor());
                                    lb61.setText(h.get(i).getSigla_disciplina());
                                    lb71.setText("-");
                                    lb72.setText("-");
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb60.setBackground(new Color(88, 97, 102));
                                    lb60.setOpaque(true);
                                    lb61.setBackground(new Color(88, 97, 102));
                                    lb61.setOpaque(true);
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText(h.get(i).getDesignacao());
                                    lb83.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(161, 62, 3));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(161, 62, 3));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb71.setText(h.get(i).getSigla_professor());
                                    lb72.setText(h.get(i).getSigla_disciplina());
                                    lb82.setText("-");
                                    lb83.setText("-");
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb71.setBackground(new Color(88, 97, 102));
                                    lb71.setOpaque(true);
                                    lb72.setBackground(new Color(88, 97, 102));
                                    lb72.setOpaque(true);
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText(h.get(i).getDesignacao());
                                    lb94.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(161, 62, 3));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(161, 62, 3));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb82.setText(h.get(i).getSigla_professor());
                                    lb83.setText(h.get(i).getSigla_disciplina());
                                    lb93.setText("-");
                                    lb94.setText("-");
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb82.setBackground(new Color(88, 97, 102));
                                    lb82.setOpaque(true);
                                    lb83.setBackground(new Color(88, 97, 102));
                                    lb83.setOpaque(true);
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText(h.get(i).getDesignacao());
                                    lb105.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(161, 62, 3));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(161, 62, 3));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb93.setText(h.get(i).getSigla_professor());
                                    lb94.setText(h.get(i).getSigla_disciplina());
                                    lb104.setText("-");
                                    lb105.setText("-");
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb93.setBackground(new Color(88, 97, 102));
                                    lb93.setOpaque(true);
                                    lb94.setBackground(new Color(88, 97, 102));
                                    lb94.setOpaque(true);
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText(h.get(i).getDesignacao());
                                    lb116.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(161, 62, 3));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(161, 62, 3));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb104.setText(h.get(i).getSigla_professor());
                                    lb105.setText(h.get(i).getSigla_disciplina());
                                    lb115.setText("-");
                                    lb116.setText("-");
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb104.setBackground(new Color(88, 97, 102));
                                    lb104.setOpaque(true);
                                    lb105.setBackground(new Color(88, 97, 102));
                                    lb105.setOpaque(true);
                                    lb115.setBackground(new Color(88, 97, 102));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(88, 97, 102));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(88, 97, 102));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(88, 97, 102));
                                    lb127.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb115.setText(h.get(i).getSigla_professor());
                                    lb116.setText(h.get(i).getSigla_disciplina());
                                    lb126.setText(h.get(i).getDesignacao());
                                    lb127.setText(h.get(i).getCodigo_sala());
                                    lb115.setBackground(new Color(161, 62, 3));
                                    lb115.setOpaque(true);
                                    lb116.setBackground(new Color(161, 62, 3));
                                    lb116.setOpaque(true);
                                    lb126.setBackground(new Color(161, 62, 3));
                                    lb126.setOpaque(true);
                                    lb127.setBackground(new Color(161, 62, 3));
                                    lb127.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 5) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText(h.get(i).getDesignacao());
                                    lb30.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(161, 62, 3));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(161, 62, 3));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Qui.setText(h.get(i).getSigla_professor());
                                    lb19.setText(h.get(i).getSigla_disciplina());
                                    lb29.setText("-");
                                    lb30.setText("-");
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    P8Qui.setBackground(new Color(88, 97, 102));
                                    P8Qui.setOpaque(true);
                                    lb19.setBackground(new Color(88, 97, 102));
                                    lb19.setOpaque(true);
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText(h.get(i).getDesignacao());
                                    lb41.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(161, 62, 3));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(161, 62, 3));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb29.setText(h.get(i).getSigla_professor());
                                    lb30.setText(h.get(i).getSigla_disciplina());
                                    lb40.setText("-");
                                    lb41.setText("-");
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb29.setBackground(new Color(88, 97, 102));
                                    lb29.setOpaque(true);
                                    lb30.setBackground(new Color(88, 97, 102));
                                    lb30.setOpaque(true);
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText(h.get(i).getDesignacao());
                                    lb52.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(161, 62, 3));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(161, 62, 3));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb40.setText(h.get(i).getSigla_professor());
                                    lb41.setText(h.get(i).getSigla_disciplina());
                                    lb51.setText("-");
                                    lb52.setText("-");
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb40.setBackground(new Color(88, 97, 102));
                                    lb40.setOpaque(true);
                                    lb41.setBackground(new Color(88, 97, 102));
                                    lb41.setOpaque(true);
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText(h.get(i).getDesignacao());
                                    lb63.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(161, 62, 3));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(161, 62, 3));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb51.setText(h.get(i).getSigla_professor());
                                    lb52.setText(h.get(i).getSigla_disciplina());
                                    lb62.setText("-");
                                    lb63.setText("-");
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb51.setBackground(new Color(88, 97, 102));
                                    lb51.setOpaque(true);
                                    lb52.setBackground(new Color(88, 97, 102));
                                    lb52.setOpaque(true);
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText(h.get(i).getDesignacao());
                                    lb74.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(161, 62, 3));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(161, 62, 3));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb62.setText(h.get(i).getSigla_professor());
                                    lb63.setText(h.get(i).getSigla_disciplina());
                                    lb73.setText("-");
                                    lb74.setText("-");
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb62.setBackground(new Color(88, 97, 102));
                                    lb62.setOpaque(true);
                                    lb63.setBackground(new Color(88, 97, 102));
                                    lb63.setOpaque(true);
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText(h.get(i).getDesignacao());
                                    lb85.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(161, 62, 3));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(161, 62, 3));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb73.setText(h.get(i).getSigla_professor());
                                    lb74.setText(h.get(i).getSigla_disciplina());
                                    lb84.setText("-");
                                    lb85.setText("-");
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb73.setBackground(new Color(88, 97, 102));
                                    lb73.setOpaque(true);
                                    lb74.setBackground(new Color(88, 97, 102));
                                    lb74.setOpaque(true);
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText(h.get(i).getDesignacao());
                                    lb96.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(161, 62, 3));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(161, 62, 3));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb84.setText(h.get(i).getSigla_professor());
                                    lb85.setText(h.get(i).getSigla_disciplina());
                                    lb95.setText("-");
                                    lb96.setText("-");
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb84.setBackground(new Color(88, 97, 102));
                                    lb84.setOpaque(true);
                                    lb85.setBackground(new Color(88, 97, 102));
                                    lb85.setOpaque(true);
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText(h.get(i).getDesignacao());
                                    lb107.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(161, 62, 3));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(161, 62, 3));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb95.setText(h.get(i).getSigla_professor());
                                    lb96.setText(h.get(i).getSigla_disciplina());
                                    lb106.setText("-");
                                    lb107.setText("-");
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb95.setBackground(new Color(88, 97, 102));
                                    lb95.setOpaque(true);
                                    lb96.setBackground(new Color(88, 97, 102));
                                    lb96.setOpaque(true);
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText(h.get(i).getDesignacao());
                                    lb118.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(161, 62, 3));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(161, 62, 3));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb106.setText(h.get(i).getSigla_professor());
                                    lb107.setText(h.get(i).getSigla_disciplina());
                                    lb117.setText("-");
                                    lb118.setText("-");
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb106.setBackground(new Color(88, 97, 102));
                                    lb106.setOpaque(true);
                                    lb107.setBackground(new Color(88, 97, 102));
                                    lb107.setOpaque(true);
                                    lb117.setBackground(new Color(88, 97, 102));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(88, 97, 102));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(88, 97, 102));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(88, 97, 102));
                                    lb129.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb117.setText(h.get(i).getSigla_professor());
                                    lb118.setText(h.get(i).getSigla_disciplina());
                                    lb128.setText(h.get(i).getDesignacao());
                                    lb129.setText(h.get(i).getCodigo_sala());
                                    lb117.setBackground(new Color(161, 62, 3));
                                    lb117.setOpaque(true);
                                    lb118.setBackground(new Color(161, 62, 3));
                                    lb118.setOpaque(true);
                                    lb128.setBackground(new Color(161, 62, 3));
                                    lb128.setOpaque(true);
                                    lb129.setBackground(new Color(161, 62, 3));
                                    lb129.setOpaque(true);
                                }
                            }
                        } else if (h.get(i).getDia_semana() == 6) {
                            if (h.get(i).getHora_inicio() == 8) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText(h.get(i).getDesignacao());
                                    lb32.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(161, 62, 3));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(161, 62, 3));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    P8Sex.setText(h.get(i).getSigla_professor());
                                    lb21.setText(h.get(i).getSigla_disciplina());
                                    lb31.setText("-");
                                    lb32.setText("-");
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    P8Sex.setBackground(new Color(88, 97, 102));
                                    P8Sex.setOpaque(true);
                                    lb21.setBackground(new Color(88, 97, 102));
                                    lb21.setOpaque(true);
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 9) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText(h.get(i).getDesignacao());
                                    lb43.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(161, 62, 3));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(161, 62, 3));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb31.setText(h.get(i).getSigla_professor());
                                    lb32.setText(h.get(i).getSigla_disciplina());
                                    lb42.setText("-");
                                    lb43.setText("-");
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb31.setBackground(new Color(88, 97, 102));
                                    lb31.setOpaque(true);
                                    lb32.setBackground(new Color(88, 97, 102));
                                    lb32.setOpaque(true);
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));;
                                    lb54.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 10) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText(h.get(i).getDesignacao());
                                    lb54.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(161, 62, 3));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(161, 62, 3));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb42.setText(h.get(i).getSigla_professor());
                                    lb43.setText(h.get(i).getSigla_disciplina());
                                    lb53.setText("-");
                                    lb54.setText("-");
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb42.setBackground(new Color(88, 97, 102));
                                    lb42.setOpaque(true);
                                    lb43.setBackground(new Color(88, 97, 102));
                                    lb43.setOpaque(true);
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 11) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText(h.get(i).getDesignacao());
                                    lb65.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(161, 62, 3));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(161, 62, 3));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb53.setText(h.get(i).getSigla_professor());
                                    lb54.setText(h.get(i).getSigla_disciplina());
                                    lb64.setText("-");
                                    lb65.setText("-");
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb53.setBackground(new Color(88, 97, 102));
                                    lb53.setOpaque(true);
                                    lb54.setBackground(new Color(88, 97, 102));
                                    lb54.setOpaque(true);
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 12) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText(h.get(i).getDesignacao());
                                    lb76.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(161, 62, 3));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(161, 62, 3));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb64.setText(h.get(i).getSigla_professor());
                                    lb65.setText(h.get(i).getSigla_disciplina());
                                    lb75.setText("-");
                                    lb76.setText("-");
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb64.setBackground(new Color(88, 97, 102));
                                    lb64.setOpaque(true);
                                    lb65.setBackground(new Color(88, 97, 102));
                                    lb65.setOpaque(true);
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 13) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText(h.get(i).getDesignacao());
                                    lb87.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(161, 62, 3));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(161, 62, 3));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb75.setText(h.get(i).getSigla_professor());
                                    lb76.setText(h.get(i).getSigla_disciplina());
                                    lb86.setText("-");
                                    lb87.setText("-");
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb75.setBackground(new Color(88, 97, 102));
                                    lb75.setOpaque(true);
                                    lb76.setBackground(new Color(88, 97, 102));
                                    lb76.setOpaque(true);
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 14) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText(h.get(i).getDesignacao());
                                    lb98.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(161, 62, 3));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(161, 62, 3));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb86.setText(h.get(i).getSigla_professor());
                                    lb87.setText(h.get(i).getSigla_disciplina());
                                    lb97.setText("-");
                                    lb98.setText("-");
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb86.setBackground(new Color(88, 97, 102));
                                    lb86.setOpaque(true);
                                    lb87.setBackground(new Color(88, 97, 102));
                                    lb87.setOpaque(true);
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 15) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText(h.get(i).getDesignacao());
                                    lb109.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(161, 62, 3));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(161, 62, 3));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb97.setText(h.get(i).getSigla_professor());
                                    lb98.setText(h.get(i).getSigla_disciplina());
                                    lb108.setText("-");
                                    lb109.setText("-");
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb97.setBackground(new Color(88, 97, 102));
                                    lb97.setOpaque(true);
                                    lb98.setBackground(new Color(88, 97, 102));
                                    lb98.setOpaque(true);
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 16) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText(h.get(i).getDesignacao());
                                    lb120.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(161, 62, 3));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(161, 62, 3));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                } else if (h.get(i).getDuracaoAula() == 2) {
                                    lb108.setText(h.get(i).getSigla_professor());
                                    lb109.setText(h.get(i).getSigla_disciplina());
                                    lb119.setText("-");
                                    lb120.setText("-");
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb108.setBackground(new Color(88, 97, 102));
                                    lb108.setOpaque(true);
                                    lb109.setBackground(new Color(88, 97, 102));
                                    lb109.setOpaque(true);
                                    lb119.setBackground(new Color(88, 97, 102));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(88, 97, 102));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(88, 97, 102));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(88, 97, 102));
                                    lb131.setOpaque(true);
                                }
                            } else if (h.get(i).getHora_inicio() == 17) {
                                if (h.get(i).getDuracaoAula() == 1) {
                                    lb119.setText(h.get(i).getSigla_professor());
                                    lb120.setText(h.get(i).getSigla_disciplina());
                                    lb130.setText(h.get(i).getDesignacao());
                                    lb131.setText(h.get(i).getCodigo_sala());
                                    lb119.setBackground(new Color(161, 62, 3));
                                    lb119.setOpaque(true);
                                    lb120.setBackground(new Color(161, 62, 3));
                                    lb120.setOpaque(true);
                                    lb130.setBackground(new Color(161, 62, 3));
                                    lb130.setOpaque(true);
                                    lb131.setBackground(new Color(161, 62, 3));
                                    lb131.setOpaque(true);
                                }
                            }
                        }
                    }
                } else {
                    HorarioVazio();
                }
            }
        });
    }
    
    public void HorarioVazio() {

        lb0.setFont(new Font("Arial", Font.BOLD, 10));
        lb0.setForeground(Color.white);
        lb01.setFont(new Font("Arial", Font.BOLD, 10));
        lb01.setForeground(Color.white);
        lb02.setFont(new Font("Arial", Font.BOLD, 10));
        lb02.setForeground(Color.white);
        lb03.setFont(new Font("Arial", Font.BOLD, 10));
        lb03.setForeground(Color.white);
        lb04.setFont(new Font("Arial", Font.BOLD, 10));
        lb04.setForeground(Color.white);
        lb05.setFont(new Font("Arial", Font.BOLD, 10));
        lb05.setForeground(Color.white);
        lb06.setFont(new Font("Arial", Font.BOLD, 10));
        lb06.setForeground(Color.white);
        lb07.setFont(new Font("Arial", Font.BOLD, 10));
        lb07.setForeground(Color.white);
        lb08.setFont(new Font("Arial", Font.BOLD, 10));
        lb08.setForeground(Color.white);
        lb09.setFont(new Font("Arial", Font.BOLD, 10));
        lb09.setForeground(Color.white);
        lb010.setFont(new Font("Arial", Font.BOLD, 10));
        lb010.setForeground(Color.white);
        lb1.setFont(new Font("Arial", Font.BOLD, 10));
        lb1.setForeground(Color.white);
        lb2.setFont(new Font("Arial", Font.BOLD, 10));
        lb2.setForeground(Color.white);
        lb3.setFont(new Font("Arial", Font.BOLD, 10));
        lb3.setForeground(Color.white);
        lb4.setFont(new Font("Arial", Font.BOLD, 10));
        lb4.setForeground(Color.white);
        lb5.setFont(new Font("Arial", Font.BOLD, 10));
        lb5.setForeground(Color.white);
        lb6.setFont(new Font("Arial", Font.BOLD, 10));
        lb6.setForeground(Color.white);
        lb7.setFont(new Font("Arial", Font.BOLD, 10));
        lb7.setForeground(Color.white);
        lb8.setFont(new Font("Arial", Font.BOLD, 10));
        lb8.setForeground(Color.white);
        lb9.setFont(new Font("Arial", Font.BOLD, 10));
        lb9.setForeground(Color.white);
        lb10.setFont(new Font("Arial", Font.BOLD, 10));
        lb10.setForeground(Color.white);
        lb11.setFont(new Font("Arial", Font.BOLD, 10));
        lb11.setForeground(Color.white);
        lb11.setBorder(border);
        P8Seg.setFont(new Font("Arial", Font.BOLD, 10));
//        P8Seg.setOpaque(true);
//        P8Seg.setBackground(Color.red);
        P8Seg.setForeground(Color.white);
        P8Seg.setBorder(border);
        lb13.setFont(new Font("Arial", Font.BOLD, 10));
        lb13.setForeground(Color.white);
        lb13.setBorder(border);
        P8Ter.setFont(new Font("Arial", Font.BOLD, 10));
        P8Ter.setForeground(Color.white);
        P8Ter.setBorder(border);
        lb15.setFont(new Font("Arial", Font.BOLD, 10));
        lb15.setForeground(Color.white);
        lb15.setBorder(border);
        P8Qua.setFont(new Font("Arial", Font.BOLD, 10));
        P8Qua.setForeground(Color.white);
        P8Qua.setBorder(border);
        lb17.setFont(new Font("Arial", Font.BOLD, 10));
        lb17.setForeground(Color.white);
        lb17.setBorder(border);
        P8Qui.setFont(new Font("Arial", Font.BOLD, 10));
        P8Qui.setForeground(Color.white);
        P8Qui.setBorder(border);
        lb19.setFont(new Font("Arial", Font.BOLD, 10));
        lb19.setForeground(Color.white);
        lb19.setBorder(border);
        P8Sex.setFont(new Font("Arial", Font.BOLD, 10));
        P8Sex.setForeground(Color.white);
        P8Sex.setBorder(border);
        lb21.setFont(new Font("Arial", Font.BOLD, 10));
        lb21.setForeground(Color.white);
        lb21.setBorder(border);
        lb22.setFont(new Font("Arial", Font.BOLD, 10));
        lb22.setForeground(Color.white);
        lb22.setBorder(border);
        lb23.setFont(new Font("Arial", Font.BOLD, 10));
        lb23.setForeground(Color.white);
        lb23.setBorder(border);
        lb24.setFont(new Font("Arial", Font.BOLD, 10));
        lb24.setForeground(Color.white);
        lb24.setBorder(border);
        lb25.setFont(new Font("Arial", Font.BOLD, 10));
        lb25.setForeground(Color.white);
        lb25.setBorder(border);
        lb26.setFont(new Font("Arial", Font.BOLD, 10));
        lb26.setForeground(Color.white);
        lb26.setBorder(border);
        lb27.setFont(new Font("Arial", Font.BOLD, 10));
        lb27.setForeground(Color.white);
        lb27.setBorder(border);
        lb28.setFont(new Font("Arial", Font.BOLD, 10));
        lb28.setForeground(Color.white);
        lb28.setBorder(border);
        lb29.setFont(new Font("Arial", Font.BOLD, 10));
        lb29.setForeground(Color.white);
        lb29.setBorder(border);
        lb30.setFont(new Font("Arial", Font.BOLD, 10));
        lb30.setForeground(Color.white);
        lb30.setBorder(border);
        lb31.setFont(new Font("Arial", Font.BOLD, 10));
        lb31.setForeground(Color.white);
        lb31.setBorder(border);
        lb32.setFont(new Font("Arial", Font.BOLD, 10));
        lb32.setForeground(Color.white);
        lb32.setBorder(border);
        lb33.setFont(new Font("Arial", Font.BOLD, 10));
        lb33.setForeground(Color.white);
        lb33.setBorder(border);
        lb34.setFont(new Font("Arial", Font.BOLD, 10));
        lb34.setForeground(Color.white);
        lb34.setBorder(border);
        lb35.setFont(new Font("Arial", Font.BOLD, 10));
        lb35.setForeground(Color.white);
        lb35.setBorder(border);
        lb36.setFont(new Font("Arial", Font.BOLD, 10));
        lb36.setForeground(Color.white);
        lb36.setBorder(border);
        lb37.setFont(new Font("Arial", Font.BOLD, 10));
        lb37.setForeground(Color.white);
        lb37.setBorder(border);
        lb38.setFont(new Font("Arial", Font.BOLD, 10));
        lb38.setForeground(Color.white);
        lb38.setBorder(border);
        lb39.setFont(new Font("Arial", Font.BOLD, 10));
        lb39.setForeground(Color.white);
        lb39.setBorder(border);
        lb40.setFont(new Font("Arial", Font.BOLD, 10));
        lb40.setForeground(Color.white);
        lb40.setBorder(border);
        lb41.setFont(new Font("Arial", Font.BOLD, 10));
        lb41.setForeground(Color.white);
        lb41.setBorder(border);
        lb42.setFont(new Font("Arial", Font.BOLD, 10));
        lb42.setForeground(Color.white);
        lb42.setBorder(border);
        lb43.setFont(new Font("Arial", Font.BOLD, 10));
        lb43.setForeground(Color.white);
        lb43.setBorder(border);
        lb44.setFont(new Font("Arial", Font.BOLD, 10));
        lb44.setForeground(Color.white);
        lb44.setBorder(border);
        lb45.setFont(new Font("Arial", Font.BOLD, 10));
        lb45.setForeground(Color.white);
        lb45.setBorder(border);
        lb46.setFont(new Font("Arial", Font.BOLD, 10));
        lb46.setForeground(Color.white);
        lb46.setBorder(border);
        lb47.setFont(new Font("Arial", Font.BOLD, 10));
        lb47.setForeground(Color.white);
        lb47.setBorder(border);
        lb48.setFont(new Font("Arial", Font.BOLD, 10));
        lb48.setForeground(Color.white);
        lb48.setBorder(border);
        lb49.setFont(new Font("Arial", Font.BOLD, 10));
        lb49.setForeground(Color.white);
        lb49.setBorder(border);
        lb50.setFont(new Font("Arial", Font.BOLD, 10));
        lb50.setForeground(Color.white);
        lb50.setBorder(border);
        lb51.setFont(new Font("Arial", Font.BOLD, 10));
        lb51.setForeground(Color.white);
        lb51.setBorder(border);
        lb52.setFont(new Font("Arial", Font.BOLD, 10));
        lb52.setForeground(Color.white);
        lb52.setBorder(border);
        lb53.setFont(new Font("Arial", Font.BOLD, 10));
        lb53.setForeground(Color.white);
        lb53.setBorder(border);
        lb54.setFont(new Font("Arial", Font.BOLD, 10));
        lb54.setForeground(Color.white);
        lb54.setBorder(border);
        lb55.setFont(new Font("Arial", Font.BOLD, 10));
        lb55.setForeground(Color.white);
        lb55.setBorder(border);
        lb56.setFont(new Font("Arial", Font.BOLD, 10));
        lb56.setForeground(Color.white);
        lb56.setBorder(border);
        lb57.setFont(new Font("Arial", Font.BOLD, 10));
        lb57.setForeground(Color.white);
        lb57.setBorder(border);
        lb58.setFont(new Font("Arial", Font.BOLD, 10));
        lb58.setForeground(Color.white);
        lb58.setBorder(border);
        lb59.setFont(new Font("Arial", Font.BOLD, 10));
        lb59.setForeground(Color.white);
        lb59.setBorder(border);
        lb60.setFont(new Font("Arial", Font.BOLD, 10));
        lb60.setForeground(Color.white);
        lb60.setBorder(border);
        lb61.setFont(new Font("Arial", Font.BOLD, 10));
        lb61.setForeground(Color.white);
        lb61.setBorder(border);
        lb62.setFont(new Font("Arial", Font.BOLD, 10));
        lb62.setForeground(Color.white);
        lb62.setBorder(border);
        lb63.setFont(new Font("Arial", Font.BOLD, 10));
        lb63.setForeground(Color.white);
        lb63.setBorder(border);
        lb64.setFont(new Font("Arial", Font.BOLD, 10));
        lb64.setForeground(Color.white);
        lb64.setBorder(border);
        lb65.setFont(new Font("Arial", Font.BOLD, 10));
        lb65.setForeground(Color.white);
        lb65.setBorder(border);
        lb66.setFont(new Font("Arial", Font.BOLD, 10));
        lb66.setForeground(Color.white);
        lb66.setBorder(border);
        lb67.setFont(new Font("Arial", Font.BOLD, 10));
        lb67.setForeground(Color.white);
        lb67.setBorder(border);
        lb68.setFont(new Font("Arial", Font.BOLD, 10));
        lb68.setForeground(Color.white);
        lb68.setBorder(border);
        lb69.setFont(new Font("Arial", Font.BOLD, 10));
        lb69.setForeground(Color.white);
        lb69.setBorder(border);
        lb70.setFont(new Font("Arial", Font.BOLD, 10));
        lb70.setForeground(Color.white);
        lb70.setBorder(border);
        lb71.setFont(new Font("Arial", Font.BOLD, 10));
        lb71.setForeground(Color.white);
        lb71.setBorder(border);
        lb72.setFont(new Font("Arial", Font.BOLD, 10));
        lb72.setForeground(Color.white);
        lb72.setBorder(border);
        lb73.setFont(new Font("Arial", Font.BOLD, 10));
        lb73.setForeground(Color.white);
        lb73.setBorder(border);
        lb74.setFont(new Font("Arial", Font.BOLD, 10));
        lb74.setForeground(Color.white);
        lb74.setBorder(border);
        lb75.setFont(new Font("Arial", Font.BOLD, 10));
        lb75.setForeground(Color.white);
        lb75.setBorder(border);
        lb76.setFont(new Font("Arial", Font.BOLD, 10));
        lb76.setForeground(Color.white);
        lb76.setBorder(border);
        lb77.setFont(new Font("Arial", Font.BOLD, 10));
        lb77.setForeground(Color.white);
        lb77.setBorder(border);
        lb78.setFont(new Font("Arial", Font.BOLD, 10));
        lb78.setForeground(Color.white);
        lb78.setBorder(border);
        lb79.setFont(new Font("Arial", Font.BOLD, 10));
        lb79.setForeground(Color.white);
        lb79.setBorder(border);
        lb80.setFont(new Font("Arial", Font.BOLD, 10));
        lb80.setForeground(Color.white);
        lb80.setBorder(border);
        lb81.setFont(new Font("Arial", Font.BOLD, 10));
        lb81.setForeground(Color.white);
        lb81.setBorder(border);
        lb82.setFont(new Font("Arial", Font.BOLD, 10));
        lb82.setForeground(Color.white);
        lb82.setBorder(border);
        lb83.setFont(new Font("Arial", Font.BOLD, 10));
        lb83.setForeground(Color.white);
        lb83.setBorder(border);
        lb84.setFont(new Font("Arial", Font.BOLD, 10));
        lb84.setForeground(Color.white);
        lb84.setBorder(border);
        lb85.setFont(new Font("Arial", Font.BOLD, 10));
        lb85.setForeground(Color.white);
        lb85.setBorder(border);
        lb86.setFont(new Font("Arial", Font.BOLD, 10));
        lb86.setForeground(Color.white);
        lb86.setBorder(border);
        lb87.setFont(new Font("Arial", Font.BOLD, 10));
        lb87.setForeground(Color.white);
        lb87.setBorder(border);
        lb88.setFont(new Font("Arial", Font.BOLD, 10));
        lb88.setForeground(Color.white);
        lb88.setBorder(border);
        lb89.setFont(new Font("Arial", Font.BOLD, 10));
        lb89.setForeground(Color.white);
        lb89.setBorder(border);
        lb90.setFont(new Font("Arial", Font.BOLD, 10));
        lb90.setForeground(Color.white);
        lb90.setBorder(border);
        lb91.setFont(new Font("Arial", Font.BOLD, 10));
        lb91.setForeground(Color.white);
        lb91.setBorder(border);
        lb92.setFont(new Font("Arial", Font.BOLD, 10));
        lb92.setForeground(Color.white);
        lb92.setBorder(border);
        lb93.setFont(new Font("Arial", Font.BOLD, 10));
        lb93.setForeground(Color.white);
        lb93.setBorder(border);
        lb94.setFont(new Font("Arial", Font.BOLD, 10));
        lb94.setForeground(Color.white);
        lb94.setBorder(border);
        lb95.setFont(new Font("Arial", Font.BOLD, 10));
        lb95.setForeground(Color.white);
        lb95.setBorder(border);
        lb96.setFont(new Font("Arial", Font.BOLD, 10));
        lb96.setForeground(Color.white);
        lb96.setBorder(border);
        lb97.setFont(new Font("Arial", Font.BOLD, 10));
        lb97.setForeground(Color.white);
        lb97.setBorder(border);
        lb98.setFont(new Font("Arial", Font.BOLD, 10));
        lb98.setForeground(Color.white);
        lb98.setBorder(border);
        lb99.setFont(new Font("Arial", Font.BOLD, 10));
        lb99.setForeground(Color.white);
        lb99.setBorder(border);
        lb100.setFont(new Font("Arial", Font.BOLD, 10));
        lb100.setForeground(Color.white);
        lb100.setBorder(border);
        lb101.setFont(new Font("Arial", Font.BOLD, 10));
        lb101.setForeground(Color.white);
        lb101.setBorder(border);
        lb102.setFont(new Font("Arial", Font.BOLD, 10));
        lb102.setForeground(Color.white);
        lb102.setBorder(border);
        lb103.setFont(new Font("Arial", Font.BOLD, 10));
        lb103.setForeground(Color.white);
        lb103.setBorder(border);
        lb104.setFont(new Font("Arial", Font.BOLD, 10));
        lb104.setForeground(Color.white);
        lb104.setBorder(border);
        lb105.setFont(new Font("Arial", Font.BOLD, 10));
        lb105.setForeground(Color.white);
        lb105.setBorder(border);
        lb106.setFont(new Font("Arial", Font.BOLD, 10));
        lb106.setForeground(Color.white);
        lb106.setBorder(border);
        lb107.setFont(new Font("Arial", Font.BOLD, 10));
        lb107.setForeground(Color.white);
        lb107.setBorder(border);
        lb108.setFont(new Font("Arial", Font.BOLD, 10));
        lb108.setForeground(Color.white);
        lb108.setBorder(border);
        lb109.setFont(new Font("Arial", Font.BOLD, 10));
        lb109.setForeground(Color.white);
        lb109.setBorder(border);
        lb110.setFont(new Font("Arial", Font.BOLD, 10));
        lb110.setForeground(Color.white);
        lb110.setBorder(border);
        lb111.setFont(new Font("Arial", Font.BOLD, 10));
        lb111.setForeground(Color.white);
        lb111.setBorder(border);
        lb112.setFont(new Font("Arial", Font.BOLD, 10));
        lb112.setForeground(Color.white);
        lb112.setBorder(border);
        lb113.setFont(new Font("Arial", Font.BOLD, 10));
        lb113.setForeground(Color.white);
        lb113.setBorder(border);
        lb114.setFont(new Font("Arial", Font.BOLD, 10));
        lb114.setForeground(Color.white);
        lb114.setBorder(border);
        lb115.setFont(new Font("Arial", Font.BOLD, 10));
        lb115.setForeground(Color.white);
        lb115.setBorder(border);
        lb116.setFont(new Font("Arial", Font.BOLD, 10));
        lb116.setForeground(Color.white);
        lb116.setBorder(border);
        lb117.setFont(new Font("Arial", Font.BOLD, 10));
        lb117.setForeground(Color.white);
        lb117.setBorder(border);
        lb118.setFont(new Font("Arial", Font.BOLD, 10));
        lb118.setForeground(Color.white);
        lb118.setBorder(border);
        lb119.setFont(new Font("Arial", Font.BOLD, 10));
        lb119.setForeground(Color.white);
        lb119.setBorder(border);
        lb120.setFont(new Font("Arial", Font.BOLD, 10));
        lb120.setForeground(Color.white);
        lb120.setBorder(border);
        lb121.setFont(new Font("Arial", Font.BOLD, 10));
        lb121.setForeground(Color.white);
        lb121.setBorder(border);
        lb122.setFont(new Font("Arial", Font.BOLD, 10));
        lb122.setForeground(Color.white);
        lb122.setBorder(border);
        lb123.setFont(new Font("Arial", Font.BOLD, 10));
        lb123.setForeground(Color.white);
        lb123.setBorder(border);
        lb124.setFont(new Font("Arial", Font.BOLD, 10));
        lb124.setForeground(Color.white);
        lb124.setBorder(border);
        lb125.setFont(new Font("Arial", Font.BOLD, 10));
        lb125.setForeground(Color.white);
        lb125.setBorder(border);
        lb126.setFont(new Font("Arial", Font.BOLD, 10));
        lb126.setForeground(Color.white);
        lb126.setBorder(border);
        lb127.setFont(new Font("Arial", Font.BOLD, 10));
        lb127.setForeground(Color.white);
        lb127.setBorder(border);
        lb128.setFont(new Font("Arial", Font.BOLD, 10));
        lb128.setForeground(Color.white);
        lb128.setBorder(border);
        lb129.setFont(new Font("Arial", Font.BOLD, 10));
        lb129.setForeground(Color.white);
        lb129.setBorder(border);
        lb130.setFont(new Font("Arial", Font.BOLD, 10));
        lb130.setForeground(Color.white);
        lb130.setBorder(border);
        lb131.setFont(new Font("Arial", Font.BOLD, 10));
        lb131.setForeground(Color.white);
        lb131.setBorder(border);
        lb000.setFont(new Font("Arial", Font.BOLD, 10));
        lb001.setFont(new Font("Arial", Font.BOLD, 10));
        lb002.setFont(new Font("Arial", Font.BOLD, 10));
        lb003.setFont(new Font("Arial", Font.BOLD, 10));
        lb004.setFont(new Font("Arial", Font.BOLD, 10));
        lb005.setFont(new Font("Arial", Font.BOLD, 10));
        lb006.setFont(new Font("Arial", Font.BOLD, 10));
        lb007.setFont(new Font("Arial", Font.BOLD, 10));
        lb008.setFont(new Font("Arial", Font.BOLD, 10));
        lb009.setFont(new Font("Arial", Font.BOLD, 10));
        lb0010.setFont(new Font("Arial", Font.BOLD, 10));
        lb0011.setFont(new Font("Arial", Font.BOLD, 10));
        lb0012.setFont(new Font("Arial", Font.BOLD, 10));
        lb0013.setFont(new Font("Arial", Font.BOLD, 10));
        lb0014.setFont(new Font("Arial", Font.BOLD, 10));
        lb0014.setOpaque(true);
        lb0014.setBackground(new Color(161, 62, 3));
        lb0014.setForeground(Color.BLACK);
        lb0014.setBorder(borderG);
        lb0015.setFont(new Font("Arial", Font.BOLD, 10));
        lb0016.setFont(new Font("Arial", Font.BOLD, 10));
        lb0016.setOpaque(true);
        lb0016.setBackground(new Color(88, 97, 102));
        lb0016.setForeground(Color.BLACK);
        lb0016.setBorder(borderO);
        P8Seg.setText("");
        lb13.setText("");
        P8Ter.setText("");
        lb15.setText("");
        P8Qua.setText("");
        lb17.setText("");
        P8Qui.setText("");
        lb19.setText("");
        P8Sex.setText("");
        lb21.setText("");
        lb23.setText("");
        lb24.setText("");
        lb25.setText("");
        lb26.setText("");
        lb27.setText("");
        lb28.setText("");
        lb29.setText("");
        lb30.setText("");
        lb31.setText("");
        lb32.setText("");
        lb34.setText("");
        lb35.setText("");
        lb36.setText("");
        lb37.setText("");
        lb38.setText("");
        lb39.setText("");
        lb40.setText("");
        lb41.setText("");
        lb42.setText("");
        lb43.setText("");
        lb45.setText("");
        lb46.setText("");
        lb47.setText("");
        lb48.setText("");
        lb49.setText("");
        lb50.setText("");
        lb51.setText("");
        lb52.setText("");
        lb53.setText("");
        lb54.setText("");
        lb56.setText("");
        lb57.setText("");
        lb58.setText("");
        lb59.setText("");
        lb60.setText("");
        lb61.setText("");
        lb62.setText("");
        lb63.setText("");
        lb64.setText("");
        lb65.setText("");
        lb67.setText("");
        lb68.setText("");
        lb69.setText("");
        lb70.setText("");
        lb71.setText("");
        lb72.setText("");
        lb73.setText("");
        lb74.setText("");
        lb75.setText("");
        lb76.setText("");
        lb78.setText("");
        lb79.setText("");
        lb80.setText("");
        lb81.setText("");
        lb82.setText("");
        lb83.setText("");
        lb84.setText("");
        lb85.setText("");
        lb86.setText("");
        lb87.setText("");
        lb89.setText("");
        lb90.setText("");
        lb91.setText("");
        lb92.setText("");
        lb93.setText("");
        lb94.setText("");
        lb95.setText("");
        lb96.setText("");
        lb97.setText("");
        lb98.setText("");
        lb100.setText("");
        lb101.setText("");
        lb102.setText("");
        lb103.setText("");
        lb104.setText("");
        lb105.setText("");
        lb106.setText("");
        lb107.setText("");
        lb108.setText("");
        lb109.setText("");
        lb111.setText("");
        lb112.setText("");
        lb113.setText("");
        lb114.setText("");
        lb115.setText("");
        lb116.setText("");
        lb117.setText("");
        lb118.setText("");
        lb119.setText("");
        lb120.setText("");
        lb122.setText("");
        lb123.setText("");
        lb124.setText("");
        lb125.setText("");
        lb126.setText("");
        lb127.setText("");
        lb128.setText("");
        lb129.setText("");
        lb130.setText("");
        lb131.setText("");
        P8Seg.setOpaque(false);
        lb13.setOpaque(false);
        P8Ter.setOpaque(false);
        lb15.setOpaque(false);
        P8Qua.setOpaque(false);
        lb17.setOpaque(false);
        P8Qui.setOpaque(false);
        lb19.setOpaque(false);
        P8Sex.setOpaque(false);
        lb21.setOpaque(false);
        lb22.setOpaque(false);
        lb23.setOpaque(false);
        lb24.setOpaque(false);
        lb25.setOpaque(false);
        lb26.setOpaque(false);
        lb27.setOpaque(false);
        lb28.setOpaque(false);
        lb29.setOpaque(false);
        lb30.setOpaque(false);
        lb31.setOpaque(false);
        lb32.setOpaque(false);
        lb33.setOpaque(false);
        lb34.setOpaque(false);
        lb35.setOpaque(false);
        lb36.setOpaque(false);
        lb37.setOpaque(false);
        lb38.setOpaque(false);
        lb39.setOpaque(false);
        lb40.setOpaque(false);
        lb41.setOpaque(false);
        lb42.setOpaque(false);
        lb43.setOpaque(false);
        lb44.setOpaque(false);
        lb45.setOpaque(false);
        lb46.setOpaque(false);
        lb47.setOpaque(false);
        lb48.setOpaque(false);
        lb49.setOpaque(false);
        lb50.setOpaque(false);
        lb51.setOpaque(false);
        lb52.setOpaque(false);
        lb53.setOpaque(false);
        lb54.setOpaque(false);
        lb55.setOpaque(false);
        lb56.setOpaque(false);
        lb57.setOpaque(false);
        lb58.setOpaque(false);
        lb59.setOpaque(false);
        lb60.setOpaque(false);
        lb61.setOpaque(false);
        lb62.setOpaque(false);
        lb63.setOpaque(false);
        lb64.setOpaque(false);
        lb65.setOpaque(false);
        lb66.setOpaque(false);
        lb67.setOpaque(false);
        lb68.setOpaque(false);
        lb69.setOpaque(false);
        lb70.setOpaque(false);
        lb71.setOpaque(false);
        lb72.setOpaque(false);
        lb73.setOpaque(false);
        lb74.setOpaque(false);
        lb75.setOpaque(false);
        lb76.setOpaque(false);
        lb77.setOpaque(false);
        lb78.setOpaque(false);
        lb79.setOpaque(false);
        lb80.setOpaque(false);
        lb81.setOpaque(false);
        lb82.setOpaque(false);
        lb83.setOpaque(false);
        lb84.setOpaque(false);
        lb85.setOpaque(false);
        lb86.setOpaque(false);
        lb87.setOpaque(false);
        lb88.setOpaque(false);
        lb89.setOpaque(false);
        lb90.setOpaque(false);
        lb91.setOpaque(false);
        lb92.setOpaque(false);
        lb93.setOpaque(false);
        lb94.setOpaque(false);
        lb95.setOpaque(false);
        lb96.setOpaque(false);
        lb97.setOpaque(false);
        lb98.setOpaque(false);
        lb99.setOpaque(false);
        lb100.setOpaque(false);
        lb101.setOpaque(false);
        lb102.setOpaque(false);
        lb103.setOpaque(false);
        lb104.setOpaque(false);
        lb105.setOpaque(false);
        lb106.setOpaque(false);
        lb107.setOpaque(false);
        lb108.setOpaque(false);
        lb109.setOpaque(false);
        lb110.setOpaque(false);
        lb111.setOpaque(false);
        lb112.setOpaque(false);
        lb113.setOpaque(false);
        lb114.setOpaque(false);
        lb115.setOpaque(false);
        lb116.setOpaque(false);
        lb117.setOpaque(false);
        lb118.setOpaque(false);
        lb119.setOpaque(false);
        lb120.setOpaque(false);
        lb121.setOpaque(false);
        lb122.setOpaque(false);
        lb123.setOpaque(false);
        lb124.setOpaque(false);
        lb125.setOpaque(false);
        lb126.setOpaque(false);
        lb127.setOpaque(false);
        lb128.setOpaque(false);
        lb129.setOpaque(false);
        lb130.setOpaque(false);
        lb131.setOpaque(false);
    }

    private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    final Border borderO = BorderFactory.createLineBorder(new Color(156, 102, 31));
    final Border borderG = BorderFactory.createLineBorder(new Color(88, 97, 102));
    JLabel lb = new JLabel("Horario:");
    JLabel lb0 = new JLabel("");
    JLabel lb01 = new JLabel("Segunda-", JLabel.RIGHT);
    JLabel lb02 = new JLabel("Feira");
    JLabel lb03 = new JLabel("Terça-", JLabel.RIGHT);
    JLabel lb04 = new JLabel("Feira");
    JLabel lb05 = new JLabel("Quarta-", JLabel.RIGHT);
    JLabel lb06 = new JLabel("Feira");
    JLabel lb07 = new JLabel("Quinta-", JLabel.RIGHT);
    JLabel lb08 = new JLabel("Feira");
    JLabel lb09 = new JLabel("Sexta-", JLabel.RIGHT);
    JLabel lb010 = new JLabel("Feira");
    JLabel lb1 = new JLabel("");
    JLabel lb2 = new JLabel("");
    JLabel lb3 = new JLabel("");
    JLabel lb4 = new JLabel("");
    JLabel lb5 = new JLabel("");
    JLabel lb6 = new JLabel("");
    JLabel lb7 = new JLabel("");
    JLabel lb8 = new JLabel("");
    JLabel lb9 = new JLabel("");
    JLabel lb10 = new JLabel("");
    JLabel lb11 = new JLabel("8:00");
    final JLabel P8Seg = new JLabel("0,0", JLabel.CENTER);
    final JLabel lb13 = new JLabel("0,1", JLabel.CENTER);
    final JLabel P8Ter = new JLabel("0,2", JLabel.CENTER);
    final JLabel lb15 = new JLabel("0,3", JLabel.CENTER);
    final JLabel P8Qua = new JLabel("0,4", JLabel.CENTER);
    final JLabel lb17 = new JLabel("0,5", JLabel.CENTER);
    final JLabel P8Qui = new JLabel("0,6", JLabel.CENTER);
    final JLabel lb19 = new JLabel("0,7", JLabel.CENTER);
    final JLabel P8Sex = new JLabel("0,8", JLabel.CENTER);
    final JLabel lb21 = new JLabel("0,9", JLabel.CENTER);
    JLabel lb22 = new JLabel("9:00");
    final JLabel lb23 = new JLabel("1,0", JLabel.CENTER);
    final JLabel lb24 = new JLabel("1,1", JLabel.CENTER);
    final JLabel lb25 = new JLabel("1,2", JLabel.CENTER);
    final JLabel lb26 = new JLabel("1,3", JLabel.CENTER);
    final JLabel lb27 = new JLabel("1,4", JLabel.CENTER);
    final JLabel lb28 = new JLabel("1,5", JLabel.CENTER);
    final JLabel lb29 = new JLabel("1,6", JLabel.CENTER);
    final JLabel lb30 = new JLabel("1,7", JLabel.CENTER);
    final JLabel lb31 = new JLabel("1,8", JLabel.CENTER);
    final JLabel lb32 = new JLabel("1,9", JLabel.CENTER);
    JLabel lb33 = new JLabel("10:00");
    final JLabel lb34 = new JLabel("2,0", JLabel.CENTER);
    final JLabel lb35 = new JLabel("2,1", JLabel.CENTER);
    final JLabel lb36 = new JLabel("2,2", JLabel.CENTER);
    final JLabel lb37 = new JLabel("2,3", JLabel.CENTER);
    final JLabel lb38 = new JLabel("2,4", JLabel.CENTER);
    final JLabel lb39 = new JLabel("2,5", JLabel.CENTER);
    final JLabel lb40 = new JLabel("2,6", JLabel.CENTER);
    final JLabel lb41 = new JLabel("2,7", JLabel.CENTER);
    final JLabel lb42 = new JLabel("2,8", JLabel.CENTER);
    final JLabel lb43 = new JLabel("2,9", JLabel.CENTER);
    JLabel lb44 = new JLabel("11:00");
    final JLabel lb45 = new JLabel("3,0", JLabel.CENTER);
    final JLabel lb46 = new JLabel("3,1", JLabel.CENTER);
    final JLabel lb47 = new JLabel("3,2", JLabel.CENTER);
    final JLabel lb48 = new JLabel("3,3", JLabel.CENTER);
    final JLabel lb49 = new JLabel("3,4", JLabel.CENTER);
    final JLabel lb50 = new JLabel("3,5", JLabel.CENTER);
    final JLabel lb51 = new JLabel("3,6", JLabel.CENTER);
    final JLabel lb52 = new JLabel("3,7", JLabel.CENTER);
    final JLabel lb53 = new JLabel("3,8", JLabel.CENTER);
    final JLabel lb54 = new JLabel("3,9", JLabel.CENTER);
    JLabel lb55 = new JLabel("12:00");
    final JLabel lb56 = new JLabel("4,0", JLabel.CENTER);
    final JLabel lb57 = new JLabel("4,1", JLabel.CENTER);
    final JLabel lb58 = new JLabel("4,2", JLabel.CENTER);
    final JLabel lb59 = new JLabel("4,3", JLabel.CENTER);
    final JLabel lb60 = new JLabel("4,4", JLabel.CENTER);
    final JLabel lb61 = new JLabel("4,5", JLabel.CENTER);
    final JLabel lb62 = new JLabel("4,6", JLabel.CENTER);
    final JLabel lb63 = new JLabel("4,7", JLabel.CENTER);
    final JLabel lb64 = new JLabel("4,8", JLabel.CENTER);
    final JLabel lb65 = new JLabel("4,9", JLabel.CENTER);
    JLabel lb66 = new JLabel("13:00");
    final JLabel lb67 = new JLabel("5,0", JLabel.CENTER);
    final JLabel lb68 = new JLabel("5,1", JLabel.CENTER);
    final JLabel lb69 = new JLabel("5,2", JLabel.CENTER);
    final JLabel lb70 = new JLabel("5,3", JLabel.CENTER);
    final JLabel lb71 = new JLabel("5,4", JLabel.CENTER);
    final JLabel lb72 = new JLabel("5,5", JLabel.CENTER);
    final JLabel lb73 = new JLabel("5,6", JLabel.CENTER);
    final JLabel lb74 = new JLabel("5,7", JLabel.CENTER);
    final JLabel lb75 = new JLabel("5,8", JLabel.CENTER);
    final JLabel lb76 = new JLabel("5,9", JLabel.CENTER);
    JLabel lb77 = new JLabel("14:00");
    final JLabel lb78 = new JLabel("6,0", JLabel.CENTER);
    final JLabel lb79 = new JLabel("6,1", JLabel.CENTER);
    final JLabel lb80 = new JLabel("6,2", JLabel.CENTER);
    final JLabel lb81 = new JLabel("6,3", JLabel.CENTER);
    final JLabel lb82 = new JLabel("6,4", JLabel.CENTER);
    final JLabel lb83 = new JLabel("6,5", JLabel.CENTER);
    final JLabel lb84 = new JLabel("6,6", JLabel.CENTER);
    final JLabel lb85 = new JLabel("6,7", JLabel.CENTER);
    final JLabel lb86 = new JLabel("6,8", JLabel.CENTER);
    final JLabel lb87 = new JLabel("6,9", JLabel.CENTER);
    JLabel lb88 = new JLabel("15:00");
    final JLabel lb89 = new JLabel("7,0", JLabel.CENTER);
    final JLabel lb90 = new JLabel("7,1", JLabel.CENTER);
    final JLabel lb91 = new JLabel("7,2", JLabel.CENTER);
    final JLabel lb92 = new JLabel("7,3", JLabel.CENTER);
    final JLabel lb93 = new JLabel("7,4", JLabel.CENTER);
    final JLabel lb94 = new JLabel("7,5", JLabel.CENTER);
    final JLabel lb95 = new JLabel("7,6", JLabel.CENTER);
    final JLabel lb96 = new JLabel("7,7", JLabel.CENTER);
    final JLabel lb97 = new JLabel("7,8", JLabel.CENTER);
    final JLabel lb98 = new JLabel("7,9", JLabel.CENTER);
    JLabel lb99 = new JLabel("16:00");
    final JLabel lb100 = new JLabel("8,0", JLabel.CENTER);
    final JLabel lb101 = new JLabel("8,1", JLabel.CENTER);
    final JLabel lb102 = new JLabel("8,2", JLabel.CENTER);
    final JLabel lb103 = new JLabel("8,3", JLabel.CENTER);
    final JLabel lb104 = new JLabel("8,4", JLabel.CENTER);
    final JLabel lb105 = new JLabel("8,5", JLabel.CENTER);
    final JLabel lb106 = new JLabel("8,6", JLabel.CENTER);
    final JLabel lb107 = new JLabel("8,7", JLabel.CENTER);
    final JLabel lb108 = new JLabel("8,8", JLabel.CENTER);
    final JLabel lb109 = new JLabel("8,9", JLabel.CENTER);
    JLabel lb110 = new JLabel("17:00");
    final JLabel lb111 = new JLabel("9,0", JLabel.CENTER);
    final JLabel lb112 = new JLabel("9,1", JLabel.CENTER);
    final JLabel lb113 = new JLabel("9,2", JLabel.CENTER);
    final JLabel lb114 = new JLabel("9,3", JLabel.CENTER);
    final JLabel lb115 = new JLabel("9,4", JLabel.CENTER);
    final JLabel lb116 = new JLabel("9,5", JLabel.CENTER);
    final JLabel lb117 = new JLabel("9,6", JLabel.CENTER);
    final JLabel lb118 = new JLabel("9,7", JLabel.CENTER);
    final JLabel lb119 = new JLabel("9,8", JLabel.CENTER);
    final JLabel lb120 = new JLabel("9,9", JLabel.CENTER);
    JLabel lb121 = new JLabel("18:00");
    final JLabel lb122 = new JLabel("10,0", JLabel.CENTER);
    final JLabel lb123 = new JLabel("10,1", JLabel.CENTER);
    final JLabel lb124 = new JLabel("10,2", JLabel.CENTER);
    final JLabel lb125 = new JLabel("10,3", JLabel.CENTER);
    final JLabel lb126 = new JLabel("10,4", JLabel.CENTER);
    final JLabel lb127 = new JLabel("10,5", JLabel.CENTER);
    final JLabel lb128 = new JLabel("10,6", JLabel.CENTER);
    final JLabel lb129 = new JLabel("10,7", JLabel.CENTER);
    final JLabel lb130 = new JLabel("10,8", JLabel.CENTER);
    final JLabel lb131 = new JLabel("10,9", JLabel.CENTER);
    JLabel lb000 = new JLabel("");
    JLabel lb001 = new JLabel("");
    JLabel lb002 = new JLabel("");
    JLabel lb003 = new JLabel("");
    JLabel lb004 = new JLabel("");
    JLabel lb005 = new JLabel("");
    JLabel lb006 = new JLabel("");
    JLabel lb007 = new JLabel("");
    JLabel lb008 = new JLabel("");
    JLabel lb009 = new JLabel("");
    JLabel lb0010 = new JLabel("");
    JLabel lb0011 = new JLabel("");
    JLabel lb0012 = new JLabel("");
    JLabel lb0013 = new JLabel("");
    JLabel lb0014 = new JLabel("Teoricas", JLabel.CENTER);
    JLabel lb0015 = new JLabel("");
    JLabel lb0016 = new JLabel("Praticas", JLabel.CENTER);
}
