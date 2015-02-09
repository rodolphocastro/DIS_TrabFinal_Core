package com.ardc.dis_trabfinal_core.entity.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * Classe para a entidade do tipo Respostas.
 * @author ALVES, R.C.
 */
@Entity(name = "respostas")
public class RespostasDB implements Serializable{
    
    /**
     * Código para a resposta.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "respostasGenerator")
    @SequenceGenerator(name = "respostasGenerator", sequenceName = "respostasGenerator", allocationSize = 1, initialValue = 1)
    private long codigo;

    /**
     * A que projeto a resposta está associada.
     */
    @OneToOne(mappedBy = "respostas")
    private ProjetoDB projeto;

    @Column(length = 1000)
    private String quadro1Resposta1;

    @Column(length = 1000)
    private String quadro1Resposta2;

    @Column(length = 1000)
    private String quadro1Resposta3;

    @Column(length = 1000)
    private String quadro1Resposta4;

    @Column(length = 1000)
    private String quadro2Resposta1;

    @Column(length = 1000)
    private String quadro2Resposta2;

    @Column(length = 1000)
    private String quadro2Resposta3;

    @Column(length = 1000)
    private String quadro2Resposta4;

    @Column(length = 1000)
    private String quadro3Resposta1;

    @Column(length = 1000)
    private String quadro3Resposta2;

    @Column(length = 1000)
    private String quadro3Resposta3;

    @Column(length = 1000)
    private String quadro4Resposta1;

    @Column(length = 1000)
    private String quadro4Resposta2;

    @Column(length = 1000)
    private String quadro4Resposta3;

    @Column(length = 1000)
    private String quadro4Resposta4;

    @Column(length = 1000)
    private String quadro5Resposta1;

    @Column(length = 1000)
    private String quadro5Resposta2;

    @Column(length = 1000)
    private String quadro5Resposta3;

    @Column(length = 1000)
    private String quadro5Resposta4;

    @Column(length = 1000)
    private String quadro6Resposta1;

    @Column(length = 1000)
    private String quadro6Resposta2;

    @Column(length = 1000)
    private String quadro6Resposta3;

    @Column(length = 1000)
    private String quadro6Resposta4;

    @Column(length = 1000)
    private String quadro6Resposta5;

    @Column(length = 1000)
    private String quadro6Resposta6;

    @Column(length = 1000)
    private String quadro7Resposta1;

    @Column(length = 1000)
    private String quadro7Resposta2;

    @Column(length = 1000)
    private String quadro8Resposta1;

    @Column(length = 1000)
    private String quadro8Resposta2;

    @Column(length = 1000)
    private String quadro8Resposta3;

    @Column(length = 1000)
    private String quadro9Resposta1;

    @Column(length = 1000)
    private String quadro9Resposta2;

    @Column(length = 1000)
    private String quadro9Resposta3;

    @Column(length = 1000)
    private String quadro9Resposta4;

    @Column(length = 1000)
    private String quadro9Resposta5;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public ProjetoDB getProjeto() {
        return projeto;
    }

    public void setProjeto(ProjetoDB projeto) {
        this.projeto = projeto;
    }

    public String getQuadro1Resposta1() {
        return quadro1Resposta1;
    }

    public void setQuadro1Resposta1(String quadro1Resposta1) {
        this.quadro1Resposta1 = quadro1Resposta1;
    }

    public String getQuadro1Resposta2() {
        return quadro1Resposta2;
    }

    public void setQuadro1Resposta2(String quadro1Resposta2) {
        this.quadro1Resposta2 = quadro1Resposta2;
    }

    public String getQuadro1Resposta3() {
        return quadro1Resposta3;
    }

    public void setQuadro1Resposta3(String quadro1Resposta3) {
        this.quadro1Resposta3 = quadro1Resposta3;
    }

    public String getQuadro1Resposta4() {
        return quadro1Resposta4;
    }

    public void setQuadro1Resposta4(String quadro1Resposta4) {
        this.quadro1Resposta4 = quadro1Resposta4;
    }

    public String getQuadro2Resposta1() {
        return quadro2Resposta1;
    }

    public void setQuadro2Resposta1(String quadro2Resposta1) {
        this.quadro2Resposta1 = quadro2Resposta1;
    }

    public String getQuadro2Resposta2() {
        return quadro2Resposta2;
    }

    public void setQuadro2Resposta2(String quadro2Resposta2) {
        this.quadro2Resposta2 = quadro2Resposta2;
    }

    public String getQuadro2Resposta3() {
        return quadro2Resposta3;
    }

    public void setQuadro2Resposta3(String quadro2Resposta3) {
        this.quadro2Resposta3 = quadro2Resposta3;
    }

    public String getQuadro2Resposta4() {
        return quadro2Resposta4;
    }

    public void setQuadro2Resposta4(String quadro2Resposta4) {
        this.quadro2Resposta4 = quadro2Resposta4;
    }

    public String getQuadro3Resposta1() {
        return quadro3Resposta1;
    }

    public void setQuadro3Resposta1(String quadro3Resposta1) {
        this.quadro3Resposta1 = quadro3Resposta1;
    }

    public String getQuadro3Resposta2() {
        return quadro3Resposta2;
    }

    public void setQuadro3Resposta2(String quadro3Resposta2) {
        this.quadro3Resposta2 = quadro3Resposta2;
    }

    public String getQuadro3Resposta3() {
        return quadro3Resposta3;
    }

