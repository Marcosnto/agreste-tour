/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aestrela;

import java.util.Scanner;

/**
 *
 * @author Layla
 */
public class Teste {
    
    public static void main(String[]args){
     Scanner entrada=new Scanner(System.in);
    GerarGrafo G = new GerarGrafo();
    String verticeInicial;
    String verticedestino;
        System.out.println("====Impressao========");
        G.gerar_Grafo();
        G.impressao();
        
        System.out.println("==========================Funcionamento do algoritimo=================================");
        System.out.println("Informe a cidade Inicial:");
        verticeInicial = entrada.next();
        System.out.println("Informe a cidade destino:");
        verticedestino = entrada.next();
        
        
        
    }
}
