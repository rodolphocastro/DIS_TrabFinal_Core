package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.database.ProjetoDB;
import java.util.List;

/**
 * Interface contendo os métodos a serem implementados pelo DAOProjeto.
 * @author ALVES, R.C.
 */
public interface DAOProjetoInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar todos os projetos cadastrados no sistema.
     * @return Uma lista contendo todos os projetos cadastrados.
     */
    public List<ProjetoDB> listar();

    /**
     * Método para listar todos os projetos liderados por um aluno.
     * @param emailLider O e-mail do aluno a ser pesquisado.
     * @return Uma lista contendo todos os projetos encontrados.
     */
    public List<ProjetoDB> pesquisarPorLider(String emailLider);

    /**
     * Método para listar todos os projetos orientados por um determinado professor.
     * @param emailOrientador O e-mail do professor a ser pesquisado.
     * @return Uma lista contendo todos os projetos orientados pelo professor determinado.
     */
    public List<ProjetoDB> pesquisarPorOrientador(String emailOrientador);

    /**
     * Método para listar os projetos com base em um determinado membro.
     * @param emailMembro O e-mail do membro a ser considerado.
     * @return Uma lista contendo os projetos encontrados.
     */
    public List<ProjetoDB> pesquisarPorMembro(String emailMembro);

    /**
     * Método para listar os projetos avaliados por um determinado avaliador.
     * @param emailAvaliador O e-mail do avaliador a ser considerado.
     * @return Uma lista contendo os projetos encontrados.
     */
    public List<ProjetoDB> pesquisarPorAvaliador(String emailAvaliador);

    /**
     * Método para cadastrar um novo projeto na database.
     * @param projeto  O projeto a ser inserido.
     */
    public void inserir(ProjetoDB projeto);

    /**
     * Método para alterar um projeto previamente cadastrado na database.
     * @param projeto O projeto a ser removido.
     */
    public void alterar(ProjetoDB projeto);
}
