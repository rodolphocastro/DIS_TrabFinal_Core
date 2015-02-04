package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.ForeignKey;

/**
 * Classe para a entidade AvaliadorDB.
 * @author alvesrc
 */
@Entity(name = "avaliador")
@PrimaryKeyJoinColumn(name = "usuario_email")
@ForeignKey(name = "fk_avaliador_usuario")
public class AvaliadorDB extends UsuarioDB{
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
