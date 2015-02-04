package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAvaliadorInterface;
import com.ardc.dis_trabfinal_core.entity.database.AvaliadorDB;
import java.util.List;
import javax.persistence.Query;

/**
 * DAO para a entidade Avaliador.
 * @author alvesrc
 */
public class DAOAvaliador extends DAOGenerico implements DAOAvaliadorInterface{

    /**
     * Método para listar os avaliadores que estão cadastrados no site.
     * @return Uma lista contendo os avaliadores encontrados.
     */
    @Override
    public List<AvaliadorDB> listar() {
        try{
            em = getEntityManager();
            Query q = em.createQuery("select a from avaliador a", AvaliadorDB.class);
            return q.getResultList();
        }catch(Exception err){
            return null;
        }finally{
            if (em != null){
                em.close();
            }
        }
    }

    /**
     * Método para inserir avaliadores no sistema.
     * @param avaliador O avaliador a ser inserido no sistema.
     */
    @Override
    public void inserir(AvaliadorDB avaliador) {
        super.inserir(avaliador);
    }

    /**
     * Método para alterar um avaliador cadastrado no sistema.
     * @param avaliador O avaliador a ser alterado.
     */
    @Override
    public void alterar(AvaliadorDB avaliador) {
        super.alterar(avaliador);
    }
    
}
