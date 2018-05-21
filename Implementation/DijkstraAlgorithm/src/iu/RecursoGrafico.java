/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iu;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author BRUNO S LIMA
 */
public class RecursoGrafico {
    

    public static void trocarPainel(String namePanel, JFrame parent){
        
        JPanel a = null;
        String titulo = "";
        
        switch(namePanel){
                
            case "Dijkstra":
                a = new Dijkstra();
                titulo = "Algoritmo Dijkstra";
                break;
            
            case "Cancelar":
                
                parent.getContentPane().removeAll();
                parent.getContentPane().add(Principal.conteudo);
                parent.revalidate();
                parent.repaint();
                return;
                
            default:
                
                break;
        }
        
        a.setBounds(5, 10, 585, 290);
        a.setBorder(javax.swing.BorderFactory.createTitledBorder(titulo));
        parent.getContentPane().removeAll();
        parent.getContentPane().add(a);
        parent.getContentPane().add(Principal.conteudo);
        parent.revalidate();
        parent.repaint();     
    }
}
