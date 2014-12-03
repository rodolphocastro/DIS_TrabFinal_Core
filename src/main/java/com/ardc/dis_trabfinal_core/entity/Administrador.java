package com.ardc.dis_trabfinal_core.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.ForeignKey;
/**
 * Classe para a entidade Administrador.
 * @author alvesrc
 */
@Entity(name = "administrador")
@PrimaryKeyJoinColumn(name = "usuario_email")
@ForeignKey(name = "fk_administrador_usuario")
public class Administrador extends Usuario implements Serializable{
    
}
