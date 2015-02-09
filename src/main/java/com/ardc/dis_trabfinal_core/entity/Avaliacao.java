package com.ardc.dis_trabfinal_core.entity;

/**
 * Classe para conter Objetos do tipo Avaliacao.
 * @author ALVES, R.C.
 */
public class Avaliacao {
    /**
     * Código da avaliação.
     */
    private long codigo;

    /**
     * Projeto avaliado.
     */
    private Projeto projeto;

    /**
     * Avaliador responsável.
     */
    private Avaliador avaliador;

    /**
     * Nota atribuída ao projeto.
     */
    private float nota;

    /**
     * Se ocorreu avaliação ou não.
     */
    private boolean avaliado;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Avaliador getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Avaliador avaliador) {
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
