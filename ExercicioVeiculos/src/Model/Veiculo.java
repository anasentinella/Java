/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Felipe
 */
public class Veiculo {

    private String Marca;
    private String Modelo;
    private String Placa;
    private String Cor;
    private int AnoFabri;

    public Veiculo() {
        
    }

    public Veiculo(String Marca, String Modelo, String Placa, String Cor, int AnoFabri) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Cor = Cor;
        this.AnoFabri = AnoFabri;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getAnoFabri() {
        return AnoFabri;
    }

    public void setAnoFabri(int AnoFabri) {
        this.AnoFabri = AnoFabri;
    }
}
