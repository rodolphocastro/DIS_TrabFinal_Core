package com.ardc.dis_trabfinal_core.entity;

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
    
}
