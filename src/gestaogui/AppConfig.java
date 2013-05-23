package gestaogui;

import gestaologica.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class AppConfig extends JFrame {

    private Painel gerirHorarios;
    private Painel listarHorarios;
    private Painel listarDados;
    private Painel calculo;
    private Painel salaLivre;
    private Imagens img = new Imagens();
    private JTabbedPane jtp = new JTabbedPane();
    DefaultListModel ModeloListaHorario = new DefaultListModel();

    public AppConfig() {

        setTitle("Gerir Horário");
        addPaineis();
        addTabs();
        EditCelulaHorario();

        

        calculoCarga();
        listarHorarios();
        listarDados();
        setProperties(600, 500, 1, true);

    }

    private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }

    /**
     * This method adds tabs to the TabbedPane, it is called on the constructor.
     *
     */
    private void addTabs() {

        getContentPane().add(jtp);

        // Tabs
        jtp.addTab("Gerir Horarios", gerirHorarios);
        jtp.addTab("Listar Horaios", listarHorarios);
        jtp.addTab("Listar Dados", listarDados);
        jtp.addTab("Calculo", calculo);
        jtp.addTab("Sala Livre", salaLivre);
        jtp.setBackground(new Color(61, 71, 78));
        jtp.setForeground(Color.WHITE);
    }

    private void addPaineis() {

        // Panels
        gerirHorarios = new Painel(img.background2);
        listarHorarios = new Painel(img.background2);
        listarDados = new Painel(img.background2);
        calculo = new Painel(img.background2);
        salaLivre = new Painel(img.background2);

        gerirHorarios.setOpaque(false);
        listarHorarios.setOpaque(false);
        listarDados.setOpaque(false);
        calculo.setOpaque(false);
        salaLivre.setOpaque(false);

    }

    private void configButtons(Botao[] botoes) {
        final Border emptyBorder = BorderFactory.createEmptyBorder();
        for (Botao bt : botoes) {
            bt.setContentAreaFilled(false);
            bt.setBorderPainted(false);
            bt.setBorder(emptyBorder);
        }
    }

    private void listarDados() {

        // Panels
        Painel main_panel = new Painel(img.background2);
        JPanel buttons_panel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Layout
        listarDados.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Labels
        JLabel lbl_add = new JLabel("     Listar Dados:");

        // Buttons
        Botao listarProf = new Botao(img.professor, img.professorO);
        Botao listarAluno = new Botao(img.aluno, img.alunoO);
        Botao listarDisc = new Botao(img.disciplina, img.disciplinaO);
        Botao listarTurma = new Botao(img.turma, img.turmaO);
        Botao listarSala = new Botao(img.sala, img.salaO);
        Botao[] botoes = {listarProf, listarAluno, listarDisc, listarTurma, listarSala};

        // Customize

        // Font
        lbl_add.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lbl_add.setForeground(Color.white);

        // Borders
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Buttons
        configButtons(botoes);




        // Adding to panels
        buttons_panel.add(listarProf);
        buttons_panel.add(listarAluno);
        buttons_panel.add(listarDisc);
        buttons_panel.add(listarTurma);
        buttons_panel.add(listarSala);

        main_panel.add(lbl_add, BorderLayout.NORTH);
        main_panel.add(buttons_panel, BorderLayout.SOUTH);

        listarDados.add(main_panel);


    }

    private void EditCelulaHorario() {

        final Main m = new Main();
        Turma t = new Turma();
        Disciplina d = new Disciplina();
        Professor p = new Professor();
        SalaAula s = new SalaAula();
        Component c = null;


        // Panels
        Painel main_panel = new Painel(img.background2);
        JPanel buttons_panel = new JPanel(new GridLayout(1, 3, 5, 5));
        JPanel formulario_panel = new JPanel(new GridLayout(4, 6, 10, 10));
        buttons_panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Layout
        main_panel.setLayout(new BorderLayout());
        gerirHorarios.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));

        // Labels
        JLabel lb = new JLabel("Edição da celula de Horário:");

        //List
        String[] v = new String[m.horarios.size()];

        // v[0] = "Turma" + ", Disciplina" + ", Tipo Aula" + ", Dia da semana" + ", Hora de inicio" + ", Duração" + ", Professor" + ", Sala" + "\n";
        ModeloListaHorario.addElement("Turma" + ", Disciplina" + ", Tipo Aula" + ", Dia da semana" + ", Hora de inicio" + ", Duração" + ", Professor" + ", Sala" + "\n");
        for (int i = 0; i < m.horarios.size(); i++) {
            v[i] = m.horarios.get(i).toStringLista();
            ModeloListaHorario.addElement(m.horarios.get(i).toStringLista());
        }
        final JList l = new JList(ModeloListaHorario);
        l.setValueIsAdjusting(true);


        //Formulario
        JLabel la0 = new JLabel("Turma");
        String[] v0 = new String[m.turmas.size()];
        for (int i = 0; i < m.turmas.size(); i++) {
            v0[i] = m.turmas.get(i).toStringSigla();
        }
        final JComboBox te0 = new JComboBox(v0);


        JLabel la1 = new JLabel("Disciplina");
        String[] v1 = new String[m.disciplinas.size()];
        for (int i = 0; i < m.disciplinas.size(); i++) {
            v1[i] = m.disciplinas.get(i).toStringSigla();
        }
        final JComboBox te1 = new JComboBox(v1);


        JLabel la2 = new JLabel("Tipo Aula");
        String[] v2 = new String[2];
        v2[0] = "t";
        v2[1] = "p";
        final JComboBox te2 = new JComboBox(v2);


        JLabel la3 = new JLabel("Dia da Semana");
        String[] v3 = new String[5];
        for (int i = 0; i < 5; i++) {
            v3[i] = "" + (2 + i);
        }
        final JComboBox te3 = new JComboBox(v3);


        JLabel la4 = new JLabel("Hora de Inicio");
        String[] v4 = new String[8];
        for (int i = 0; i < 8; i++) {
            v4[i] = "" + (8 + i);
        }
        final JComboBox te4 = new JComboBox(v4);


        JLabel la5 = new JLabel("Professor");
        String[] v5 = new String[m.professores.size()];
        for (int i = 0; i < m.professores.size(); i++) {
            v5[i] = m.professores.get(i).toString();
        }
        final JComboBox te5 = new JComboBox(v5);


        JLabel la6 = new JLabel("Sala");
        String[] v6 = new String[m.salas.size()];
        for (int i = 0; i < m.salas.size(); i++) {
            v6[i] = m.salas.get(i).toStringSigla();
        }

        final JComboBox te6 = new JComboBox(v6);


        // Buttons
        Botao add = new Botao(img.add, img.addO);
        Botao edit = new Botao(img.editar, img.editarO);
        Botao remove = new Botao(img.remover, img.removerO);

        Botao[] botoes = {add, edit, remove};

        // Customize

        // Borders
        main_panel.setBorder(new EmptyBorder(20, 20, 5, 20));
        buttons_panel.setBorder(new EmptyBorder(5, 20, 20, 20));


        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Font
        lb.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lb.setForeground(Color.white);

        // Buttons
        configButtons(botoes);

        //Mouse Listener
        l.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList) evt.getSource();
                String Tipo = "";
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint());
//                    m.horarios.get(index-1);
//                    te0.getWidth();
                    if (index > 0) {
                        te0.setSelectedItem(m.horarios.get(index - 1).getDesignacao());
                        te1.setSelectedItem(m.horarios.get(index - 1).getSigla_disciplina());
                        if (m.horarios.get(index - 1).getAulas() == 1) {
                            Tipo = "t";
                        } else if (m.horarios.get(index - 1).getAulas() == 2) {
                            Tipo = "p";
                        }
                        te2.setSelectedItem(Tipo);
                        te3.setSelectedItem(m.horarios.get(index - 1).getDia_semana() + "");
                        te4.setSelectedItem(m.horarios.get(index - 1).getHora_inicio() + "");
                        te5.setSelectedItem(" " + m.horarios.get(index - 1).getSigla_professor());
                        te6.setSelectedItem(m.horarios.get(index - 1).getCodigo_sala());

                    }
                }
            }
        });
