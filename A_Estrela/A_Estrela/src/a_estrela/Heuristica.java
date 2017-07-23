package a_estrela;

class Heuristica {
    
    private float valorHeuristica;
    private Vertice nomedestino;

    public Heuristica(float valorHeuristica, Vertice nomedestino) {
        this.valorHeuristica = valorHeuristica;
        this.nomedestino = nomedestino;
    }
    
    public float getValorHeuristica() {
        return valorHeuristica;
    }

    public void setValorHeuristica(float valorHeuristica) {
        this.valorHeuristica = valorHeuristica;
    }

    public Vertice getNomedestino() {
        return nomedestino;
    }

    public void setNomedestino(Vertice nomedestino) {
        this.nomedestino = nomedestino;
    }
    
}
