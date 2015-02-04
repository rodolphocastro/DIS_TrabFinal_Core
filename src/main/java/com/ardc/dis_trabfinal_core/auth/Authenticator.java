package com.ardc.dis_trabfinal_core.auth;

import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOUsuarioInterface;
import com.ardc.dis_trabfinal_core.entity.database.UsuarioDB;

/**
 * Classe responsável por garantir a autenticidade dos acessos ao sistema.
 * @author alvesrc
 */
public class Authenticator {
    
    /**
     * O usuário que está atualmente logado.
     */
    private UsuarioDB usuarioAtual = null;
    
    /**
     * DAO para acesso às entidades do tipo Usuário.
     */
    private final DAOUsuarioInterface daoUser = DAOFactory.createDAOUsuario();
    
    /**
     * Instância do autenticador para uso.
     */
    private static Authenticator auth = new Authenticator();
    
    public static Authenticator getAuth(){
        return auth;
    }
    
    /**
     * Método para autenticar um login.
     * @param email O e-mail informado pelo usuário.
     * @param senha A senha informada pelo usuário.
     */
    public void autenticar(String email, String senha){
        usuarioAtual = daoUser.pesquisarPorEmailSenha(email, senha);
    }
    
    /**
     * Método para realizar logout de um usuário.
     */
    public void logout(){
        this.usuarioAtual = null;
    }

    public UsuarioDB getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(UsuarioDB usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }
    
    /**
     * Método para informar se o usuário está autenticado ou não.
     * @return TRUE se o usuário estiver autenticado, FALSE caso contrário.
     */
    public boolean isLogado(){
        return usuarioAtual != null;
    }
    
    /**
     * Método para verificar qual o papel do usuário no sistema.
     * @return O papel do atual usuario.
     */
    public String getPapelUsuario(){
        if(usuarioAtual != null){
            return usuarioAtual.getPapel();
        }
        return "";
    }
}
