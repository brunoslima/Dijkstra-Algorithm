package iu;

import computationalRepresentation.Adjacencia;
import computationalRepresentation.Arquivo;
import computationalRepresentation.ListaAdjacencia;
import computationalRepresentation.MatrizAdjacencia;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author BRUNO S LIMA
 */
public class Principal extends javax.swing.JFrame {
    
    private String filename; 
    public static JPanel conteudo;
    private boolean arquivoAberto = false;
    
    public static Adjacencia lista;
    public static Adjacencia matriz;
    
    public static boolean escolhaMatriz = true;

    /** Creates new form Principal */
    public Principal() {
        
        
        initComponents();
        
        this.setTitle("Dijkstra's algorithm");        
        
        this.setSize(600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        arquivoFechar.setEnabled(false);
        
        ferramentasCaminhoMinimo.setEnabled(false);
        conteudo = jPanel1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonMatriz = new javax.swing.JRadioButton();
        jRadioButtonLista = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        arquivoNovo = new javax.swing.JMenuItem();
        arquivoFechar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        arquivoSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ferramentasCaminhoMinimo = new javax.swing.JMenu();
        ferramentasDijkstra = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Selecione a implementação: ");

        jRadioButtonMatriz.setSelected(true);
        jRadioButtonMatriz.setText("Matriz");
        jRadioButtonMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMatrizActionPerformed(evt);
            }
        });

        jRadioButtonLista.setText("Lista");
        jRadioButtonLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonLista)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButtonMatriz)
                    .addComponent(jRadioButtonLista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        arquivoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iu/images/b.png"))); // NOI18N
        arquivoNovo.setText("Novo grafo ...");
        arquivoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoNovoActionPerformed(evt);
            }
        });
        jMenu1.add(arquivoNovo);

        arquivoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iu/images/g.png"))); // NOI18N
        arquivoFechar.setText("Fechar");
        arquivoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoFecharActionPerformed(evt);
            }
        });
        jMenu1.add(arquivoFechar);
        jMenu1.add(jSeparator1);

        arquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iu/images/h.png"))); // NOI18N
        arquivoSair.setText("Sair");
        arquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoSairActionPerformed(evt);
            }
        });
        jMenu1.add(arquivoSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ferramentas");

        ferramentasCaminhoMinimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iu/images/e.png"))); // NOI18N
        ferramentasCaminhoMinimo.setText("Caminho mínimo");

        ferramentasDijkstra.setText("Dijkstra");
        ferramentasDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ferramentasDijkstraActionPerformed(evt);
            }
        });
        ferramentasCaminhoMinimo.add(ferramentasDijkstra);

        jMenu2.add(ferramentasCaminhoMinimo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arquivoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoNovoActionPerformed
        
        if(arquivoAberto) this.arquivoFecharActionPerformed(evt);
        
        JFileChooser a = new JFileChooser();
        a.setDialogTitle("Escolha um arquivo ...");
        a.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".txt") || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Arquivo de texto (.txt)";
            }
        });
        
        int opcao = a.showOpenDialog(this);
        
        if(opcao == JFileChooser.APPROVE_OPTION){
            
            this.filename = a.getSelectedFile().getAbsolutePath();
            
            matriz = Arquivo.leituraArquivo(filename, true);
            lista = Arquivo.leituraArquivo(filename, false);
            
            arquivoFechar.setEnabled(true);
        
            ferramentasCaminhoMinimo.setEnabled(true);
            
            this.arquivoAberto = true;
        }
        
        
    }//GEN-LAST:event_arquivoNovoActionPerformed

    private void arquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoSairActionPerformed
        
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_arquivoSairActionPerformed

    private void arquivoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoFecharActionPerformed
        
        this.filename = null;
        matriz = null;
        lista = null;
        this.arquivoAberto = false;
        
        arquivoFechar.setEnabled(false);
        
        RecursoGrafico.trocarPainel("Cancelar", this);
        
        ferramentasCaminhoMinimo.setEnabled(false);

    }//GEN-LAST:event_arquivoFecharActionPerformed

    private void jRadioButtonMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMatrizActionPerformed

        jRadioButtonMatriz.setSelected(true);
        jRadioButtonLista.setSelected(false);
        escolhaMatriz = true;
    }//GEN-LAST:event_jRadioButtonMatrizActionPerformed

    private void jRadioButtonListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonListaActionPerformed

        jRadioButtonMatriz.setSelected(false);
        jRadioButtonLista.setSelected(true);
        escolhaMatriz = false;
    }//GEN-LAST:event_jRadioButtonListaActionPerformed

    private void ferramentasDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ferramentasDijkstraActionPerformed

        RecursoGrafico.trocarPainel("Dijkstra", this);
    }//GEN-LAST:event_ferramentasDijkstraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arquivoFechar;
    private javax.swing.JMenuItem arquivoNovo;
    private javax.swing.JMenuItem arquivoSair;
    private javax.swing.JMenu ferramentasCaminhoMinimo;
    private javax.swing.JMenuItem ferramentasDijkstra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonLista;
    private javax.swing.JRadioButton jRadioButtonMatriz;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}