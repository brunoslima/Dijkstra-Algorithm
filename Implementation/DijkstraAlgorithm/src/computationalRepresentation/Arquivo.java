
package computationalRepresentation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BRUNO S LIMA
 */
public class Arquivo {
    
    public Arquivo(){
        
    }
    
    public static Adjacencia leituraArquivo(String nomeArquivo, boolean tipoRepresentacao){
        
        Adjacencia adjacencia = null;
        
        try {
            
            Scanner scan = new Scanner(new FileReader(nomeArquivo));
            
            //Lendo e verificando se é grafo ou digrafo
            boolean tipoGrafo;
            if(scan.nextInt() == 0) tipoGrafo = false; //Falso para grafo
            else tipoGrafo = true; //Verdadeiro para Digrafo
            
            int numeroVertices = scan.nextInt(); //Lendo número de vertices
            
            //Instanciando a estrutura que será utilizada.
            MatrizAdjacencia ma;
            ListaAdjacencia la;
            if(tipoRepresentacao) {
                
                ma = new MatrizAdjacencia(numeroVertices);
                adjacencia = new Adjacencia(numeroVertices, ma, tipoGrafo);
            }
            else {
                
                la = new ListaAdjacencia(numeroVertices);
                adjacencia = new Adjacencia(numeroVertices, la, tipoGrafo);
            }
            
            int i, j, peso;
            
            while(scan.hasNext()){
                
                i = scan.nextInt(); //Lendo vertice 1
                j = scan.nextInt(); //Lendo vertice 2
                peso = scan.nextInt(); //Lendo peso (ou valor)
                
                if(tipoGrafo == true) adjacencia.adicionaAresta(i, j, peso); //Para Digrafos
                else{
                    
                    //Para Grafos
                    adjacencia.adicionaAresta(i,j, peso);
                    adjacencia.adicionaAresta(j, i, peso);
                }
                
                
            }
            
            scan.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo!");
        }
        
        return(adjacencia);
        
    }
}
