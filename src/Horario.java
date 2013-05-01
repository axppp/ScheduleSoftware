/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axppp
 */
public class Horario {
    private String designacao;
    private String sigla_disciplina;
    private enum tipo_aula {T,P};
    tipo_aula aulas;
    
    private int dia_semana;
    private int hora_inicio;
    private int duracaoAula;
    private String sigla_professor;
    private String codigo_sala;

    public Horario(Turma turma, Disciplina disciplina, int tipo_aula, int dia_semana, int hora_inicio, int duracaoAula, Professor professor, SalaAula sala) {
        this.designacao = turma.getDesignacao();
        this.sigla_disciplina = disciplina.getSigla();
        
        if(tipo_aula == 1)
        {
            this.aulas = aulas.T;
        }
        else if(tipo_aula==2)
                {
                    this.aulas=aulas.P;
                }
        verificaDiaSemana(dia_semana);
        verificaHoraAula(hora_inicio);
        this.duracaoAula = duracaoAula;
        this.sigla_professor = professor.getSigla();
        this.codigo_sala = sala.getCodigo();
    }
    
   public void verificaDiaSemana(int dia_semana)
   {
       if(dia_semana >= 2 && dia_semana <= 6)
       {
           this.dia_semana = dia_semana;
       }
   }
   
    
    public void verificaHoraAula(int horainicio)
   {
       if( horainicio > 8 || horainicio < 17)
       {
           this.hora_inicio = horainicio;
       }
       else
       {
           //deve mandar uma excepcao
           System.out.println("aula nao pode ser lecionada");
       }
   }

    public String getDesignacao() {
        return designacao;
    }

    public String getSigla_disciplina() {
        return sigla_disciplina;
    }

    public tipo_aula getAulas() {
        return aulas;
    }

    public int getDia_semana() {
        return dia_semana;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public int getDuracaoAula() {
        return duracaoAula;
    }

    public String getSigla_professor() {
        return sigla_professor;
    }

    public String getCodigo_sala() {
        return codigo_sala;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setSigla_disciplina(String sigla_disciplina) {
        this.sigla_disciplina = sigla_disciplina;
    }

    public void setAulas(tipo_aula aulas) {
        this.aulas = aulas;
    }

    public void setDia_semana(int dia_semana) {
        this.dia_semana = dia_semana;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public void setSigla_professor(String sigla_professor) {
        this.sigla_professor = sigla_professor;
    }

    public void setCodigo_sala(String codigo_sala) {
        this.codigo_sala = codigo_sala;
    }
    
    @Override
    public String toString() {
        return "Horario{" + "designacao=" + designacao + ", sigla_disciplina=" + sigla_disciplina + ", aulas=" + aulas + ", dia_semana=" + dia_semana + ", hora_inicio=" + hora_inicio + ", duracaoAula=" + duracaoAula + ", sigla_professor=" + sigla_professor + ", codigo_sala=" + codigo_sala + '}';
    }
    
}
