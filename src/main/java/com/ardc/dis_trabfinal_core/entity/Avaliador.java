package com.ardc.dis_trabfinal_core.entity;

import java.util.List;

/**
 * Classe para armazenar dados dos avaliadores.
 * @author alvesrc
 */
public class Avaliador extends Usuario{
    /**
     * Área em que o avaliador atua.
     */
    private String areaAtuacao;
    
    /**
     * Formação profissional do avaliador.
     */
    private String formacao;

    /**
     * Lista contendo as avaliações feitas pelo avaliador.
     */
    private List<Avaliacao> Avaliacoes;
    
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return Avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> Avaliacoes) {
        this.Avaliacoes = Avaliacoes;
    }
    
    
}
