package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.database.AlunoDB;
import java.util.List;

/**
 * Interface para o DAO da entity Aluno.
 * @author alvesrc
 */
public interface DAOAlunoInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar os alunos cadastrados no sistema.
     * @return Uma lista contendo os alunos cadastrados no sistema.
     */
    public List<AlunoDB> listar();
    
    /**
     * Método para inserir um novo aluno no sistema.
     * @param aluno o aluno a ser inserido na database.
     */
    public void inserir(AlunoDB aluno);
    
    /**
     * Método para alterar um aluno já cadastrado no sistema.
     * @param aluno 
     */
    public void alterar(AlunoDB aluno);
    
}
