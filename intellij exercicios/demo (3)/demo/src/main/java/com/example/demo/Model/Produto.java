package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="ProdutoIntellij")
public class Produto {
    @Id
    @Column
    private int cod;
    @Column
    private String descric;
    @Column
    private double preco;
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescric() {
        return descric;
    }

    public void setDescric(String descric) {
        this.descric = descric;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}