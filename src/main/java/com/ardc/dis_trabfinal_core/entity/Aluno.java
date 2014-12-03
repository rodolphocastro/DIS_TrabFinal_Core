package com.ardc.dis_trabfinal_core.entity;

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
public class Aluno extends Usuario implements Serializable{
    
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
}
