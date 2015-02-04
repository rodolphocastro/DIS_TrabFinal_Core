package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import java.util.List;

/**
 * Interface para o DAO da entidade administrador.
 * @author alvesrc
 */
public interface DAOAdministradorInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar o administradores cadastrados no sistema.
     * @return 
     */
    public List<AdministradorDB> listar();

    /**
     * Método para inserir administradores no sistema.
     * @param administrador O administrador a ser inserido.
     */
    public void inserir(AdministradorDB administrador);

    /**
     * Método para alterar um administrador cadastrado no sistema.
     * @param administrador O administrador a ser alterado.
     */
    public void alterar(AdministradorDB administrador);
}
