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
 private int preco;
 private String descricao;
 private int codigo;

    public Produto() {
        this.preco = 0;
    }
 
    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
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

}
