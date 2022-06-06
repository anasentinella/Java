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
public class Funcionario extends Pessoa implements IPessoa {

    private double salario;
    private int cargaH;
    private String cargo;
    private String email;
    private int ctps;
    private String nome;
    private int idade; 
    

    public Funcionario() {
		this.idade = 0;
		this.salario = -1;
	}
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salario  inválida para o cadastro ...");
        }
        else{
            this.salario=salario;
        }
    }

    public int getCargaH() {
        return cargaH;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibir() {
       System.out.printf("Salario: %if |cargaH : %d | cargo: %s | Email: %s | ctps: %d\n",
       getSalario(),getCargaH(),getCargo(),getEmail(),getCtps());  
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
