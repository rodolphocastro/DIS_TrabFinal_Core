package com.ardc.dis_trabfinal_core.business;


import com.ardc.dis_trabfinal_core.auth.Authenticator;
import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAlunoInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOPerguntasInterface;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOProjetoInterface;
import com.ardc.dis_trabfinal_core.entity.Avaliacao;
import com.ardc.dis_trabfinal_core.entity.DescPerguntas;
import com.ardc.dis_trabfinal_core.entity.Perguntas;
import com.ardc.dis_trabfinal_core.entity.Projeto;
import com.ardc.dis_trabfinal_core.entity.Respostas;
import com.ardc.dis_trabfinal_core.entity.database.AlunoDB;
import com.ardc.dis_trabfinal_core.entity.database.ProjetoDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe contendo as regras de negócio para as entidades do tipo Projeto.
 * @author ALVES, R.C.
 */
public class ProjetoBusiness {
    
    /**
     * Referencia ao DAO responsável pelas entidades do tipo Projeto.
     */
    private DAOProjetoInterface projetoDAO = DAOFactory.createDAOProjeto();

    /**
     * Referencia ao DAO responsável pelas entidades do tipo Aluno.
     */
    private DAOAlunoInterface alunoDAO = DAOFactory.createDAOAluno();

    /**
     * REferencia ao DAO responsável pelas entidades to tipo Perguntas
     */
    private DAOPerguntasInterface perguntasDAO = DAOFactory.createDAOPerguntas();

    /**
     * Referencia ao Authenticator para efetuar Login.
     */
    private Authenticator autenticacao = Authenticator.getAuth();

    /**
     * Método para listar os projetos cadastrados no sistema.
     * @return Uma lista contendo os projetos encontrados.
     */
    public List<Projeto> listar() {
        List<Projeto> projetos = new ArrayList<>();
        for (ProjetoDB projetoDB : projetoDAO.listar()) {
            projetos.add(ConversorDatabase.getProjeto(projetoDB));
        }
        return projetos;
    }

    /**
     * Método para listar os projetos liderados pelo atual usuário.
     * @return Uma lista contendo os projetos liderados pelo atual usuário.
     */
    public List<Projeto> listarPorLiderLogado() {
        List<Projeto> projetos = new ArrayList<>();
        for (ProjetoDB projetoDB : projetoDAO.pesquisarPorLider(autenticacao.getUsuarioAtual().getEmail())) {
            projetos.add(ConversorDatabase.getProjeto(projetoDB));
        }
        return projetos;
    }

    /**
     * Método para listar os projetos em que o atual usuário participa.
     * @return Uma lista contendo os projetos em que o usuário participa.
     */
    public List<Projeto> listarPorParticipanteLogado() {
        List<Projeto> projetos = new ArrayList<>();
        for (ProjetoDB projetoDB : projetoDAO.pesquisarPorMembro(autenticacao.getUsuarioAtual().getEmail())) {
            projetos.add(ConversorDatabase.getProjeto(projetoDB));
        }
        return projetos;
    }

    /**
     * Método para listar os projetos em que o atual usuário orientador participa.
     * @return Uma lista contendo os projetos orientados pelo atual usuário.
     */
    public List<Projeto> listarPorOrientadorLogado() {
        List<Projeto> projetos = new ArrayList<>();
        for (ProjetoDB projetoDB : projetoDAO.pesquisarPorOrientador(autenticacao.getUsuarioAtual().getEmail())) {
            projetos.add(ConversorDatabase.getProjeto(projetoDB));
        }
        return projetos;
    }

    /**
     * Método para listar os projetos em que o atual usuário avaliou.
     * @return Uma lista contendo os projetos avaliados pelo atual usuário.
     */
    public List<Projeto> listarPorAvaliadorLogado() {
        List<Projeto> projetos = new ArrayList<>();
        for (ProjetoDB projetoDB : projetoDAO.pesquisarPorAvaliador(autenticacao.getUsuarioAtual().getEmail())) {
            projetos.add(ConversorDatabase.getProjeto(projetoDB));
        }
        return projetos;
    }

    /**
     * Método para finalizar a avaliação de um projeto.
     * @param projeto O projeto a ter a avaliação finalizada.
     */
    public void finalizarAvaliacaoProjeto(Projeto projeto) {
        ProjetoDB projetoDB = ConversorDatabase.getProjetoDB(projeto);
        float nota = 0;
        for (Avaliacao avaliacao : projeto.getAvaliacoes()) {
            nota += avaliacao.getNota();
        }
        nota = nota / projeto.getAvaliacoes().size();
        if (nota >= 7) {
            projetoDB.setStatus("aprovado");
        } else {
            projetoDB.setStatus("reprovado");
        }
        projetoDB.setDataUltimaModificacao(new Date());
        projetoDAO.alterar(projetoDB);
    }

    /**
     * Método para inserir um projeto na database.
     * @param projeto
     * @return 
     */
    public boolean inserir(Projeto projeto) {
        List<ProjetoDB> projetos = projetoDAO.pesquisarPorLider(autenticacao.getUsuarioAtual().getEmail());
        for (ProjetoDB projetoDB : projetos) {
            if (!(projetoDB.getStatus().equals("encerrado") || projetoDB.getStatus().equals("inativo")
                    || projetoDB.getStatus().equals("reprovado"))) {
                return false;
            }
        }
        ProjetoDB projetoDB = ConversorDatabase.getProjetoDB(projeto);
        projetoDB.setDataCriacao(new Date());
        projetoDB.setDataUltimaModificacao(new Date());
        projetoDB.setStatus("ativo");
        projetoDB.setLider((AlunoDB) alunoDAO.buscar(AlunoDB.class, autenticacao.getUsuarioAtual().getEmail()));
        projetoDAO.inserir(projetoDB);
        return true;
    }

