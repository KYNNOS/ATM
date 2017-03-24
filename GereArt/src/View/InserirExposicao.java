/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import java.util.*;
import Controller.*;


/**
 *
 * @author BD
 */
public class InserirExposicao {
     Visitantes V;
   Obra Ob;
   Exposicao E;
   public   Obra O;
   public   Visitantes vis;
   
 
    public void inserirObra(){
        
        
  
        System.out.println("Insira o nome do artista");
        String nome_artista = new Scanner(System.in).nextLine();
        System.out.println("Insira o titulo da obra ");
        String titulo_obra = new Scanner(System.in).nextLine();
        System.out.println("Insira a categoria");
        String categoria = new Scanner(System.in).nextLine();
        System.out.println("Insira o tipo da obra");
        String tipo_obra = new Scanner(System.in).nextLine();
        System.out.println("Insira a data da obra");
        String data = new Scanner(System.in).nextLine();
        
        Ob.setNome_artista(nome_artista);
        Ob.setTitulo_obra(titulo_obra);
        Ob.setCategoria(categoria);
        Ob.setTipo_obra(tipo_obra);
        Ob.setData(data);
        O = new Obra(nome_artista,titulo_obra,categoria,tipo_obra,data);
        E.getObra().add(O);
        
        
    }

    public void inserirVisitantes(){
    
        System.out.println("Insira o nome do Visitante");
        String nome = new Scanner(System.in).nextLine();
        V.setNome(nome);
         vis = new Visitantes( nome);
        E.getVisit().add(vis);
    }
    
    
    public  void inserirExp(){
        
        
  //      , ArrayList<Obra> Obra, ArrayList<Visitantes> visit
        System.out.println("Insira o nome da exposiçao");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Insira a data de quando inicia a exposiçao");
        String data_ini = new Scanner(System.in).nextLine();
        System.out.println("Insira a data de quando acaba a exposiçao");
        String data_fim = new Scanner(System.in).nextLine();
        System.out.println("Insira a quantidade das obras");
        int quantidade = new Scanner(System.in).nextInt();
        System.out.println("Insira o preço da obra");
        Double preco = new Scanner(System.in).nextDouble();
       
        
        E.setNome(nome);
        E.setData_ini(data_ini);
        E.setData_fim(data_fim);
        E.setQuantidade(quantidade);
        E.setPreco(preco);
        
     
        
    }
    
    

    
    
}
