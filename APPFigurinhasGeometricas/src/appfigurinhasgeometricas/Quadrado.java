/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfigurinhasgeometricas;

/**
 *
 * @author aluno
 */
public class Quadrado implements AreaCalculavel {

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0(zero)");
        } 
        else {
            this.lado = lado;
        }
    }
    private double lado;

    public void calcularArea(double lado) {

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

}
