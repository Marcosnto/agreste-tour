
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
    }
    
}
