package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAlunoInterface;
import com.ardc.dis_trabfinal_core.entity.database.AlunoDB;
import java.util.List;
import javax.persistence.Query;

/**
 * Data Access Objeto para controlar a entidade Aluno.
 * @author alvesrc
 */
public class DAOAluno extends DAOGenerico implements DAOAlunoInterface{

    /**
     * Método para listar os alunos cadastrados no banco de dados.
     * @return Uma lista contendo os alunos encontrados.
     */
    @Override
    public List<AlunoDB> listar() {
        try{
            em = getEntityManager();
            Query q = em.createQuery("select a from aluno a", AlunoDB.class);
            return q.getResultList();
        } catch(Exception err){
            return null;
        } finally{
            if(em != null){
                em.close();
            }
        }
    }

    /**
     * Método para inserir um aluno no banco de dados.
     * @param aluno O aluno que será inserido no banco de dados.
     */
    @Override
    public void inserir(AlunoDB aluno) {
        super.inserir(aluno);
    }

    /**
     * Método para alterar um aluno cadastrado no banco de dados.
     * @param aluno O aluno a ser alterado no banco de dados.
     */
    @Override
    public void alterar(AlunoDB aluno) {
        super.alterar(aluno);
    }
    
}
