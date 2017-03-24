/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author BD
 */
public class Obra {
    //private int ID;
    private String nome_artista;
    private String titulo_obra;
    private String categoria;
    private String tipo_obra;
    private String data;

    public Obra(/*int ID,*/ String nome_artista, String titulo_obra, String categoria, String tipo_obra, String data) {
        //this.ID = ID;
        this.nome_artista = nome_artista;
        this.titulo_obra = titulo_obra;
        this.categoria = categoria;
        this.tipo_obra = tipo_obra;
        this.data = data;
    }

    /* public int getID() {
    return ID;
    }
    
    public void setID(int ID) {
    this.ID = ID;
    }*/

    public String getNome_artista() {
        return nome_artista;
    }

    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    public String getTitulo_obra() {
        return titulo_obra;
    }

    public void setTitulo_obra(String titulo_obra) {
        this.titulo_obra = titulo_obra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo_obra() {
        return tipo_obra;
    }

    public void setTipo_obra(String tipo_obra) {
        this.tipo_obra = tipo_obra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
