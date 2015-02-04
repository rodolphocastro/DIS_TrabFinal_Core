package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.ForeignKey;


/**
 * Entidade para o usuário do tipo aluno.
 * @author alvesrc
 */
@Entity(name = "aluno")
@PrimaryKeyJoinColumn(name = "usuario_email")
@ForeignKey(name = "fk_aluno_usuario")
public class AlunoDB extends UsuarioDB implements Serializable{
    
    /**
     * A matrícula do aluno na instituição, deve ser única.
     */
    @Column(unique = true)
    private int matricula;
    
    /**
     * O curso em que o aluno está matriculado.
     */
    private String curso;
    
    /**
     * O período em que o aluno está.
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
