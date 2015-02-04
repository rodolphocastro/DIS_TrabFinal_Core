package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAvaliadorInterface;
import com.ardc.dis_trabfinal_core.entity.Avaliador;
import com.ardc.dis_trabfinal_core.entity.database.AvaliadorDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe para as regras de negocio para as entidades do tipo Avaliador.
 * @author alvesrc
 */
public class AvaliadorBusiness {
    
    /**
     * DAO para acesso aos objetos da entidade Avaliador.
     */
    private DAOAvaliadorInterface daoAvaliador = DAOFactory.createDAOAvaliador();
    
    /**
     * Método para listar os avaliadores cadastrados no sistema.
     * @return Uma lista contendo os avaliadores.
     */
    public List<Avaliador> listar() {
        List<Avaliador> listagem = new ArrayList<>();
        for (AvaliadorDB avaliadorDB : daoAvaliador.listar()) {
            listagem.add(ConversorDatabase.getAvaliador(avaliadorDB));
        }
        return listagem;
    }
    
    /**
     * Método para inserir um novo avaliador no sistema.
     * @param avaliador O avaliador a ser inserido.
     */
    public void inserir(Avaliador avaliador) {
        AvaliadorDB avaliadorDB = ConversorDatabase.getAvaliadorDB(avaliador);
        avaliadorDB.setPapel("avaliador");
        avaliadorDB.setStatus("ativo");
        avaliadorDB.setDataCadastro(new Date());
        avaliadorDB.setDataUltimaModificacao(new Date());
        daoAvaliador.inserir(avaliadorDB);
    }
    
    /**
     * Método para alterar um avaliador cadastrado no sistema.
     * @param avaliador O avaliador a ser alterado.
     */
    public void alterar(Avaliador avaliador) {
        AvaliadorDB avaliadorDB = ConversorDatabase.getAvaliadorDB(avaliador);
        avaliadorDB.setDataUltimaModificacao(new Date());
        daoAvaliador.alterar(avaliadorDB);
    }
    
    /**
     * Método para remover um avaliador do sistema.
     * @param emailAvaliador O e-mail do avaliador a ser removido.
     */
    public void remover(String emailAvaliador) {
        //Quando houverem avaliações, será necessário atualizar esse método. @alvesrc
        daoAvaliador.remover(AvaliadorDB.class, emailAvaliador);
    }
}
