
package computationalRepresentation;

/**
 *
 * @author BRUNO S LIMA
 */
public class Adjacencia {
    
    private int numeroVertices;
    private RepresentacaoComputacional representacao;
    private boolean tipoGrafo;
    
    public Adjacencia(int numeroVertices, RepresentacaoComputacional representacao, boolean tipoGrafo){
        
        this.setNumeroVertices(numeroVertices);
        this.representacao = representacao;
        this.setTipoGrafo(tipoGrafo);
    }

    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }
    
    public void adicionaAresta(int i, int j, int peso){
        
        this.representacao.adicionaAresta(i, j, peso);
    }
    
    public boolean verificaAdjacencia(int i, int j){
        
        return(this.representacao.verificarAdjacencia(i, j));
    }
    
    public int getPeso(int i, int j){
        
        return(this.representacao.getPeso(i, j));
    }
    
    public void exibir(){
        
        System.out.println("Número de vertices: " + this.numeroVertices);
        this.representacao.exibir();
    }
    
    public boolean hasNext(int pos){
        
        return(this.representacao.hasNext(pos));
    }
    
    public int next(int pos){
        
        return(this.representacao.next(pos));
    }
    
    public void inicializaIterator(int pos){
        
        this.representacao.inicializaIterator(pos);
    }

    public boolean isTipoGrafo() {
        return tipoGrafo;
    }

    public void setTipoGrafo(boolean tipoGrafo) {
        this.tipoGrafo = tipoGrafo;
    }
    
    
}
