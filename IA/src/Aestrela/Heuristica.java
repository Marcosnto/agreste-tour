/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aestrela;

/**
 *
 * @author Layla
 */
class Heuristica {
    
    private int valorHeuristica;
    private Vertice nomedestino;

    public Heuristica(int valorHeuristica, Vertice nomedestino) {
        this.valorHeuristica = valorHeuristica;
        this.nomedestino = nomedestino;
    }
    
    public int getValorHeuristica() {
        return valorHeuristica;
    }

    public void setValorHeuristica(int valorHeuristica) {
        this.valorHeuristica = valorHeuristica;
    }

    public Vertice getNomedestino() {
        return nomedestino;
    }

    public void setNomedestino(Vertice nomedestino) {
        this.nomedestino = nomedestino;
    }
    
}
