package com.ardc.dis_trabfinal_core.entity;

import java.util.Date;

/**
 * Classe para armazenar usuários do sistema.
 * @author alvesrc
 */
public class Usuario {
    
    /**
     * O email do usuário.
     */
    protected String email;
    
    /**
     * O nome do usuário.
     */
    protected String nome;
    
    /**
     * O papel do usuário no sistema.
     */
    protected String papel;
    
    /**
     * A senha de acesso do usuário.
     */
    protected String senha;
    
    /**
     * O atual estado do usuário.
     */
    protected String status;
    
     /**
     * A data em que o usuário foi criado.
     */
    protected Date dataCadastro;
    
    /**
     * A data em que a ultima modificação foi efetuada.
     */
    protected Date dataUltimaModificacao;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataUltimaModificacao() {
        return dataUltimaModificacao;
    }

    public void setDataUltimaModificacao(Date dataUltimaModificacao) {
        this.dataUltimaModificacao = dataUltimaModificacao;
    }
    
    
    
}
