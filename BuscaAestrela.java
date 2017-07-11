
package Aestrela;

import java.util.ArrayList;

/**
 *
 * @author Layla
 */
public class BuscaAestrela {
    
    ArrayList<Vertice> VerticesAbertos = new ArrayList<Vertice>();
    ArrayList<Vertice> VerticesFechados = new ArrayList<Vertice>();
    ArrayList<Vertice> VerticesAdjecentes = new ArrayList<Vertice>();
    
    public void aestrela(ArrayList<Vertice> grafo, Vertice vinicial, Vertice vfinal){
        // Adicionando o vertice Incial a lista de vertices abertos
        VerticesAbertos.add(vinicial);
        Vertice verticepai = vinicial;
        ConjuntoDeVerticesAdjecentes(vinicial);
        while(!verticepai.equals(vfinal)){
            
            
            
        }
        
       
        
    }
    
    
    public ArrayList<Vertice> ConjuntoDeVerticesAdjecentes(Vertice vi){
        
        for(int i = 0; i < vi.arestas.size();i++){
            VerticesAdjecentes.add(vi.arestas.get(i).getNomeAresta());
            
            
        }
       return VerticesAdjecentes;
     }
    
    public int PegarValorH(Vertice vi , Vertice vf){
        int heuristica = 0;
        for(int i= 0; i<vi.arestas.size();i++){
            if(vi.heuristica.get(i).getNomedestino().equals(vf)){
                
            }
        }
        
        return 0;
    }
    
}
