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

/**
 *
 * @author axppp
 */
public class Listar extends JFrame {

    final JLabel[][] labels = new JLabel[26][11];
    private Imagens img = new Imagens();
    private AppConfig appconfig;
    //Painel panel = new Painel();
    Painel panelbtn = new Painel(img.background2);
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    final Border borderO = BorderFactory.createLineBorder(Color.RED.darker());
    final Border borderG = BorderFactory.createLineBorder(Color.GRAY);

    public Listar(String tipo) {
        super("Listagem");

        panelbtn.setLayout(new GridLayout(26, 11, 0, 0));
        panelbtn.setOpaque(false);

        declaracao();
        metodoPriLinha();
        metodoHoras(2, 0, 0);
        metodoMeiaHoras(3, 0, 0);
        metodoHoras(4, 0, 1);
        metodoMeiaHoras(5, 0, 1);
        metodoHoras(6, 0, 2);
        metodoMeiaHoras(7, 0, 2);
        metodoHoras(8, 0, 3);
        metodoMeiaHoras(9, 0, 3);
        metodoHoras(10, 0, 4);
        metodoMeiaHoras(11, 0, 4);
        metodoHoras(12, 0, 5);
        metodoMeiaHoras(13, 0, 5);
        metodoHoras(14, 0, 6);
        metodoMeiaHoras(15, 0, 6);
        metodoHoras(16, 0, 7);
        metodoMeiaHoras(17, 0, 7);
        metodoHoras(18, 0, 8);
        metodoMeiaHoras(19, 0, 8);
        metodoHoras(20, 0, 9);
        metodoMeiaHoras(21, 0, 9);
        metodoHoras(22, 0, 10);
        metodoLinhaBranca(23);
        labelsAulas(24);
        metodoAddPainel();
        if(tipo.equalsIgnoreCase("professor"))
        {
        listagemProf();
        }else if(tipo.equalsIgnoreCase("aluno"))
        {
            listagemAlunos();
        }else if(tipo.equalsIgnoreCase("turma"))
        {
            listagemTurma();
        }else if(tipo.equalsIgnoreCase("disciplina"))
        {
            listagemDisc();
        }else if(tipo.equalsIgnoreCase("sala"))
        {
            listagemSala();
        }
        

        //HorarioVazio();
        setProperties(850, 400, 1, true);
    }

    private void metodoLinhaBranca(int indice) {
        for (int i = 0; i < 11; i++) {
            labels[indice][i].setText("");
        }
    }

