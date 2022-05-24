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
public class Circunferencia implements AreaCalculavel{
    private double raio;

    @Override
    public double calcularArea() {
      double area= (raio*raio) * Math.PI;
      return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circunferencia(double raio) {
       if(raio<=0)
       {
           throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0(zero)");
       }
               this.raio = raio;
    }
    
    
}
