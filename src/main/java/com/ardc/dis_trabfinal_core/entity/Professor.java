/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ardc.dis_trabfinal_core.entity;

/**
 *
 * @author alvesrc
 */
public class Professor extends Usuario{
    
    /**
     * Departamento acadêmico ao qual o professor está alocado.
     */
    private String departamento;
    
    /**
     * A principal disciplina ministrada pelo professor.
     */
    private String disciplinaPrincipal;

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
