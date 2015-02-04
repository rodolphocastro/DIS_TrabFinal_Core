package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.database.ProfessorDB;
import java.util.List;

/**
 * Interface para os métodos do DAO referente à entidade Professor.
 * @author alvesrc
 */
public interface DAOProfessorInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar os Professores cadastrados no sistema.
     * @return Uma lista contendo os professores cadastrados.
     */
    public List<ProfessorDB> listar();
    
    /**
     * Método para inserir um professor no sistema.
     * @param professor O professor a ser inserido no sistema.
     */
    public void inserir(ProfessorDB professor);

    /**
     * Método para alterar um professor cadastrado no sistema.
     * @param professor O professor a ser alterado.
     */
    public void alterar(ProfessorDB professor);
}
