
package computationalRepresentation;

/**
 *
 * @author BRUNO S LIMA
 */
public class No {
    
    private int valor;
    private int peso;
    private No prox;
    
    public No(int valor, int peso){
        
        this.valor = valor;
        this.peso = peso;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
    
    
}
