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
public class Cliente extends Pessoa  implements IPessoa {

    private String tutorAnimal;
    private String endereco;
    private int telefone;
    private String nomeA;
    private String raca;
    private String cor;
    private float peso;
    private int idade;
    private int idadeAnim;

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
        if (telefone < 0) {
			throw new IllegalArgumentException("O valor do telefone inserido e invalido...");
		} else {
			this.telefone = telefone;
		}
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
        if (peso < 0) {
            throw new IllegalArgumentException("Peso inválido para o cadastro ...");
        }
        else{
            this.peso=peso;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 1) {
            throw new IllegalArgumentException("Idade inválida para o cadastro ...");
        }
        else{
            this.idade=idade;
        }
    }

    public int getIdadeAnim() {
        return idadeAnim;
    }

    public void setIdadeAnim(int idadeAnim) {
        if (idadeAnim<1) {
            throw new IllegalArgumentException("Idade inválida para o cadastro ...");
        }
        else{
            this.idadeAnim = idadeAnim;
        }
    }

    @Override
    public void exibir() {
         System.out.printf("TutorAnimal: %s | Endereco: %s | Telefone: %d | NomeA: %s | raca: %d "
                 + "|Cor %s| Peso %d | Idade %d| idadeAnim %d\n",
                 getTutorAnimal(),getEndereco(),getTelefone(),getNomeA(),getRaca(),getCor(),getPeso(),
                 getIdade(),getIdadeAnim());

    }
}
