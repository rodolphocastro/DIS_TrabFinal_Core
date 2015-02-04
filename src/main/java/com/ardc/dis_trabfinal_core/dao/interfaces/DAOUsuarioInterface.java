package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.database.UsuarioDB;
import java.util.List;

/**
 * Interface para DAO da entidade Usuário.
 * @author alvesrc
 */
public interface DAOUsuarioInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar os usuários.
     * @return 
     */
    public List<UsuarioDB> listar();
    
    /**
     * Método para autenticar usuários.
     * @param email O e-mail informado do usuário.
     * @param senha A senha informada pelo usuário.
     * @return O usuário encontrado.
     */
    public UsuarioDB pesquisarPorEmailSenha(String email, String senha);
}
