package a_estrela;

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
        Ribeiropolis = new Vertice("Ribeiropolis");
        SaoDomingos = new Vertice("SaoDomingos");
        SaoMigueldoAleixo = new Vertice("SaoMigueldoAleixo");
        // Adicionando arestas a AreiaBranca
        AreiaBranca.arestas.add(new Aresta(CampodoBrito, 5, 27.6f));// na aresta temos o nome do vertice  e suas duas funções G
        AreiaBranca.arestas.add(new Aresta(Itabaiana, 10, 20.2f));
        AreiaBranca.arestas.add(new Aresta(Malhador, 7, 40.4f));
        //Adicionando arestas a CampodoBrito
        CampodoBrito.arestas.add(new Aresta(AreiaBranca, 5, 27.6f));
        CampodoBrito.arestas.add(new Aresta(Itabaiana, 4, 13.4f));
        CampodoBrito.arestas.add(new Aresta(SaoDomingos, 8, 15.5f));
        //Adicionando arestas a Carira
        Carira.arestas.add(new Aresta(FreiPaulo, 10, 28.9f));
        Carira.arestas.add(new Aresta(NossaSenhoraAparecida, 10,35 ));
        Carira.arestas.add(new Aresta(Pinhao, 10, 34.5f));
        //Adicionando arestas Freipaulo
        FreiPaulo.arestas.add(new Aresta(Ribeiropolis, 10, 26.2f));
        FreiPaulo.arestas.add(new Aresta(Itabaiana, 10, 28.2f));
        FreiPaulo.arestas.add(new Aresta(Macambira, 10, 36.6f));
        FreiPaulo.arestas.add(new Aresta(PedraMole, 10, 14.2f));
        FreiPaulo.arestas.add(new Aresta(Carira, 10, 28.9f));
        FreiPaulo.arestas.add(new Aresta(NossaSenhoraAparecida, 10, 44.1f));
        //Adicionando arestas de  Malhador
        Malhador.arestas.add(new Aresta(AreiaBranca, 10, 40.4f));
        Malhador.arestas.add(new Aresta(MoitaBonita, 10, 16.9f));
        Malhador.arestas.add(new Aresta(Itabaiana, 10, 21.9f));
        //Adicionando arestas de Itabaiana
        Itabaiana.arestas.add(new Aresta(AreiaBranca, 10, 20.2f));
        Itabaiana.arestas.add(new Aresta(CampodoBrito, 10, 13.4f));
        Itabaiana.arestas.add(new Aresta(FreiPaulo, 10, 28.2f));
        Itabaiana.arestas.add(new Aresta(Macambira, 10, 28.8f));
        Itabaiana.arestas.add(new Aresta(Malhador, 10, 21.9f));
        Itabaiana.arestas.add(new Aresta(MoitaBonita, 10, 16.3f));
        Itabaiana.arestas.add(new Aresta(Ribeiropolis, 10, 22f));
        //Adcionando arestas de Moita Bonita
        MoitaBonita.arestas.add(new Aresta(Malhador, 10, 16.9f));
        MoitaBonita.arestas.add(new Aresta(Ribeiropolis, 10, 13.2f));
        MoitaBonita.arestas.add(new Aresta(Itabaiana, 10, 16.3f));
        //Adicionando arestas de Ribeiropolis
        Ribeiropolis.arestas.add(new Aresta(MoitaBonita, 10, 13.2f));
        Ribeiropolis.arestas.add(new Aresta(Itabaiana, 10, 22));
        Ribeiropolis.arestas.add(new Aresta(FreiPaulo, 10, 26.2f));
        Ribeiropolis.arestas.add(new Aresta(NossaSenhoraAparecida, 10, 18));
        Ribeiropolis.arestas.add(new Aresta(SaoMigueldoAleixo, 10, 27.9f));
        // Adcionando arestas de Sao Miguel do Aleixo
        SaoMigueldoAleixo.arestas.add(new Aresta(Ribeiropolis, 10, 27.9f));
        SaoMigueldoAleixo.arestas.add(new Aresta(NossaSenhoraAparecida, 10, 27.8f));
        //Adcionando arestas de Nossa senhora Aparecida
        NossaSenhoraAparecida.arestas.add(new Aresta(SaoMigueldoAleixo, 10, 27.8f));
        NossaSenhoraAparecida.arestas.add(new Aresta(Ribeiropolis, 10, 18));
        NossaSenhoraAparecida.arestas.add(new Aresta(FreiPaulo, 10, 44.1f));
        NossaSenhoraAparecida.arestas.add(new Aresta(Carira, 10, 35));
        // Adcionando arestas de Pinhao
        Pinhao.arestas.add(new Aresta(Carira, 10, 34.5f));
        Pinhao.arestas.add(new Aresta(PedraMole, 10, 11.4f));
        //Adcionando arestas de pedra mole
        PedraMole.arestas.add(new Aresta(FreiPaulo, 10, 14.2f));
        PedraMole.arestas.add(new Aresta(Macambira, 10, 31));
        PedraMole.arestas.add(new Aresta(Pinhao, 10, 11.4f));
        //Adcionando Aresta de são Domingo
        SaoDomingos.arestas.add(new Aresta(CampodoBrito, 10, 15.5f));
        SaoDomingos.arestas.add(new Aresta(Macambira, 10, 31.5f));
        //Adcionando Aresta de Macambira
        Macambira.arestas.add(new Aresta(Itabaiana, 10, 28.8f));
        Macambira.arestas.add(new Aresta(FreiPaulo, 10, 36.6f));
        Macambira.arestas.add(new Aresta(SaoDomingos,10, 31.5f));
        Macambira.arestas.add(new Aresta(PedraMole, 10, 31));
        // Adicionando heuristicas em linha reta para casa Vertice
        // adicionando as heuristicas em linha reta do Vertice AreiaBranca.
        AreiaBranca.heuristica.add(new Heuristica(16.83f, Itabaiana));
        AreiaBranca.heuristica.add(new Heuristica(47.43f, NossaSenhoraAparecida));
        AreiaBranca.heuristica.add(new Heuristica(52.14f, Pinhao));
        AreiaBranca.heuristica.add(new Heuristica(22.02f, MoitaBonita));
        AreiaBranca.heuristica.add(new Heuristica(29.2f, SaoDomingos));
        AreiaBranca.heuristica.add(new Heuristica(19.65f, CampodoBrito));
        AreiaBranca.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        AreiaBranca.heuristica.add(new Heuristica(20, Carira));
        AreiaBranca.heuristica.add(new Heuristica(15, Ribeiropolis));
        AreiaBranca.heuristica.add(new Heuristica(20, PedraMole));
        AreiaBranca.heuristica.add(new Heuristica(0, AreiaBranca));
        AreiaBranca.heuristica.add(new Heuristica(20, Macambira));
        AreiaBranca.heuristica.add(new Heuristica(15, Malhador));
        AreiaBranca.heuristica.add(new Heuristica(0, FreiPaulo));
        // adicionando heuristicas em linha reta da vertice CampodoBrito
        CampodoBrito.heuristica.add(new Heuristica(20, Itabaiana));
        CampodoBrito.heuristica.add(new Heuristica(0, CampodoBrito));
        CampodoBrito.heuristica.add(new Heuristica(15, Macambira));
        CampodoBrito.heuristica.add(new Heuristica(20, Carira));
        CampodoBrito.heuristica.add(new Heuristica(15, Ribeiropolis));
        CampodoBrito.heuristica.add(new Heuristica(20, AreiaBranca));
        CampodoBrito.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        CampodoBrito.heuristica.add(new Heuristica(20, Malhador));
        CampodoBrito.heuristica.add(new Heuristica(15, SaoDomingos));
        CampodoBrito.heuristica.add(new Heuristica(22.43f, MoitaBonita));
        CampodoBrito.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        CampodoBrito.heuristica.add(new Heuristica(20, PedraMole));
        CampodoBrito.heuristica.add(new Heuristica(15, FreiPaulo));
        CampodoBrito.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando heuristicas em linha reta do vertice Carira
        Carira.heuristica.add(new Heuristica(20, Itabaiana));
        Carira.heuristica.add(new Heuristica(22.43f, CampodoBrito));
        Carira.heuristica.add(new Heuristica(15, Macambira));
        Carira.heuristica.add(new Heuristica(0, Carira));
        Carira.heuristica.add(new Heuristica(15, Ribeiropolis));
        Carira.heuristica.add(new Heuristica(20, AreiaBranca));
        Carira.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Carira.heuristica.add(new Heuristica(20, Malhador));
        Carira.heuristica.add(new Heuristica(15, SaoDomingos));
        Carira.heuristica.add(new Heuristica(45.83f, MoitaBonita));
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
        FreiPaulo.heuristica.add(new Heuristica(26.31f, MoitaBonita));
        FreiPaulo.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        FreiPaulo.heuristica.add(new Heuristica(20, PedraMole));
        FreiPaulo.heuristica.add(new Heuristica(0, FreiPaulo));
        FreiPaulo.heuristica.add(new Heuristica(16.77f, Pinhao));
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
        Itabaiana.heuristica.add(new Heuristica(12.9f, MoitaBonita));
        Itabaiana.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Itabaiana.heuristica.add(new Heuristica(20, PedraMole));
        Itabaiana.heuristica.add(new Heuristica(15, FreiPaulo));
        Itabaiana.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando Heuristica em linha reta do vertice Macambira
        Macambira.heuristica.add(new Heuristica(0, Itabaiana));
        Macambira.heuristica.add(new Heuristica(20, CampodoBrito));
        Macambira.heuristica.add(new Heuristica(0, Macambira));
        Macambira.heuristica.add(new Heuristica(20, Carira));
        Macambira.heuristica.add(new Heuristica(15, Ribeiropolis));
        Macambira.heuristica.add(new Heuristica(20, AreiaBranca));
        Macambira.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Macambira.heuristica.add(new Heuristica(20, Malhador));
        Macambira.heuristica.add(new Heuristica(15, SaoDomingos));
        Macambira.heuristica.add(new Heuristica(29.28f, MoitaBonita));
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
        Malhador.heuristica.add(new Heuristica(0, Malhador));
        Malhador.heuristica.add(new Heuristica(15, SaoDomingos));
        Malhador.heuristica.add(new Heuristica(11.76f, MoitaBonita));
        Malhador.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Malhador.heuristica.add(new Heuristica(20, PedraMole));
        Malhador.heuristica.add(new Heuristica(15, FreiPaulo));
        Malhador.heuristica.add(new Heuristica(20, Pinhao));
        //adicionando heuristica em linha Reta do vertice Moita Bonita
        MoitaBonita.heuristica.add(new Heuristica(12.9f, Itabaiana));
        MoitaBonita.heuristica.add(new Heuristica(22.43f, CampodoBrito));
        MoitaBonita.heuristica.add(new Heuristica(29.28f, Macambira));
        MoitaBonita.heuristica.add(new Heuristica(45.83f, Carira));
        MoitaBonita.heuristica.add(new Heuristica(10.65f, Ribeiropolis));
        MoitaBonita.heuristica.add(new Heuristica(22.02f, AreiaBranca));
        MoitaBonita.heuristica.add(new Heuristica(22.03f, SaoMigueldoAleixo));
        MoitaBonita.heuristica.add(new Heuristica(11.76f, Malhador));
        MoitaBonita.heuristica.add(new Heuristica(31.93f, SaoDomingos));
        MoitaBonita.heuristica.add(new Heuristica(0, MoitaBonita));
        MoitaBonita.heuristica.add(new Heuristica(26.61f, NossaSenhoraAparecida));
        MoitaBonita.heuristica.add(new Heuristica(33.93f, PedraMole));
        MoitaBonita.heuristica.add(new Heuristica(26.31f, FreiPaulo));
        MoitaBonita.heuristica.add(new Heuristica(45.02f, Pinhao));
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
        NossaSenhoraAparecida.heuristica.add(new Heuristica(26.61f, MoitaBonita));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0, NossaSenhoraAparecida));
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
        PedraMole.heuristica.add(new Heuristica(33.93f, MoitaBonita));
        PedraMole.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        PedraMole.heuristica.add(new Heuristica(0, PedraMole));
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
        Pinhao.heuristica.add(new Heuristica(45.02f, MoitaBonita));
        Pinhao.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Pinhao.heuristica.add(new Heuristica(20, PedraMole));
        Pinhao.heuristica.add(new Heuristica(16.77f, FreiPaulo));
        Pinhao.heuristica.add(new Heuristica(0, Pinhao));
        //
        Ribeiropolis.heuristica.add(new Heuristica(0, Itabaiana));
        Ribeiropolis.heuristica.add(new Heuristica(20, CampodoBrito));
        Ribeiropolis.heuristica.add(new Heuristica(15, Macambira));
        Ribeiropolis.heuristica.add(new Heuristica(20, Carira));
        Ribeiropolis.heuristica.add(new Heuristica(0, Ribeiropolis));
        Ribeiropolis.heuristica.add(new Heuristica(20, AreiaBranca));
        Ribeiropolis.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        Ribeiropolis.heuristica.add(new Heuristica(20, Malhador));
        Ribeiropolis.heuristica.add(new Heuristica(15, SaoDomingos));
        Ribeiropolis.heuristica.add(new Heuristica(10.65f, MoitaBonita));
        Ribeiropolis.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        Ribeiropolis.heuristica.add(new Heuristica(20, PedraMole));
        Ribeiropolis.heuristica.add(new Heuristica(15, FreiPaulo));
        Ribeiropolis.heuristica.add(new Heuristica(20, Pinhao));
        //
        SaoDomingos.heuristica.add(new Heuristica(20, Itabaiana));
        SaoDomingos.heuristica.add(new Heuristica(20, CampodoBrito));
        SaoDomingos.heuristica.add(new Heuristica(15, Macambira));
        SaoDomingos.heuristica.add(new Heuristica(20, Carira));
        SaoDomingos.heuristica.add(new Heuristica(15, Ribeiropolis));
        SaoDomingos.heuristica.add(new Heuristica(20, AreiaBranca));
        SaoDomingos.heuristica.add(new Heuristica(15, SaoMigueldoAleixo));
        SaoDomingos.heuristica.add(new Heuristica(20, Malhador));
        SaoDomingos.heuristica.add(new Heuristica(0, SaoDomingos));
        SaoDomingos.heuristica.add(new Heuristica(31.93f, MoitaBonita));
        SaoDomingos.heuristica.add(new Heuristica(15, NossaSenhoraAparecida));
        SaoDomingos.heuristica.add(new Heuristica(20, PedraMole));
        SaoDomingos.heuristica.add(new Heuristica(15, FreiPaulo));
        SaoDomingos.heuristica.add(new Heuristica(20, Pinhao));
        //
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, Itabaiana));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, CampodoBrito));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, Macambira));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, Carira));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, Ribeiropolis));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, AreiaBranca));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0, SaoMigueldoAleixo));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(20, Malhador));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(15, SaoDomingos));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(22.03f, MoitaBonita));
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
}
