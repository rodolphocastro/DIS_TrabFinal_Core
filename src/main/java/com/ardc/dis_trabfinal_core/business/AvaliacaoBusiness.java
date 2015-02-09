package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.dao.DAOAvaliacao;
import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAvaliacaoInterface;
import com.ardc.dis_trabfinal_core.entity.Avaliacao;
import com.ardc.dis_trabfinal_core.entity.database.AvaliacaoDB;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe contendo as regras de negócio referentes à entidade Avaliacao.
 * @author ALVES, R.C.
 */
public class AvaliacaoBusiness {
    /**
     * Referência ao DAO das entidades Avaliacao.
     */
    private DAOAvaliacaoInterface avaliacaoDAO = DAOFactory.createDAOAvaliacao();

    /**
     * Método para listar as avaliações cadastradas no sistema.
     * @return Uma lista contendo as avaliações.
     */
    public List<Avaliacao> listar() {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        for (AvaliacaoDB avaliacaoDB : avaliacaoDAO.listar()) {
            avaliacoes.add(ConversorDatabase.getAvaliacao(avaliacaoDB));
        }
        return avaliacoes;
    }

    /**
     * Método para listar as avaliações de um projeto.
     * @param codProjeto O código do projeto a ser pesquisado.
     * @return Uma lista contendo as avaliações do projeto.
     */
    public List<Avaliacao> listarPorProjeto(long codProjeto) {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        for (AvaliacaoDB avaliacaoDB : avaliacaoDAO.listarPorProjeto(codProjeto)) {
            avaliacoes.add(ConversorDatabase.getAvaliacao(avaliacaoDB));
        }
        return avaliacoes;
    }

    /**
     * Método para listar as avaliações de um avaliador determinado.
     * @param emailAvaliador O email do avaliador a ser averiguado.
     * @return Uma lista contendo as avaliações realizadas pelo avaliador.
     */
    public List<Avaliacao> listarPorAvaliador(String emailAvaliador) {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        for (AvaliacaoDB avaliacaoDB : avaliacaoDAO.listarPorAvaliador(emailAvaliador)) {
            avaliacoes.add(ConversorDatabase.getAvaliacao(avaliacaoDB));
        }
        return avaliacoes;
    }

    /**
     * Método para buscar uma avaliação de um avaliador em um dado projeto.
     * @param codProjeto O código do projeto.
     * @param emailAvaliador O e-mail do avaliador.
     * @return A avaliação encontrada.
     */
    public Avaliacao pesquisarPorProjetoAvaliador(long codProjeto, String emailAvaliador) {
        return ConversorDatabase.getAvaliacao(avaliacaoDAO.pesquisarPorProjetoAvaliador(codProjeto, emailAvaliador));
    }

    /**
     * Método para inserir uma avaliação no sistema.
     * @param avaliacao A avaliação a ser inserida.
     */
    public void inserir(Avaliacao avaliacao) {
        AvaliacaoDB avaliacaoDB = ConversorDatabase.getAvaliacaoDB(avaliacao);
        avaliacaoDB.setAvaliado(false);
        avaliacaoDAO.inserir(avaliacaoDB);
    }

    /**
     * Método para alterar uma avaliação cadastrada no sistema.
     * @param avaliacao A avaliação a ser alterada.
     */
    public void alterar(Avaliacao avaliacao) {
        avaliacaoDAO.alterar(ConversorDatabase.getAvaliacaoDB(avaliacao));
    }

    /**
     * Método para remover uma avaliação do sistema.
     * @param codAvaliacao O código da avaliação a ser removida.
     */
    public void remover(long codAvaliacao) {
        avaliacaoDAO.remover(codAvaliacao);
    }
}
