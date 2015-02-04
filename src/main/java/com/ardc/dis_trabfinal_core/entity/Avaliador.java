package com.ardc.dis_trabfinal_core.entity;

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
    
    
}
