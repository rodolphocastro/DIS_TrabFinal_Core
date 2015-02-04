package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.entity.Administrador;
import com.ardc.dis_trabfinal_core.entity.Aluno;
import com.ardc.dis_trabfinal_core.entity.Avaliador;
import com.ardc.dis_trabfinal_core.entity.Professor;
import com.ardc.dis_trabfinal_core.entity.Usuario;
import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import com.ardc.dis_trabfinal_core.entity.database.AlunoDB;
import com.ardc.dis_trabfinal_core.entity.database.AvaliadorDB;
import com.ardc.dis_trabfinal_core.entity.database.ProfessorDB;
import com.ardc.dis_trabfinal_core.entity.database.UsuarioDB;

/**
 * Classe responsável por adequar os objetos xxxDB em xxx.
 * @author alvesrc
 */
public class ConversorDatabase {
    
    /**
     * Método para converter um UsuarioDB em um Usuario.
     * @param usuarioDB O usuário a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static Usuario getUsuario(UsuarioDB usuarioDB) {
        if (usuarioDB != null) {
            Usuario usuario = new Usuario();
            usuario.setEmail(usuarioDB.getEmail());
            usuario.setNome(usuarioDB.getNome());
            usuario.setPapel(usuarioDB.getPapel());
            usuario.setSenha(usuarioDB.getSenha());
            usuario.setStatus(usuarioDB.getStatus());
            usuario.setDataCadastro(usuarioDB.getDataCadastro());
            usuario.setDataUltimaModificacao(usuarioDB.getDataUltimaModificacao());
            return usuario;
        }
        return null;
    }

    /**
     * Método para converter um AdministradorDB em um Administrador.
     * @param administradorDB O administrador a ser convertido.
     * @return Wololo. O resultado da conversão. Retorna null em caso de erros.
     */
    public static Administrador getAdministrador(AdministradorDB administradorDB) {
        if (administradorDB != null) {
            Administrador administrador = new Administrador();
            administrador.setEmail(administradorDB.getEmail());
            administrador.setNome(administradorDB.getNome());
            administrador.setPapel(administradorDB.getPapel());
            administrador.setSenha(administradorDB.getSenha());
            administrador.setStatus(administradorDB.getStatus());
            administrador.setDataCadastro(administradorDB.getDataCadastro());
            administrador.setDataUltimaModificacao(administradorDB.getDataUltimaModificacao());
            return administrador;
        }
        return null;
    }

    /**
     * Método para converter um Administrador em um AdministradorDB.
     * @param administrador O administrador a ser convertido.
     * @return O resultado a conversão. Retorna null em caso de erros.
     */
    public static AdministradorDB getAdministradorDB(Administrador administrador) {
        if (administrador != null) {
            AdministradorDB administradorDB = new AdministradorDB();
            administradorDB.setEmail(administrador.getEmail());
            administradorDB.setNome(administrador.getNome());
            administradorDB.setPapel(administrador.getPapel());
            administradorDB.setSenha(administrador.getSenha());
            administradorDB.setStatus(administrador.getStatus());
            administradorDB.setDataCadastro(administrador.getDataCadastro());
            administradorDB.setDataUltimaModificacao(administrador.getDataUltimaModificacao());
            return administradorDB;
        }
        return null;
    }

