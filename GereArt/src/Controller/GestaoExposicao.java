/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.*;

/**
 *
 * @author BD
 */
public class GestaoExposicao {
    
     ArrayList<Exposicao> Exp;

    public GestaoExposicao(ArrayList<Exposicao> Exp) {
        this.Exp = Exp;
    }
     
    
    
    
     public void addExposicao(int ID, String nome, String data_ini, String data_fim, int quantidade, double preco, ArrayList<Obra> Obra, ArrayList<Visitantes> visit) {
        Exposicao E = new Exposicao(ID, nome, data_ini, data_fim, quantidade, preco, Obra, visit);
        int novoId = Exp.size();

        E.setID(novoId);

        Exp.add(E);

    }
  private void ListExp(){
         for (int i = 0; i < Exp.size(); i++) {
             System.out.println("Exposiçoes" + Exp.listIterator(i));
             
         }}
   
    
    
    
    
}
