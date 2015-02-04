package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAdministradorInterface;
import com.ardc.dis_trabfinal_core.entity.Administrador;
import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe contendo as regras de negócio para a entidade Administrador.
 * @author alvesrc
 */
public class AdministradorBusiness {
    
    /**
     * DAO Para acesso às entidades do tipo administrador.
     */
    private DAOAdministradorInterface daoAdm = DAOFactory.createDAOAdministrador();
    
    /**
     * Método para listar os administradores cadastrados no sistema.
     * @return Lista contendo os administradores cadastrados.
     */
    public List<Administrador> listar(){
        List<Administrador> listagem = new ArrayList<>();
        for (AdministradorDB administradorDB : daoAdm.listar()) {
            listagem.add(ConversorDatabase.getAdministrador(administradorDB));
        }
        return listagem;
    }
    
    /**
     * Método para inserir um Administrador no sistema.
     * @param administrador O administrador a ser inserido.
     */
    public void inserir(Administrador administrador) {
        AdministradorDB administradorDB = ConversorDatabase.getAdministradorDB(administrador);
        administradorDB.setPapel("administrador");
        administradorDB.setStatus("ativo");
        administradorDB.setDataCadastro(new Date());
        administradorDB.setDataUltimaModificacao(new Date());
        daoAdm.inserir(administradorDB);
    }
    
    /**
     * Método para alterar um Administrador no sistema.
     * @param administrador O administrador a ser alterado.
     */
    public void alterar(Administrador administrador) {
        AdministradorDB administradorDB = ConversorDatabase.getAdministradorDB(administrador);
        administradorDB.setDataUltimaModificacao(new Date());
        daoAdm.alterar(administradorDB);
    }
    
    /**
     * Método para remover um Administrador no sistema.
     * @param emailAdministrador O email do administrador a ser removido.
     * @return TRUE caso o admin seja removido com sucesso, FALSE caso não seja possível remover.
     */
    public boolean remover(String emailAdministrador) {
        List<AdministradorDB> administradores = daoAdm.listar();
        if (administradores.size() > 1) {
            daoAdm.remover(AdministradorDB.class, emailAdministrador);
            return true;
        }
        return false;
    }
}
