package com.ardc.dis_trabfinal_core.dao;

import java.io.Serializable;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOGenericoInterface;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Classe para um DataAccessObject genérico, a ser herdado pelos outros DAO, Implementa a interface DAOGenericoInterface.
 * @see com.ardc.dis_trabfinal_core.dao.interfaces.DAOGenericoInterface
 * @author alvesrc
 */
public class DAOGenerico implements Serializable, DAOGenericoInterface{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Factory responsável por criar os gestores de entidades.
     */
    protected static EntityManagerFactory emf = null;
    
    /**
     * Gestor de Entidade a ser utilizado.
     */
    protected EntityManager em;

    /**
     * Getter para a EntityManagerFactory, caso ela não exista uma é criada.
     * @return A EntityManagerFactory responsável.
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("DIS_TrabFinal_PU");
        }
        return emf;
    }

    /**
     * Getter para a EntityManager.
     * @return A atual EntityManager do objeto.
     */
    public EntityManager getEntityManager() {
        return DAOGenerico.getEntityManagerFactory().createEntityManager();
    }

    /**
     * Insere um objeto na database.
     * @param obj O objeto a ser inserido na database.
     */
    @Override
    public void inserir(Object obj) {
        //Pegando o entityManager
        em = this.getEntityManager();
        //Iniciando uma transação com o banco de dados
        em.getTransaction().begin();
        //Fazendo o objeto persistir (Salvando)
        em.persist(obj);
        //Fazendo commit da transação.
        em.getTransaction().commit();
        //Fechando a comunicação.
        em.close();
    }

    /**
     * Remove um objeto da database.
     * @param classe A classe do objeto a ser removido.
     * @param pk A chave Primária do objeto a ser removido.
     */
    @Override
    public void remover(Class classe, Object pk) {
        //Iniciando a comunicaçao
        em = this.getEntityManager();
        //Iniciando uma transaçao
        em.getTransaction().begin();
        //Removendo o objeto. O metodo find encontra um objeto com base em sua classe e sua pk
        em.remove(em.find(classe, pk));
        //Commitando a transaçao
        em.getTransaction().commit();
        //Finalizando comunicaçao.
        em.close();
    }

    /**
     * Altera um objeto na database.
     * @param obj O objeto a ser atualizado.
     */
    @Override
    public void alterar(Object obj) {
        //Inicianddo a comunicação
        em = this.getEntityManager();
        //Iniciando a transação
        em.getTransaction().begin();
        //Fazendo o merge do objeto com o objeto já existente.
        em.merge(obj);
        //Fazendo commit da transação
        em.getTransaction().commit();
        //Finalizando a comunicação;
        em.close();
    }

    /**
     * Busca um objeto na database.
     * @param classe A classe do objeto a ser buscado.
     * @param pk A chave primária do objeto a ser buscado.
     * @return O objeto encontrado na database.
     */
    @Override
    public Object buscar(Class classe, Object pk) {
        try {
            em = this.getEntityManager();
            return em.find(classe, pk);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
}
