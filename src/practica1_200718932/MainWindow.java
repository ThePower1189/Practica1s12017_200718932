/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_200718932;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Lisbeth
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("LOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PLAY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       SAXBuilder builder = new SAXBuilder();
       File xmlfile = new File("XML PRUEBA.xml");
       
       String pal = null;
       
       try{
           Document docs =(Document) builder.build(xmlfile);
           Element rootNode = docs.getRootElement();
           
           List listaDobles = rootNode.getChildren("dobles");
           List listaTriples = rootNode.getChildren("triples");
           List listaDiccionario= rootNode.getChildren("diccionario");
           
           String dimen = rootNode.getChildTextTrim("dimension");
           System.out.println("\t"+dimen);
           
           for (int i = 0; i<listaDobles.size();i++){
               
               Element tabladoble = (Element) listaDobles.get(i);
               List lista_dobles = tabladoble.getChildren();
           
                for (int j = 0; j<lista_dobles.size(); j++){

                    Element casilla = (Element) lista_dobles.get(j);

                    String x = casilla.getChildTextTrim("x");
                    String y = casilla.getChildTextTrim("y");
                    System.out.println( "\t"+x+"\t\t"+y);
                  
                }
           }
           
           for (int m = 0; m<listaTriples.size();m++){
               
               Element tablatriple = (Element) listaTriples.get(m);
               List lista_triples = tablatriple.getChildren(dimen);
           
                for (int n = 0; n<lista_triples.size(); n++){

                    Element casilla = (Element) lista_triples.get(n);

                    String x = casilla.getChildTextTrim("x");
                    String y = casilla.getChildTextTrim("y");
                    System.out.println( "\t"+x+"\t\t"+y);
                  
                }
           }
           
           for (int k = 0; k<listaDiccionario.size();k++){
               
               Element tabladiccionario = (Element) listaDiccionario.get(k);
               List lista_diccionario = tabladiccionario.getChildren();
           
                for (int l = 0; l<lista_diccionario.size(); l++){

                    Element palabra = (Element) lista_diccionario.get(l);

                     pal = palabra.getChildTextTrim("palabra");
                    System.out.println( "\t"+pal);
                  
                }
           }

       }catch(IOException | JDOMException io){
           System.out.println(io.getMessage());
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
