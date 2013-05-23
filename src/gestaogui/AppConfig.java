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
        //EditCelulaHorario();
        //addExports();
        //listarHorarios();
       // addEdits();
        //addList();
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

  
    private void addList() {
/*
        // Panels
        final Painel main_panel = new Painel(img.bg4);
        final JPanel buttons_panel = new JPanel(new GridLayout(5, 2, 10, 10));

        // Layout
        calculo.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Buttons
        final Botao compAnalysis = new Botao(img.ca, img.ca_o);
        final Botao rankP = new Botao(img.rn, img.rn_o);
        final Botao rankA = new Botao(img.ra, img.ra_o);
        final Botao rankC = new Botao(img.rc, img.rc_o);
        final Botao rankS = new Botao(img.rs, img.rs_o);
        final Botao[] botoes = {compAnalysis, rankP, rankA, rankC, rankS};

        // Labels
        final JLabel lb = new JLabel("     Statistics and Listings:");

        // Border
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Customization

        // Color
        lb.setForeground(Color.white);

        // Font
        lb.setFont((new Font("Arial", Font.BOLD, 14)));

        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Buttons
        configButtons(botoes);
 

        // Adding to panels
        buttons_panel.add(compAnalysis);
        buttons_panel.add(rankP);
        buttons_panel.add(rankA);
        buttons_panel.add(rankC);
        buttons_panel.add(rankS);

        main_panel.add(lb, BorderLayout.NORTH);
        main_panel.add(buttons_panel, BorderLayout.SOUTH);

        calculo.add(main_panel);
*/
    }

   
    private void EditCelulaHorario() {
      /*  final Main m = new Main();
        Turma t = new Turma();
        Disciplina d = new Disciplina();
        Professor p = new Professor();
        SalaAula s = new SalaAula();
        Component c = null;
        // Panels
        Painel main_panel = new Painel(img.bg4);
        JPanel buttons_panel = new JPanel(new GridLayout(1, 3, 5, 5));
        JPanel formulario_panel = new JPanel(new GridLayout(4, 6, 10, 10));
        buttons_panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Layout
        main_panel.setLayout(new BorderLayout());
        gerirHorarios.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));

        // Labels
        JLabel lb = new JLabel("Edição da celula de Horário:");

        //List
      //  String[] v = new String[m.h.size() + 1];
        //v[0] = "Turma" + ", Disciplina" + ", Tipo Aula" + ", Dia da semana" + ", Hora de inicio" + ", Duração" + ", Professor" + ", Sala" + "\n";
        ModeloListaHorario.addElement("Turma" + ", Disciplina" + ", Tipo Aula" + ", Dia da semana" + ", Hora de inicio" + ", Duração" + ", Professor" + ", Sala" + "\n");
        for (int i = 0; i < m.h.size(); i++) {
            v[i + 1] = m.h.get(i).toStringLista();
            ModeloListaHorario.addElement(m.h.get(i).toStringLista());
        }
        final JList l = new JList(ModeloListaHorario);
        l.setValueIsAdjusting(true);

        //Formulario
        JLabel la0 = new JLabel("Turma");
        String[] v0 = new String[m.t.size()];
        for (int i = 0; i < m.t.size(); i++) {
            v0[i] = m.t.get(i).toStringSigla();
        }
        final JComboBox te0 = new JComboBox(v0);
//        final JTextField te0 = new JTextField();

        JLabel la1 = new JLabel("Disciplina");
        String[] v1 = new String[m.d.size()];
        for (int i = 0; i < m.d.size(); i++) {
            v1[i] = m.d.get(i).toStringSigla();
        }
        final JComboBox te1 = new JComboBox(v1);
//        final JTextField te1 = new JTextField();

        JLabel la2 = new JLabel("Tipo Aula");
        String[] v2 = new String[2];
        v2[0] = "t";
        v2[1] = "p";
        final JComboBox te2 = new JComboBox(v2);
//        final JTextField te2 = new JTextField();

        JLabel la3 = new JLabel("Dia da Semana");
        String[] v3 = new String[5];
        for (int i = 0; i < 5; i++) {
            v3[i] = "" + (2 + i);
        }
        final JComboBox te3 = new JComboBox(v3);
//        final JTextField te3 = new JTextField();

        JLabel la4 = new JLabel("Hora de Inicio");
        String[] v4 = new String[8];
        for (int i = 0; i < 8; i++) {
            v4[i] = "" + (8 + i);
        }
        final JComboBox te4 = new JComboBox(v4);
//        final JTextField te4 = new JTextField();

        JLabel la5 = new JLabel("Professor");
        String[] v5 = new String[m.p.size()];
        for (int i = 0; i < m.p.size(); i++) {
            v5[i] = m.p.get(i).toString();
        }
        final JComboBox te5 = new JComboBox(v5);
//        final JTextField te5 = new JTextField();

        JLabel la6 = new JLabel("Sala");
        String[] v6 = new String[m.s.size()];
        for (int i = 0; i < m.s.size(); i++) {
            v6[i] = m.s.get(i).toStringSigla();
        }
        final JComboBox te6 = new JComboBox(v6);
//        final JTextField te6 = new JTextField();

        // Buttons
        Botao add = new Botao(img.add1, img.add1_o);
        Botao edit = new Botao(img.remove1, img.remove1_o);
        Botao remove = new Botao(img.remove1, img.remove1_o);
//		Botao impDisc = new Botao(img.add1, img.add1_o);
//		Botao impResu = new Botao(img.add1, img.add1_o);
//		Botao impEv = new Botao(img.add1, img.add1_o);
        Botao[] botoes = {add, edit, remove};

        // Customize

        // Borders
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Font
        lb.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lb.setForeground(Color.white);

        // Buttons
        configButtons(botoes);

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
                    Horario H = new Horario(m.t.get(te0.getSelectedIndex()), m.d.get(te1.getSelectedIndex()), te2.getSelectedIndex() + 1, te3.getSelectedIndex() + 2, te4.getSelectedIndex() + 8, duracao, m.p.get(te5.getSelectedIndex()), m.s.get(te6.getSelectedIndex()));
                    H.addHorario(m.h, m.s, m.d);
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
                    Horario H = new Horario(m.t.get(te0.getSelectedIndex()), m.d.get(te1.getSelectedIndex()), te2.getSelectedIndex() + 1, te3.getSelectedIndex() + 2, te4.getSelectedIndex() + 8, duracao, m.p.get(te5.getSelectedIndex()), m.s.get(te6.getSelectedIndex()));
                    val = m.h.get(l.getSelectedIndex() - 1).alterarHorario(H, m.h, m.s, m.d);
                    if (val == 1) {
                        ModeloListaHorario.set(l.getSelectedIndex(), H.toStringLista());
                    }
                }


            }
        });

        // remover celula
        remove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                m.h.get(l.getSelectedIndex() - 1).apagarHorario(m.h);
                ModeloListaHorario.removeElementAt(l.getSelectedIndex());
            }
        });

        // Disciplines
//        impDisc.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
////				csv.importDisc(null, AppConfig.this, Main.getDisciplinas(), Main.getModalidades());
//            }
//        });

        // Results
//        impResu.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
////				csv.importResultados(null, AppConfig.this, Main.getAtleta(), Main.getModalidades(), Main.getPaises(), Main.getProvas(), Main.getEquipas(), Main.getJogos());
//            }
//        });

        // Events

//        impEv.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
////				csv.importProvas(null, AppConfig.this, Main.getJogos(), Main.getProvas(), Main.getDisciplinas(), Main.getModalidades());
//            }
//        });
        // Adding to panels
//        add.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttons_panel.add(add);
//        edit.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttons_panel.add(edit);
//        remove.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttons_panel.add(remove);
//        buttons_panel.add(impDisc);
//        buttons_panel.add(impEv);
//        buttons_panel.add(impResu);
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
//        main_panel.add(buttons_panel, BorderLayout.SOUTH);
        main_panel.add(formulario_panel, BorderLayout.SOUTH);

        gerirHorarios.add(main_panel, BorderLayout.NORTH);
        gerirHorarios.add(buttons_panel, BorderLayout.SOUTH);
*/
    }

   
    private void addExports() {
/*
        // Panels
        Painel main_panel = new Painel(img.bg4);
        JPanel buttons_panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Layouts
        salaLivre.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Labels
        JLabel lb = new JLabel("     Export:");

        // Buttons
        Botao expC= new Botao(img.expCountry, img.expCountry_o);
        Botao expDisc = new Botao(img.expDisc, img.expDisc_o);
        Botao expResu = new Botao(img.expResu, img.expResu_o);
        Botao expPro = new Botao(img.expEv, img.expEv_o);
        Botao[] botoes = {expC, expDisc, expResu, expPro};

        // Customize

        // Font
        lb.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lb.setForeground(Color.white);

        // Border
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Buttons
        configButtons(botoes);

        // ActionListeners
        // Countries
        expC.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				csv.exportPais(AppConfig.this, Main.getPaises());
            }
        });

        // Competitions
        expDisc.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				csv.exportDisciplina(AppConfig.this, Main.getModalidades());
            }
        });

        // Results
        expResu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String[] genero = {"Male", "Female", "Mixed"};
//				Modalidade mod = (Modalidade) JOptionPane.showInputDialog(AppConfig.this, "Choose a sport?", "Export Results", JOptionPane.QUESTION_MESSAGE, null, Main.getModalidades().toArray(), Main.getModalidades().toArray()[0]);
//				if (mod != null) {
//					JogosOlimpicos edition = (JogosOlimpicos) JOptionPane.showInputDialog(AppConfig.this, "Which year?", "Export Events", JOptionPane.QUESTION_MESSAGE, null, Main.getJogos().toArray(), Main.getJogos().toArray()[0]);
//					if (edition != null) {
//						String genre = (String) JOptionPane.showInputDialog(AppConfig.this, "Which genre?", "Export Events?", JOptionPane.QUESTION_MESSAGE, null, genero, genero[0]);
//						if (genre != null) {
//							int ano = edition.getAno();
//							int tipo = -1;
//							if (genre.equals("Male")) {
//								tipo = 0;
//							} else if (genre.equals("Female")) {
//								tipo = 1;
//							} else if (genre.equals("Mixed")) {
//								tipo = 2;
//							}
//							if (tipo != -1 || mod != null || edition != null || genre != null)
//								csv.exportResultados(AppConfig.this, Main.getModalidades(), Main.getProvas(), mod.getNome(), tipo, ano);
//						}
//					}
//				}
            }
        });

        // Events
        expPro.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				JogosOlimpicos edition = (JogosOlimpicos) JOptionPane.showInputDialog(AppConfig.this, "Which year", "Export Events", JOptionPane.QUESTION_MESSAGE, null, Main.getJogos().toArray(), Main.getJogos().toArray()[0]);
//				if (edition != null) {
//					int ano = edition.getAno();
//					csv.exportProvas(AppConfig.this, Main.getProvas(), ano);
//				}
            }
        });

        // Adding to panels
        buttons_panel.add(expC);
        buttons_panel.add(expDisc);
        buttons_panel.add(expResu);
        buttons_panel.add(expPro);

        main_panel.add(lb, BorderLayout.NORTH);
        main_panel.add(buttons_panel, BorderLayout.SOUTH);

        salaLivre.add(main_panel);
        * */
    }

    
    private void listarHorarios() {
/*
        // Panels
        Painel main_panel = new Painel(img.bg4);
        JPanel buttons_panel = new JPanel(new GridLayout(6, 2, 10, 10));

        // Layout
        listarHorarios.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Labels
        JLabel lbl_add = new JLabel("     Listar Horarios:");

        // Buttons
        Botao listarProf = new Botao(img.addCo, img.addCo_o);
        Botao listarAluno = new Botao(img.btn_horariosAluno, img.btn_horariosAlunoO);
        Botao listarDisc = new Botao(img.addSpo, img.addSpo_o);
        Botao listarTurma = new Botao(img.addSpo, img.addSpo_o);
        Botao listarSala = new Botao(img.addSpo, img.addSpo_o);
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

        // Add country
        listarProf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				if (a != null) {
//					a.setVisible(false);
//					a = null;
//				}
//				a = new AddDados(null, null, null);
//				a.setSelectedIndex(0);
            }
        });

        // Add Competition
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

        // Add Sport
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
*/
    }

   
    private void addEdits() {

        /*
        // Panels
        Painel main_panel = new Painel(img.bg4);
        JPanel buttons_panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Layout
        listarDados.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 70));
        main_panel.setLayout(new BorderLayout());

        // Labels
        JLabel lbl_edit = new JLabel("     Edit:");

        // Buttons
        Botao editCo = new Botao(img.editCo, img.editCo_o);
        Botao editDis = new Botao(img.editDis, img.editDis_o);
        Botao editSpo = new Botao(img.editSpo, img.editSpo_o);
        Botao[] botoes = {editCo, editDis, editSpo};

        // Customize

        // Font
        lbl_edit.setFont((new Font("Arial", Font.BOLD, 14)));

        // Color
        lbl_edit.setForeground(Color.white);

        // Border
        main_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        // Opaque
        main_panel.setOpaque(false);
        buttons_panel.setOpaque(false);

        // Buttons
        configButtons(botoes);

        // ActionListener
        // Edit country
        editCo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				Pais pais = (Pais) JOptionPane.showInputDialog(AppConfig.this, "Choose the country you want to edit", "Edit Country", JOptionPane.QUESTION_MESSAGE, null, Main.getPaises().toArray(), Main.getPaises().toArray()[0]);
//				if (pais != null) {
//					if (a != null) {
//						a.setVisible(false);
//						a = null;
//					}
//
//					a = new AddDados(pais, null, null);
//					a.setCountry(pais);
//					a.setSelectedIndex(0);
//				}
            }
        });

        // Edit competition
        editDis.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				Disciplina dis = (Disciplina) JOptionPane.showInputDialog(AppConfig.this, "Choose the competition you want to edit", "Edit Competition", JOptionPane.QUESTION_MESSAGE, null, Main.getDisciplinas().toArray(), Main.getDisciplinas().toArray()[0]);
//				if (dis != null) {
//					if (a != null) {
//						a.setVisible(false);
//						a = null;
//					}
//					a = new AddDados(null, dis, null);
//					a.setCompetition(dis);
//					a.setSelectedIndex(1);
//				}
            }
        });

        // Edit sport
        editSpo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				Modalidade mod = (Modalidade) JOptionPane.showInputDialog(AppConfig.this, "Choose the sport you want to edit", "Edit Sport", JOptionPane.QUESTION_MESSAGE, null, Main.getModalidades().toArray(), Main.getModalidades().toArray()[0]);
//				if (mod != null) {
//					if (a != null) {
//						a.setVisible(false);
//						a = null;
//					}
//					a = new AddDados(null, null, mod);
//					a.setSport(mod);
//					a.setSelectedIndex(2);
//				}
            }
        });

        // Adding to panels
        buttons_panel.add(editCo);
        buttons_panel.add(editDis);
        buttons_panel.add(editSpo);

        main_panel.add(lbl_edit, BorderLayout.NORTH);
        main_panel.add(buttons_panel, BorderLayout.SOUTH);

        listarDados.add(main_panel);
        * */
    }
}
