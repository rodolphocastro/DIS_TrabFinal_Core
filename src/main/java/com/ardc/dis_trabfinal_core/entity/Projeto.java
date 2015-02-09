package com.ardc.dis_trabfinal_core.entity;

import java.util.Date;
import java.util.List;

/**
 * Classe para armazenar dados relativos as entidades do tipo Projeto.
 * @author ALVES, R.C.
 */
public class Projeto {
    
    /**
     * Código identificador do projeto.
     */
    private long codigo;

    /**
     * Título do projeto.
     */
    private String titulo;

    /**
     * Descrição do projeto.
     */
    private String descricao;

    /**
     * Aluno líder do projeto.
     */
    private Aluno lider;

    /**
     * Data em que o projeto foi criado.
     */
    private Date dataCriacao;

    /**
     * Data da ultima modificação.
     */
    private Date dataUltimaModificacao;

    /**
     * Atual estado do projeto.
     */
    private String status;

    /**
     * Alunos que participam do projeto.
     */
    private List<Aluno> alunosMembros;

    /**
     * Area em que o projeto se encaixa.
     */
    private String areaConhecimento;

    /**
     * Professor orientador do projeto.
     */
    private Professor orientador;

    /**
     * Respostas relacionadas a este projeto.
     */
    private Respostas respostas;

    /**
     * Lista de avaliações deste projeto.
     */
    private List<Avaliacao> avaliacoes;

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

    public Aluno getLider() {
        return lider;
    }

    public void setLider(Aluno lider) {
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

    public List<Aluno> getAlunosMembros() {
        return alunosMembros;
    }

    public void setAlunosMembros(List<Aluno> alunosMembros) {
        this.alunosMembros = alunosMembros;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public Respostas getRespostas() {
        return respostas;
    }

    public void setRespostas(Respostas respostas) {
        this.respostas = respostas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
    
}
