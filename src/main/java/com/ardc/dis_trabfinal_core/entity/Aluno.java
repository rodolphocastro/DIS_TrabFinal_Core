package com.ardc.dis_trabfinal_core.entity;

import java.util.List;

/**
 * Classe para armazenar dados de Alunos.
 * @author alvesrc
 */
public class Aluno extends Usuario{
    
    /**
     * A matricula do aluno.
     */
    private int matricula;
    
    /**
     * O curso do aluno.
     */
    private String curso;
    
    /**
     * O período em que o aluno se encontra.
     */
    private int periodo;

    /**
     * Projetos em que o aluno está envolvido.
     */
    private List<Projeto> projetos;

    /**
     * Projeto que o aluno lidera.
     */
    private Projeto projetoQueLidera;
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public Projeto getProjetoQueLidera() {
        return projetoQueLidera;
    }

    public void setProjetoQueLidera(Projeto projetoQueLidera) {
        this.projetoQueLidera = projetoQueLidera;
    }
    
    
}
