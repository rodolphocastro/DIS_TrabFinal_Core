package com.ardc.dis_trabfinal_core.entity.database;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProfessorDB.class)
public abstract class ProfessorDB_ extends com.ardc.dis_trabfinal_core.entity.database.UsuarioDB_ {

	public static volatile ListAttribute<ProfessorDB, ProjetoDB> projetosOrientados;
	public static volatile SingularAttribute<ProfessorDB, String> departamento;
	public static volatile SingularAttribute<ProfessorDB, String> disciplinaPrincipal;

}

