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
public class GestaoObras {
    ArrayList<Obra> Obra;

    public GestaoObras(ArrayList<Obra> Obra) {
        this.Obra = Obra;
    }
    
    
    
     public void addObra( String nome_artista, String titulo_obra, String categoria, String tipo_obra, String data) {
        Obra O = new Obra( nome_artista, titulo_obra, categoria, tipo_obra, data);
        int novoId = Obra.size();

        //O.setID(novoId);

        Obra.add(O);

    }
     
     private void ListObra(){
         for (int i = 0; i < Obra.size(); i++) {
             System.out.println("Obras" + Obra.listIterator(i));
             
         }
     
     
     
     }
    
}
