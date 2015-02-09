package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.dao.DAOGenerico;
import com.ardc.dis_trabfinal_core.entity.database.AvaliacaoDB;
import java.util.List;

/**
 * Interface descrevendo os métodos a serem implementados pelo DAOAvaliacao.
 * @author ALVES, R.C.
 */
public interface DAOAvaliacaoInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar todas as avaliações cadastradas no sistema.
     * @return Uma lista contendo as avaliações encontradas.
     */
    public List<AvaliacaoDB> listar();

    /**
     * Método para listar todas as avaliações de um projeto.
     * @param codProjeto O código do projeto do qual serão listadas as avaliacoes.
     * @return Uma Lista contendo as avaliações encontradas.
     */
    public List<AvaliacaoDB> listarPorProjeto(long codProjeto);

    /**
     * Método para listar todas as avaliações realizadas por um Avaliador.
     * @param emailAvaliador O e-mail do avaliador a ser averiguado.
     * @return Uma lista contendo as avaliações encontradas.
     */
    public List<AvaliacaoDB> listarPorAvaliador(String emailAvaliador);

    /**
     * Método para pesquisar avaliações de um avaliador em um projeto específico.
     * @param codProjeto Código do projeto.
     * @param emailAvaliador E-mail do avaliador.
     * @return A avaliação encontrada.
     */
    public AvaliacaoDB pesquisarPorProjetoAvaliador(long codProjeto, String emailAvaliador);

    /**
     * Método para inserir uma avaliação no sistema.
     * @param avaliacao A avaliação a ser inserida.
     */
    public void inserir(AvaliacaoDB avaliacao);

    /**
     * Método para alterar uma avaliação previamente cadastrada no sistema.
     * @param avaliacao A avaliação a ser alterada.
     */
    public void alterar(AvaliacaoDB avaliacao);

    /**
     * Método para remover uma avaliação do sistema.
     * @param codAvaliacao o código da avaliação a ser removida.
     */
    public void remover(long codAvaliacao);
}
