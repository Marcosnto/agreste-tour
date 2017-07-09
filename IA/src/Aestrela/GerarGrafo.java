package Aestrela;

import java.util.ArrayList;

public class GerarGrafo {

    ArrayList<Vertice> grafo;
    Vertice Carira, NossaSenhoraAparecida, SaoMigueldoAleixo, Ribeiropolis, MoitaBonita, FreiPaulo, Pinhao, CampodoBrito,
            PedraMole, Macambira, AreiaBranca, SaoDomingos, Malhador, Itabaiana;

    public void gerar_Grafo() {
        grafo = new ArrayList<Vertice>();
        // Criando Vertices
        AreiaBranca = new Vertice("AreiaBranca");
        CampodoBrito = new Vertice("CampodoBrito");
        Carira = new Vertice("Carira");
        FreiPaulo = new Vertice("FreiPaulo");
        Itabaiana = new Vertice("Itabaiana");
        Macambira = new Vertice("Macambira");
        Malhador = new Vertice("Malhador");
        MoitaBonita = new Vertice("MoitaBonita");
        NossaSenhoraAparecida = new Vertice("NossaSenhoraAparecida");
        PedraMole = new Vertice("PedraMole");
        Pinhao = new Vertice("Pinhao");
        Ribeiropolis = new Vertice("Ribeirolopis");
        SaoDomingos = new Vertice("SaoDomingos");
        SaoMigueldoAleixo = new Vertice("SaoMigueldoAleixo");
        // Adicionando arestas a AreiaBranca
        AreiaBranca.arestas.add(new Aresta(CampodoBrito, 10, 10));// na aresta temos o nome do vertice  e suas duas funções G
        AreiaBranca.arestas.add(new Aresta(Itabaiana, 10, 10));
        AreiaBranca.arestas.add(new Aresta(Malhador, 10, 10));
        //Adicionando arestas a CampodoBrito
        CampodoBrito.arestas.add(new Aresta(AreiaBranca, 10, 10));
        CampodoBrito.arestas.add(new Aresta(Itabaiana, 10, 10));
        CampodoBrito.arestas.add(new Aresta(SaoDomingos, 10, 10));
        //Adicionando arestas a Carira
         Carira.arestas.add(new Aresta(FreiPaulo, 10, 10));
         Carira.arestas.add(new Aresta(NossaSenhoraAparecida, 10, 10));
         Carira.arestas.add(new Aresta(Pinhao, 10, 10));
         //Adicionando arestas Freipaulo
          FreiPaulo.arestas.add(new Aresta(FreiPaulo, 10, 10));
           FreiPaulo.arestas.add(new Aresta(FreiPaulo, 10, 10));
            FreiPaulo.arestas.add(new Aresta(FreiPaulo, 10, 10));
             FreiPaulo.arestas.add(new Aresta(FreiPaulo, 10, 10));
         
        // Adicionando heuristicas em linha reta para casa Vertice
        // adicionando as heuristicas em linha reta do Vertice AreiaBranca.
        AreiaBranca.heuristica.add(new Heuristica(15, Itabaiana));
        AreiaBranca.heuristica.add(new Heuristica(20, NossaSenhoraAparecida));
        AreiaBranca.heuristica.add(new Heuristica(15, Pinhao));
        AreiaBranca.heuristica.add(new Heuristica(20, MoitaBonita));
        AreiaBranca.heuristica.add(new Heuristica(15, SaoDomingos));
        AreiaBranca.heuristica.add(new Heuristica(20, CampodoBrito));
        AreiaBranca.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        AreiaBranca.heuristica.add(new Heuristica(20, Carira));
        AreiaBranca.heuristica.add(new Heuristica(15, Ribeiropolis));
        AreiaBranca.heuristica.add(new Heuristica(20, PedraMole));
        AreiaBranca.heuristica.add(new Heuristica(15, AreiaBranca));
        AreiaBranca.heuristica.add(new Heuristica(20, Macambira));
        AreiaBranca.heuristica.add(new Heuristica(15, Malhador));
        AreiaBranca.heuristica.add(new Heuristica(0, FreiPaulo));
        // adicionando heuristicas em linha reta da vertice CampodoBrito
        CampodoBrito.heuristica.add(new Heuristica(0, Itabaiana));
        CampodoBrito.heuristica.add(new Heuristica(20, CampodoBrito));
        CampodoBrito.heuristica.add(new Heuristica(15, Macambira));
        CampodoBrito.heuristica.add(new Heuristica(20, Carira));
        CampodoBrito.heuristica.add(new Heuristica(15, Ribeiropolis));
        CampodoBrito.heuristica.add(new Heuristica(20, AreiaBranca));
        CampodoBrito.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        CampodoBrito.heuristica.add(new Heuristica(20, Malhador));
        CampodoBrito.heuristica.add(new Heuristica(15, SaoDomingos));
        CampodoBrito.heuristica.add(new Heuristica(20, MoitaBonita));
        CampodoBrito.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        CampodoBrito.heuristica.add(new Heuristica(20, PedraMole));
        CampodoBrito.heuristica.add(new Heuristica(15, FreiPaulo));
        CampodoBrito.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando heuristicas em linha reta do vertice Carira
        Carira.heuristica.add(new Heuristica(0, Itabaiana));
        Carira.heuristica.add(new Heuristica(20, CampodoBrito));
        Carira.heuristica.add(new Heuristica(15, Macambira));
        Carira.heuristica.add(new Heuristica(20, Carira));
        Carira.heuristica.add(new Heuristica(15, Ribeiropolis));
        Carira.heuristica.add(new Heuristica(20, AreiaBranca));
        Carira.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Carira.heuristica.add(new Heuristica(20, Malhador));
        Carira.heuristica.add(new Heuristica(15, SaoDomingos));
        Carira.heuristica.add(new Heuristica(20, MoitaBonita));
        Carira.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Carira.heuristica.add(new Heuristica(20, PedraMole));
        Carira.heuristica.add(new Heuristica(15, FreiPaulo));
        Carira.heuristica.add(new Heuristica(20, Pinhao));
        // adicionando heuristicas em linha reta do vertice FreiPaulo
        FreiPaulo.heuristica.add(new Heuristica(0, Itabaiana));
        FreiPaulo.heuristica.add(new Heuristica(20, CampodoBrito));
        FreiPaulo.heuristica.add(new Heuristica(15, Macambira));
        FreiPaulo.heuristica.add(new Heuristica(20, Carira));
        FreiPaulo.heuristica.add(new Heuristica(15, Ribeiropolis));
        FreiPaulo.heuristica.add(new Heuristica(20, AreiaBranca));
        FreiPaulo.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        FreiPaulo.heuristica.add(new Heuristica(20, Malhador));
        FreiPaulo.heuristica.add(new Heuristica(15, SaoDomingos));
        FreiPaulo.heuristica.add(new Heuristica(20, MoitaBonita));
        FreiPaulo.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        FreiPaulo.heuristica.add(new Heuristica(20, PedraMole));
        FreiPaulo.heuristica.add(new Heuristica(15, FreiPaulo));
        FreiPaulo.heuristica.add(new Heuristica(20, Pinhao));
        // adicionando heuristica em linha reta do vertice Itabaiana
        Itabaiana.heuristica.add(new Heuristica(0, Itabaiana));
        Itabaiana.heuristica.add(new Heuristica(20, CampodoBrito));
        Itabaiana.heuristica.add(new Heuristica(15, Macambira));
        Itabaiana.heuristica.add(new Heuristica(20, Carira));
        Itabaiana.heuristica.add(new Heuristica(15, Ribeiropolis));
        Itabaiana.heuristica.add(new Heuristica(20, AreiaBranca));
        Itabaiana.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Itabaiana.heuristica.add(new Heuristica(20, Malhador));
        Itabaiana.heuristica.add(new Heuristica(15, SaoDomingos));
        Itabaiana.heuristica.add(new Heuristica(20, MoitaBonita));
        Itabaiana.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Itabaiana.heuristica.add(new Heuristica(20, PedraMole));
        Itabaiana.heuristica.add(new Heuristica(15, FreiPaulo));
        Itabaiana.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando Heuristica em linha reta do vertice Macambira
        Macambira.heuristica.add(new Heuristica(0, Itabaiana));
        Macambira.heuristica.add(new Heuristica(20, CampodoBrito));
        Macambira.heuristica.add(new Heuristica(15, Macambira));
        Macambira.heuristica.add(new Heuristica(20, Carira));
        Macambira.heuristica.add(new Heuristica(15, Ribeiropolis));
        Macambira.heuristica.add(new Heuristica(20, AreiaBranca));
        Macambira.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Macambira.heuristica.add(new Heuristica(20, Malhador));
        Macambira.heuristica.add(new Heuristica(15, SaoDomingos));
        Macambira.heuristica.add(new Heuristica(20, MoitaBonita));
        Macambira.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Macambira.heuristica.add(new Heuristica(20, PedraMole));
        Macambira.heuristica.add(new Heuristica(15, FreiPaulo));
        Macambira.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando Heuristica em Linha reta do vertice Malhador
        Malhador.heuristica.add(new Heuristica(0, Itabaiana));
        Malhador.heuristica.add(new Heuristica(20, CampodoBrito));
        Malhador.heuristica.add(new Heuristica(15, Macambira));
        Malhador.heuristica.add(new Heuristica(20, Carira));
        Malhador.heuristica.add(new Heuristica(15, Ribeiropolis));
        Malhador.heuristica.add(new Heuristica(20, AreiaBranca));
        Malhador.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Malhador.heuristica.add(new Heuristica(20, Malhador));
        Malhador.heuristica.add(new Heuristica(15, SaoDomingos));
        Malhador.heuristica.add(new Heuristica(20, MoitaBonita));
        Malhador.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Malhador.heuristica.add(new Heuristica(20, PedraMole));
        Malhador.heuristica.add(new Heuristica(15, FreiPaulo));
        Malhador.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando heuristica em linha Reta do vertice Moita Bonita
        MoitaBonita.heuristica.add(new Heuristica(0, Itabaiana));
        MoitaBonita.heuristica.add(new Heuristica(20, CampodoBrito));
        MoitaBonita.heuristica.add(new Heuristica(15, Macambira));
        MoitaBonita.heuristica.add(new Heuristica(20, Carira));
        MoitaBonita.heuristica.add(new Heuristica(15, Ribeiropolis));
        MoitaBonita.heuristica.add(new Heuristica(20, AreiaBranca));
        MoitaBonita.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        MoitaBonita.heuristica.add(new Heuristica(20, Malhador));
        MoitaBonita.heuristica.add(new Heuristica(15, SaoDomingos));
        MoitaBonita.heuristica.add(new Heuristica(20, MoitaBonita));
        MoitaBonita.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        MoitaBonita.heuristica.add(new Heuristica(20, PedraMole));
        MoitaBonita.heuristica.add(new Heuristica(15, FreiPaulo));
        MoitaBonita.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando Heuristica
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0, Itabaiana));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, CampodoBrito));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(15, Macambira));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, Carira));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(15, Ribeiropolis));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, AreiaBranca));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, Malhador));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(15, SaoDomingos));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, MoitaBonita));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, PedraMole));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(15, FreiPaulo));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(20, Pinhao));
        //Heuristicas de Pinhao
        PedraMole.heuristica.add(new Heuristica(0, Itabaiana));
        PedraMole.heuristica.add(new Heuristica(20, CampodoBrito));
        PedraMole.heuristica.add(new Heuristica(15, Macambira));
        PedraMole.heuristica.add(new Heuristica(20, Carira));
        PedraMole.heuristica.add(new Heuristica(15, Ribeiropolis));
        PedraMole.heuristica.add(new Heuristica(20, AreiaBranca));
        PedraMole.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        PedraMole.heuristica.add(new Heuristica(20, Malhador));
        PedraMole.heuristica.add(new Heuristica(15, SaoDomingos));
        PedraMole.heuristica.add(new Heuristica(20, MoitaBonita));
        PedraMole.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        PedraMole.heuristica.add(new Heuristica(20, PedraMole));
        PedraMole.heuristica.add(new Heuristica(15, FreiPaulo));
        PedraMole.heuristica.add(new Heuristica(20, Pinhao));
        //Heuristicas de Carira
        Pinhao.heuristica.add(new Heuristica(0, Itabaiana));
        Pinhao.heuristica.add(new Heuristica(20, CampodoBrito));
        Pinhao.heuristica.add(new Heuristica(15, Macambira));
        Pinhao.heuristica.add(new Heuristica(20, Carira));
        Pinhao.heuristica.add(new Heuristica(15, Ribeiropolis));
        Pinhao.heuristica.add(new Heuristica(20, AreiaBranca));
        Pinhao.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Pinhao.heuristica.add(new Heuristica(20, Malhador));
        Pinhao.heuristica.add(new Heuristica(15, SaoDomingos));
        Pinhao.heuristica.add(new Heuristica(20, MoitaBonita));
        Pinhao.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Pinhao.heuristica.add(new Heuristica(20, PedraMole));
        Pinhao.heuristica.add(new Heuristica(15, FreiPaulo));
        Pinhao.heuristica.add(new Heuristica(20, Pinhao));
        //
        Ribeiropolis.heuristica.add(new Heuristica(0, Itabaiana));
        Ribeiropolis.heuristica.add(new Heuristica(20, CampodoBrito));
        Ribeiropolis.heuristica.add(new Heuristica(15, Macambira));
        Ribeiropolis.heuristica.add(new Heuristica(20, Carira));
        Ribeiropolis.heuristica.add(new Heuristica(15, Ribeiropolis));
        Ribeiropolis.heuristica.add(new Heuristica(20, AreiaBranca));
        Ribeiropolis.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Ribeiropolis.heuristica.add(new Heuristica(20, Malhador));
        Ribeiropolis.heuristica.add(new Heuristica(15, SaoDomingos));
        Ribeiropolis.heuristica.add(new Heuristica(20, MoitaBonita));
        Ribeiropolis.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Ribeiropolis.heuristica.add(new Heuristica(20, PedraMole));
        Ribeiropolis.heuristica.add(new Heuristica(15, FreiPaulo));
        Ribeiropolis.heuristica.add(new Heuristica(20, Pinhao));
        //
        SaoDomingos.heuristica.add(new Heuristica(0, Itabaiana));
        SaoDomingos.heuristica.add(new Heuristica(20, CampodoBrito));
        SaoDomingos.heuristica.add(new Heuristica(15, Macambira));
        SaoDomingos.heuristica.add(new Heuristica(20, Carira));
        SaoDomingos.heuristica.add(new Heuristica(15, Ribeiropolis));
        SaoDomingos.heuristica.add(new Heuristica(20, AreiaBranca));
        SaoDomingos.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        SaoDomingos.heuristica.add(new Heuristica(20, Malhador));
        SaoDomingos.heuristica.add(new Heuristica(15, SaoDomingos));
        SaoDomingos.heuristica.add(new Heuristica(20, MoitaBonita));
        SaoDomingos.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        SaoDomingos.heuristica.add(new Heuristica(20, PedraMole));
        SaoDomingos.heuristica.add(new Heuristica(15, FreiPaulo));
        SaoDomingos.heuristica.add(new Heuristica(20, Pinhao));
        //
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0, Itabaiana));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, CampodoBrito));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, Macambira));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, Carira));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, Ribeiropolis));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, AreiaBranca));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, Malhador));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, SaoDomingos));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, MoitaBonita));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, PedraMole));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, FreiPaulo));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, Pinhao));
        //

        // Adicionando os vertices comprelo com suas funções g's e h's 
        grafo.add(AreiaBranca);
        grafo.add(CampodoBrito);
        grafo.add(Carira);
        grafo.add(FreiPaulo);
        grafo.add(Itabaiana);
        grafo.add(Macambira);
        grafo.add(Malhador);
        grafo.add(Malhador);
        grafo.add(MoitaBonita);
        grafo.add(NossaSenhoraAparecida);
        grafo.add(PedraMole);
        grafo.add(Pinhao);
        grafo.add(Ribeiropolis);
        grafo.add(SaoDomingos);
        grafo.add(SaoMigueldoAleixo);

    }

    public void impressao() {
        for (int i = 0; i < grafo.size(); i++) {
            System.out.println("Distancia em Linha Reta de  " + grafo.get(i).getNomeCidade() + " para:");
            for (int j = 0; j < grafo.get(i).getHeuristica().size(); j++) {
                System.out.println(grafo.get(i).getHeuristica().get(j).getNomedestino().getNomeCidade() + " - " + grafo.get(i).getHeuristica().get(j).getValorHeuristica());
            }
            
            System.out.println("Arestas de "+grafo.get(i).getNomeCidade());
            for (int j = 0; j < grafo.get(i).getArestas().size(); j++) {
                System.out.println(grafo.get(i).getArestas().get(j).getNomeAresta().getNomeCidade() + " - " + grafo.get(i).getArestas().get(j).getIndice() + " - " + grafo.get(i).getArestas().get(j).getDistancia());
            }
             System.out.println("/n");
        }
    }

}
