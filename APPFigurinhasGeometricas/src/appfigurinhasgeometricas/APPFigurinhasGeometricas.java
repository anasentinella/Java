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
public class APPFigurinhasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Quadrado q1 = new Quadrado(5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            Retangulo r1 = new Retangulo(8, 13);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
                e.printStackTrace();
        }

        try {
            Circunferencia c1 = new Circunferencia(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
                e.printStackTrace();
        }

    }

}
