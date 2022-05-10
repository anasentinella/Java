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
public class FormaGeometrica {

    private double perimetro;
    private double area;

    public double calcArea(){
        System.out.println("Calculando area");
        return 0;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
