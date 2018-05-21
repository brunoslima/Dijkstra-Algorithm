
package computationalRepresentation;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author BRUNO S LIMA
 */
public class Lista {
    
    public No primeiro;
    public No ultimo;
    public int tamanhoLista;
    public No posicaoAtual = null;
    
    public Lista(){
        
        this.primeiro = null;
        this.ultimo = null;
        this.tamanhoLista = 0;
    }
    
    public int getTamanhoLista(){
        
        return(this.tamanhoLista);
    }
    
    public boolean estaVazia(){
        
        if(this.getTamanhoLista() == 0) return(true);
        return(false);
    }
    
    public void inserirNo(int valor, int peso){
        
        No no = new No(valor, peso);
        
        if(this.estaVazia() == true){
            
            this.primeiro = this.ultimo = no;
        }
        else{
            
            this.ultimo.setProx(no);
            this.ultimo = no;
        }
        
        this.tamanhoLista++;
    }
    
    public void removerNo(No no){
        
        No atual, anterior;
        atual = anterior = this.primeiro;
        int cont = 1;
        
        if(this.estaVazia() == false){
            
            while(cont <= this.getTamanhoLista() && atual.getValor() != no.getValor()){
                
                anterior = atual;
                atual = atual.getProx();
                cont++;
            }
            
            if(atual.getValor() == no.getValor()){
                
                if(this.getTamanhoLista() == 1){
                    
                    this.primeiro = this.ultimo = null;
                }
                else{
                    if(atual == this.primeiro){
                        this.primeiro = this.primeiro.getProx();
                    }
                    else{
                        anterior.setProx(atual.getProx());
                    }
                }
                
                this.tamanhoLista--;
            }
        }
        else JOptionPane.showMessageDialog(null, "A lista está vazia!");
        
    }
    
    public void exibir(){
        
        No temp = this.primeiro;
        String valores = "";
        int cont = 1;
        
        if(this.estaVazia() == false){
            
            while(cont <= this.getTamanhoLista()){
                
                valores += " " + Integer.toString(temp.getValor()) + " |";
                temp = temp.getProx();
                cont++;
            }
            
            System.out.print(valores);
        }
        
    }
    
    
    public boolean contem(int valor){
        
        No aux = this.primeiro;
        
        while (aux != null){
            
            if (aux.getValor() == valor) return(true);
            aux = aux.getProx();
            
        }
        return(false);
    }
    
}
