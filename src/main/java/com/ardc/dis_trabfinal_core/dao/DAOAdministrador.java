package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAdministradorInterface;
import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author alvesrc
 */
public class DAOAdministrador extends DAOGenerico implements DAOAdministradorInterface{

    /**
     * Método para listar todos os administradores cadastrados no sistema.
     * @return Uma lista contendo todos os administradores encontrados.
     */
    @Override
    public List<AdministradorDB> listar() {
        try{
            em = getEntityManager();
            Query q = em.createQuery("select a from administrador a", AdministradorDB.class);
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
     * Método para inserir um administrador no sistema.
     * @param administrador O administrador a ser inserido no sistema.
     */
    @Override
    public void inserir(AdministradorDB administrador) {
        super.inserir(administrador);
    }

    /**
     * Método para alterar um administrador cadastrado no sistema.
     * @param administrador O administrador a ser alterado.
     */
    @Override
    public void alterar(AdministradorDB administrador) {
        super.alterar(administrador);
    }
    
}
