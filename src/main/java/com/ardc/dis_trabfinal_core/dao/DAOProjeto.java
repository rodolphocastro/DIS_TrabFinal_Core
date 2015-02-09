package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOProjetoInterface;
import com.ardc.dis_trabfinal_core.entity.database.ProjetoDB;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * DAO para lidar com entidades do tipo Projeto.
 * @author ALVES, R.C.
 */
public class DAOProjeto extends DAOGenerico implements DAOProjetoInterface{
    
    /**
     * Método para listar todos os projetos cadastrados no sistema.
     * @return Uma lista contendo todos os projetos cadastrados.
     */
    @Override
    public List<ProjetoDB> listar(){
        try {
            em = getEntityManager();
            Query q = em.createQuery("select p from projeto p", ProjetoDB.class);
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
     * Método para listar todos os projetos liderados por um aluno.
     * @param emailLider O e-mail do aluno a ser pesquisado.
     * @return Uma lista contendo todos os projetos encontrados.
     */
    @Override
    public List<ProjetoDB> pesquisarPorLider(String emailLider){
        try {
            em = getEntityManager();
            Query q = em.createQuery("select p from projeto p where p.lider.email like :email", ProjetoDB.class);
            q.setParameter("email", emailLider);
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
     * Método para listar todos os projetos orientados por um determinado professor.
     * @param emailOrientador O e-mail do professor a ser pesquisado.
     * @return Uma lista contendo todos os projetos orientados pelo professor determinado.
     */
    @Override
    public List<ProjetoDB> pesquisarPorOrientador(String emailOrientador){
        try {
            em = getEntityManager();
            Query q = em.createQuery("select p from projeto p where p.orientador.email like :email", ProjetoDB.class);
            q.setParameter("email", emailOrientador);
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
     * Método para listar os projetos com base em um determinado membro.
     * @param emailMembro O e-mail do membro a ser considerado.
     * @return Uma lista contendo os projetos encontrados.
     */
    @Override
    public List<ProjetoDB> pesquisarPorMembro(String emailMembro){
        try {
            em = getEntityManager();
            Query q = em.createQuery("select p from projeto p join fetch p.alunosMembros a where a.email like :email", ProjetoDB.class);
            q.setParameter("email", emailMembro);
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
     * Método para listar os projetos avaliados por um determinado avaliador.
     * @param emailAvaliador O e-mail do avaliador a ser considerado.
     * @return Uma lista contendo os projetos encontrados.
     */
    @Override
    public List<ProjetoDB> pesquisarPorAvaliador(String emailAvaliador){
        try {
            em = getEntityManager();
            Query q = em.createQuery("select p from projeto p join fetch p.avaliacoes a where a.avaliador.email like :email", ProjetoDB.class);
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
     * Método para cadastrar um novo projeto na database.
     * @param projeto  O projeto a ser inserido.
     */
    @Override
    public void inserir(ProjetoDB projeto){
        super.inserir(projeto);
    }

    /**
     * Método para alterar um projeto previamente cadastrado na database.
     * @param projeto O projeto a ser removido.
     */
    @Override
    public void alterar(ProjetoDB projeto){
        super.alterar(projeto);
    }
}
