/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ardc.dis_trabfinal_core.entity;

import java.util.List;

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

    /**
     * Lista de projetos que o professor orienta.
     */
    private List<Projeto> projetosOrientados;
    
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

    public List<Projeto> getProjetosOrientados() {
        return projetosOrientados;
    }

    public void setProjetosOrientados(List<Projeto> projetosOrientados) {
        this.projetosOrientados = projetosOrientados;
    }
    
    
    
}
