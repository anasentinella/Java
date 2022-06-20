/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPetshop;

/**
 *
 * @author aluno
 */
class Produto {
 private double preco;
 private String descricao;
 private int codigo;
 private String tipo;
 private  String datacomp;

    public Produto() {
        this.preco = 0;
    }
 
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 1) {
            throw new IllegalArgumentException("Preco inválido para o cadasto ...");
        }
        else{
            this.preco=preco;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDatacomp() {
        return datacomp;
    }

    public void setDatacomp(String datacomp) {
        this.datacomp = datacomp;
    }

    void exibir() {
          System.out.println("Preço: " + this.preco + ",Descrição do produto: " + this.descricao +",Codigo do produto: " + this.codigo +
                  ",Tipo do Produto: " + this.tipo);
    }

}
