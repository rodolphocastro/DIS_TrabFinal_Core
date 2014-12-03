package com.ardc.dis_trabfinal_core.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.ForeignKey;

/**
 * Classe para a entidade Professor.
 * @author alvesrc
 */
@Entity(name = "professor")
@PrimaryKeyJoinColumn(name = "usuario_email")
@ForeignKey(name = "fk_professor_usuario")
public class Professor extends Usuario implements Serializable{
    
    /**
     * Departamento acadêmico ao qual o professor está alocado.
     */
    private String departamento;
    
    /**
     * A principal disciplina ministrada pelo professor.
     */
    private String disciplinaPrincipal;

    //Getters & Setters gerados automaticamente.
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDisciplinaPrincipal() {
        return disciplinaPrincipal;
    }

    public void setDisciplinaPrincipal(String disciplinaPrincipal) {
        this.disciplinaPrincipal = disciplinaPrincipal;
    }
    
    
}
