/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Produtos;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class ProdutosControler  {
     private ArrayList<Produtos> listaPc;
     public ProdutosControler() {
        listaPc= new ArrayList<>();
     }
    public void CadastrarProduto(String codigo,String descricao, double preco){
        Produtos p1 = new Produtos(codigo, descricao, preco);
        listaPc.add(p1);
    }
     public ArrayList <Produtos> buscarTodos(){
        return listaPc;
        
 }
     public void Excluir (String Descricao){
         for (Produtos p: listaPc)
         {
             if(p.getDescricao().equals(Descricao))
             {
                 listaPc.remove(p);
                 break;
             }
         }
     }
}
