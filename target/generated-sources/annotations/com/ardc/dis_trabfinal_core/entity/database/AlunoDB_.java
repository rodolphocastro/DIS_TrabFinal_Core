package com.ardc.dis_trabfinal_core.entity.database;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AlunoDB.class)
public abstract class AlunoDB_ extends com.ardc.dis_trabfinal_core.entity.database.UsuarioDB_ {

	public static volatile SingularAttribute<AlunoDB, String> curso;
	public static volatile ListAttribute<AlunoDB, ProjetoDB> projetos;
	public static volatile SingularAttribute<AlunoDB, Integer> periodo;
	public static volatile SingularAttribute<AlunoDB, ProjetoDB> projetoQueLidera;
	public static volatile SingularAttribute<AlunoDB, Integer> matricula;

}

