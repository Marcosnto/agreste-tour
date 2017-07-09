/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aestrela;

import java.util.ArrayList;

/**
 *
 * @author Layla
 */
public class Vertice {
    
    private String nomeCidade;
    ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    ArrayList<Heuristica> heuristica = new ArrayList<Heuristica>();

    public Vertice(String nomeCidade, int heuristicaLinhaReta, ArrayList arestas, ArrayList heuristica) {
        this.nomeCidade = nomeCidade;
        this.arestas = arestas;
        this.heuristica = heuristica;
    }
    
    
    public Vertice(){
        
    }
    
    public Vertice( String nomeCidade){
        this.nomeCidade = nomeCidade;
        
    }
    public ArrayList<Heuristica> getHeuristica() {
        return heuristica;
    }

    public void setHeuristica(ArrayList<Heuristica> heuristica) {
        this.heuristica = heuristica;
    }
    
   
    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }


    

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }
    
    
    
}
