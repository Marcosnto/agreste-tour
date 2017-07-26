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
        // na aresta temos o nome do vertice  e suas duas funções G
        AreiaBranca.arestas.add(new Aresta(Itabaiana, 0.398305085f, 0.245742092f));
        
        
        //Adicionando arestas a CampodoBrito
        CampodoBrito.arestas.add(new Aresta(Itabaiana, 0.059322034F, 0.163017032f));
        CampodoBrito.arestas.add(new Aresta(SaoDomingos, 0.059322034f, 0.188564477f));
        CampodoBrito.arestas.add(new Aresta(Macambira, 0, 0.228710462f));
        
        //Adicionando arestas a Carira
        Carira.arestas.add(new Aresta(FreiPaulo, 0.169491525f, 0.351581509f));
        Carira.arestas.add(new Aresta(NossaSenhoraAparecida, 0.169491525f, 0.425790754f));
        Carira.arestas.add(new Aresta(Pinhao, 0.008474576f, 0.41970803f));
        
        //Adicionando arestas Freipaulo
        FreiPaulo.arestas.add(new Aresta(Ribeiropolis, 0, 0.318734793f));
        FreiPaulo.arestas.add(new Aresta(Itabaiana, 1, 0.343065693f));
        FreiPaulo.arestas.add(new Aresta(PedraMole, 0.008474576f, 0.172749392f));
        FreiPaulo.arestas.add(new Aresta(Carira, 0.169491525f, 0.351581509f));
        
        //Adicionando arestas de  Malhador
        Malhador.arestas.add(new Aresta(MoitaBonita, 0.008474576f, 0.205596107f));
        
        //Adicionando arestas de Itabaiana
        Itabaiana.arestas.add(new Aresta(AreiaBranca, 0.398305085f, 0.245742092f));
        Itabaiana.arestas.add(new Aresta(CampodoBrito, 0.06779661f, 0.163017032f));
        Itabaiana.arestas.add(new Aresta(FreiPaulo, 0.169491525f, 0.343065693f));
        Itabaiana.arestas.add(new Aresta(MoitaBonita, 0.06779661f, 0.198296837f));
        
        //Adcionando arestas de Moita Bonita
        MoitaBonita.arestas.add(new Aresta(Malhador, 0.008474576f, 0.2055961f));
        MoitaBonita.arestas.add(new Aresta(Ribeiropolis, 0.016949153f, 0.160583942f));
        MoitaBonita.arestas.add(new Aresta(Itabaiana, 0.008474576f, 0.198296837f));
        
        //Adicionando arestas de Ribeiropolis
        Ribeiropolis.arestas.add(new Aresta(MoitaBonita, 0, 0.160583942f));
        Ribeiropolis.arestas.add(new Aresta(FreiPaulo, 0.008474576f, 0.318734793f));
        Ribeiropolis.arestas.add(new Aresta(NossaSenhoraAparecida, 0, 0.218978102f));
        Ribeiropolis.arestas.add(new Aresta(SaoMigueldoAleixo, 0, 0.339416058f));
        
        // Adcionando arestas de Sao Miguel do Aleixo
        SaoMigueldoAleixo.arestas.add(new Aresta(Ribeiropolis, 0, 0.338199513f));
        SaoMigueldoAleixo.arestas.add(new Aresta(NossaSenhoraAparecida, 0, 0.116788321f));
        
        //Adcionando arestas de Nossa senhora Aparecida
        NossaSenhoraAparecida.arestas.add(new Aresta(SaoMigueldoAleixo, 0.042372881f, 0.116788321f));
        NossaSenhoraAparecida.arestas.add(new Aresta(Ribeiropolis, 0.042372881f, 0.218978102f));
        NossaSenhoraAparecida.arestas.add(new Aresta(Carira, 0.042372881f, 0.425790754f));
        
        // Adcionando arestas de Pinhao
        Pinhao.arestas.add(new Aresta(Carira, 0, 0.419708029f));
        Pinhao.arestas.add(new Aresta(PedraMole, 0, 0.138686131f));
        
        //Adcionando arestas de pedra mole
        PedraMole.arestas.add(new Aresta(FreiPaulo, 0, 0.172749392f));
        PedraMole.arestas.add(new Aresta(Macambira, 0, 0.377128954f));
        PedraMole.arestas.add(new Aresta(Pinhao, 0, 0.13868613f));
        
        //Adcionando Aresta de são Domingo
        SaoDomingos.arestas.add(new Aresta(CampodoBrito, 0, 0.183698297f));
        
        //Adcionando Aresta de Macambira
        Macambira.arestas.add(new Aresta(CampodoBrito, 0, 0.228710462f));
        Macambira.arestas.add(new Aresta(PedraMole, 0, 0.377128954f));
        
        // Adicionando heuristicas em linha reta para casa Vertice
       
        // adicionando as heuristicas em linha reta do Vertice AreiaBranca.
        AreiaBranca.heuristica.add(new Heuristica(0.263503992f, Itabaiana));
        AreiaBranca.heuristica.add(new Heuristica(0.742602161f, NossaSenhoraAparecida));
        AreiaBranca.heuristica.add(new Heuristica(0.8163457f, Pinhao));
        AreiaBranca.heuristica.add(new Heuristica(0.344762799f, MoitaBonita));
        AreiaBranca.heuristica.add(new Heuristica(0.457178644f, SaoDomingos));
        AreiaBranca.heuristica.add(new Heuristica(0.307656177f, CampodoBrito));
        AreiaBranca.heuristica.add(new Heuristica(0.687490214f, SaoMigueldoAleixo));
        AreiaBranca.heuristica.add(new Heuristica(1f, Carira));
        AreiaBranca.heuristica.add(new Heuristica(0.484578049f, Ribeiropolis));
        AreiaBranca.heuristica.add(new Heuristica(0.672459684f, PedraMole));
        AreiaBranca.heuristica.add(new Heuristica(0, AreiaBranca));
        AreiaBranca.heuristica.add(new Heuristica(0.550649757f, Macambira));
        AreiaBranca.heuristica.add(new Heuristica(0.2118365f, Malhador));
        AreiaBranca.heuristica.add(new Heuristica(0.638327853f, FreiPaulo));
        
        // adicionando heuristicas em linha reta da vertice CampodoBrito
        CampodoBrito.heuristica.add(new Heuristica(0.149679036f, Itabaiana));
        CampodoBrito.heuristica.add(new Heuristica(0, CampodoBrito));
        CampodoBrito.heuristica.add(new Heuristica(0.25097855f, Macambira));
        CampodoBrito.heuristica.add(new Heuristica(0.772350086f, Carira));
        CampodoBrito.heuristica.add(new Heuristica(0.530765618f, Ribeiropolis));
        CampodoBrito.heuristica.add(new Heuristica(0.307656177f, AreiaBranca));
        CampodoBrito.heuristica.add(new Heuristica(0.647095663f, SaoMigueldoAleixo));
        CampodoBrito.heuristica.add(new Heuristica(0.3799906f, Malhador));
        CampodoBrito.heuristica.add(new Heuristica(0.165492406f, SaoDomingos));
        CampodoBrito.heuristica.add(new Heuristica(0.351182089f, MoitaBonita));
        CampodoBrito.heuristica.add(new Heuristica(0.597463598f, NossaSenhoraAparecida));
        CampodoBrito.heuristica.add(new Heuristica(0.37967747f, PedraMole));
        CampodoBrito.heuristica.add(new Heuristica(0.397839361f, FreiPaulo));
        CampodoBrito.heuristica.add(new Heuristica(0.52231094f, Pinhao));
        
        //adicionando heuristicas em linha reta do vertice Carira
        Carira.heuristica.add(new Heuristica(0.739001096f, Itabaiana));
        Carira.heuristica.add(new Heuristica(0.772350086f, CampodoBrito));
        Carira.heuristica.add(new Heuristica(0.568968217f, Macambira));
        Carira.heuristica.add(new Heuristica(0, Carira));
        Carira.heuristica.add(new Heuristica(0.551119461f, Ribeiropolis));
        Carira.heuristica.add(new Heuristica(1, AreiaBranca));
        Carira.heuristica.add(new Heuristica(0.570690465f, SaoMigueldoAleixo));
        Carira.heuristica.add(new Heuristica(0.8993268f, Malhador));
        Carira.heuristica.add(new Heuristica(0.763738845f, SaoDomingos));
        Carira.heuristica.add(new Heuristica(0.717551276f, MoitaBonita));
        Carira.heuristica.add(new Heuristica(0.339752623f, NossaSenhoraAparecida));
        Carira.heuristica.add(new Heuristica(0.458900892f, PedraMole));
        Carira.heuristica.add(new Heuristica(0.374667293f, FreiPaulo));
        Carira.heuristica.add(new Heuristica(0.39580398f, Pinhao));
        
        // adicionando heuristicas em linha reta do vertice FreiPaulo
        FreiPaulo.heuristica.add(new Heuristica(0.374617293f, Itabaiana));
        FreiPaulo.heuristica.add(new Heuristica(0.39783139361f, CampodoBrito));
        FreiPaulo.heuristica.add(new Heuristica(0.225457961f, Macambira));
        FreiPaulo.heuristica.add(new Heuristica(0.374667293f, Carira));
        FreiPaulo.heuristica.add(new Heuristica(0.27086269f, Ribeiropolis));
        FreiPaulo.heuristica.add(new Heuristica(0.638327853f, AreiaBranca));
        FreiPaulo.heuristica.add(new Heuristica(0.461092845f, SaoMigueldoAleixo));
        FreiPaulo.heuristica.add(new Heuristica(0.5746047f, Malhador));
        FreiPaulo.heuristica.add(new Heuristica(0.409895099f, SaoDomingos));
        FreiPaulo.heuristica.add(new Heuristica(0.411930484f, MoitaBonita));
        FreiPaulo.heuristica.add(new Heuristica(0.280569908f, NossaSenhoraAparecida));
        FreiPaulo.heuristica.add(new Heuristica(0.180992641f, PedraMole));
        FreiPaulo.heuristica.add(new Heuristica(0, FreiPaulo));
        FreiPaulo.heuristica.add(new Heuristica(0.26256458f, Pinhao));
        
        // adicionando heuristica em linha reta do vertice Itabaiana
        Itabaiana.heuristica.add(new Heuristica(0, Itabaiana));
        Itabaiana.heuristica.add(new Heuristica(0.149679036f, CampodoBrito));
        Itabaiana.heuristica.add(new Heuristica(0.317050258f, Macambira));
        Itabaiana.heuristica.add(new Heuristica(0.739001096f, Carira));
        Itabaiana.heuristica.add(new Heuristica(0.26287772f, Ribeiropolis));
        Itabaiana.heuristica.add(new Heuristica(0.263503992f, AreiaBranca));
        Itabaiana.heuristica.add(new Heuristica(0.515578519f, SaoMigueldoAleixo));
        Itabaiana.heuristica.add(new Heuristica(0.2523877f, Malhador));
        Itabaiana.heuristica.add(new Heuristica(0.306247064f, SaoDomingos));
        Itabaiana.heuristica.add(new Heuristica(0.201972757f, MoitaBonita));
        Itabaiana.heuristica.add(new Heuristica(0.506967277f, NossaSenhoraAparecida));
        Itabaiana.heuristica.add(new Heuristica(0.424769062f, PedraMole));
        Itabaiana.heuristica.add(new Heuristica(0.374667293f, FreiPaulo));
        Itabaiana.heuristica.add(new Heuristica(0.56677626f, Pinhao));
        
        //adicionando Heuristica em linha reta do vertice Macambira
        Macambira.heuristica.add(new Heuristica(0.317050258f, Itabaiana));
        Macambira.heuristica.add(new Heuristica(0.25097855f, CampodoBrito));
        Macambira.heuristica.add(new Heuristica(0, Macambira));
        Macambira.heuristica.add(new Heuristica(0.568968217f, Carira));
        Macambira.heuristica.add(new Heuristica(0.386879599f, Ribeiropolis));
        Macambira.heuristica.add(new Heuristica(0.550649757f, AreiaBranca));
        Macambira.heuristica.add(new Heuristica(0.636449037f, SaoMigueldoAleixo));
        Macambira.heuristica.add(new Heuristica(0.5666197f, Malhador));
        Macambira.heuristica.add(new Heuristica(0.194927196f, SaoDomingos));
        Macambira.heuristica.add(new Heuristica(0.458431188f, MoitaBonita));
        Macambira.heuristica.add(new Heuristica(0.496790355f, NossaSenhoraAparecida));
        Macambira.heuristica.add(new Heuristica(0.131204008f, PedraMole));
        Macambira.heuristica.add(new Heuristica(0.225457961f, FreiPaulo));
        Macambira.heuristica.add(new Heuristica(0.27164553f, Pinhao));
        
        //adicionando Heuristica em Linha reta do vertice Malhador
        Malhador.heuristica.add(new Heuristica(0.252387667f, Itabaiana));
        Malhador.heuristica.add(new Heuristica(0.379990606f, CampodoBrito));
        Malhador.heuristica.add(new Heuristica(0.566619696f, Macambira));
        Malhador.heuristica.add(new Heuristica(0.899326757f, Carira));
        Malhador.heuristica.add(new Heuristica(0.350086112f, Ribeiropolis));
        Malhador.heuristica.add(new Heuristica(0.211836543f, AreiaBranca));
        Malhador.heuristica.add(new Heuristica(0.498669172f, SaoMigueldoAleixo));
        Malhador.heuristica.add(new Heuristica(0, Malhador));
        Malhador.heuristica.add(new Heuristica(0.545326444f, SaoDomingos));
        Malhador.heuristica.add(new Heuristica(0.18428057f, MoitaBonita));
        Malhador.heuristica.add(new Heuristica(0.600125254f, NossaSenhoraAparecida));
        Malhador.heuristica.add(new Heuristica(0.664474714f, PedraMole));
        Malhador.heuristica.add(new Heuristica(0.574604666f, FreiPaulo));
        Malhador.heuristica.add(new Heuristica(0.801628307f, Pinhao));
        
        //adicionando heuristica em linha Reta do vertice Moita Bonita
        MoitaBonita.heuristica.add(new Heuristica(0.201972757f, Itabaiana));
        MoitaBonita.heuristica.add(new Heuristica(0.351182089f, CampodoBrito));
        MoitaBonita.heuristica.add(new Heuristica(0.458431188f, Macambira));
        MoitaBonita.heuristica.add(new Heuristica(0.717551276f, Carira));
        MoitaBonita.heuristica.add(new Heuristica(0.167744951f, Ribeiropolis));
        MoitaBonita.heuristica.add(new Heuristica(0.344762799f, AreiaBranca));
        MoitaBonita.heuristica.add(new Heuristica(0.344919367f, SaoMigueldoAleixo));
        MoitaBonita.heuristica.add(new Heuristica(0.18428057f, Malhador));
        MoitaBonita.heuristica.add(new Heuristica(0.499921716f, SaoDomingos));
        MoitaBonita.heuristica.add(new Heuristica(0, MoitaBonita));
        MoitaBonita.heuristica.add(new Heuristica(0.416627525f, NossaSenhoraAparecida));
        MoitaBonita.heuristica.add(new Heuristica(0.531235322f, PedraMole));
        MoitaBonita.heuristica.add(new Heuristica(0.411930484f, FreiPaulo));
        MoitaBonita.heuristica.add(new Heuristica(0.657898857f, Pinhao));
        
        //adicionando Heuristica em linha reta do vertice NossaSenhoraAparecida
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.506967277f, Itabaiana));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.597463598f, CampodoBrito));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.496790355f, Macambira));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.339752623f, Carira));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.258337248f, Ribeiropolis));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.742602161f, AreiaBranca));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.238453108f, SaoMigueldoAleixo));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.600125254f, Malhador));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.661499922f, SaoDomingos));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.416627525f, MoitaBonita));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0, NossaSenhoraAparecida));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.458431188f, PedraMole));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.280569908f, FreiPaulo));
        NossaSenhoraAparecida.heuristica.add(new Heuristica(0.501643964f, Pinhao));
        
        //Heuristicas de Pedra Mole
        PedraMole.heuristica.add(new Heuristica(0.424769062f, Itabaiana));
        PedraMole.heuristica.add(new Heuristica(0.37967747f, CampodoBrito));
        PedraMole.heuristica.add(new Heuristica(0.131204008f, Macambira));
        PedraMole.heuristica.add(new Heuristica(0.458900892f, Carira));
        PedraMole.heuristica.add(new Heuristica(0.422420542f, Ribeiropolis));
        PedraMole.heuristica.add(new Heuristica(0.672459684f, AreiaBranca));
        PedraMole.heuristica.add(new Heuristica(0.63942383f, SaoMigueldoAleixo));
        PedraMole.heuristica.add(new Heuristica(0.664474714f, Malhador));
        PedraMole.heuristica.add(new Heuristica(0.31689369f, SaoDomingos));
        PedraMole.heuristica.add(new Heuristica(0.531235322f, MoitaBonita));
        PedraMole.heuristica.add(new Heuristica(0.458431188f, NossaSenhoraAparecida));
        PedraMole.heuristica.add(new Heuristica(0, PedraMole));
        PedraMole.heuristica.add(new Heuristica(0.180992641f, FreiPaulo));
        PedraMole.heuristica.add(new Heuristica(0.144042587f, Pinhao));
        
        //Heuristicas de Pinhão
        Pinhao.heuristica.add(new Heuristica(0.566776264f, Itabaiana));
        Pinhao.heuristica.add(new Heuristica(0.522310944f, CampodoBrito));
        Pinhao.heuristica.add(new Heuristica(0.27164553f, Macambira));
        Pinhao.heuristica.add(new Heuristica(0.395803977f, Carira));
        Pinhao.heuristica.add(new Heuristica(0.530922186f, Ribeiropolis));
        Pinhao.heuristica.add(new Heuristica(0.816345702f, AreiaBranca));
        Pinhao.heuristica.add(new Heuristica(0.713323939f, SaoMigueldoAleixo));
        Pinhao.heuristica.add(new Heuristica(0.801628307f, Malhador));
        Pinhao.heuristica.add(new Heuristica(0.442774385f, SaoDomingos));
        Pinhao.heuristica.add(new Heuristica(0.657898857f, MoitaBonita));
        Pinhao.heuristica.add(new Heuristica(0.501643964f, NossaSenhoraAparecida));
        Pinhao.heuristica.add(new Heuristica(0.14404220587f, PedraMole));
        Pinhao.heuristica.add(new Heuristica(0.262564584f, FreiPaulo));
        Pinhao.heuristica.add(new Heuristica(0, Pinhao));
        
        //
        Ribeiropolis.heuristica.add(new Heuristica(0.26287772f, Itabaiana));
        Ribeiropolis.heuristica.add(new Heuristica(0.530765618f, CampodoBrito));
        Ribeiropolis.heuristica.add(new Heuristica(0.386879599f, Macambira));
        Ribeiropolis.heuristica.add(new Heuristica(0.551119461f, Carira));
        Ribeiropolis.heuristica.add(new Heuristica(0, Ribeiropolis));
        Ribeiropolis.heuristica.add(new Heuristica(0.484578049f, AreiaBranca));
        Ribeiropolis.heuristica.add(new Heuristica(0.267418193f, SaoMigueldoAleixo));
        Ribeiropolis.heuristica.add(new Heuristica(0.350086112f, Malhador));
        Ribeiropolis.heuristica.add(new Heuristica(0.492093315f, SaoDomingos));
        Ribeiropolis.heuristica.add(new Heuristica(0.166744951f, MoitaBonita));
        Ribeiropolis.heuristica.add(new Heuristica(0.258337248f, NossaSenhoraAparecida));
        Ribeiropolis.heuristica.add(new Heuristica(0.422420542f, PedraMole));
        Ribeiropolis.heuristica.add(new Heuristica(0.27086269f, FreiPaulo));
        Ribeiropolis.heuristica.add(new Heuristica(0.530922186f, Pinhao));
        
        //
        SaoDomingos.heuristica.add(new Heuristica(0.306247064f, Itabaiana));
        SaoDomingos.heuristica.add(new Heuristica(0.165492406f, CampodoBrito));
        SaoDomingos.heuristica.add(new Heuristica(0.194927196f, Macambira));
        SaoDomingos.heuristica.add(new Heuristica(0.763738845f, Carira));
        SaoDomingos.heuristica.add(new Heuristica(0.492093315f, Ribeiropolis));
        SaoDomingos.heuristica.add(new Heuristica(0.457178644f, AreiaBranca));
        SaoDomingos.heuristica.add(new Heuristica(0.758728668f, SaoMigueldoAleixo));
        SaoDomingos.heuristica.add(new Heuristica(0.545326444f, Malhador));
        SaoDomingos.heuristica.add(new Heuristica(0, SaoDomingos));
        SaoDomingos.heuristica.add(new Heuristica(0.499921716f, MoitaBonita));
        SaoDomingos.heuristica.add(new Heuristica(0.661499922f, NossaSenhoraAparecida));
        SaoDomingos.heuristica.add(new Heuristica(0.31689369f, PedraMole));
        SaoDomingos.heuristica.add(new Heuristica(0.409895099f, FreiPaulo));
        SaoDomingos.heuristica.add(new Heuristica(0.442774385f, Pinhao));
        //
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.515578519f, Itabaiana));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.647095663f, CampodoBrito));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.636449037f, Macambira));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.570690465f, Carira));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.267418193f, Ribeiropolis));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.687490214f, AreiaBranca));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0, SaoMigueldoAleixo));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.498669172f, Malhador));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.758728668f, SaoDomingos));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.344919367f, MoitaBonita));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.238453108f, NossaSenhoraAparecida));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.633787381f, PedraMole));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.461092845f, FreiPaulo));
        SaoMigueldoAleixo.heuristica.add(new Heuristica(0.713323939f, Pinhao));
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
