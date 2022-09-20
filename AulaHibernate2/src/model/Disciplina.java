/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 *
 * @author aluno
 */

@Entity
@Table (name ="DiscpJava")
public class Disciplina implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int codigo;
   @Column(name = "Descrição",nullable = false, length = 100)
   private String descricao;
   @Column
   private int cargaH;
   

    public Disciplina( String descrição, int cargaH) {
        this.descricao = descrição;
        this.cargaH = cargaH;
    }

    public Disciplina() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescrição() {
        return descricao;
    }

    public void setDescrição(String descrição) {
        this.descricao = descrição;
    }

    public int getCargaH() {
        return cargaH;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }
}
