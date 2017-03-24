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
public class GestaoVisitantes {
    ArrayList<Visitantes> vis;

    public GestaoVisitantes(ArrayList<Visitantes> vis) {
        this.vis = vis;
    }

public void addVisitante(String nome) {
        Visitantes V = new Visitantes(nome);
        int novoId = vis.size();

        

        vis.add(V);

    }    
   private void ListVisit(){
         for (int i = 0; i < vis.size(); i++) {
             System.out.println("Visitantes" + vis.listIterator(i));
             
         }}
    
}
