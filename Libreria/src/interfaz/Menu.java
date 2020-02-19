/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    FondoPanel fondo =new FondoPanel();
    /** 
     * Creates new form Menu
     */
    public Menu() {
        
        this.setContentPane(fondo);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        j_loguin.setEnabled(true);
        j_cliente.setEnabled(false);
        j_administrador.setEnabled(false);
    }

    public JMenu getJ_administrador() {
        return j_administrador;
    }

    public void setJ_administrador(JMenu j_administrador) {
        this.j_administrador = j_administrador;
    }

    public JMenu getJ_cliente() {
        return j_cliente;
    }

    public void setJ_cliente(JMenu j_cliente) {
        this.j_cliente = j_cliente;
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        j_loguin = new javax.swing.JMenuItem();
        j_cliente = new javax.swing.JMenu();
        j_autor = new javax.swing.JMenuItem();
        j_libros = new javax.swing.JMenuItem();
        j_administrador = new javax.swing.JMenu();
        j_Mlibros = new javax.swing.JMenuItem();
        j_Mautores = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu ");

        j_loguin.setText("Loguin");
        j_loguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_loguinActionPerformed(evt);
            }
        });
        jMenu1.add(j_loguin);

        jMenuBar1.add(jMenu1);

        j_cliente.setText("Cliente");

        j_autor.setText("Autores");
        j_autor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_autorMouseClicked(evt);
            }
        });
        j_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_autorActionPerformed(evt);
            }
        });
        j_cliente.add(j_autor);

        j_libros.setText("Libros");
        j_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_librosMouseClicked(evt);
            }
        });
        j_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_librosActionPerformed(evt);
            }
        });
        j_cliente.add(j_libros);

        jMenuBar1.add(j_cliente);

        j_administrador.setText("Administracion");

        j_Mlibros.setText("Modificar libros ");
        j_Mlibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_MlibrosActionPerformed(evt);
            }
        });
        j_administrador.add(j_Mlibros);

        j_Mautores.setText("Modificar autores");
        j_Mautores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_MautoresActionPerformed(evt);
            }
        });
        j_administrador.add(j_Mautores);

        jMenuBar1.add(j_administrador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_loguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_loguinActionPerformed
        Loguin log = new Loguin(this);
        log.setVisible(true);
        this.setVisible(false);
          
    }//GEN-LAST:event_j_loguinActionPerformed

    private void j_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_autorActionPerformed
       Autores au =new Autores();
       au.setVisible(true);
       this.setVisible(false);
        

    }//GEN-LAST:event_j_autorActionPerformed

    private void j_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_librosActionPerformed
       Libros li =new Libros();
       li.setVisible(true);
       this.setVisible(false);
       

    }//GEN-LAST:event_j_librosActionPerformed

    private void j_MlibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_MlibrosActionPerformed
       Modificar_libros ml=new Modificar_libros();
       ml.setVisible(true);
       this.setVisible(false);

    }//GEN-LAST:event_j_MlibrosActionPerformed

    private void j_MautoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_MautoresActionPerformed
       Modificar_autores ma=new Modificar_autores();
       ma.setVisible(true);
       this.setVisible(false);

    }//GEN-LAST:event_j_MautoresActionPerformed

    private void j_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_librosMouseClicked
       
    }//GEN-LAST:event_j_librosMouseClicked

    private void j_autorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_autorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j_autorMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem j_Mautores;
    private javax.swing.JMenuItem j_Mlibros;
    private javax.swing.JMenu j_administrador;
    private javax.swing.JMenuItem j_autor;
    private javax.swing.JMenu j_cliente;
    private javax.swing.JMenuItem j_libros;
    private javax.swing.JMenuItem j_loguin;
    // End of variables declaration//GEN-END:variables


    class FondoPanel extends JPanel{
        private Image imagen ;
        
        
        @Override
        public void paint(Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/imagenes/libro.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0,getWidth(), getHeight(), this );
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
    
}
