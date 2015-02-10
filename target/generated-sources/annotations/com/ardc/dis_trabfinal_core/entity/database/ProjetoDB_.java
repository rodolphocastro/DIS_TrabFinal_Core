package com.ardc.dis_trabfinal_core.entity.database;

import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProjetoDB.class)
public abstract class ProjetoDB_ {

	public static volatile SingularAttribute<ProjetoDB, AlunoDB> lider;
	public static volatile SingularAttribute<ProjetoDB, Long> codigo;
	public static volatile SingularAttribute<ProjetoDB, String> titulo;
	public static volatile ListAttribute<ProjetoDB, AvaliacaoDB> avaliacoes;
	public static volatile SingularAttribute<ProjetoDB, RespostasDB> respostas;
	public static volatile SingularAttribute<ProjetoDB, String> areaConhecimento;
	public static volatile SingularAttribute<ProjetoDB, String> status;
	public static volatile ListAttribute<ProjetoDB, AlunoDB> alunosMembros;
	public static volatile SingularAttribute<ProjetoDB, Date> dataUltimaModificacao;
	public static volatile SingularAttribute<ProjetoDB, Date> dataCriacao;
	public static volatile SingularAttribute<ProjetoDB, ProfessorDB> orientador;
	public static volatile SingularAttribute<ProjetoDB, String> descricao;

}

