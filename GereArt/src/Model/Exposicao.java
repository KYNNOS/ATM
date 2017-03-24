/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;


/**
 *
 * @author BD
 */
public class Exposicao {
    private int ID;
    private String nome;
    private String data_ini;
    private String data_fim;
    private int quantidade; 
    private double preco;
    ArrayList<Obra> Obra;
    ArrayList<Visitantes> visit;

    public Exposicao(int ID, String nome, String data_ini, String data_fim, int quantidade, double preco, ArrayList<Obra> Obra, ArrayList<Visitantes> visit) {
        this.ID = ID;
        this.nome = nome;
        this.data_ini = data_ini;
        this.data_fim = data_fim;
        this.quantidade = quantidade;
        this.preco = preco;
        this.Obra = Obra;
        this.visit = visit;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_ini() {
        return data_ini;
    }

    public void setData_ini(String data_ini) {
        this.data_ini = data_ini;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Obra> getObra() {
        return Obra;
    }

    public void setObra(ArrayList<Obra> Obra) {
        this.Obra = Obra;
    }

    public ArrayList<Visitantes> getVisit() {
        return visit;
    }

    public void setVis(ArrayList<Visitantes> visit) {
        this.visit = visit;
    }

  
}
