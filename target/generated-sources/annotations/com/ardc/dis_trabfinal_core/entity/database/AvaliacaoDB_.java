package com.ardc.dis_trabfinal_core.entity.database;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AvaliacaoDB.class)
public abstract class AvaliacaoDB_ {

	public static volatile SingularAttribute<AvaliacaoDB, Long> codigo;
	public static volatile SingularAttribute<AvaliacaoDB, Float> nota;
	public static volatile SingularAttribute<AvaliacaoDB, ProjetoDB> projeto;
	public static volatile SingularAttribute<AvaliacaoDB, AvaliadorDB> avaliador;
	public static volatile SingularAttribute<AvaliacaoDB, Boolean> avaliado;

}

