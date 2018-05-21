
package dijkstra;

import computationalRepresentation.Adjacencia;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author BRUNO S LIMA
 */
public class Dijkstra {
    
    public Vertice resultados[];
    
    public Dijkstra(Adjacencia adj){
        
        this.resultados = new Vertice[adj.getNumeroVertices()];
        
        for(int i = 0; i < this.resultados.length; i++){
            
            this.resultados[i] = new Vertice();
            this.resultados[i].setPosicao(i); //Nome do vertice
        }
    }
    
    public void inicializa(Vertice verticeInicial){
        
        for(int i = 0; i < this.resultados.length; i++){
            
            this.resultados[i].setDistancia(Integer.MAX_VALUE);
            this.resultados[i].setPI(null);
        }
        
        this.resultados[verticeInicial.getPosicao()].setDistancia(0);
        
    }
    
    public void relaxa(Vertice u, int i, Adjacencia adj){
        
        int distancia;
        
        if(u.getDistancia() != Integer.MAX_VALUE){
            
            distancia = u.getDistancia() + adj.getPeso(u.getPosicao(), this.resultados[i].getPosicao());
            
            if(this.resultados[i].getDistancia() > (distancia) ){
            
                this.resultados[i].setDistancia(distancia);
                this.resultados[i].setPI(u);
            }
        }
        
    }
    
    public void AlgoritmoDijsktra(Adjacencia adj, Vertice verticeInicial){
        
        this.inicializa(verticeInicial);
        
        Queue<Vertice> filaS = new LinkedList(); //Fila S vazia
        Queue<Vertice> filaQ = new LinkedList(); //Fila Q com todos os vertices
        
        int i;
        for(i = 0; i < this.resultados.length; i++){
            
            filaQ.add(this.resultados[i]); //Adicionando todos os vertices na filaQ
        }
        
        Vertice aux = null;
        while(!filaQ.isEmpty()){
        
            Vertice u = filaQ.poll();
            filaS.add(u);
            
            adj.inicializaIterator(u.getPosicao());
            while(adj.hasNext(u.getPosicao())){
                
                i = adj.next(u.getPosicao());
                
                this.relaxa(u, i, adj);
            }//Fim while interno
            
        }//Fim while externo
        
    }//Fim do método
    
    
    public void mostrarResultados(){
        
        System.out.println("\n\nResultados:\n");
        
        System.out.print("V ");
        for(int i = 0; i < this.resultados.length; i++){
            
            System.out.print(" | " + this.resultados[i].getPosicao());
        }
        
        System.out.print("\nD ");
        for(int i = 0; i < this.resultados.length; i++){
            
            System.out.print(" | " + this.resultados[i].getDistancia());
        }
        
        System.out.print("\nPI");
        for(int i = 0; i < this.resultados.length; i++){
            
            if(this.resultados[i].getPI() != null) 
                System.out.print(" | " + this.resultados[i].getPI().getPosicao());
            else System.out.print(" | null");
        }
        
        System.out.println();
    }
    
    public String printCaminho(Vertice inicio, Vertice fim){
        
        String texto = "";
        if(inicio.getPosicao() == fim.getPosicao()) return(inicio.getPosicao() + "-> ");
        else if(this.resultados[fim.getPosicao()].getPI() == null) texto += "Não existe caminho";
        else{
            texto = printCaminho(inicio, this.resultados[fim.getPosicao()].getPI());
            texto += fim.getPosicao() + "-> ";
        }
        
        return(texto);
    }
    
}

