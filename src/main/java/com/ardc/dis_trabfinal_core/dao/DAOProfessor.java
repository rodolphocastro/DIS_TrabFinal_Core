package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOProfessorInterface;
import com.ardc.dis_trabfinal_core.entity.database.ProfessorDB;
import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author alvesrc
 */
public class DAOProfessor extends DAOGenerico implements DAOProfessorInterface {
    
    /**
     * Método para listar os Professores cadastrados no sistema.
     * @return Uma lista contendo os professores cadastrados.
     */
    @Override
    public List<ProfessorDB> listar() {
        try {
            em = getEntityManager();
            Query q = em.createQuery("select p from professor p", ProfessorDB.class);
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
     * Método para inserir um novo professor no Sistema.
     * @param professor O professor a ser inserido.
     */
    @Override
    public void inserir(ProfessorDB professor) {
        professor.setDataCadastro(new Date());
        professor.setDataUltimaModificacao(new Date());
        professor.setPapel("professor");
        professor.setStatus("ativo");
        super.inserir(professor);
    }

    /**
     * Método para alterar um professor já cadastrado no sistema.
     * @param professor O professor a ser alterado.
     */
    @Override
    public void alterar(ProfessorDB professor) {
        professor.setDataUltimaModificacao(new Date());
        super.alterar(professor);
    }
}