    /**
     * Método para alterar um projeto já cadastrado no sistema.
     * @param projeto O projeto a ser alterado.
     */
    public void alterar(Projeto projeto) {
        ProjetoDB projetoDB = ConversorDatabase.getProjetoDB(projeto);
        projetoDB.setDataUltimaModificacao(new Date());
        projetoDAO.alterar(projetoDB);
    }

    /**
     * Método para salvar as atuais alterações feitas a um projeto.
     * @param projeto O projeto a ser alterado.
     */
    public void salvarAlteracoes(Projeto projeto) {
        ProjetoDB projetoDB = ConversorDatabase.getProjetoDB(projeto);
        projetoDB.setDataUltimaModificacao(new Date());
        projetoDB.setStatus("em preenchimento");
        projetoDAO.alterar(projetoDB);
    }

    /**
     * Método para finalizar o preenchimento de um projeto.
     * @param projeto O projeto WIP.
     * @return Retorna TRUE caso seja possível finalizar, FALSE caso contrário.
     */
    public boolean finalizarPreenchimento(Projeto projeto) {
        ProjetoDB projetoDB = ConversorDatabase.getProjetoDB(projeto);
        if (verificarRespostas(ConversorDatabase.getRespostas(projetoDB.getRespostas()))) {
            projetoDB.setDataUltimaModificacao(new Date());
            projetoDB.setStatus("em avaliação");
            projetoDAO.alterar(projetoDB);
            return true;
        }
        return false;
    }

    /**
     * Método para verificar as respostas.
     * @param respostas As respostas a serem verificadas.
     * @return 
     */
    private boolean verificarRespostas(Respostas respostas) {
        if (respostas.getQuadro1Resposta1().trim().length() == 0
                || respostas.getQuadro1Resposta2().trim().length() == 0
                || respostas.getQuadro1Resposta3().trim().length() == 0
                || respostas.getQuadro1Resposta4().trim().length() == 0
                || respostas.getQuadro2Resposta1().trim().length() == 0
                || respostas.getQuadro2Resposta2().trim().length() == 0
                || respostas.getQuadro2Resposta3().trim().length() == 0
                || respostas.getQuadro2Resposta4().trim().length() == 0
                || respostas.getQuadro3Resposta1().trim().length() == 0
                || respostas.getQuadro3Resposta2().trim().length() == 0
                || respostas.getQuadro3Resposta3().trim().length() == 0
                || respostas.getQuadro4Resposta1().trim().length() == 0
                || respostas.getQuadro4Resposta2().trim().length() == 0
                || respostas.getQuadro4Resposta3().trim().length() == 0
                || respostas.getQuadro4Resposta4().trim().length() == 0
                || respostas.getQuadro5Resposta1().trim().length() == 0
                || respostas.getQuadro5Resposta2().trim().length() == 0
                || respostas.getQuadro5Resposta3().trim().length() == 0
                || respostas.getQuadro5Resposta4().trim().length() == 0
                || respostas.getQuadro6Resposta1().trim().length() == 0
                || respostas.getQuadro6Resposta2().trim().length() == 0
                || respostas.getQuadro6Resposta3().trim().length() == 0
                || respostas.getQuadro6Resposta4().trim().length() == 0
                || respostas.getQuadro6Resposta5().trim().length() == 0
                || respostas.getQuadro6Resposta6().trim().length() == 0
                || respostas.getQuadro7Resposta1().trim().length() == 0
                || respostas.getQuadro7Resposta2().trim().length() == 0
                || respostas.getQuadro8Resposta1().trim().length() == 0
                || respostas.getQuadro8Resposta2().trim().length() == 0
                || respostas.getQuadro8Resposta3().trim().length() == 0
                || respostas.getQuadro9Resposta1().trim().length() == 0
                || respostas.getQuadro9Resposta2().trim().length() == 0
                || respostas.getQuadro9Resposta3().trim().length() == 0
                || respostas.getQuadro9Resposta4().trim().length() == 0
                || respostas.getQuadro9Resposta5().trim().length() == 0) {

            return false;
        }
        return true;
    }

    /**
     * Método para remover um projeto do sistema.
     * @param codProjeto O código do projeto a ser removido.
     */
    public void remover(long codProjeto) {
        projetoDAO.remover(ProjetoDB.class, codProjeto);
    }

    /**
     * Método para retornar as perguntas relacionadas a um projeto.
     * @return O conjunto de perguntas encontrados.
     */
    public Perguntas getPerguntas() {
        Perguntas perguntas = ConversorDatabase.getPerguntas(perguntasDAO.listar().get(0));
        return perguntas;
    }

    /**
     * Método para buscar um projeto com base em seu código.
     * @param codProjeto O código do projeto a ser localizado.
     * @return O projeto encontrado.
     */
    public Projeto pesquisarPorCodigo(long codProjeto) {
        return ConversorDatabase.getProjeto((ProjetoDB) projetoDAO.buscar(ProjetoDB.class, codProjeto));
    }

    /**
     * Método para retornar a descrição das perguntas.
     * @return 
     */
    public DescPerguntas getDescricaoPerguntas() {
        return perguntasDAO.getDescricaoPerguntas();
    }
}