    private void metodoPriLinha() {
        labels[0][0] = new JLabel("Horario");
        labels[0][0].setFont(new Font("Arial", Font.BOLD, 12));
        labels[0][0].setForeground(Color.white);

        labels[1][0] = new JLabel("");
        labels[1][0].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][0].setForeground(Color.white);
        labels[1][1] = new JLabel("Segunda-", JLabel.RIGHT);
        labels[1][1].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][1].setForeground(Color.white);
        labels[1][2] = new JLabel("Feira");
        labels[1][2].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][2].setForeground(Color.white);
        labels[1][3] = new JLabel("Terça-", JLabel.RIGHT);
        labels[1][3].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][3].setForeground(Color.white);
        labels[1][4] = new JLabel("Feira");
        labels[1][4].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][4].setForeground(Color.white);
        labels[1][5] = new JLabel("Quarta-", JLabel.RIGHT);
        labels[1][5].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][5].setForeground(Color.white);
        labels[1][6] = new JLabel("Feira");
        labels[1][6].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][6].setForeground(Color.white);
        labels[1][7] = new JLabel("Quinta-", JLabel.RIGHT);
        labels[1][7].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][7].setForeground(Color.white);
        labels[1][8] = new JLabel("Feira");
        labels[1][8].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][8].setForeground(Color.white);
        labels[1][9] = new JLabel("Sexta-", JLabel.RIGHT);
        labels[1][9].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][9].setForeground(Color.white);
        labels[1][10] = new JLabel("Feira");
        labels[1][10].setFont(new Font("Arial", Font.BOLD, 10));
        labels[1][10].setForeground(Color.white);


    }

    private void declaracao() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 11; j++) {
                labels[i][j] = new JLabel("");
            }

        }
    }

    private void metodoMeiaHoras(int linha, int coluna, int indice) {
        int hora = indice + 8;
        labels[linha][coluna] = new JLabel(hora + ":30");
        labels[linha][coluna].setBorder(border);
        labels[linha][coluna].setForeground(Color.white);
        for (int k = 1; k < 11; k++) {
            labels[linha][k].setText("");
            labels[linha][k].setFont(new Font("Arial", Font.BOLD, 10));
            labels[linha][k].setForeground(Color.white);
            labels[linha][k].setBorder(border);
            labels[linha][k].setHorizontalAlignment(JLabel.CENTER);

        }
    }

    private void metodoHoras(int linha, int coluna, int indice) {
        int hora = indice + 8;
        labels[linha][coluna] = new JLabel(hora + ":00");
        labels[linha][coluna].setBorder(border);
        labels[linha][coluna].setForeground(Color.white);
        for (int k = 1; k < 11; k++) {
            labels[linha][k].setText("");
            labels[linha][k].setFont(new Font("Arial", Font.BOLD, 10));
            labels[linha][k].setForeground(Color.white);
            labels[linha][k].setBorder(border);
            labels[linha][k].setHorizontalAlignment(JLabel.CENTER);

        }
    }

    private void metodoAddPainel() {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 11; j++) {
                panelbtn.add(labels[i][j], BorderLayout.NORTH);
            }
        }
        add(panelbtn, BorderLayout.CENTER);
    }

    private void labelsAulas(int linha) {
        labels[linha][5].setText("Teoricas");
        labels[linha][5].setBackground(new Color(156, 102, 31));
        labels[linha][5].setHorizontalAlignment(JLabel.CENTER);
        labels[linha][5].setOpaque(true);
        labels[linha][7].setText("Praticas");
        labels[linha][7].setBackground(new Color(88, 97, 102));
        labels[linha][7].setHorizontalAlignment(JLabel.CENTER);
        labels[linha][7].setOpaque(true);

    }

     private void listagemTurma() {
        final Main m = new Main();

        JLabel NomeTurma = new JLabel("Turmas:", JLabel.CENTER);
        String[] v5 = new String[m.turmas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.turmas.size() + 1; i++) {
            v5[i] = m.turmas.get(i - 1).toStringSigla();
        }
        final JComboBox com = new JComboBox(v5);

        com.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> horario = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    horario = m.turmas.get(com.getSelectedIndex() - 1).listarHorarioTurma(m.horarios);
                                
                    for (int i = 0; i < horario.size(); i++) {
                        int dia_semana = horario.get(i).getDia_semana();
                        switch (dia_semana) {
                            case 2:
                                horarioSegunda(horario, dia_semana, i);
                                break;
                            case 3:
                                horarioTerca(horario, dia_semana,i);
                                break;
                            case 4:
                                horarioQuarta(horario,dia_semana, i);
                                break;
                            case 5:
                                horarioQuinta(horario, dia_semana, i);
                                break;
                            case 6:
                                horarioSexta(horario, dia_semana, i);
                                break;
                            default:
                                dispose();
                        };
                    }
                }
                else
                {
                    HorarioVazio();
                }
            }
        });

        NomeTurma.setFont(new Font("Arial", Font.BOLD, 12));
        NomeTurma.setForeground(Color.white);
        panelbtn.add(NomeTurma, BorderLayout.NORTH);
        panelbtn.add(com);
    }
    
    private void listagemDisc() {
        final Main m = new Main();

        JLabel NomeDisc = new JLabel("Disciplinas:", JLabel.CENTER);
        String[] v5 = new String[m.disciplinas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.disciplinas.size() + 1; i++) {
            v5[i] = m.disciplinas.get(i - 1).toStringSigla();
        }
        final JComboBox com = new JComboBox(v5);

        com.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> horario = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    horario = m.disciplinas.get(com.getSelectedIndex() - 1).listarHorarioDisciplina(m.disciplinas, m.horarios);
                                
                    for (int i = 0; i < horario.size(); i++) {
                        int dia_semana = horario.get(i).getDia_semana();
                        switch (dia_semana) {
                            case 2:
                                horarioSegunda(horario, dia_semana, i);
                                break;
                            case 3:
                                horarioTerca(horario, dia_semana,i);
                                break;
                            case 4:
                                horarioQuarta(horario,dia_semana, i);
                                break;
                            case 5:
                                horarioQuinta(horario, dia_semana, i);
                                break;
                            case 6:
                                horarioSexta(horario, dia_semana, i);
                                break;
                            default:
                                dispose();
                        };
                    }
                }
                else
                {
                    HorarioVazio();
                }
            }
        });

        NomeDisc.setFont(new Font("Arial", Font.BOLD, 12));
        NomeDisc.setForeground(Color.white);
        panelbtn.add(NomeDisc, BorderLayout.NORTH);
        panelbtn.add(com);
    }
    
    private void listagemAlunos() {
        final Main m = new Main();

        JLabel NomeAlunos = new JLabel("Alunos:", JLabel.CENTER);
        String[] v5 = new String[m.alunos.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.alunos.size() + 1; i++) {
            v5[i] = m.alunos.get(i - 1).toStringNumeroAluno();
        }
        final JComboBox com = new JComboBox(v5);

        com.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> horario = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    horario = m.alunos.get(com.getSelectedIndex() - 1).listarHorarioAluno(m.alunos, m.horarios);
                                
                    for (int i = 0; i < horario.size(); i++) {
                        int dia_semana = horario.get(i).getDia_semana();
                        switch (dia_semana) {
                            case 2:
                                horarioSegunda(horario, dia_semana, i);
                                break;
                            case 3:
                                horarioTerca(horario, dia_semana,i);
                                break;
                            case 4:
                                horarioQuarta(horario,dia_semana, i);
                                break;
                            case 5:
                                horarioQuinta(horario, dia_semana, i);
                                break;
                            case 6:
                                horarioSexta(horario, dia_semana, i);
                                break;
                            default:
                                dispose();
                        };
                    }
                }
                else
                {
                    HorarioVazio();
                }
            }
        });

        NomeAlunos.setFont(new Font("Arial", Font.BOLD, 12));
        NomeAlunos.setForeground(Color.white);
        panelbtn.add(NomeAlunos, BorderLayout.NORTH);
        panelbtn.add(com);
    }
    
    private void listagemSala() {
        final Main m = new Main();

        JLabel NomeSala = new JLabel("Salas:", JLabel.CENTER);
        String[] v5 = new String[m.salas.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.salas.size() + 1; i++) {
            v5[i] = m.salas.get(i - 1).toStringSigla();
        }
        final JComboBox com = new JComboBox(v5);

        com.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> horario = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    horario = m.salas.get(com.getSelectedIndex() - 1).listarHorarioSala(m.salas, m.horarios);
                                
                    for (int i = 0; i < horario.size(); i++) {
                        int dia_semana = horario.get(i).getDia_semana();
                        switch (dia_semana) {
                            case 2:
                                horarioSegunda(horario, dia_semana, i);
                                break;
                            case 3:
                                horarioTerca(horario, dia_semana,i);
                                break;
                            case 4:
                                horarioQuarta(horario,dia_semana, i);
                                break;
                            case 5:
                                horarioQuinta(horario, dia_semana, i);
                                break;
                            case 6:
                                horarioSexta(horario, dia_semana, i);
                                break;
                            default:
                                dispose();
                        };
                    }
                }
                else
                {
                    HorarioVazio();
                }
            }
        });

        NomeSala.setFont(new Font("Arial", Font.BOLD, 12));
        NomeSala.setForeground(Color.white);
        panelbtn.add(NomeSala, BorderLayout.NORTH);
        panelbtn.add(com);
    }
    
    private void listagemProf() {
        final Main m = new Main();

        JLabel NomeCom = new JLabel("Professores:", JLabel.CENTER);
        String[] v5 = new String[m.professores.size() + 1];
        v5[0] = " ";
        for (int i = 1; i < m.professores.size() + 1; i++) {
            v5[i] = m.professores.get(i - 1).toString();
        }
        final JComboBox com = new JComboBox(v5);

        com.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HorarioVazio();
                ArrayList<Horario> horario = new ArrayList<>();
                if (com.getSelectedIndex() > 0) {
                    horario = m.professores.get(com.getSelectedIndex() - 1).listarHorarioProfessor(m.professores, m.horarios);
                                
                    for (int i = 0; i < horario.size(); i++) {
                        int dia_semana = horario.get(i).getDia_semana();
                        switch (dia_semana) {
                            case 2:
                                horarioSegunda(horario, dia_semana, i);
                                break;
                            case 3:
                                horarioTerca(horario, dia_semana,i);
                                break;
                            case 4:
                                horarioQuarta(horario,dia_semana, i);
                                break;
                            case 5:
                                horarioQuinta(horario, dia_semana, i);
                                break;
                            case 6:
                                horarioSexta(horario, dia_semana, i);
                                break;
                            default:
                                dispose();
                        };
                    }
                }
                else
                {
                    HorarioVazio();
                }
            }
        });

        NomeCom.setFont(new Font("Arial", Font.BOLD, 12));
        NomeCom.setForeground(Color.white);
        panelbtn.add(NomeCom, BorderLayout.NORTH);
        panelbtn.add(com);
    }

    private void metodoAdicionarAula(ArrayList<Horario> horario, int hora_inicio, int dia_semana, int i, int tipo_aula) {
        Color tijolo = new Color(156, 102, 31);
        Color cinza = new Color(88, 97, 102);
        Color cor;
        if(tipo_aula ==1)
        {
            cor = tijolo;
        }else 
            cor = cinza;
        
        if (dia_semana == 2) {
            System.out.println(hora_inicio + " +" + dia_semana);
            labels[hora_inicio][dia_semana - 1].setText(horario.get(i).getSigla_professor());
            labels[hora_inicio][dia_semana - 1].setBackground(cor);
            labels[hora_inicio][dia_semana - 1].setOpaque(true);
            
            labels[hora_inicio][dia_semana].setText(horario.get(i).getSigla_disciplina());
            labels[hora_inicio][dia_semana].setBackground(cor);
            labels[hora_inicio][dia_semana].setOpaque(true);
            
            if(tipo_aula ==2){
                labels[hora_inicio + 3][dia_semana - 1].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+3][dia_semana -1].setBackground(cor);
            labels[hora_inicio+3][dia_semana-1].setOpaque(true);
            
            labels[hora_inicio+2][dia_semana -1].setBackground(cor);
            labels[hora_inicio+2][dia_semana-1].setOpaque(true);
            labels[hora_inicio+1][dia_semana -1].setBackground(cor);
            labels[hora_inicio+1][dia_semana-1].setOpaque(true);
            labels[hora_inicio+2][dia_semana].setBackground(cor);
            labels[hora_inicio+2][dia_semana].setOpaque(true);
            labels[hora_inicio+1][dia_semana].setBackground(cor);
            labels[hora_inicio+1][dia_semana].setOpaque(true);
            
            labels[hora_inicio + 3][dia_semana].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+3][dia_semana].setBackground(cor);
            labels[hora_inicio+3][dia_semana].setOpaque(true);
            }else if(tipo_aula ==1){
            labels[hora_inicio + 1][dia_semana - 1].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+1][dia_semana -1].setBackground(cor);
            labels[hora_inicio+1][dia_semana-1].setOpaque(true);
            
            labels[hora_inicio + 1][dia_semana].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+1][dia_semana].setBackground(cor);
            labels[hora_inicio+1][dia_semana].setOpaque(true);
            }
        } else if (dia_semana == 3) {
            labels[hora_inicio][dia_semana].setText(horario.get(i).getSigla_professor());
            labels[hora_inicio][dia_semana].setBackground(cor);
            labels[hora_inicio][dia_semana].setOpaque(true);
            
            labels[hora_inicio][dia_semana+1].setText(horario.get(i).getSigla_disciplina());
            labels[hora_inicio][dia_semana+1].setBackground(cor);
            labels[hora_inicio][dia_semana+1].setOpaque(true);
            
            if(tipo_aula==2)
            {
                labels[hora_inicio + 3][dia_semana].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+3][dia_semana].setBackground(cor);
            labels[hora_inicio+3][dia_semana].setOpaque(true);
            
            labels[hora_inicio+2][dia_semana].setBackground(cor);
            labels[hora_inicio+2][dia_semana].setOpaque(true);
            labels[hora_inicio+1][dia_semana].setBackground(cor);
            labels[hora_inicio+1][dia_semana].setOpaque(true);
            labels[hora_inicio+2][dia_semana+1].setBackground(cor);
            labels[hora_inicio+2][dia_semana+1].setOpaque(true);
            labels[hora_inicio+1][dia_semana+1].setBackground(cor);
            labels[hora_inicio+1][dia_semana+1].setOpaque(true);
            
            labels[hora_inicio + 3][dia_semana+1].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+3][dia_semana+1].setBackground(cor);
            labels[hora_inicio+3][dia_semana+1].setOpaque(true);
                
            }else{
            labels[hora_inicio + 1][dia_semana].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+1][dia_semana].setBackground(cor);
            labels[hora_inicio+1][dia_semana].setOpaque(true);
            
            labels[hora_inicio + 1][dia_semana+1].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+1][dia_semana+1].setBackground(cor);
            labels[hora_inicio+1][dia_semana+1].setOpaque(true);
            }
        }else if (dia_semana==4)
        {
            labels[hora_inicio][dia_semana+1].setText(horario.get(i).getSigla_professor());
            labels[hora_inicio][dia_semana+1].setBackground(cor);
            labels[hora_inicio][dia_semana+1].setOpaque(true);
            
            labels[hora_inicio][dia_semana+2].setText(horario.get(i).getSigla_disciplina());
            labels[hora_inicio][dia_semana+2].setBackground(cor);
            labels[hora_inicio][dia_semana+2].setOpaque(true);
            
            if(tipo_aula==2)
            {labels[hora_inicio+3][dia_semana+1].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+3][dia_semana+1].setBackground(cor);
            labels[hora_inicio+3][dia_semana+1].setOpaque(true);
            
            labels[hora_inicio+3][dia_semana+2].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+3][dia_semana+2].setBackground(cor);
            labels[hora_inicio+3][dia_semana+2].setOpaque(true);
            
            
            labels[hora_inicio+2][dia_semana+1].setBackground(cor);
            labels[hora_inicio+2][dia_semana+1].setOpaque(true);
            labels[hora_inicio+1][dia_semana+1].setBackground(cor);
            labels[hora_inicio+1][dia_semana+1].setOpaque(true);
            labels[hora_inicio+2][dia_semana+2].setBackground(cor);
            labels[hora_inicio+2][dia_semana+2].setOpaque(true);
            labels[hora_inicio+1][dia_semana+2].setBackground(cor);
            labels[hora_inicio+1][dia_semana+2].setOpaque(true);
            
            
            
            }
            else{
                
            labels[hora_inicio+1][dia_semana+1].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+1][dia_semana+1].setBackground(cor);
            labels[hora_inicio+1][dia_semana+1].setOpaque(true);
            
            labels[hora_inicio+1][dia_semana+2].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+1][dia_semana+2].setBackground(cor);
            labels[hora_inicio+1][dia_semana+2].setOpaque(true);
            }
        }
        else if(dia_semana==5)
        {
            labels[hora_inicio][dia_semana+2].setText(horario.get(i).getSigla_professor());
            labels[hora_inicio][dia_semana+2].setBackground(cor);
            labels[hora_inicio][dia_semana+2].setOpaque(true);
            
            labels[hora_inicio][dia_semana+3].setText(horario.get(i).getSigla_disciplina());
            labels[hora_inicio][dia_semana+3].setBackground(cor);
            labels[hora_inicio][dia_semana+3].setOpaque(true);
            
            
            if(tipo_aula==2)
            {
                labels[hora_inicio+3][dia_semana+2].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+3][dia_semana+2].setBackground(cor);
            labels[hora_inicio+3][dia_semana+2].setOpaque(true);
            
            labels[hora_inicio+3][dia_semana+3].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+3][dia_semana+3].setBackground(cor);
            labels[hora_inicio+3][dia_semana+3].setOpaque(true);
            
            labels[hora_inicio+2][dia_semana+3].setBackground(cor);
            labels[hora_inicio+2][dia_semana+3].setOpaque(true);
            labels[hora_inicio+1][dia_semana+3].setBackground(cor);
            labels[hora_inicio+1][dia_semana+3].setOpaque(true);
            
            labels[hora_inicio+2][dia_semana+2].setBackground(cor);
            labels[hora_inicio+2][dia_semana+2].setOpaque(true);
            labels[hora_inicio+1][dia_semana+2].setBackground(cor);
            labels[hora_inicio+1][dia_semana+2].setOpaque(true);
           
            }else
            {
                
            labels[hora_inicio+1][dia_semana+2].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+1][dia_semana+2].setBackground(cor);
            labels[hora_inicio+1][dia_semana+2].setOpaque(true);
            
            labels[hora_inicio+1][dia_semana+3].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+1][dia_semana+3].setBackground(cor);
            labels[hora_inicio+1][dia_semana+3].setOpaque(true);
            }
        }else if (dia_semana ==6)
        {
            labels[hora_inicio][dia_semana+3].setText(horario.get(i).getSigla_professor());
            labels[hora_inicio][dia_semana+3].setBackground(cor);
            labels[hora_inicio][dia_semana+3].setOpaque(true);
            
            labels[hora_inicio][dia_semana+4].setText(horario.get(i).getSigla_disciplina());
            labels[hora_inicio][dia_semana+4].setBackground(cor);
            labels[hora_inicio][dia_semana+4].setOpaque(true);
            
            
            if(tipo_aula==2){
                
                labels[hora_inicio+3][dia_semana+3].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+3][dia_semana+3].setBackground(cor);
            labels[hora_inicio+3][dia_semana+3].setOpaque(true);
            
            labels[hora_inicio+3][dia_semana+4].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+3][dia_semana+4].setBackground(cor);
            labels[hora_inicio+3][dia_semana+4].setOpaque(true);
            
            
            labels[hora_inicio+2][dia_semana+3].setBackground(cor);
            labels[hora_inicio+2][dia_semana+3].setOpaque(true);
            labels[hora_inicio+1][dia_semana+3].setBackground(cor);
            labels[hora_inicio+1][dia_semana+3].setOpaque(true);
            
            labels[hora_inicio+2][dia_semana+4].setBackground(cor);
            labels[hora_inicio+2][dia_semana+4].setOpaque(true);
            labels[hora_inicio+1][dia_semana+4].setBackground(cor);
            labels[hora_inicio+1][dia_semana+4].setOpaque(true);
            
            
            
            
            
            }else
            {
            labels[hora_inicio+1][dia_semana+3].setText(horario.get(i).getDesignacao());
            labels[hora_inicio+1][dia_semana+3].setBackground(cor);
            labels[hora_inicio+1][dia_semana+3].setOpaque(true);
            
            labels[hora_inicio+1][dia_semana+4].setText(horario.get(i).getCodigo_sala());
            labels[hora_inicio+1][dia_semana+4].setBackground(cor);
            labels[hora_inicio+1][dia_semana+4].setOpaque(true);
                
            }
        }

    }

    private void horarioSegunda(ArrayList<Horario> horario, int dia_semana, int indice) {
        int inicio_aula = horario.get(indice).getHora_inicio();

        switch (inicio_aula) {
            case 8:
                metodoAdicionarAula(horario, 2, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 9:
                metodoAdicionarAula(horario, 4, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 10:
                metodoAdicionarAula(horario, 6, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 11:
                metodoAdicionarAula(horario, 8, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 12:
                metodoAdicionarAula(horario, 10, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 13:
                metodoAdicionarAula(horario, 12, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 14:
                metodoAdicionarAula(horario, 14, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 15:
                metodoAdicionarAula(horario, 16, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 16:
                metodoAdicionarAula(horario, 18, dia_semana, indice, horario.get(indice).getAulas());
                break;
            case 17:
                metodoAdicionarAula(horario, 20, dia_semana, indice, horario.get(indice).getAulas());
                break;

        }
    }

    private void horarioTerca(ArrayList<Horario> horario, int dia_semana, int indice) {
        int inicio_aula = horario.get(indice).getHora_inicio();

        switch (inicio_aula) {
            case 8:metodoAdicionarAula(horario, 2, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 9:metodoAdicionarAula(horario, 4, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 10:metodoAdicionarAula(horario, 6, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 11:metodoAdicionarAula(horario, 8, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 12:metodoAdicionarAula(horario, 10, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 13:metodoAdicionarAula(horario, 12, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 14:metodoAdicionarAula(horario, 14, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 15:metodoAdicionarAula(horario, 16, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 16:metodoAdicionarAula(horario, 18, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 17:metodoAdicionarAula(horario, 20, dia_semana,indice,horario.get(indice).getAulas()); break;
           
        }

    }

    private void horarioQuarta(ArrayList<Horario> horario, int dia_semana, int indice) {
        int inicio_aula = horario.get(indice).getHora_inicio();

        switch (inicio_aula) {
           case 8:metodoAdicionarAula(horario, 2, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 9:metodoAdicionarAula(horario, 4, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 10:metodoAdicionarAula(horario, 6, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 11:metodoAdicionarAula(horario, 8, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 12:metodoAdicionarAula(horario, 10, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 13:metodoAdicionarAula(horario, 12, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 14:metodoAdicionarAula(horario, 14, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 15:metodoAdicionarAula(horario, 16, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 16:metodoAdicionarAula(horario, 18, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 17:metodoAdicionarAula(horario, 20, dia_semana,indice,horario.get(indice).getAulas()); break;
        }

    }

    private void horarioQuinta(ArrayList<Horario> horario,int dia_semana, int indice) {
        int inicio_aula = horario.get(indice).getHora_inicio();

        switch (inicio_aula) {
           case 8:metodoAdicionarAula(horario, 2, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 9:metodoAdicionarAula(horario, 4, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 10:metodoAdicionarAula(horario, 6, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 11:metodoAdicionarAula(horario, 8, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 12:metodoAdicionarAula(horario, 10, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 13:metodoAdicionarAula(horario, 12, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 14:metodoAdicionarAula(horario, 14, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 15:metodoAdicionarAula(horario, 16, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 16:metodoAdicionarAula(horario, 18, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 17:metodoAdicionarAula(horario, 20, dia_semana,indice,horario.get(indice).getAulas()); break;
        }

    }

    private void horarioSexta(ArrayList<Horario> horario, int dia_semana, int indice) {
        int inicio_aula = horario.get(indice).getHora_inicio();

        switch (inicio_aula) {
           case 8:metodoAdicionarAula(horario, 2, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 9:metodoAdicionarAula(horario, 4, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 10:metodoAdicionarAula(horario, 6, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 11:metodoAdicionarAula(horario, 8, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 12:metodoAdicionarAula(horario, 10, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 13:metodoAdicionarAula(horario, 12, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 14:metodoAdicionarAula(horario, 14, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 15:metodoAdicionarAula(horario, 16, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 16:metodoAdicionarAula(horario, 18, dia_semana,indice,horario.get(indice).getAulas()); break;
            case 17:metodoAdicionarAula(horario, 20, dia_semana,indice,horario.get(indice).getAulas()); break;
        }

    }

    public void HorarioVazio() {
        for (int i = 2; i < 23; i++) {
            for (int k = 1; k < 11; k++) {
                labels[i][k].setText("");
                labels[i][k].setFont(new Font("Arial", Font.BOLD, 10));
                labels[i][k].setForeground(Color.white);
                labels[i][k].setBorder(border);
                labels[i][k].setHorizontalAlignment(JLabel.CENTER);
                labels[i][k].setOpaque(false);
            }
        }
    }

    private void setProperties(int w, int h, int opcao, boolean visible) {
        setSize(w, h);
        setDefaultCloseOperation(opcao);
        setVisible(visible);
        setLocationRelativeTo(null);
    }
}
