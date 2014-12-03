package com.ardc.dis_trabfinal_core.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe para a entidade do tipo Usuário, essa classe será herdada por todas as classes que forem acessar o sistema.
 * @author alvesrc
 */
@Entity(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable{
    
    /**
     * Email do usuário, chave primária da entidade.
     */
    @Id
    protected String email;
    
    /**
     * O nome do usuário.
     */
    protected String nome;
    
    /**
     * A senha do usuário.
     */
    protected String senha;
    
    /**
     * A data em que o usuário foi criado.
     */
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dataCadastro;
    
    /**
     * A data em que a ultima modificação foi efetuada.
     */
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dataUltimaModificacao;
    
    /**
     * O atual status do usuário no sistema.
     */
    protected String status;
    
    /**
     * A função do usuário no sistema.
     */
    protected String papel;
    
    //Getters & Setters gerados automaticamente

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    
    
}
