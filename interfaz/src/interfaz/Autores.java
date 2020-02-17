/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.Metodos_autores;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import modelo.autores;

/**
 *
 * @author antho
 */
public class Autores extends javax.swing.JFrame {
private DefaultTableModel dtm;
Metodos_autores met = new Metodos_autores();
    /**
     * Creates new form Autores
     */
    public Autores() {
        
        initComponents();
        List<autores> autor = met.ListarAutor();
        dtm = (DefaultTableModel) tbl_autoresU.getModel();
        
        for (autores au: autor) {
           Vector fila = new Vector();
//            fila.add(au.getId_autor());
            fila.add(au.getNombre());
            fila.add(au.getApellido());
            fila.add(au.getFecha());
            fila.add(au.getNum_libros());
            if (au.isEcuatoriano()==true){
            fila.add("Si es");
            }else {
            fila.add("No lo es");
            }
            dtm.addRow(fila);
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_autoresU = new javax.swing.JTable();
        btn_buscarU = new javax.swing.JButton();
        btn_regresarU = new javax.swing.JButton();
        btn_salirU = new javax.swing.JButton();
        txt_busq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Autores");

        tbl_autoresU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellido", "Fecha de Naci.", "N. Libros", "Ecuatoriano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_autoresU);

        btn_buscarU.setText("Buscar");
        btn_buscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarUActionPerformed(evt);
            }
        });

        btn_regresarU.setText("Regresar");
        btn_regresarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarUActionPerformed(evt);
            }
        });

        btn_salirU.setText("SALIR");
        btn_salirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirUActionPerformed(evt);
            }
        });

        jLabel2.setText("AUTOR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarU)
                                .addGap(140, 140, 140)
                                .addComponent(btn_regresarU))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btn_salirU)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscarU)
                    .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_regresarU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirU)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarUActionPerformed
            
            dtm = (DefaultTableModel) tbl_autoresU.getModel();
            String id = txt_busq.getText();
            autores consultaautor = new Metodos_autores().Buscarautor(id);
            eliminar();
            Vector fila = new Vector();
            fila.add(consultaautor.getNombre());
            fila.add(consultaautor.getApellido());
            fila.add(consultaautor.getFecha());
            fila.add(consultaautor.getNum_libros());
            if (consultaautor.isEcuatoriano()==true){
            fila.add("Si es");
            }else {
            fila.add("No lo es");
            }
            dtm.addRow(fila);
            
    }//GEN-LAST:event_btn_buscarUActionPerformed

    private void btn_regresarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarUActionPerformed
    Menu me=new Menu();
    me.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btn_regresarUActionPerformed

    private void btn_salirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirUActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirUActionPerformed

    public void eliminar(){ 
     try{
        DefaultTableModel dtm = (DefaultTableModel) tbl_autoresU.getModel();
        int a = tbl_autoresU.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        dtm.removeRow(dtm.getRowCount()-1);
        } 
     }catch(Exception ex){
         System.out.println("Error al limpiar tabla");
     }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarU;
    private javax.swing.JButton btn_regresarU;
    private javax.swing.JButton btn_salirU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_autoresU;
    private javax.swing.JTextField txt_busq;
    // End of variables declaration//GEN-END:variables
}
