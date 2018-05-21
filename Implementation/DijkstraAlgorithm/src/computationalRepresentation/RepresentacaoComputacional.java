
package computationalRepresentation;

/**
 *
 * @author BRUNO S LIMA
 */
public abstract class RepresentacaoComputacional {
    
    protected int numeroVertices;
    
    public RepresentacaoComputacional(int numeroVertices){
        
        this.numeroVertices = numeroVertices;
    }
    
    public abstract void adicionaAresta(int i, int j, int peso);
    
    public abstract boolean verificarAdjacencia(int i, int j);
    
    public abstract void exibir();
    
    public abstract boolean hasNext(int pos);
    
    public abstract int next(int pos);
    
    public abstract void inicializaIterator(int pos);
    
    public abstract int getPeso(int i, int j);
        
}