//		 ActionListeners
// adicionar a celula
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int duracao = 0;
                if (te2.getSelectedIndex() == 0) {
                    duracao = 1;
                } else if (te2.getSelectedIndex() == 1) {
                    duracao = 2;
                }
                if (duracao == 1 || duracao == 2) {
                    Horario H = new Horario(m.turmas.get(te0.getSelectedIndex()), m.disciplinas.get(te1.getSelectedIndex()), te2.getSelectedIndex() + 1, te3.getSelectedIndex() + 2, te4.getSelectedIndex() + 8, duracao, m.professores.get(te5.getSelectedIndex()), m.salas.get(te6.getSelectedIndex()));
                    H.addHorario(m.horarios, m.salas, m.disciplinas);
//                    dispose();
//                    menu.repaint();
                    ModeloListaHorario.addElement(H.toStringLista());

                }

            }
        });

// editar celula
        edit.addActionListener(new ActionListener() {
            @SuppressWarnings("unused")
            public void actionPerformed(ActionEvent e) {
                int duracao = 0, val = 0;
                if (te2.getSelectedIndex() == 0) {
                    duracao = 1;
                } else if (te2.getSelectedIndex() == 1) {
                    duracao = 2;
                }
                if (duracao == 1 || duracao == 2) {
                    Horario H = new Horario(m.turmas.get(te0.getSelectedIndex()), m.disciplinas.get(te1.getSelectedIndex()), te2.getSelectedIndex() + 1, te3.getSelectedIndex() + 2, te4.getSelectedIndex() + 8, duracao, m.professores.get(te5.getSelectedIndex()), m.salas.get(te6.getSelectedIndex()));
                    val = m.horarios.get(l.getSelectedIndex() - 1).alterarHorario(H, m.horarios, m.salas, m.disciplinas);
                    if (val == 1) {
                        ModeloListaHorario.set(l.getSelectedIndex(), H.toStringLista());
                    }
                }


            }
        });

        // remover celula
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                m.horarios.get(l.getSelectedIndex() - 1).apagarHorario(m.horarios);
                ModeloListaHorario.removeElementAt(l.getSelectedIndex());
            }
        });

        // Adding to panels

        buttons_panel.add(add);
        buttons_panel.add(edit);
        buttons_panel.add(remove);
        formulario_panel.add(la0);
        formulario_panel.add(te0);
        formulario_panel.add(la1);
        formulario_panel.add(te1);
        formulario_panel.add(la2);
        formulario_panel.add(te2);
        formulario_panel.add(la3);
        formulario_panel.add(te3);
        formulario_panel.add(la4);
        formulario_panel.add(te4);
        formulario_panel.add(la5);
        formulario_panel.add(te5);
        formulario_panel.add(la6);
        formulario_panel.add(te6);

        main_panel.add(lb, BorderLayout.NORTH);
        main_panel.add(new JScrollPane(l, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS), BorderLayout.CENTER);
        //main_panel.add(buttons_panel, BorderLayout.SOUTH);
        main_panel.add(formulario_panel, BorderLayout.SOUTH);

        gerirHorarios.add(main_panel, BorderLayout.NORTH);
        gerirHorarios.add(buttons_panel, BorderLayout.SOUTH);

    }

    private void calculoCarga() {

        // Panels
        Painel main_panel = new Painel(img.background2);
        JPanel buttons_panel = new JPanel(new GridLayout(6, 2, 10, 10));


        // Layout
        calculo.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Labels
        JLabel lbl_add = new JLabel("     Calcular Carga Horaria:");

        // Buttons
        Botao cargaProf = new Botao(img.professor, img.professorO);
        Botao cargaAluno = new Botao(img.aluno, img.alunoO);
        Botao cargaDisc = new Botao(img.disciplina, img.disciplinaO);
        Botao cargaTurma = new Botao(img.turma, img.turmaO);
        Botao cargaSala = new Botao(img.sala, img.salaO);
        Botao[] botoes = {cargaProf, cargaAluno, cargaDisc, cargaTurma, cargaSala};

        // Customize

        // Font
        lbl_add.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lbl_add.setForeground(Color.white);

        // Borders
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Buttons
        configButtons(botoes);
        
        cargaProf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CargaHoraria carga = new CargaHoraria();
               
            }
        });
        
       cargaAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
               
            }
        });
       
       cargaDisc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
               
            }
        });
       
       cargaTurma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
               
            }
        });
       
       cargaSala.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        




        // Adding to panels
        buttons_panel.add(cargaProf);
        buttons_panel.add(cargaAluno);
        buttons_panel.add(cargaDisc);
        buttons_panel.add(cargaTurma);
        buttons_panel.add(cargaSala);

        main_panel.add(lbl_add, BorderLayout.NORTH);
        main_panel.add(buttons_panel, BorderLayout.SOUTH);

        calculo.add(main_panel);


    }

    private void listarHorarios() {
        // Panels
        Painel main_panel = new Painel(img.background2);
        JPanel buttons_panel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Layout
        listarHorarios.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Labels
        JLabel lbl_add = new JLabel("     Listar Horarios:");

        // Buttons
        Botao listarProf = new Botao(img.professor, img.professorO);
        Botao listarAluno = new Botao(img.aluno, img.alunoO);
        Botao listarDisc = new Botao(img.disciplina, img.disciplinaO);
        Botao listarTurma = new Botao(img.turma, img.turmaO);
        Botao listarSala = new Botao(img.sala, img.salaO);
        Botao[] botoes = {listarProf, listarAluno, listarDisc, listarTurma, listarSala};

        // Customize

        // Font
        lbl_add.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lbl_add.setForeground(Color.white);

        // Borders
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Buttons
        configButtons(botoes);
        // ActionListeners


        listarProf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Listar a = new Listar();
               
            }
        });


        listarAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				if (a != null) {
//					a.setVisible(false);
//					a = null;
//				}
//				a = new AddDados(null, null, null);
//				a.setSelectedIndex(1);
            }
        });


        listarDisc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				if (a != null) {
//					a.setVisible(false);
//					a = null;
//				}
//				a = new AddDados(null, null, null);
//				a.setSelectedIndex(2);
            }
        });

        // Adding to panels
        buttons_panel.add(listarProf);
        buttons_panel.add(listarAluno);
        buttons_panel.add(listarDisc);
        buttons_panel.add(listarTurma);
        buttons_panel.add(listarSala);

        main_panel.add(lbl_add, BorderLayout.NORTH);
        main_panel.add(buttons_panel, BorderLayout.SOUTH);

        listarHorarios.add(main_panel);


    }

    private void addEdits() {

        /*
         * // Panels Painel main_panel = new Painel(img.bg4); JPanel
         * buttons_panel = new JPanel(new GridLayout(3, 2, 10, 10));
         *
         * // Layout listarDados.setLayout(new FlowLayout(FlowLayout.CENTER, 0,
         * 70)); main_panel.setLayout(new BorderLayout());
         *
         * // Labels JLabel lbl_edit = new JLabel(" Edit:");
         *
         * // Buttons Botao editCo = new Botao(img.editCo, img.editCo_o); Botao
         * editDis = new Botao(img.editDis, img.editDis_o); Botao editSpo = new
         * Botao(img.editSpo, img.editSpo_o); Botao[] botoes = {editCo, editDis,
         * editSpo};
         *
         * // Customize
         *
         * // Font lbl_edit.setFont((new Font("Arial", Font.BOLD, 14)));
         *
         * // Color lbl_edit.setForeground(Color.white);
         *
         * // Border main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
         * buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20)); // Opaque
         * main_panel.setOpaque(false); buttons_panel.setOpaque(false);
         *
         * // Buttons configButtons(botoes);
         *
         * // ActionListener // Edit country editCo.addActionListener(new
         * ActionListener() {
         *
         * public void actionPerformed(ActionEvent e) { //	Pais pais = (Pais)
         * JOptionPane.showInputDialog(AppConfig.this, "Choose the country you
         * want to edit", "Edit Country", JOptionPane.QUESTION_MESSAGE, null,
         * Main.getPaises().toArray(), Main.getPaises().toArray()[0]); //	if
         * (pais != null) { //	if (a != null) { //	a.setVisible(false); //	a =
         * null; //	} // //	a = new AddDados(pais, null, null); //
         * a.setCountry(pais); //	a.setSelectedIndex(0); //	} } });
         *
         * // Edit competition editDis.addActionListener(new ActionListener() {
         *
         * public void actionPerformed(ActionEvent e) { //	Disciplina dis =
         * (Disciplina) JOptionPane.showInputDialog(AppConfig.this, "Choose the
         * competition you want to edit", "Edit Competition",
         * JOptionPane.QUESTION_MESSAGE, null, Main.getDisciplinas().toArray(),
         * Main.getDisciplinas().toArray()[0]); //	if (dis != null) { //	if (a
         * != null) { //	a.setVisible(false); //	a = null; //	} //	a = new
         * AddDados(null, dis, null); //	a.setCompetition(dis); //
         * a.setSelectedIndex(1); //	} } });
         *
         * // Edit sport editSpo.addActionListener(new ActionListener() {
         *
         * public void actionPerformed(ActionEvent e) { //	Modalidade mod =
         * (Modalidade) JOptionPane.showInputDialog(AppConfig.this, "Choose the
         * sport you want to edit", "Edit Sport", JOptionPane.QUESTION_MESSAGE,
         * null, Main.getModalidades().toArray(),
         * Main.getModalidades().toArray()[0]); //	if (mod != null) { //	if (a
         * != null) { //	a.setVisible(false); //	a = null; //	} //	a = new
         * AddDados(null, null, mod); //	a.setSport(mod); //
         * a.setSelectedIndex(2); //	} } });
         *
         * // Adding to panels buttons_panel.add(editCo);
         * buttons_panel.add(editDis); buttons_panel.add(editSpo);
         *
         * main_panel.add(lbl_edit, BorderLayout.NORTH);
         * main_panel.add(buttons_panel, BorderLayout.SOUTH);
         *
         * listarDados.add(main_panel);
         *
         */
    }
}