    public void setQuadro3Resposta3(String quadro3Resposta3) {
        this.quadro3Resposta3 = quadro3Resposta3;
    }

    public String getQuadro4Resposta1() {
        return quadro4Resposta1;
    }

    public void setQuadro4Resposta1(String quadro4Resposta1) {
        this.quadro4Resposta1 = quadro4Resposta1;
    }

    public String getQuadro4Resposta2() {
        return quadro4Resposta2;
    }

    public void setQuadro4Resposta2(String quadro4Resposta2) {
        this.quadro4Resposta2 = quadro4Resposta2;
    }

    public String getQuadro4Resposta3() {
        return quadro4Resposta3;
    }

    public void setQuadro4Resposta3(String quadro4Resposta3) {
        this.quadro4Resposta3 = quadro4Resposta3;
    }

    public String getQuadro4Resposta4() {
        return quadro4Resposta4;
    }

    public void setQuadro4Resposta4(String quadro4Resposta4) {
        this.quadro4Resposta4 = quadro4Resposta4;
    }

    public String getQuadro5Resposta1() {
        return quadro5Resposta1;
    }

    public void setQuadro5Resposta1(String quadro5Resposta1) {
        this.quadro5Resposta1 = quadro5Resposta1;
    }

    public String getQuadro5Resposta2() {
        return quadro5Resposta2;
    }

    public void setQuadro5Resposta2(String quadro5Resposta2) {
        this.quadro5Resposta2 = quadro5Resposta2;
    }

    public String getQuadro5Resposta3() {
        return quadro5Resposta3;
    }

    public void setQuadro5Resposta3(String quadro5Resposta3) {
        this.quadro5Resposta3 = quadro5Resposta3;
    }

    public String getQuadro5Resposta4() {
        return quadro5Resposta4;
    }

    public void setQuadro5Resposta4(String quadro5Resposta4) {
        this.quadro5Resposta4 = quadro5Resposta4;
    }

    public String getQuadro6Resposta1() {
        return quadro6Resposta1;
    }

    public void setQuadro6Resposta1(String quadro6Resposta1) {
        this.quadro6Resposta1 = quadro6Resposta1;
    }

    public String getQuadro6Resposta2() {
        return quadro6Resposta2;
    }

    public void setQuadro6Resposta2(String quadro6Resposta2) {
        this.quadro6Resposta2 = quadro6Resposta2;
    }

    public String getQuadro6Resposta3() {
        return quadro6Resposta3;
    }

    public void setQuadro6Resposta3(String quadro6Resposta3) {
        this.quadro6Resposta3 = quadro6Resposta3;
    }

    public String getQuadro6Resposta4() {
        return quadro6Resposta4;
    }

    public void setQuadro6Resposta4(String quadro6Resposta4) {
        this.quadro6Resposta4 = quadro6Resposta4;
    }

    public String getQuadro6Resposta5() {
        return quadro6Resposta5;
    }

    public void setQuadro6Resposta5(String quadro6Resposta5) {
        this.quadro6Resposta5 = quadro6Resposta5;
    }

    public String getQuadro6Resposta6() {
        return quadro6Resposta6;
    }

    public void setQuadro6Resposta6(String quadro6Resposta6) {
        this.quadro6Resposta6 = quadro6Resposta6;
    }

    public String getQuadro7Resposta1() {
        return quadro7Resposta1;
    }

    public void setQuadro7Resposta1(String quadro7Resposta1) {
        this.quadro7Resposta1 = quadro7Resposta1;
    }

    public String getQuadro7Resposta2() {
        return quadro7Resposta2;
    }

    public void setQuadro7Resposta2(String quadro7Resposta2) {
        this.quadro7Resposta2 = quadro7Resposta2;
    }

    public String getQuadro8Resposta1() {
        return quadro8Resposta1;
    }

    public void setQuadro8Resposta1(String quadro8Resposta1) {
        this.quadro8Resposta1 = quadro8Resposta1;
    }

    public String getQuadro8Resposta2() {
        return quadro8Resposta2;
    }

    public void setQuadro8Resposta2(String quadro8Resposta2) {
        this.quadro8Resposta2 = quadro8Resposta2;
    }

    public String getQuadro8Resposta3() {
        return quadro8Resposta3;
    }

    public void setQuadro8Resposta3(String quadro8Resposta3) {
        this.quadro8Resposta3 = quadro8Resposta3;
    }

    public String getQuadro9Resposta1() {
        return quadro9Resposta1;
    }

    public void setQuadro9Resposta1(String quadro9Resposta1) {
        this.quadro9Resposta1 = quadro9Resposta1;
    }

    public String getQuadro9Resposta2() {
        return quadro9Resposta2;
    }

    public void setQuadro9Resposta2(String quadro9Resposta2) {
        this.quadro9Resposta2 = quadro9Resposta2;
    }

    public String getQuadro9Resposta3() {
        return quadro9Resposta3;
    }

    public void setQuadro9Resposta3(String quadro9Resposta3) {
        this.quadro9Resposta3 = quadro9Resposta3;
    }

    public String getQuadro9Resposta4() {
        return quadro9Resposta4;
    }

    public void setQuadro9Resposta4(String quadro9Resposta4) {
        this.quadro9Resposta4 = quadro9Resposta4;
    }

    public String getQuadro9Resposta5() {
        return quadro9Resposta5;
    }

    public void setQuadro9Resposta5(String quadro9Resposta5) {
        this.quadro9Resposta5 = quadro9Resposta5;
    }

}
