package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.database.AvaliadorDB;
import java.util.List;

/**
 * Interface para o DAO da entidade Avaliador.
 * @author alvesrc
 */
public interface DAOAvaliadorInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar os avaliadores cadastrados no sistema.
     * @return 
     */
    public List<AvaliadorDB> listar();
    
    /**
     * Método para inserir um avaliador no sistema.
     * @param avaliador 
     */
    public void inserir(AvaliadorDB avaliador);
    
    /**
     * Método para alterar um avaliador cadastrado no sistema.
     * @param avaliador 
     */
    public void alterar(AvaliadorDB avaliador);
    
}
