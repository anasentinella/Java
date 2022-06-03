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
public class Cliente extends Pessoa implements IPessoa {

    private String tutorAnimal;
    private String endereco;
    private int telefone;
    private String nomeA;
    private String raca;
    private String cor;
    private float peso;
    private int idade;
    private String dtnascAnim;

    public String getTutorAnimal() {
        return tutorAnimal;
    }

    public void setTutorAnimal(String tutorAnimal) {
        this.tutorAnimal = tutorAnimal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeA() {
        return nomeA;
    }

    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDtnascAnim() {
        return dtnascAnim;
    }

    public void setDtnascAnim(String dtnascAnim) {
        this.dtnascAnim = dtnascAnim;
    }

    public void exibir() {
        System.out.println(getTutorAnimal);
        System.out.println(getEndereco);
        System.out.println(getTelefone);
        System.out.println(getNomeA);
        System.out.println(getRaca);
        System.out.println(getCor);
        System.out.println(getPeso);
        System.out.println(getIdade);
        System.out.println(getDtnascAnim);

    }
}
