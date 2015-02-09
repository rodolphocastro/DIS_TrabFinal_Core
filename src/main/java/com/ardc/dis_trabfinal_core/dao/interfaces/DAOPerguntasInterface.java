package com.ardc.dis_trabfinal_core.dao.interfaces;

import com.ardc.dis_trabfinal_core.entity.DescPerguntas;
import com.ardc.dis_trabfinal_core.entity.database.PerguntasDB;
import java.util.List;

/**
 * Interface descrevendo os métodos a serem implementados pelo DAOPerguntas.
 * @author ALVES, R.C.
 */
public interface DAOPerguntasInterface extends DAOGenericoInterface{
    
    /**
     * Método para listar as perguntas cadastradas no sistema.
     * @return Uma lista contendo as perguntas encontradas.
     */
    public List<PerguntasDB> listar();

    /**
     * Método para visualizar a descrição de uma pergunta.
     * @return A descrição de uma pergunta.
     */
    public DescPerguntas getDescricaoPerguntas();
}
