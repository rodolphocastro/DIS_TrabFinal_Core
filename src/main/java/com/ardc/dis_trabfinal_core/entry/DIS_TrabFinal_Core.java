package com.ardc.dis_trabfinal_core.entry;

import com.ardc.dis_trabfinal_core.dao.DAOGenerico;
import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import java.util.Date;

/**
 * Classe de entrada do software.
 * @author alvesrc
 */
public class DIS_TrabFinal_Core {
    
    /**
     * Método de entrada para o programa.
     * @param args Argumentos para a execução do programa.
     */
    public static void main(String args[]){
        System.out.println("Inserindo administrador...");
        DAOGenerico dg = (DAOGenerico) DAOFactory.createDAOGenerico();
        AdministradorDB admin = new AdministradorDB();
        admin.setNome("Rodolpho de Castro Alves");
        admin.setEmail("rodolphoalves@alunos.utfpr.edu.br");
        admin.setSenha("1234");
        admin.setDataCadastro(new Date());
        admin.setDataUltimaModificacao(new Date());
        admin.setStatus("ativo");
        admin.setPapel("administrador");
        dg.inserir(admin);
        System.out.println("Rotina executada. Checar logs.");
    }
}
