package com.ardc.dis_trabfinal_core.entity.database;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UsuarioDB.class)
public abstract class UsuarioDB_ {

	public static volatile SingularAttribute<UsuarioDB, String> status;
	public static volatile SingularAttribute<UsuarioDB, String> email;
	public static volatile SingularAttribute<UsuarioDB, Date> dataUltimaModificacao;
	public static volatile SingularAttribute<UsuarioDB, String> nome;
	public static volatile SingularAttribute<UsuarioDB, String> papel;
	public static volatile SingularAttribute<UsuarioDB, String> senha;
	public static volatile SingularAttribute<UsuarioDB, Date> dataCadastro;

}

