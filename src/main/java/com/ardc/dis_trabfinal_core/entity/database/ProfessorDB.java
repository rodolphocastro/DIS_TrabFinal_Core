package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.ForeignKey;

/**
 * Classe para a entidade ProfessorDB.
 * @author alvesrc
 */
@Entity(name = "professor")
@PrimaryKeyJoinColumn(name = "usuario_email")
@ForeignKey(name = "fk_professor_usuario")
public class ProfessorDB extends UsuarioDB implements Serializable{
    
    /**
     * Departamento acadêmico ao qual o professor está alocado.
     */
    private String departamento;
    
    /**
     * A principal disciplina ministrada pelo professor.
     */
    private String disciplinaPrincipal;

    /**
     * Projetos que o professor orienta.
     */
    @OneToMany(mappedBy = "orientador")
    private List<ProjetoDB> projetosOrientados;
    
    //Getters & Setters gerados automaticamente.
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDisciplinaPrincipal() {
        return disciplinaPrincipal;
    }

    public void setDisciplinaPrincipal(String disciplinaPrincipal) {
        this.disciplinaPrincipal = disciplinaPrincipal;
    }

    public List<ProjetoDB> getProjetosOrientados() {
        return projetosOrientados;
    }

    public void setProjetosOrientados(List<ProjetoDB> projetosOrientados) {
        this.projetosOrientados = projetosOrientados;
    }
    
    
}
