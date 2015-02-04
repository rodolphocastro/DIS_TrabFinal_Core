package com.ardc.dis_trabfinal_core.business;

import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOUsuarioInterface;
import com.ardc.dis_trabfinal_core.entity.Usuario;
import com.ardc.dis_trabfinal_core.entity.database.UsuarioDB;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe para as regras de negocio para as entidades do tipo Usuario.
 * @author alvesrc
 */
public class UsuarioBusiness {
    
    /**
     * DAO Para acesso às entidades do tipo usuario.
     */
    private DAOUsuarioInterface daoUser = DAOFactory.createDAOUsuario();
    
    /**
     * Método para listar os usuários presentes no sistema.
     * @return Uma lista contendo os usuários cadastrados.
     */
    public List<Usuario> listar() {
        List<Usuario> listagem = new ArrayList<>();
        List<UsuarioDB> listagemDB = daoUser.listar();
        Usuario usuario = new Usuario();
        for (int i = 0; i < listagemDB.size(); i++) {
            usuario.setEmail(listagemDB.get(i).getEmail());
            usuario.setNome(listagemDB.get(i).getNome());
            usuario.setPapel(listagemDB.get(i).getPapel());
            usuario.setSenha(listagemDB.get(i).getSenha());
            usuario.setStatus(listagemDB.get(i).getStatus());
            usuario.setDataCadastro(listagemDB.get(i).getDataCadastro());
            usuario.setDataUltimaModificacao(listagemDB.get(i).getDataUltimaModificacao());
            listagem.add(usuario);
            usuario = new Usuario();
        }
        return listagem;
    }

    /**
     * Método para inserir um novo usuário no sistema.
     * @param usuario O usuário a ser inserido.
     */
    public void inserir(Usuario usuario) {
        UsuarioDB usuarioDB = new UsuarioDB();
        usuarioDB.setEmail(usuario.getEmail());
        usuarioDB.setSenha(usuario.getSenha());
        usuarioDB.setPapel("usuario");
        usuarioDB.setStatus("ativo");
        usuarioDB.setNome(usuario.getNome());
        usuarioDB.setDataCadastro(new Date());
        usuarioDB.setDataUltimaModificacao(new Date());
        daoUser.inserir(usuarioDB);

    }

    /**
     * Método para alterar um usuário já cadastrado no sistema.
     * @param usuario O usuário a ser alterado.
     */
    public void alterar(Usuario usuario) {
        UsuarioDB usuarioDB = new UsuarioDB();
        usuarioDB.setEmail(usuario.getEmail());
        usuarioDB.setSenha(usuario.getSenha());
        usuarioDB.setNome(usuario.getNome());
        usuarioDB.setStatus(usuario.getStatus());
        usuarioDB.setDataCadastro(usuario.getDataCadastro());
        usuarioDB.setPapel(usuario.getPapel());
        usuarioDB.setDataUltimaModificacao(new Date());
        daoUser.alterar(usuarioDB);

    }

    /**
     * Método para remover um usuário do sistema.
     * @param codUsuario O código do usuário a ser removido.
     */
    public void remover(String codUsuario) {
        daoUser.remover(UsuarioDB.class, codUsuario);

    }
}
