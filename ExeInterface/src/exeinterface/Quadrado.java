/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeinterface;

/**
 *
 * @author aluno
 */
public class Quadrado extends FormaGeometrica implements IForma, IBidimensional {

    private double lado;

    @Override
    public double calcArea() {
        setArea(lado * lado);
        return getArea();
    }

    @Override
    public double calcPerimetro() {
        setPerimetro(4 * lado);
        return getPerimetro();
    }

    @Override
    public double calcSeccao() {
        return 0;
    }

    @Override
    public void mostrar() {
        System.out.println("é um quadrado");
    }

    @Override
    public void ehBidimensional() {
        System.out.println("é um quadrado");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
