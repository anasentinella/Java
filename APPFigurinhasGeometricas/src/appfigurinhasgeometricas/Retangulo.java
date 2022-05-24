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
public class Retangulo implements AreaCalculavel {
  private double lado;
  private double altura;
  
    @Override
    public double calcularArea() {
     double area = lado *altura;
     return area;
    }

   public Retangulo(double lado,double altura) {
        if (lado <= 0 || altura <=0)
        {
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0(zero)");
        } 
        else if(lado==altura)
        {
                throw new IllegalArgumentException("Valo inválido, modifique um dos valores a fim de torná-los diferentes ");
        }
        else {
            this.lado = lado;
        }
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
