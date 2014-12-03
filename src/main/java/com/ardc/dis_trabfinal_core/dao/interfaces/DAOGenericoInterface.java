package com.ardc.dis_trabfinal_core.dao.interfaces;

/**
 * Interface genérica para um DataAccessObject.
 * @author alvesrc
 */
public interface DAOGenericoInterface {
    
    /**
     * Armazena um objeto na database.
     * @param obj O objeto a ser inserido na database. 
     */
    public abstract void inserir(Object obj);
    
    /**
     * Remove um objeto da database.
     * @param classe A classe do objeto a ser removido.
     * @param pk A primary key do objeto a ser removido.
     */
    public abstract void remover(Class classe, Object pk);
    
    /**
     * Altera um objeto previamente salvo na database para uma nova versão.
     * @param obj O objeto a ser atualizado. 
     */
    public abstract void alterar(Object obj);
    
    /**
     * Busca um objeto na database.
     * @param classe A classe do objeto a ser buscado.
     * @param pk A primary key do objeto a ser buscado.
     * @return Uma cópia do objeto encontrado na database.
     */
    public abstract Object buscar(Class classe, Object pk);
}