    /**
     * Método para converter um AvaliadorDB em um Avaliador.
     * @param avaliadorDB O avaliador a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static Avaliador getAvaliador(AvaliadorDB avaliadorDB) {
        if (avaliadorDB != null) {
            Avaliador avaliador = new Avaliador();
            avaliador.setEmail(avaliadorDB.getEmail());
            avaliador.setNome(avaliadorDB.getNome());
            avaliador.setPapel(avaliadorDB.getPapel());
            avaliador.setSenha(avaliadorDB.getSenha());
            avaliador.setStatus(avaliadorDB.getStatus());
            avaliador.setDataCadastro(avaliadorDB.getDataCadastro());
            avaliador.setDataUltimaModificacao(avaliadorDB.getDataUltimaModificacao());
            avaliador.setFormacao(avaliadorDB.getFormacao());
            avaliador.setAreaAtuacao(avaliadorDB.getAreaAtuacao());
            return avaliador;
        }
        return null;

    }

    /**
     * Método para converter um Avaliador em um AvaliadorDB.
     * @param avaliador O avaliador a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static AvaliadorDB getAvaliadorDB(Avaliador avaliador) {
        if (avaliador != null) {
            AvaliadorDB avaliadorDB = new AvaliadorDB();
            avaliadorDB.setEmail(avaliador.getEmail());
            avaliadorDB.setNome(avaliador.getNome());
            avaliadorDB.setPapel(avaliador.getPapel());
            avaliadorDB.setSenha(avaliador.getSenha());
            avaliadorDB.setStatus(avaliador.getStatus());
            avaliadorDB.setDataCadastro(avaliador.getDataCadastro());
            avaliadorDB.setDataUltimaModificacao(avaliador.getDataUltimaModificacao());
            avaliadorDB.setFormacao(avaliador.getFormacao());
            avaliadorDB.setAreaAtuacao(avaliador.getAreaAtuacao());
            return avaliadorDB;
        }
        return null;

    }

    /**
     * Método para converter um ProfessorDB em um Professor.
     * @param professorDB O professor a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static Professor getProfessor(ProfessorDB professorDB) {
        if (professorDB != null) {
            Professor professor = new Professor();
            professor.setEmail(professorDB.getEmail());
            professor.setNome(professorDB.getNome());
            professor.setPapel(professorDB.getPapel());
            professor.setSenha(professorDB.getSenha());
            professor.setStatus(professorDB.getStatus());
            professor.setDataCadastro(professorDB.getDataCadastro());
            professor.setDataUltimaModificacao(professorDB.getDataUltimaModificacao());
            professor.setDepartamento(professorDB.getDepartamento());
            professor.setDisciplinaPrincipal(professorDB.getDisciplinaPrincipal());
            return professor;
        }
        return null;

    }

    /**
     * Método para converter um Professor em um ProfessorDB.
     * @param professor O professor a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static ProfessorDB getProfessorDB(Professor professor) {
        if (professor != null) {
            ProfessorDB professorDB = new ProfessorDB();
            professorDB.setEmail(professor.getEmail());
            professorDB.setNome(professor.getNome());
            professorDB.setPapel(professor.getPapel());
            professorDB.setSenha(professor.getSenha());
            professorDB.setStatus(professor.getStatus());
            professorDB.setDataCadastro(professor.getDataCadastro());
            professorDB.setDataUltimaModificacao(professor.getDataUltimaModificacao());
            professorDB.setDepartamento(professor.getDepartamento());
            professorDB.setDisciplinaPrincipal(professor.getDisciplinaPrincipal());
            return professorDB;
        }
        return null;

    }

    /**
     * Método para converter um AlunoDB em Aluno.
     * @param alunoDB O aluno a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static Aluno getAluno(AlunoDB alunoDB) {
        if (alunoDB != null) {
            Aluno aluno = new Aluno();
            aluno.setEmail(alunoDB.getEmail());
            aluno.setNome(alunoDB.getNome());
            aluno.setPapel(alunoDB.getPapel());
            aluno.setSenha(alunoDB.getSenha());
            aluno.setStatus(alunoDB.getStatus());
            aluno.setDataCadastro(alunoDB.getDataCadastro());
            aluno.setDataUltimaModificacao(alunoDB.getDataUltimaModificacao());
            aluno.setCurso(alunoDB.getCurso());
            aluno.setPeriodo(alunoDB.getPeriodo());
            aluno.setMatricula(alunoDB.getMatricula());
            return aluno;
        }
        return null;

    }

    /**
     * Método para converter um Aluno em um AlunoDB.
     * @param aluno O aluno a ser convertido.
     * @return O resultado da conversão. Retorna null em caso de erros.
     */
    public static AlunoDB getAlunoDB(Aluno aluno) {
        if (aluno != null) {
            AlunoDB alunoDB = new AlunoDB();
            alunoDB.setEmail(aluno.getEmail());
            alunoDB.setNome(aluno.getNome());
            alunoDB.setPapel(aluno.getPapel());
            alunoDB.setSenha(aluno.getSenha());
            alunoDB.setStatus(aluno.getStatus());
            alunoDB.setDataCadastro(aluno.getDataCadastro());
            alunoDB.setDataUltimaModificacao(aluno.getDataUltimaModificacao());
            alunoDB.setCurso(aluno.getCurso());
            alunoDB.setPeriodo(aluno.getPeriodo());
            alunoDB.setMatricula(aluno.getMatricula());
            return alunoDB;
        }
        return null;

    }
}
