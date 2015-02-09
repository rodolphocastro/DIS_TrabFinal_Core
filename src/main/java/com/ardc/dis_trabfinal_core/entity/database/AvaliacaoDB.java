package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import org.hibernate.annotations.ForeignKey;

/**
 * Classe para a entidade Avaliacao.
 * @author ALVES, R.C.
 */
@Entity(name = "avaliacao")
public class AvaliacaoDB implements Serializable{
    
    /**
     * Código da Avaliação.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "avaliacaoGenerator")
    @SequenceGenerator(name = "avaliacaoGenerator", sequenceName = "avaliacaoGenerator", allocationSize = 1, initialValue = 1)
    private long codigo;

    /**
     * A qual projeto a avaliação está ligada.
     */
    @ManyToOne
    @JoinColumn(name = "projeto_email")
    @ForeignKey(name = "fk_avaliacao_projeto")
    private ProjetoDB projeto;

    /**
     * A qual avaliador a avaliação está ligada.
     */
    @ManyToOne
    @JoinColumn(name = "avaliador_email")
    @ForeignKey(name = "fk_avaliacao_avaliador")
    private AvaliadorDB avaliador;

    /**
     * A nota dada pelo avaliador.
     */
    private float nota;

    /**
     * Se a avaliação foi feita ou não.
     */
    private boolean avaliado;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public ProjetoDB getProjeto() {
        return projeto;
    }

    public void setProjeto(ProjetoDB projeto) {
        this.projeto = projeto;
    }

    public AvaliadorDB getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(AvaliadorDB avaliador) {
        this.avaliador = avaliador;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isAvaliado() {
        return avaliado;
    }

    public void setAvaliado(boolean avaliado) {
        this.avaliado = avaliado;
    }
}
