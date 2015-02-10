package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ForeignKey;

/**
 * Classe para a entidade do tipo Projeto.s
 * @author ALVES, R.C.
 */
@Entity(name = "projeto")
public class ProjetoDB implements Serializable{
    
    /**
     * Identificador do projeto.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "projetoGenerator")
    @SequenceGenerator(name = "projetoGenerator", sequenceName = "projetoGenerator", allocationSize = 1, initialValue = 1)
    private long codigo;

    /**
     * Nome do projeto.
     */
    private String titulo;

    /**
     * Descrição do Projeto.
     */
    private String descricao;

    /**
     * O aluno que lidera o Projeto.
     */
    @OneToOne
    @JoinColumn(name = "lider_email")
    @ForeignKey(name = "fk_projeto_lider")
    private AlunoDB lider;

    /**
     * A data em que o projeto foi criado.
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    /**
     * A data da ultima alteração no projeto.
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimaModificacao;

    /**
     * O estado atual do projeto.
     */
    private String status;

    /**
     * Os alunos que participam do projeto.
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "aluno_projeto",
            joinColumns = {
                @JoinColumn(name = "projeto_codigo")},
            inverseJoinColumns = {
                @JoinColumn(name = "aluno_codigo")})
    @ForeignKey(name = "fk_projeto_aluno", inverseName = "fk_aluno_projeto")
    private List<AlunoDB> alunosMembros;

    /**
     * A área em que esse projeto se encaixa.
     */
    private String areaConhecimento;

    /**
     * O professor que orienta o projeto.
     */
    @ManyToOne
    @JoinColumn(name = "orientador_email")
    @ForeignKey(name = "fk_projeto_orientador")
    private ProfessorDB orientador;

    /**
     * Respostas a esse projeto.
     */
    @OneToOne(cascade = javax.persistence.CascadeType.ALL)
    @JoinColumn(name = "respostas_codigo")
    @ForeignKey(name = "fk_projeto_respostas")
    private RespostasDB respostas;

    /**
     * Avaliações deste projeto.
     */
    @OneToMany(mappedBy = "projeto")
    private List<AvaliacaoDB> avaliacoes;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AlunoDB getLider() {
        return lider;
    }

    public void setLider(AlunoDB lider) {
        this.lider = lider;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataUltimaModificacao() {
        return dataUltimaModificacao;
    }

    public void setDataUltimaModificacao(Date dataUltimaModificacao) {
        this.dataUltimaModificacao = dataUltimaModificacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<AlunoDB> getAlunosMembros() {
        return alunosMembros;
    }

    public void setAlunosMembros(List<AlunoDB> alunosMembros) {
        this.alunosMembros = alunosMembros;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public ProfessorDB getOrientador() {
        return orientador;
    }

    public void setOrientador(ProfessorDB orientador) {
        this.orientador = orientador;
    }

    public RespostasDB getRespostas() {
        return respostas;
    }

    public void setRespostas(RespostasDB respostas) {
        this.respostas = respostas;
    }

    public List<AvaliacaoDB> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoDB> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

}
