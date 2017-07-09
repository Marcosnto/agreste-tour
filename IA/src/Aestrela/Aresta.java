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
class Aresta {
      
    private Vertice nomeAresta;
    private int indice;
    private int distancia;

    public Aresta(Vertice nomeAresta, int indice, int distancia) {
        this.nomeAresta = nomeAresta;
        this.indice = indice;
        this.distancia = distancia;
    }
    
    
    public Aresta(){
        
    }

    public Vertice getNomeAresta() {
        return nomeAresta;
    }

    public void setNomeAresta(Vertice nomeAresta) {
        this.nomeAresta = nomeAresta;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    
    
    
}
