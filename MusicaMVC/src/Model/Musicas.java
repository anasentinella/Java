/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Musicas {
   private String nome;
   private String compostior;
   private String genero;
   private int anoLanc;

    public Musicas(String nome, String compostior, String genero, int anoLanc) {
        this.nome = nome;
        this.compostior = compostior;
        this.genero = genero;
        this.anoLanc = anoLanc;
    }

    public Musicas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCompostior() {
        return compostior;
    }

    public void setCompostior(String compostior) {
        this.compostior = compostior;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(int anoLanc) {
        this.anoLanc = anoLanc;
    }
}
