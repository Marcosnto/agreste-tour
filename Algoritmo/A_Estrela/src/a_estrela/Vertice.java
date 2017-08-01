package a_estrela;

import java.util.ArrayList;

public class Vertice {

    private String nomeCidade;
    ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    ArrayList<Heuristica> heuristica = new ArrayList<Heuristica>();
    public float funcao;
    public float gAnt;
    public Vertice verticePai;

    public Vertice(String nomeCidade, int heuristicaLinhaReta, ArrayList arestas, ArrayList heuristica) {
        this.nomeCidade = nomeCidade;
        this.arestas = arestas;
        this.heuristica = heuristica;
        this.funcao = 0f;
        this.gAnt = 0f;
        this.verticePai = new Vertice();
    }

    public Vertice() {
    }

    public Vertice(String nomeCidade) {
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

    public void calcular_F(float valorG, Vertice vf) {
        for (int i = 0; i < heuristica.size(); i++) {
            if (heuristica.get(i).getNomedestino().getNomeCidade().equalsIgnoreCase(vf.getNomeCidade())) {
                this.funcao = valorG + (heuristica.get(i).getValorHeuristica())*0.4f;
                break;
            }
        }
    }

   
    public float getFuncao() {
        return funcao;
    }
    public void setFuncao(float funcao) {
        this.funcao = funcao;
    }
    public float getgAnt() {
        return gAnt;
    }
    public void setgAnt(float gAnt) {
        this.gAnt = gAnt;
    }
    
     public Vertice getVerticePai() {
        return verticePai;
    }

    public void setVerticePai(Vertice verticePai) {
        this.verticePai = verticePai;
    }
    

}
