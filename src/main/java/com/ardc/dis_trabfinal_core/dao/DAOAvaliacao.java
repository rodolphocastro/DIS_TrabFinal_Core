package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAvaliacaoInterface;
import com.ardc.dis_trabfinal_core.entity.database.AvaliacaoDB;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * DAO para controlar as entidades de tipo Avaliacao.
 * @author ALVES, R.C.
 */
public class DAOAvaliacao extends DAOGenerico implements DAOAvaliacaoInterface{
    
    /**
     * Método para listar todas as avaliações cadastradas no sistema.
     * @return Uma lista contendo as avaliações encontradas.
     */
    @Override
    public List<AvaliacaoDB> listar() {
        try {
            em = getEntityManager();
            Query q = em.createQuery("select a from avaliacao a", AvaliacaoDB.class);
            return q.getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

     /**
     * Método para listar todas as avaliações de um projeto.
     * @param codProjeto O código do projeto do qual serão listadas as avaliacoes.
     * @return Uma Lista contendo as avaliações encontradas.
     */
    @Override
    public List<AvaliacaoDB> listarPorProjeto(long codProjeto) {
        try {
            em = getEntityManager();
            Query q = em.createQuery("select a from avaliacao a where a.projeto.codigo = :codigo", AvaliacaoDB.class);
            q.setParameter("codigo", codProjeto);
            return q.getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

     /**
     * Método para listar todas as avaliações realizadas por um Avaliador.
     * @param emailAvaliador O e-mail do avaliador a ser averiguado.
     * @return Uma lista contendo as avaliações encontradas.
     */
    @Override
    public List<AvaliacaoDB> listarPorAvaliador(String emailAvaliador) {
        try {
            em = getEntityManager();
            Query q = em.createQuery("select a from avaliacao a where a.avaliador.email like :email", AvaliacaoDB.class);
            q.setParameter("email", emailAvaliador);
            return q.getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Método para pesquisar avaliações de um avaliador em um projeto específico.
     * @param codProjeto Código do projeto.
     * @param emailAvaliador E-mail do avaliador.
     * @return A avaliação encontrada.
     */
    @Override
    public AvaliacaoDB pesquisarPorProjetoAvaliador(long codProjeto, String emailAvaliador) {
        try {
            em = getEntityManager();
            Query q = em.createQuery("select a from avaliacao a where a.avaliador.email like :email and a.projeto.codigo = :codigo", AvaliacaoDB.class);
            q.setParameter("email", emailAvaliador);
            q.setParameter("codigo", codProjeto);
            return (AvaliacaoDB) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Método para inserir uma avaliação no sistema.
     * @param avaliacao A avaliação a ser inserida.
     */
    @Override
    public void inserir(AvaliacaoDB avaliacao) {
        super.inserir(avaliacao);
    }

    /**
     * Método para alterar uma avaliação previamente cadastrada no sistema.
     * @param avaliacao A avaliação a ser alterada.
     */
    @Override
    public void alterar(AvaliacaoDB avaliacao) {
        super.alterar(avaliacao);
    }

    /**
     * Método para remover uma avaliação do sistema.
     * @param codAvaliacao o código da avaliação a ser removida.
     */
    @Override
    public void remover(long codAvaliacao) {
        super.remover(AvaliacaoDB.class, codAvaliacao);
    }
}
