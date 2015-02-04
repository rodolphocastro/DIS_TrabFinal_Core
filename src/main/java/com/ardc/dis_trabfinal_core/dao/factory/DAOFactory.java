package com.ardc.dis_trabfinal_core.dao.factory;

import com.ardc.dis_trabfinal_core.dao.DAOAdministrador;
import com.ardc.dis_trabfinal_core.dao.DAOAluno;
import com.ardc.dis_trabfinal_core.dao.DAOAvaliador;
import com.ardc.dis_trabfinal_core.dao.DAOGenerico;
import com.ardc.dis_trabfinal_core.dao.DAOProfessor;
import com.ardc.dis_trabfinal_core.dao.DAOUsuario;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAdministradorInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAlunoInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAvaliadorInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOGenericoInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOProfessorInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOUsuarioInterface;

/**
 * Factory para os DAOs.
 * @author alvesrc
 */
public class DAOFactory {
    
    /**
     * Método para criar um novo DAOGenerico.
     * @return Um novo DAOGenerico.
     */
    public static DAOGenericoInterface createDAOGenerico(){
        return new DAOGenerico();
    }
    
    /**
     * Método para criar um novo DAOAdministrador.
     * @return Um novo DAOAdministrador.
     */
    public static DAOAdministradorInterface createDAOAdministrador(){
        return new DAOAdministrador();
    }
    
    /**
     * Método para criar um novo DAOAluno.
     * @return Um novo DAOAluno.
     */
    public static DAOAlunoInterface createDAOAluno(){
        return new DAOAluno();
    }
    
    /**
     * Método para criar um novo DAOAvaliador.
     * @return Um novo DAOAvaliador.
     */
    public static DAOAvaliadorInterface createDAOAvaliador(){
        return new DAOAvaliador();
    }
    
    /**
     * Método para criar um novo DAOUsuario.
     * @return Um novo DAOUsuario.
     */
    public static DAOUsuarioInterface createDAOUsuario(){
        return new DAOUsuario();
    }
    
    /**
     * Método para criar um novo DAOProfessor
     * @return Um novo DAOProfessor.
     */
    public static DAOProfessorInterface createDAOProfessor(){
        return new DAOProfessor();
    }
}
