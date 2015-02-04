package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.ForeignKey;

/**
 * Classe para a entidade AdministradorDB.
 * @author alvesrc
 */
@Entity(name = "administrador")
@PrimaryKeyJoinColumn(name = "usuario_email")
@ForeignKey(name = "fk_administrador_usuario")
public class AdministradorDB extends UsuarioDB implements Serializable{
    
}
