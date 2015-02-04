package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOProfessorInterface;
import com.ardc.dis_trabfinal_core.entity.Professor;
import com.ardc.dis_trabfinal_core.entity.database.ProfessorDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe para lidar com as regras de negócio referentes à entidade do tipo Professor.
 * @author alvesrc
 */
public class ProfessorBusiness {
    
    /**
     * DAO para acesso às entidades do tipo Professor.
     */
    private DAOProfessorInterface daoProf = DAOFactory.createDAOProfessor();
    
    /**
     * Método para listar os professores cadastrados no sistema.
     * @return Uma lista contendo os professores cadastrados.
     */
    public List<Professor> listar() {
        List<Professor> listagem = new ArrayList<>();
        for (ProfessorDB professorDB : daoProf.listar()) {
            listagem.add(ConversorDatabase.getProfessor(professorDB));
        }
        return listagem;
    }
    
    /**
     * Método para inserir um novo professor no sistema.
     * @param professor O professor a ser inserido.
     */
    public void inserir(Professor professor) {
        ProfessorDB professorDB = ConversorDatabase.getProfessorDB(professor);
        professorDB.setPapel("professor");
        professorDB.setStatus("ativo");
        professorDB.setDataCadastro(new Date());
        professorDB.setDataUltimaModificacao(new Date());
        daoProf.inserir(professorDB);
    }
    
    /**
     * Método para alterar um professor cadastrado no sistema. 
     * @param professor O professor a ser alterado.
     */
    public void alterar(Professor professor) {
        ProfessorDB professorDB = ConversorDatabase.getProfessorDB(professor);
        professorDB.setDataUltimaModificacao(new Date());
        daoProf.alterar(professorDB);
    }
    
    /**
     * Método para remover um professor do sistema.
     * @param emailProfessor O e-mail do professor a ser removido.
     */
    public void remover(String emailProfessor) {
        //Ao adicionar projetos, será necessário rever este método. @alvesrc
        daoProf.remover(ProfessorDB.class, emailProfessor);
    }
}
