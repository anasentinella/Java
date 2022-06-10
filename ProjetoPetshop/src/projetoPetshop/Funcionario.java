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
    private int idade;
    
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
            throw new IllegalArgumentException("Salario  inválido para o cadastro ...");
        } else {
            this.salario = salario;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 1) {
            throw new IllegalArgumentException("Idade inválida para o cadastro ...");
        } else {
            this.idade = idade;
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
        System.out.printf("Nome %s| Idade %d| Salario: %if |cargaH : %d | cargo: %s | Email: %s | ctps: %d\n",
                getNome(), getIdade(), getSalario(), getCargaH(), getCargo(), getEmail(), getCtps());

    }
}
