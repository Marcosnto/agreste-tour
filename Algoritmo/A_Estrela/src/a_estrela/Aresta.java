package a_estrela;

class Aresta {
      
    private Vertice nomeAresta;
    private float indice;
    private float distancia;

    public Aresta(Vertice nomeAresta, float indice, float distancia) {
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

    public float getIndice() {
        return indice;
    }

    public void setIndice(float indice) {
        this.indice = indice;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    
    
    
}
