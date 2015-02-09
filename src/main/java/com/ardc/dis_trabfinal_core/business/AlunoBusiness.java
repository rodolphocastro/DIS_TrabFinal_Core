package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.auth.Authenticator;
import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOAlunoInterface;
import com.ardc.dis_trabfinal_core.entity.Aluno;
import com.ardc.dis_trabfinal_core.entity.database.AlunoDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe responsável pelas regras de negócio para as entidades do tipo Aluno.
 * @author alvesrc
 */
public class AlunoBusiness {
    
    /**
     * DAO para acesso às entidades do tipo Aluno.
     */
    private DAOAlunoInterface daoAluno = DAOFactory.createDAOAluno();
    
    /**
     * Referência ao autenticador.
     */
    private Authenticator auth = Authenticator.getAuth();
    
    /**
     * Método para listar os alunos cadastrados no sistema.
     * @return Uma lista contendo os alunos cadastrados.
     */
    public List<Aluno> listar() {
        List<Aluno> listagem = new ArrayList<>();
        for (AlunoDB alunoDB : daoAluno.listar()) {
            listagem.add(ConversorDatabase.getAluno(alunoDB));
        }
        return listagem;
    }
    
    /**
     * Método para inserir um aluno no sistema.
     * @param aluno O aluno a ser cadastrado no sistema.
     */
    public void inserir(Aluno aluno) {
        AlunoDB alunoDB = ConversorDatabase.getAlunoDB(aluno);
        alunoDB.setPapel("aluno");
        alunoDB.setStatus("ativo");
        alunoDB.setDataCadastro(new Date());
        alunoDB.setDataUltimaModificacao(new Date());
        daoAluno.inserir(alunoDB);
    }
    
    /**
     * Método para alterar um aluno já cadastrado no sistema.
     * @param aluno O aluno a ser cadastrado no sistema.
     */
    public void alterar(Aluno aluno) {
        AlunoDB alunoDB = ConversorDatabase.getAlunoDB(aluno);
        alunoDB.setDataUltimaModificacao(new Date());
        daoAluno.alterar(alunoDB);
    }
    
    /**
     * Método para remover um aluno cadastrado no sistema.
     * @param email O e-mail do aluno.
     */
    public void remover(String codAluno){
        daoAluno.remover(Aluno.class, codAluno);
    }
    
    /**
     * Método para pesquisar um aluno cadastrado no sistema.
     * @param codAluno O código do aluno a ser buscado.
     * @return O aluno encontrado.
     */
    public Aluno pesquisar(String codAluno) {
        AlunoDB alunoDB = (AlunoDB) daoAluno.buscar(AlunoDB.class, codAluno);
        return ConversorDatabase.getAluno(alunoDB);
    }
    
    /**
     * Método para listar os membros de um projeto.
     * @param codProjeto O código do projeto a ser analisado.
     * @return Uma lista contendo os alunos que participam do projeto.
     */
    public List<Aluno> listarMembrosProjeto(long codProjeto) {
        List<Aluno> listagem = new ArrayList<>();
        for (AlunoDB alunoDB : daoAluno.listarPorProjeto(codProjeto)) {
            listagem.add(ConversorDatabase.getAluno(alunoDB));
        }
        return listagem;
    }

    /**
     * Método para listar os alunos menos logados.
     * @return Retorna uma lista contendo os alunos que menos logaram no sistema.
     */
    public List<Aluno> listarMenosLogado() {
        List<Aluno> listagem = new ArrayList<>();
        for (AlunoDB alunoDB : daoAluno.listar()) {
            if (!alunoDB.getEmail().equals(auth.getUsuarioAtual().getEmail())) {
                listagem.add(ConversorDatabase.getAluno(alunoDB));
            }
        }
        return listagem;
    }
    
}
