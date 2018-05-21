
package computationalRepresentation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author BRUNO S LIMA
 */
public class ListaAdjacencia extends RepresentacaoComputacional {
    
    public Lista [] lista;
    //public No posicaoAtual;
    
    public ListaAdjacencia(int numVertices){
        
        super(numVertices);
        this.lista = new Lista[numVertices];
        
        this.inicializaListas();
    }
    
    public void inicializaListas(){
        
        for(int i = 0; i < this.lista.length; i++){
            this.lista[i] = new Lista();
        }
    }
    
    
    @Override
    public void adicionaAresta(int i, int j, int peso){
        
          lista[i].inserirNo(j, peso);
    }
      
    @Override
    public boolean verificarAdjacencia(int i, int j){
         
        return lista[i].contem(j);
    }
    
    @Override
    public int getPeso(int i, int j) {
        
        No aux = this.lista[i].primeiro;
        while(aux != null){
            
            if(aux.getValor() == j) return(aux.getPeso());
            aux = aux.getProx();
        }

        return(Integer.MAX_VALUE); //Cuidado, melhorar!!!
    }
  
    @Override
    public void exibir(){
         
        for(int i = 0; i < this.lista.length ;i++){
            
            System.out.print("| " + i + " |-->");
            lista[i].exibir();
            System.out.println();
        }
    }

   
    public boolean hasNext(int pos) { //OK

        if(this.lista[pos].posicaoAtual != null) return(true);
        return(false);
    }

    
    public int next(int pos) { 
        
        
        No aux = this.lista[pos].posicaoAtual;
        this.lista[pos].posicaoAtual = this.lista[pos].posicaoAtual.getProx();
        return(aux.getValor());
    }
    
    public void inicializaIterator(int pos){
        
        this.lista[pos].posicaoAtual = this.lista[pos].primeiro;
    }

}
