package com.ardc.dis_trabfinal_core.dao;

import com.ardc.dis_trabfinal_core.dao.interfaces.DAOPerguntasInterface;
import com.ardc.dis_trabfinal_core.entity.DescPerguntas;
import com.ardc.dis_trabfinal_core.entity.database.PerguntasDB;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * DAO para controlar as entidades do tipo perguntas.
 * @author ALVES, R.C.
 */
public class DAOPerguntas extends DAOGenerico implements DAOPerguntasInterface{
    
    /**
     * Método para listar as perguntas cadastradas no sistema.
     * @return Uma lista contendo as perguntas encontradas.
     */
    @Override
    public List<PerguntasDB> listar(){
        try {
            em = getEntityManager();
            Query q = em.createQuery("select a from perguntas a", PerguntasDB.class);
            return q.getResultList();
        } catch (NoResultException e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Método para visualizar a descrição de uma pergunta.
     * @return A descrição de uma pergunta.
     */
    @Override
    public DescPerguntas getDescricaoPerguntas(){
        try {
            Scanner scanner = new Scanner(new File("C:/descricaoPerguntas.txt"));
            DescPerguntas descricaoPerguntas = new DescPerguntas();
            String aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro1Pergunta1(aux.substring(aux.indexOf("<1.1>")+5,aux.indexOf("</1.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro1Pergunta2(aux.substring(aux.indexOf("<1.2>")+5,aux.indexOf("</1.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro1Pergunta3(aux.substring(aux.indexOf("<1.3>")+5,aux.indexOf("</1.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro1Pergunta4(aux.substring(aux.indexOf("<1.4>")+5,aux.indexOf("</1.4>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro2Pergunta1(aux.substring(aux.indexOf("<2.1>")+5,aux.indexOf("</2.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro2Pergunta2(aux.substring(aux.indexOf("<2.2>")+5,aux.indexOf("</2.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro2Pergunta3(aux.substring(aux.indexOf("<2.3>")+5,aux.indexOf("</2.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro2Pergunta4(aux.substring(aux.indexOf("<2.4>")+5,aux.indexOf("</2.4>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro3Pergunta1(aux.substring(aux.indexOf("<3.1>")+5,aux.indexOf("</3.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro3Pergunta2(aux.substring(aux.indexOf("<3.2>")+5,aux.indexOf("</3.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro3Pergunta3(aux.substring(aux.indexOf("<3.3>")+5,aux.indexOf("</3.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro4Pergunta1(aux.substring(aux.indexOf("<4.1>")+5,aux.indexOf("</4.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro4Pergunta2(aux.substring(aux.indexOf("<4.2>")+5,aux.indexOf("</4.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro4Pergunta3(aux.substring(aux.indexOf("<4.3>")+5,aux.indexOf("</4.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro4Pergunta4(aux.substring(aux.indexOf("<4.4>")+5,aux.indexOf("</4.4>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro5Pergunta1(aux.substring(aux.indexOf("<5.1>")+5,aux.indexOf("</5.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro5Pergunta2(aux.substring(aux.indexOf("<5.2>")+5,aux.indexOf("</5.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro5Pergunta3(aux.substring(aux.indexOf("<5.3>")+5,aux.indexOf("</5.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro5Pergunta4(aux.substring(aux.indexOf("<5.4>")+5,aux.indexOf("</5.4>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro6Pergunta1(aux.substring(aux.indexOf("<6.1>")+5,aux.indexOf("</6.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro6Pergunta2(aux.substring(aux.indexOf("<6.2>")+5,aux.indexOf("</6.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro6Pergunta3(aux.substring(aux.indexOf("<6.3>")+5,aux.indexOf("</6.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro6Pergunta4(aux.substring(aux.indexOf("<6.4>")+5,aux.indexOf("</6.4>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro6Pergunta5(aux.substring(aux.indexOf("<6.5>")+5,aux.indexOf("</6.5>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro6Pergunta6(aux.substring(aux.indexOf("<6.6>")+5,aux.indexOf("</6.6>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro7Pergunta1(aux.substring(aux.indexOf("<7.1>")+5,aux.indexOf("</7.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro7Pergunta2(aux.substring(aux.indexOf("<7.2>")+5,aux.indexOf("</7.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro8Pergunta1(aux.substring(aux.indexOf("<8.1>")+5,aux.indexOf("</8.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro8Pergunta2(aux.substring(aux.indexOf("<8.2>")+5,aux.indexOf("</8.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro8Pergunta3(aux.substring(aux.indexOf("<8.3>")+5,aux.indexOf("</8.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro9Pergunta1(aux.substring(aux.indexOf("<9.1>")+5,aux.indexOf("</9.1>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro9Pergunta2(aux.substring(aux.indexOf("<9.2>")+5,aux.indexOf("</9.2>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro9Pergunta3(aux.substring(aux.indexOf("<9.3>")+5,aux.indexOf("</9.3>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro9Pergunta4(aux.substring(aux.indexOf("<9.4>")+5,aux.indexOf("</9.4>")));
            aux = scanner.nextLine();
            descricaoPerguntas.setDescricaoQuadro9Pergunta5(aux.substring(aux.indexOf("<9.5>")+5,aux.indexOf("</9.5>")));
            return descricaoPerguntas;
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
