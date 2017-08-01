package a_estrela;

import java.util.ArrayList;

public class BuscaAestrela {

    ArrayList<Vertice> VerticesAbertos;
    ArrayList<Vertice> VerticesFechados;
    ArrayList<Vertice> VerticesAdjecentes;

    public BuscaAestrela() {
        VerticesAbertos = new ArrayList<Vertice>();
        VerticesFechados = new ArrayList<Vertice>();
        VerticesAdjecentes = new ArrayList<Vertice>();
    }

    public Vertice aestrela(ArrayList<Vertice> grafo, Vertice vinicial, Vertice vfinal) {
        // Adicionando o vertice Incial a lista de vertices abertos
        VerticesAbertos.add(vinicial);
        vinicial.calcular_F(ValorG(vinicial, vinicial), vfinal);
        Vertice verticePai = vinicial;

        while (!verticePai.getNomeCidade().equalsIgnoreCase(vfinal.getNomeCidade())) {
            VerticesAdjecentes = new ArrayList<Vertice>();
            ConjuntoDeVerticesAdjecentes(verticePai);
            for (int i = 0; i < VerticesAdjecentes.size(); i++) {
                VerticesAdjecentes.get(i).gAnt = verticePai.gAnt + ValorG(verticePai, VerticesAdjecentes.get(i));
                VerticesAdjecentes.get(i).calcular_F(VerticesAdjecentes.get(i).gAnt, vfinal);
                if (!VerticesFechados.contains(VerticesAdjecentes.get(i))) {
                    VerticesAdjecentes.get(i).setVerticePai(verticePai);
                }
                VerticesAbertos.add(VerticesAdjecentes.get(i));
            }
            VerticesFechados.add(verticePai);
            VerticesAbertos.remove(verticePai);
            verticePai = menorValorF(VerticesAbertos);           
        }
        
        return verticePai;
    }


    public ArrayList<Vertice> ConjuntoDeVerticesAdjecentes(Vertice vi) {
        for (int i = 0; i < vi.arestas.size(); i++) {
            VerticesAdjecentes.add(vi.arestas.get(i).getNomeAresta());
        }
        return VerticesAdjecentes;
    }

    public Vertice menorValorF(ArrayList<Vertice> grafo) {
        Vertice menorF = grafo.get(0);
        for (int i = 1; i < grafo.size(); i++) {
            if(grafo.get(i).getFuncao()<menorF.getFuncao()){
                menorF = grafo.get(i);
            }
        }
        return menorF;
    }

    public float ValorG(Vertice vi, Vertice vf) {
        float valorGsomado = 0;
        for (int i = 0; i < vi.arestas.size(); i++) {
            if (vi.arestas.get(i).getNomeAresta().getNomeCidade().equals(vf.getNomeCidade())) {
                valorGsomado = (vi.arestas.get(i).getIndice())* 0.5f  + (vi.arestas.get(i).getDistancia())* 0.1f;
            }
        }

        return valorGsomado;
    }

}
