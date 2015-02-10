package com.ardc.dis_trabfinal_core.entity.database;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AvaliadorDB.class)
public abstract class AvaliadorDB_ extends com.ardc.dis_trabfinal_core.entity.database.UsuarioDB_ {

	public static volatile SingularAttribute<AvaliadorDB, String> formacao;
	public static volatile ListAttribute<AvaliadorDB, AvaliacaoDB> Avaliacoes;
	public static volatile SingularAttribute<AvaliadorDB, String> areaAtuacao;

}

