package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOUsuarioInterface;
import com.ardc.dis_trabfinal_core.entity.database.UsuarioDB;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author alvesrc
 */
public class DAOUsuario extends DAOGenerico implements DAOUsuarioInterface{

    /**
     * Método para listar todos os usuários cadastrados no sistema.
     * @return Uma lista com os usuários encontrados.
     */
    @Override
    public List<UsuarioDB> listar() {
        try{
            em = getEntityManager();
            Query q = em.createQuery("select a from administrador a", UsuarioDB.class);
            return q.getResultList();
        }catch(Exception err){
            return null;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }

    /**
     * Método para autenticar um usuário com base em seu e-mail e senha.
     * @param email O email informado pelo usuário.
     * @param senha A senha informada pelo usuário.
     * @return O usuário encontrado.
     */
    @Override
    public UsuarioDB pesquisarPorEmailSenha(String email, String senha) {
        try {
            em = getEntityManager();
            Query q = em.createQuery("select u from usuario u where u.email like :email and u.senha like :senha", UsuarioDB.class);
            q.setParameter("email", email);
            q.setParameter("senha", senha);
            return (UsuarioDB) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
