package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.entity.Administrador;
import com.ardc.dis_trabfinal_core.entity.Aluno;
import com.ardc.dis_trabfinal_core.entity.Avaliacao;
import com.ardc.dis_trabfinal_core.entity.Avaliador;
import com.ardc.dis_trabfinal_core.entity.Perguntas;
import com.ardc.dis_trabfinal_core.entity.Professor;
import com.ardc.dis_trabfinal_core.entity.Projeto;
import com.ardc.dis_trabfinal_core.entity.Respostas;
import com.ardc.dis_trabfinal_core.entity.Usuario;
import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import com.ardc.dis_trabfinal_core.entity.database.AlunoDB;
import com.ardc.dis_trabfinal_core.entity.database.AvaliacaoDB;
import com.ardc.dis_trabfinal_core.entity.database.AvaliadorDB;
import com.ardc.dis_trabfinal_core.entity.database.PerguntasDB;
import com.ardc.dis_trabfinal_core.entity.database.ProfessorDB;
import com.ardc.dis_trabfinal_core.entity.database.ProjetoDB;
import com.ardc.dis_trabfinal_core.entity.database.RespostasDB;
import com.ardc.dis_trabfinal_core.entity.database.UsuarioDB;
import java.util.ArrayList;
import java.util.List;

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
    
    /**
     * Método para converter de PerguntasDB para Perguntas.
     * @param perguntasDB As perguntas a serem convertidas.
     * @return O resultado da conversão.
     */
    public static Perguntas getPerguntas(PerguntasDB perguntasDB) {
        if (perguntasDB != null) {
            Perguntas perguntas = new Perguntas();
            perguntas.setQuadro1(perguntasDB.getQuadro1());
            perguntas.setQuadro1Pergunta1(perguntasDB.getQuadro1Pergunta1());
            perguntas.setQuadro1Pergunta2(perguntasDB.getQuadro1Pergunta2());
            perguntas.setQuadro1Pergunta3(perguntasDB.getQuadro1Pergunta3());
            perguntas.setQuadro1Pergunta4(perguntasDB.getQuadro1Pergunta4());
            perguntas.setQuadro2(perguntasDB.getQuadro2());
            perguntas.setQuadro2Pergunta1(perguntasDB.getQuadro2Pergunta1());
            perguntas.setQuadro2Pergunta2(perguntasDB.getQuadro2Pergunta2());
            perguntas.setQuadro2Pergunta3(perguntasDB.getQuadro2Pergunta3());
            perguntas.setQuadro2Pergunta4(perguntasDB.getQuadro2Pergunta4());
            perguntas.setQuadro3(perguntasDB.getQuadro3());
            perguntas.setQuadro3Pergunta1(perguntasDB.getQuadro3Pergunta1());
            perguntas.setQuadro3Pergunta2(perguntasDB.getQuadro3Pergunta2());
            perguntas.setQuadro3Pergunta3(perguntasDB.getQuadro3Pergunta3());
            perguntas.setQuadro4(perguntasDB.getQuadro4());
            perguntas.setQuadro4Pergunta1(perguntasDB.getQuadro4Pergunta1());
            perguntas.setQuadro4Pergunta2(perguntasDB.getQuadro4Pergunta2());
            perguntas.setQuadro4Pergunta3(perguntasDB.getQuadro4Pergunta3());
            perguntas.setQuadro4Pergunta4(perguntasDB.getQuadro4Pergunta4());
            perguntas.setQuadro5(perguntasDB.getQuadro5());
            perguntas.setQuadro5Pergunta1(perguntasDB.getQuadro5Pergunta1());
            perguntas.setQuadro5Pergunta2(perguntasDB.getQuadro5Pergunta2());
            perguntas.setQuadro5Pergunta3(perguntasDB.getQuadro5Pergunta3());
            perguntas.setQuadro5Pergunta4(perguntasDB.getQuadro5Pergunta4());
            perguntas.setQuadro6(perguntasDB.getQuadro6());
            perguntas.setQuadro6Pergunta1(perguntasDB.getQuadro6Pergunta1());
            perguntas.setQuadro6Pergunta2(perguntasDB.getQuadro6Pergunta2());
            perguntas.setQuadro6Pergunta3(perguntasDB.getQuadro6Pergunta3());
            perguntas.setQuadro6Pergunta4(perguntasDB.getQuadro6Pergunta4());
            perguntas.setQuadro6Pergunta5(perguntasDB.getQuadro6Pergunta5());
            perguntas.setQuadro6Pergunta6(perguntasDB.getQuadro6Pergunta6());
            perguntas.setQuadro7(perguntasDB.getQuadro7());
            perguntas.setQuadro7Pergunta1(perguntasDB.getQuadro7Pergunta1());
            perguntas.setQuadro7Pergunta2(perguntasDB.getQuadro7Pergunta2());
            perguntas.setQuadro8(perguntasDB.getQuadro8());
            perguntas.setQuadro8Pergunta1(perguntasDB.getQuadro8Pergunta1());
            perguntas.setQuadro8Pergunta2(perguntasDB.getQuadro8Pergunta2());
            perguntas.setQuadro8Pergunta3(perguntasDB.getQuadro8Pergunta3());
            perguntas.setQuadro9(perguntasDB.getQuadro9());
            perguntas.setQuadro9Pergunta1(perguntasDB.getQuadro9Pergunta1());
            perguntas.setQuadro9Pergunta2(perguntasDB.getQuadro9Pergunta2());
            perguntas.setQuadro9Pergunta3(perguntasDB.getQuadro9Pergunta3());
            perguntas.setQuadro9Pergunta4(perguntasDB.getQuadro9Pergunta4());
            perguntas.setQuadro9Pergunta5(perguntasDB.getQuadro9Pergunta5());
            return perguntas;
        }
        return null;

    }

    /**
     * Método para converter de Perguntas em PerguntasDB
     * @param perguntas As perguntas a serem convertidas.
     * @return 
     */
    public static PerguntasDB getPerguntasDB(Perguntas perguntas) {
        if (perguntas != null) {
            PerguntasDB perguntasDB = new PerguntasDB();
            perguntasDB.setQuadro1(perguntas.getQuadro1());
            perguntasDB.setQuadro1Pergunta1(perguntas.getQuadro1Pergunta1());
            perguntasDB.setQuadro1Pergunta2(perguntas.getQuadro1Pergunta2());
            perguntasDB.setQuadro1Pergunta3(perguntas.getQuadro1Pergunta3());
            perguntasDB.setQuadro1Pergunta4(perguntas.getQuadro1Pergunta4());
            perguntasDB.setQuadro2(perguntas.getQuadro2());
            perguntasDB.setQuadro2Pergunta1(perguntas.getQuadro2Pergunta1());
            perguntasDB.setQuadro2Pergunta2(perguntas.getQuadro2Pergunta2());
            perguntasDB.setQuadro2Pergunta3(perguntas.getQuadro2Pergunta3());
            perguntasDB.setQuadro2Pergunta4(perguntas.getQuadro2Pergunta4());
            perguntasDB.setQuadro3(perguntas.getQuadro3());
            perguntasDB.setQuadro3Pergunta1(perguntas.getQuadro3Pergunta1());
            perguntasDB.setQuadro3Pergunta2(perguntas.getQuadro3Pergunta2());
            perguntasDB.setQuadro3Pergunta3(perguntas.getQuadro3Pergunta3());
            perguntasDB.setQuadro4(perguntas.getQuadro4());
            perguntasDB.setQuadro4Pergunta1(perguntas.getQuadro4Pergunta1());
            perguntasDB.setQuadro4Pergunta2(perguntas.getQuadro4Pergunta2());
            perguntasDB.setQuadro4Pergunta3(perguntas.getQuadro4Pergunta3());
            perguntasDB.setQuadro4Pergunta4(perguntas.getQuadro4Pergunta4());
            perguntasDB.setQuadro5(perguntas.getQuadro5());
            perguntasDB.setQuadro5Pergunta1(perguntas.getQuadro5Pergunta1());
            perguntasDB.setQuadro5Pergunta2(perguntas.getQuadro5Pergunta2());
            perguntasDB.setQuadro5Pergunta3(perguntas.getQuadro5Pergunta3());
            perguntasDB.setQuadro5Pergunta4(perguntas.getQuadro5Pergunta4());
            perguntasDB.setQuadro6(perguntas.getQuadro6());
            perguntasDB.setQuadro6Pergunta1(perguntas.getQuadro6Pergunta1());
            perguntasDB.setQuadro6Pergunta2(perguntas.getQuadro6Pergunta2());
            perguntasDB.setQuadro6Pergunta3(perguntas.getQuadro6Pergunta3());
            perguntasDB.setQuadro6Pergunta4(perguntas.getQuadro6Pergunta4());
            perguntasDB.setQuadro6Pergunta5(perguntas.getQuadro6Pergunta5());
            perguntasDB.setQuadro6Pergunta6(perguntas.getQuadro6Pergunta6());
            perguntasDB.setQuadro7(perguntas.getQuadro7());
            perguntasDB.setQuadro7Pergunta1(perguntas.getQuadro7Pergunta1());
            perguntasDB.setQuadro7Pergunta2(perguntas.getQuadro7Pergunta2());
            perguntasDB.setQuadro8(perguntas.getQuadro8());
            perguntasDB.setQuadro8Pergunta1(perguntas.getQuadro8Pergunta1());
            perguntasDB.setQuadro8Pergunta2(perguntas.getQuadro8Pergunta2());
            perguntasDB.setQuadro8Pergunta3(perguntas.getQuadro8Pergunta3());
            perguntasDB.setQuadro9(perguntas.getQuadro9());
            perguntasDB.setQuadro9Pergunta1(perguntas.getQuadro9Pergunta1());
            perguntasDB.setQuadro9Pergunta2(perguntas.getQuadro9Pergunta2());
            perguntasDB.setQuadro9Pergunta3(perguntas.getQuadro9Pergunta3());
            perguntasDB.setQuadro9Pergunta4(perguntas.getQuadro9Pergunta4());
            perguntasDB.setQuadro9Pergunta5(perguntas.getQuadro9Pergunta5());
            return perguntasDB;
        }
        return null;

    }

    /**
     * Método para converter de respostasDB em respostas.
     * @param respostasDB as respostas a serem convertidas.
     * @return O resultado da conversão.
     */
    public static Respostas getRespostas(RespostasDB respostasDB) {
        if (respostasDB != null) {
            Respostas respostas = new Respostas();
            respostas.setCodigo(respostasDB.getCodigo());
            respostas.setQuadro1Resposta1(respostasDB.getQuadro1Resposta1());
            respostas.setQuadro1Resposta2(respostasDB.getQuadro1Resposta2());
            respostas.setQuadro1Resposta3(respostasDB.getQuadro1Resposta3());
            respostas.setQuadro1Resposta4(respostasDB.getQuadro1Resposta4());
            respostas.setQuadro2Resposta1(respostasDB.getQuadro2Resposta1());
            respostas.setQuadro2Resposta2(respostasDB.getQuadro2Resposta2());
            respostas.setQuadro2Resposta3(respostasDB.getQuadro2Resposta3());
            respostas.setQuadro2Resposta4(respostasDB.getQuadro2Resposta4());
            respostas.setQuadro3Resposta1(respostasDB.getQuadro3Resposta1());
            respostas.setQuadro3Resposta2(respostasDB.getQuadro3Resposta2());
            respostas.setQuadro3Resposta3(respostasDB.getQuadro3Resposta3());
            respostas.setQuadro4Resposta1(respostasDB.getQuadro4Resposta1());
            respostas.setQuadro4Resposta2(respostasDB.getQuadro4Resposta2());
            respostas.setQuadro4Resposta3(respostasDB.getQuadro4Resposta3());
            respostas.setQuadro4Resposta4(respostasDB.getQuadro4Resposta4());
            respostas.setQuadro5Resposta1(respostasDB.getQuadro5Resposta1());
            respostas.setQuadro5Resposta2(respostasDB.getQuadro5Resposta2());
            respostas.setQuadro5Resposta3(respostasDB.getQuadro5Resposta3());
            respostas.setQuadro5Resposta4(respostasDB.getQuadro5Resposta4());
            respostas.setQuadro6Resposta1(respostasDB.getQuadro6Resposta1());
            respostas.setQuadro6Resposta2(respostasDB.getQuadro6Resposta2());
            respostas.setQuadro6Resposta3(respostasDB.getQuadro6Resposta3());
            respostas.setQuadro6Resposta4(respostasDB.getQuadro6Resposta4());
            respostas.setQuadro6Resposta5(respostasDB.getQuadro6Resposta5());
            respostas.setQuadro6Resposta6(respostasDB.getQuadro6Resposta6());
            respostas.setQuadro7Resposta1(respostasDB.getQuadro7Resposta1());
            respostas.setQuadro7Resposta2(respostasDB.getQuadro7Resposta2());
            respostas.setQuadro8Resposta1(respostasDB.getQuadro8Resposta1());
            respostas.setQuadro8Resposta2(respostasDB.getQuadro8Resposta2());
            respostas.setQuadro8Resposta3(respostasDB.getQuadro8Resposta3());
            respostas.setQuadro9Resposta1(respostasDB.getQuadro9Resposta1());
            respostas.setQuadro9Resposta2(respostasDB.getQuadro9Resposta2());
            respostas.setQuadro9Resposta3(respostasDB.getQuadro9Resposta3());
            respostas.setQuadro9Resposta4(respostasDB.getQuadro9Resposta4());
            respostas.setQuadro9Resposta5(respostasDB.getQuadro9Resposta5());
            return respostas;
        }
        return null;

    }

    /**
     * Método para converter de Respostas em RespostasDB.
     * @param respostas as respostas a serem convertidas.
     * @return O resultado da conversão.
     */
    public static RespostasDB getRespostasDB(Respostas respostas) {
        if (respostas != null) {
            RespostasDB respostasDB = new RespostasDB();
            respostasDB.setCodigo(respostas.getCodigo());
            respostasDB.setQuadro1Resposta1(respostas.getQuadro1Resposta1());
            respostasDB.setQuadro1Resposta2(respostas.getQuadro1Resposta2());
            respostasDB.setQuadro1Resposta3(respostas.getQuadro1Resposta3());
            respostasDB.setQuadro1Resposta4(respostas.getQuadro1Resposta4());
            respostasDB.setQuadro2Resposta1(respostas.getQuadro2Resposta1());
            respostasDB.setQuadro2Resposta2(respostas.getQuadro2Resposta2());
            respostasDB.setQuadro2Resposta3(respostas.getQuadro2Resposta3());
            respostasDB.setQuadro2Resposta4(respostas.getQuadro2Resposta4());
            respostasDB.setQuadro3Resposta1(respostas.getQuadro3Resposta1());
            respostasDB.setQuadro3Resposta2(respostas.getQuadro3Resposta2());
            respostasDB.setQuadro3Resposta3(respostas.getQuadro3Resposta3());
            respostasDB.setQuadro4Resposta1(respostas.getQuadro4Resposta1());
            respostasDB.setQuadro4Resposta2(respostas.getQuadro4Resposta2());
            respostasDB.setQuadro4Resposta3(respostas.getQuadro4Resposta3());
            respostasDB.setQuadro4Resposta4(respostas.getQuadro4Resposta4());
            respostasDB.setQuadro5Resposta1(respostas.getQuadro5Resposta1());
            respostasDB.setQuadro5Resposta2(respostas.getQuadro5Resposta2());
            respostasDB.setQuadro5Resposta3(respostas.getQuadro5Resposta3());
            respostasDB.setQuadro5Resposta4(respostas.getQuadro5Resposta4());
            respostasDB.setQuadro6Resposta1(respostas.getQuadro6Resposta1());
            respostasDB.setQuadro6Resposta2(respostas.getQuadro6Resposta2());
            respostasDB.setQuadro6Resposta3(respostas.getQuadro6Resposta3());
            respostasDB.setQuadro6Resposta4(respostas.getQuadro6Resposta4());
            respostasDB.setQuadro6Resposta5(respostas.getQuadro6Resposta5());
            respostasDB.setQuadro6Resposta6(respostas.getQuadro6Resposta6());
            respostasDB.setQuadro7Resposta1(respostas.getQuadro7Resposta1());
            respostasDB.setQuadro7Resposta2(respostas.getQuadro7Resposta2());
            respostasDB.setQuadro8Resposta1(respostas.getQuadro8Resposta1());
            respostasDB.setQuadro8Resposta2(respostas.getQuadro8Resposta2());
            respostasDB.setQuadro8Resposta3(respostas.getQuadro8Resposta3());
            respostasDB.setQuadro9Resposta1(respostas.getQuadro9Resposta1());
            respostasDB.setQuadro9Resposta2(respostas.getQuadro9Resposta2());
            respostasDB.setQuadro9Resposta3(respostas.getQuadro9Resposta3());
            respostasDB.setQuadro9Resposta4(respostas.getQuadro9Resposta4());
            respostasDB.setQuadro9Resposta5(respostas.getQuadro9Resposta5());
            return respostasDB;
        }
        return null;

    }

    /**
     * Método para converter de ProjetoDB para Projeto.
     * @param projetoDB O projeto a ser convertido.
     * @return O resultado da conversão.
     */
    public static Projeto getProjeto(ProjetoDB projetoDB) {
        if (projetoDB != null) {
            Projeto projeto = new Projeto();
            projeto.setCodigo(projetoDB.getCodigo());
            projeto.setDataCriacao(projetoDB.getDataCriacao());
            projeto.setDataUltimaModificacao(projetoDB.getDataUltimaModificacao());
            projeto.setAreaConhecimento(projetoDB.getAreaConhecimento());
            projeto.setDescricao(projetoDB.getDescricao());
            projeto.setStatus(projetoDB.getStatus());
            projeto.setTitulo(projetoDB.getTitulo());
            projeto.setLider(getAluno(projetoDB.getLider()));
            projeto.setOrientador(getProfessor(projetoDB.getOrientador()));
            projeto.setRespostas(getRespostas(projetoDB.getRespostas()));
            List<Aluno> membros = new ArrayList<>();
            for (AlunoDB alunoDB : projetoDB.getAlunosMembros()) {
                membros.add(getAluno(alunoDB));
            }
            projeto.setAlunosMembros(membros);
            return projeto;
        }
        return null;

    }

    /**
     * Método para converter de Projeto em ProjetoDB.
     * @param projeto O projeto a ser convertido.
     * @return O resultado da conversão.
     */
    public static ProjetoDB getProjetoDB(Projeto projeto) {
        if (projeto != null) {
            ProjetoDB projetoDB = new ProjetoDB();
            projetoDB.setCodigo(projeto.getCodigo());
            projetoDB.setDataCriacao(projeto.getDataCriacao());
            projetoDB.setDataUltimaModificacao(projeto.getDataUltimaModificacao());
            projetoDB.setAreaConhecimento(projeto.getAreaConhecimento());
            projetoDB.setDescricao(projeto.getDescricao());
            projetoDB.setStatus(projeto.getStatus());
            projetoDB.setTitulo(projeto.getTitulo());
            projetoDB.setLider(getAlunoDB(projeto.getLider()));
            projetoDB.setOrientador(getProfessorDB(projeto.getOrientador()));
            projetoDB.setRespostas(getRespostasDB(projeto.getRespostas()));
            List<AlunoDB> membros = new ArrayList<>();
            for (Aluno aluno : projeto.getAlunosMembros()) {
                membros.add(getAlunoDB(aluno));
            }
            projetoDB.setAlunosMembros(membros);
            return projetoDB;
        }
        return null;

    }

    /**
     * Método para converter de AvaliacaoDB para Avaliacao.
     * @param avaliacaoDB A avaliacao a ser convertida.
     * @return O resultado da conversão.
     */
    public static Avaliacao getAvaliacao(AvaliacaoDB avaliacaoDB) {
        if (avaliacaoDB != null) {
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.setCodigo(avaliacaoDB.getCodigo());
            avaliacao.setNota(avaliacaoDB.getNota());
            avaliacao.setAvaliado(avaliacaoDB.isAvaliado());
            avaliacao.setAvaliador(getAvaliador(avaliacaoDB.getAvaliador()));
            avaliacao.setProjeto(getProjeto(avaliacaoDB.getProjeto()));
            return avaliacao;
        }
        return null;
    }

    /**
     * Método para converter de Avaliacao em AvaliacaoDB.
     * @param avaliacao A avaliacao a ser convertida.
     * @return O resultado da avaliação.
     */
    public static AvaliacaoDB getAvaliacaoDB(Avaliacao avaliacao) {
        if (avaliacao != null) {
            AvaliacaoDB avaliacaoDB = new AvaliacaoDB();
            avaliacaoDB.setCodigo(avaliacao.getCodigo());
            avaliacaoDB.setNota(avaliacao.getNota());
            avaliacaoDB.setAvaliado(avaliacao.isAvaliado());
            avaliacaoDB.setAvaliador(getAvaliadorDB(avaliacao.getAvaliador()));
            avaliacaoDB.setProjeto(getProjetoDB(avaliacao.getProjeto()));
            return avaliacaoDB;
        }
        return null;
    }
}
