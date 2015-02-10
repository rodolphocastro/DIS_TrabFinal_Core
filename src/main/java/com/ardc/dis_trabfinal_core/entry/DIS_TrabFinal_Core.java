package com.ardc.dis_trabfinal_core.entry;

import com.ardc.dis_trabfinal_core.business.AdministradorBusiness;
import com.ardc.dis_trabfinal_core.business.ConversorDatabase;
import com.ardc.dis_trabfinal_core.dao.factory.DAOFactory;
import com.ardc.dis_trabfinal_core.dao.interfaces.DAOGenericoInterface;
import com.ardc.dis_trabfinal_core.entity.Administrador;
import com.ardc.dis_trabfinal_core.entity.Perguntas;
import com.ardc.dis_trabfinal_core.entity.database.AdministradorDB;
import com.ardc.dis_trabfinal_core.entity.database.PerguntasDB;
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
        System.err.println("Inserindo dados básicos...");
        DAOGenericoInterface ggwp = DAOFactory.createDAOGenerico();
        AdministradorDB usuario = new AdministradorDB();
        usuario.setEmail("admin");
        usuario.setSenha("admin");
        usuario.setNome("admin");
        usuario.setDataCadastro(new Date());
        usuario.setDataUltimaModificacao(new Date());
        usuario.setStatus("ativo");
        usuario.setPapel("administrador");
        PerguntasDB perguntasDB = new PerguntasDB();
        perguntasDB.setQuadro1("1 Parceiros Chave");
        perguntasDB.setQuadro1Pergunta1("1.1 Quem são nossos Parceiros Chave?");
        perguntasDB.setQuadro1Pergunta2("1.2 Quem são nossos Fornecedores Chave?");
        perguntasDB.setQuadro1Pergunta3("1.3 Quais Recursos Chave adquirimos dos nossos Fornecedores?");
        perguntasDB.setQuadro1Pergunta4("1.4 Quais as Atividades Chave dos nossos Parceiros?");
        perguntasDB.setQuadro2("2 Atividades Chave");
        perguntasDB.setQuadro2Pergunta1("2.1 De quais Atividades Chave nossas Proposições de Valor necessitam?");
        perguntasDB.setQuadro2Pergunta2("2.2 E o nosso Canal de Distribuição?");
        perguntasDB.setQuadro2Pergunta3("2.3 E o Relacionamento com Consumidor?");
        perguntasDB.setQuadro2Pergunta4("2.4 E os Fluxos de Receita?");
        perguntasDB.setQuadro3("3 Recursos Chave");
        perguntasDB.setQuadro3Pergunta1("3.1 De quais Recursos Chave nossas proposições de valor necessitam?");
        perguntasDB.setQuadro3Pergunta2("3.2 E o nosso Canal de Distribuição e Relacionamento com Consumidor?");
        perguntasDB.setQuadro3Pergunta3("3.3 E os Fluxos de Receita?");
        perguntasDB.setQuadro4("4 Proposições de Valor");
        perguntasDB.setQuadro4Pergunta1("4.1 Que valor entregamos aos consumidores?");
        perguntasDB.setQuadro4Pergunta2("4.2 Quais dos seus problemas estamos ajudando a solucionar?");
        perguntasDB.setQuadro4Pergunta3("4.3 Quais os conjuntos de serviços e produtos que oferecemos para cada segmento de consumidor?");
        perguntasDB.setQuadro4Pergunta4("4.4 Quais necessidades dos consumidores estamos atentendendo?");
        perguntasDB.setQuadro5("5 Relacionamento com Consumidor");
        perguntasDB.setQuadro5Pergunta1("5.1 Que tipo de relacionamento cada segmento de consumidor espera que seja estabelecido e mantido?");
        perguntasDB.setQuadro5Pergunta2("5.2 Quais já temos estabalecidos?");
        perguntasDB.setQuadro5Pergunta3("5.3 Como estão integrados com o resto do nosso modelo de negócio?");
        perguntasDB.setQuadro5Pergunta4("5.4 Quanto custam?");
        perguntasDB.setQuadro6("6 Canais");
        perguntasDB.setQuadro6Pergunta1("6.1 Através de quais canais pretendemos alcançar os segmentos consumidores?");
        perguntasDB.setQuadro6Pergunta2("6.2 Como os alcançamos agora?");
        perguntasDB.setQuadro6Pergunta3("6.3 Como são integrados nossos canais?");
        perguntasDB.setQuadro6Pergunta4("6.4 Quais funcionam melhor?");
        perguntasDB.setQuadro6Pergunta5("6.5 Quais possuem melhor custo-benefício?");
        perguntasDB.setQuadro6Pergunta6("6.6 Como os integramos com as rotinas dos consumidores?");
        perguntasDB.setQuadro7("7 Segmentos de Consumidores");
        perguntasDB.setQuadro7Pergunta1("7.1 Para quem estamos criando valor?");
        perguntasDB.setQuadro7Pergunta2("7.2 Quem são nossos consumidores mais importantes?");
        perguntasDB.setQuadro8("8 Estrutura de Custos");
        perguntasDB.setQuadro8Pergunta1("8.1 Quais são os custos inerentes do modelo de negócio mais importantes?");
        perguntasDB.setQuadro8Pergunta2("8.2 Quais Recursos Chave são mais caros?");
        perguntasDB.setQuadro8Pergunta3("8.3 Quais Atividades Chave são mais caros?");
        perguntasDB.setQuadro9("9 Fluxos de Receita");
        perguntasDB.setQuadro9Pergunta1("9.1 Que valor nossos consumidores realmente querem pagar?");
        perguntasDB.setQuadro9Pergunta2("9.2 Quanto pagam atualmente?");
        perguntasDB.setQuadro9Pergunta3("9.3 Como pagam atualmente?");
        perguntasDB.setQuadro9Pergunta4("9.4 Como iriam preferir pagar?");
        perguntasDB.setQuadro9Pergunta5("9.5 Quanto cada fluxo de receita contribui para a receita total?");
        ggwp.inserir(perguntasDB);
        ggwp.inserir(usuario);
        
        System.err.println("Dados inseridos.");
    }
}
