
package dijkstra;

/**
 *
 * @author BRUNO S LIMA
 */
public class Vertice {
    
    private int posicao; //Nome do vertice
    private Vertice PI; //Pai do vertice
    private int distancia; //Distância da origem até o vertice
    
    public Vertice(){
        
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Vertice getPI() {
        return PI;
    }

    public void setPI(Vertice PI) {
        this.PI = PI;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    
    
}
